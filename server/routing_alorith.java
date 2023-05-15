import java.util.*;

class Router {
    private int id;
   public Map<Integer, Integer> neighbors; // neighbor id -> distance
    public Map<Integer, Integer> distances; // destination id -> cost
    public Map<Integer, Integer> nextHops; // destination id -> next hop id

    public Router(int id) {
        this.id = id;
        this.neighbors = new HashMap<>();
        this.distances = new HashMap<>();
        this.nextHops = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public void addNeighbor(int neighborId, int distance) {
        neighbors.put(neighborId, distance);
        distances.put(neighborId, distance);
        nextHops.put(neighborId, neighborId);
    }

    public void updateRoutingTable(Map<Integer, Map<Integer, Integer>> neighborDistances) {
        for (int destinationId : neighborDistances.keySet()) {
            Map<Integer, Integer> neighborDistancesForDestination = neighborDistances.get(destinationId);
            int minCost = Integer.MAX_VALUE;
            int nextHop = -1;
            for (int neighborId : neighborDistancesForDestination.keySet()) {
                int distance = neighborDistancesForDestination.get(neighborId);
                if (distance +distances.get(neighborId) < minCost) {
                    minCost = distance + distances.get(neighborId);
                    nextHop = neighborId;
                }
            }
            distances.put(destinationId, minCost);
            nextHops.put(destinationId, nextHop);
        }
    }

    public void printRoutingTable() {
        System.out.println("Routing table for router " + id + ":");
        System.out.println("Destination\tNext Hop\tCost");
        for (int destinationId : distances.keySet()) {
            System.out.println(destinationId + "\t\t" + nextHops.get(destinationId) + "\t\t" + distances.get(destinationId));
        }
        System.out.println();
    }
}

public class routing_alorith {
    public static void main(String[] args) {
        Router r1 = new Router(1);
        Router r2 = new Router(2);
        Router r3 = new Router(3);
        r1.addNeighbor(2, 1);
        r1.addNeighbor(3, 5);
        r2.addNeighbor(1, 1);
        r2.addNeighbor(3, 2);
        r3.addNeighbor(1, 5);
        r3.addNeighbor(2, 2);
        Map<Integer, Router> routers = new HashMap<>();
        routers.put(1, r1);
        routers.put(2, r2);
        routers.put(3, r3);
        for (int i = 0; i < 10; i++) {
            Map<Integer, Map<Integer, Integer>> neighborDistances = new HashMap<>();
            for (int routerId : routers.keySet()) {
                Map<Integer, Integer> distances = new HashMap<>();
                for (int neighborId : routers.get(routerId).neighbors.keySet()) {
                    distances.put(neighborId, routers.get(routerId).neighbors.get(neighborId));
                }
                neighborDistances.put(routerId, distances);
            }
            for (Router router : routers.values()) {
                router.updateRoutingTable(neighborDistances);
            }
        }
        for (Router router : routers.values()) {
            router.printRoutingTable();
        }
    }
}

