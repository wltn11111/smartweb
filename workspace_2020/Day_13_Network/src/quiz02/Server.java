package quiz02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
	public static void main(String[] args) throws Exception {

		Server ser = new Server();
		Manager manager = new Manager();
		ServerSocket server = new ServerSocket(45457);
		System.out.println("서버가 가동 되었습니다...");
		Socket sock = server.accept();
		System.out.println(sock.getInetAddress()+ " 로 부터 연결");

		InputStream is = sock.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		
		OutputStream os = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		
		while(true) {
			int id = Integer.parseInt(dis.readUTF());
			String name = dis.readUTF();
			String phone = dis.readUTF();
			
			manager.addServer(new Contact(id, name, phone));
			
			ArrayList<Contact> re = manager.getServ();
			System.out.println("현재 저장된 연락처 개수 : " + re.size());
			
			dos.writeUTF("ack");
			
			
			
		}
	}
}
