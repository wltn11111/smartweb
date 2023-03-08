package exam03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {
		
		Socket client = new Socket("192.168.50.7",25040);
		
		// 1. 클라이언트가 서버에 접속한다.
		
		// 2. 클라이언트가 먼저 +,-,*,/중 하나를 입력하여 서버에 전송한다.
		
		// 3. 클라이언트가 숫자를 하나 입력하여 서버에 전송한다.
		
		// 4. 클라이언트가 숫자를 하나더 입력하여 서버에 전송한다.
		
		// 5. 서버는 클라이언트가 전송한 데이터들을 전달 받아 두 숫자에 대하여 2번에서 전송된 연산을 처리하고
		//		그 결과를 클라이언트에 반환한다.
		
		// 6. 위의 과정은 무한히 반복한다.
		
		OutputStream os = client.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		Scanner sc = new Scanner(System.in);
		
		InputStream is = client.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		
		
		while(true) {
//			JOptionPane.showInputDialog("클라이언트에게 보낼 메세지")
			String st = sc.nextLine();
			dos.writeUTF(st);
			dos.flush();
			
			String s =dis.readUTF();
			System.out.println("서버에서 온 값 : " + s);
		
		}
		
		
	}
}
