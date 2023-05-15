import java.io.IOException;
import java.io.*;
import java.net.*;

import java.util.*;

public class Main{
    public static void main(String args[])throws IOException {
        DatagramSocket socket=new DatagramSocket();
        Scanner sc=new Scanner(System.in);
        InetAddress inetAddress=InetAddress.getByName("localhost");
        while (true){
            String sendmessge=sc.nextLine();
            byte senddata[]=sendmessge.getBytes();
            DatagramPacket sendpacket=new DatagramPacket(senddata,senddata.length,inetAddress,3465);
            socket.send(sendpacket);


            byte recivemeassge[]=new byte[20];
            DatagramPacket recivepacket=new DatagramPacket(recivemeassge,recivemeassge.length);
            socket.receive(recivepacket);
            String gotmessge=new String(recivepacket.getData());
            System.out.println("recived messge from server"+gotmessge);
        }
    }
}