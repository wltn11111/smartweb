package quiz02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {

		Socket client = new Socket("192.168.50.7", 11115);

		OutputStream os = client.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		Scanner sc = new Scanner(System.in);

		InputStream is = client.getInputStream();
		DataInputStream dis = new DataInputStream(is);


		while(true) {
			// 1. 클라이언트는 서버에 접속한다.

			// 2. 클라이언트는 사람의 고유ID (1001~1100)를 입력하여 서버에 전송한다.
			String st = sc.nextLine();
			dos.writeUTF(st);

			// 2. 클라이언트는 사람의 이름을 입력하여 서버에 전송한다.
			String name = sc.nextLine();
			dos.writeUTF(name);

			// 4. 클라이언트는 사람의 연락처(전화번호)를 입력하여 서버에 전송한다.
			String num = sc.nextLine();
			dos.writeUTF(num);
			dos.flush();

			// 5. 서버는 클라이언트로 부터 전달된 3가지 데이터를 Contact Instance로 만든다.
			//		Contact [정보은닉 적용]
			//		id, name, phone 3가지에 대하여 
			//		getter/setter/constructor/default constructor 를 가진다.

			// 6. 서버는 만들어진 인스턴스를 테이터 관리 전용 인스턴스인 Manager에게 전달하여
			//		Contact를 저장하는 ArrayList 에 보관한다.
			//		( 저장 한 후 , ArrayList에 현재 몇개의 데이터가 있는지 Server Console에 출력하세요.)

			// 7. 보관을 완료 한 후, 서버는 클라이언트에게 저장 완료의 의미인 ack 를 반환한다.

			// 8.클라이언트는 ack가 반환되면, 사용자에게 "저장완료" 메세지를 출력한다.
			
			String a = dis.readUTF();
			if(a.equals("ack")) {
				System.out.println("저장완료");
			}
			// 9. 2 ~ 8 번까지의 작업은 무한 반복한다.	


		}
	}

}
