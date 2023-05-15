import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.net.Socket;
import java.net.UnknownHostException;

public class new_client {
    public static void main(String args[]) throws IOException {
        Socket socket=null;
        PrintWriter printWriter=null;
        BufferedReader bufferedReader=null;
        try{
            socket=new Socket("localhost",4356);
            printWriter=new PrintWriter(socket.getOutputStream(),true);
            bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        }catch (UnknownHostException e){
            System.out.println("Host not found");
        }catch (IOException d){
            System.out.println("port not found or already in use");
        }
        BufferedReader inputtaking=new BufferedReader(new InputStreamReader(System.in));
        String clintmessge;
        while ((clintmessge=inputtaking.readLine())!=null){
            printWriter.println(clintmessge);
            System.out.println("server responded::"+bufferedReader.readLine());
        }
        socket.close();
        bufferedReader.close();
        printWriter.close();
    }
}
