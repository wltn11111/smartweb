package exam01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JOptionPane;
class WriteThread extends Thread{
	

	public void run() {
		Scanner sc = new Scanner(System.in);

		while(true) {
			try {
				System.out.println("서버에게 보낼 메세지 : ");
				Client.dos.writeUTF(sc.nextLine());
				Client.dos.flush();
			} catch (IOException e) {
				break;
			}
		}
	}
}
public class Client {
	public static DataOutputStream dos;
	
	public static void main(String[] args) throws Exception {

		Socket cilent = new Socket("192.168.50.67",45453);

		InputStream is = cilent.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		
		OutputStream os = cilent.getOutputStream();
		dos = new DataOutputStream(os);

		new WriteThread().start();
		
		while(true) {
			String msg = dis.readUTF();
			System.out.println("서버가 보낸 메세지 : " + msg);


			

		}
	}
}
