package exam01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JOptionPane;
class ReadThread extends Thread{
	public void run() {
		while(true) {
			try {
				String msg = Server.dis.readUTF();
				System.out.println("클라이언트로 부터 메세지 : " + msg);
			} catch (IOException e) {
				break;
			}
		}
	}
}
public class Server {
	public static DataInputStream dis;
	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(45453);
		Socket socket = server.accept(); 				// 램카드를 주시(내부에 무한루프 45453 접속하면 브레이크)
		System.out.println(socket.getInetAddress()+ " 로 부터 연결");

		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		Scanner sc = new Scanner(System.in);

		InputStream is = socket.getInputStream();
		dis = new DataInputStream(is);
		
		new ReadThread().start();

		while(true) {
			System.out.println("클라이언트에게 보낼 메세지 : ");
			dos.writeUTF(sc.nextLine());
			dos.flush();


//			JOptionPane.showInputDialog(dis.readUTF());
		}
	}
}





//		
//		dos.flush();
//		JOptionPane.showMessageDialog(null, msg);
//		System.out.println("클라이언트가 보낸 메세지 : " + msg);
//		String msg = dis.readUTF();
//		System.out.println("클라이언트가 보낸 메세지 : " + msg);