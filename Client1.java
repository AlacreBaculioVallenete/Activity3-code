import java.io.*;
import java.net.*;
 
public class Client1 {
    public static void main(String[] args) throws IOException {
         
        
        try (
            Socket SS = new Socket("localhost", 2345);
            PrintWriter OUT =
                new PrintWriter(SS.getOutputStream(), true);
            BufferedReader Ered =
                new BufferedReader(
                    new InputStreamReader(SS.getInputStream()));
            BufferedReader ISR =
                new BufferedReader(
                    new InputStreamReader(System.in))
        ) {
            String userInput;
            while ((userInput = ISR.readLine()) != null) {
                OUT.println(userInput);
                System.out.println("echo: " + Ered.readLine());
            }
        }
    }
}