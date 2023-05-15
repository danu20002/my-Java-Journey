
import java.io.*;
import java.net.*;



public class new_server  {
    public static void main(String args[]) throws IOException {
        ServerSocket serverSocket=null;

        try{
            serverSocket=new ServerSocket(4556);
        } catch (IOException e){
            System.err.println("coonection already in port you have taken");
            System.exit(1);

        }
        Socket socket=null;
        try{
            System.out.println("Waiting for connection");
            socket=serverSocket.accept();

            System.out.println("Connection successful"+socket.getInetAddress());
        }catch (IOException e){
            System.err.println("accept rejected");
            System.exit(2);
        }
        PrintWriter printWriter=new PrintWriter(socket.getOutputStream(),true);
        BufferedReader bf=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String inputline;
        while ((inputline=bufferedReader.readLine()) !=null){
            printWriter.println(inputline);
            System.out.println("Received message from client::"+bf.readLine());
            printWriter.println("client says :"+bf.readLine());
        }
        printWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}