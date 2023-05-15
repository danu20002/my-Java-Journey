import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

public class Main {
    public static void main(String args[])throws IOException {
        DatagramSocket socket=new DatagramSocket(3465);
        Scanner sc=new Scanner(System.in);
        byte recivedata[]=new byte[20];
        while (true){
            DatagramPacket receivepacket=new DatagramPacket(recivedata,recivedata.length);
            socket.receive(receivepacket);

            String recivedmessge=new String(receivepacket.getData());
            System.out.println("received meassge from"+receivepacket.getAddress().getHostAddress()+":"+recivedmessge);

            String sendmessge=sc.nextLine();
           byte senddata[]=sendmessge.getBytes();
           DatagramPacket sendpacket=new DatagramPacket(senddata,senddata.length,receivepacket.getAddress(),receivepacket.getPort());
           socket.send(sendpacket);


            }
        }
    }
