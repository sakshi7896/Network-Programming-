import java.io.*; 
import java.net.*; 
public class Server

{

public static void main(String[] args) throws Exception

{

ServerSocket sersock = new ServerSocket(3000); System.out.println("Server ready for chatting"); Socket sock = sersock.accept( );

// reading from keyboard (keyRead object)
 BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));

// sending to client (pwrite object)
 OutputStream ostream = sock.getOutputStream(); PrintWriter pwrite = new PrintWriter(ostream, true);

// receiving from server ( receiveRead object)
InputStream istream = sock.getInputStream(); BufferedReader receiveRead = new BufferedReader(new

InputStreamReader(istream));

String receiveMessage, sendMessage; while(true)

{

System.out.println("Server: Enter Message:\t"); sendMessage = keyRead.readLine(); pwrite.println(sendMessage);

pwrite.flush();

}

}

}

