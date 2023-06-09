import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try {
            clientSocket = new Socket("localhost", 5000);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: localhost");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Could not connect to server: localhost");
            System.exit(1);
        }

        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        String userInput;

        while ((userInput = stdIn.readLine()) != null) {
            out.println(userInput);
            System.out.println("Server response: " + in.readLine());
        }

        out.close();
        in.close();
        stdIn.close();
        clientSocket.close();
    }
}
