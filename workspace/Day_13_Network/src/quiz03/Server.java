package quiz03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();

		ServerSocket server = new ServerSocket(11116);
		System.out.println("서버가 가동 되었습니다...");
		Socket sock = server.accept();
		System.out.println(sock.getInetAddress() + " 로 부터 연결");

		InputStream is = sock.getInputStream();
		DataInputStream dis = new DataInputStream(is);

		OutputStream os = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);

		while (true) {
			int menu = dis.readInt();

			if (menu == 1) {
				int id = dis.readInt();
				
				String name = dis.readUTF();

				String phone = dis.readUTF();

				manager.addMember(new Member(id, name, phone));

			} else if (menu == 2) {
				String mm = manager.menuMember();
				dos.writeUTF(mm);
				dos.flush();
				
			}else if(menu==3) {
				String a =dis.readUTF();
				String mm = manager.changeName(a);
				dos.writeUTF(mm);
				dos.flush();
				
			}else if(menu==4) {
				int a = dis.readInt();
				int mm = manager.remoId(a);
				dos.writeInt(mm);
				dos.flush();
			}
			
			dos.writeUTF("ack");
			System.out.println();
		}
	}
}
