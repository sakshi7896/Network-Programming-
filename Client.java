import java.io.*; 
import java.net.*;
 public class Client

{

public static void main(String[] args) throws Exception

{

Socket sock = new Socket("127.0.0.1", 3000);

// reading from keyboard (keyRead object)
 BufferedReader keyRead = new BufferedReader(new

InputStreamReader(System.in));

//sending to client (pwrite object)

//receiving from server ( receiveRead object)

InputStream istream = sock.getInputStream();
 BufferedReader receiveRead = new BufferedReader(new

InputStreamReader(istream));

System.out.println("Client is receiving:");

String receiveMessage; 
while(true)
{

if((receiveMessage = receiveRead.readLine()) != null) //receive from server

{

System.out.println("Server:"+receiveMessage); // displaying at DOS prompt

}

}

}

}

