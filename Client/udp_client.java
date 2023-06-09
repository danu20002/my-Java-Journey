import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class udp_client {
    public static void main(String[] args) throws IOException {
        DatagramSocket clientSocket = new DatagramSocket();
        Scanner sc=new Scanner(System.in);
        InetAddress IPAddress = InetAddress.getByName("localhost");
        while(true) {
            String message = sc.nextLine();
            byte[] sendData = message.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
            clientSocket.send(sendPacket);

            byte[] receiveData = new byte[10024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);

            String responseMessage = new String(receivePacket.getData());
            System.out.println("received response from server: " +responseMessage);


        }

    }
}