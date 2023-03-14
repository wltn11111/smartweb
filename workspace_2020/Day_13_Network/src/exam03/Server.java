package exam03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(45457);
		System.out.println("서버가 가동 되었습니다...");
		Socket sock = server.accept();
		System.out.println(sock.getInetAddress()+ " 로 부터 연결");
		
		OutputStream os = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		InputStream is = sock.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		
		while(true) {
			String msg = dis.readUTF();
			System.out.println("클라이언트가 보낸 메세지 : " + msg);
			
			int num1 =  Integer.parseInt(dis.readUTF());
			System.out.println("클라이언트가 보낸 메세지 : " + num1);
			
			int num2 =  Integer.parseInt(dis.readUTF());
			System.out.println("클라이언트가 보낸 메세지 : " + num2);
			
			if(msg.equals("+")||msg.equals("-")||msg.equals("*")) {
				if(msg.equals("+")) {
					dos.writeUTF("두 수의 합 : "  + (num1+num2));
				}else if(msg.equals("-")) {
					dos.writeUTF("두 수의 빼기 : "  + (num1-num2));
				}
				else if(msg.equals("*")) {
					dos.writeUTF("두 수의 곱 : "  + (num1*num2));
				}		
			}else {
				break;
			}

		}
	}
}
