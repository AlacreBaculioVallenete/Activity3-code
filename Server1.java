import java.net.*;
import java.io.*;
 
public class Server1 {
    public static void main(String[] args) throws IOException {
         
      
        try (
            ServerSocket SS =
                new ServerSocket(2345);
            Socket Ssocket1 = SS.accept();     
            PrintWriter OUT =
                new PrintWriter(Ssocket1.getOutputStream(), true);                   
            BufferedReader Ered = new BufferedReader(
                new InputStreamReader(Ssocket1.getInputStream()));
        ) {
            String inputLine;
            while ((inputLine = Ered.readLine()) != null) {
                OUT.println(inputLine);
            }
        } 
    }
}