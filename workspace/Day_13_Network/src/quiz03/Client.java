package quiz03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();

		Socket client = new Socket("192.168.50.67", 11116);

		OutputStream os = client.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);

		InputStream is = client.getInputStream();
		DataInputStream dis = new DataInputStream(is);

		while (true) {
			System.out.println("<<연락처 관리 프로그램>>");
			System.out.println("1. 연락처 신규 등록");
			System.out.println("2. 연락처 목록 확인");
			System.out.println("3. 검색 (이름으로 검색)");
			System.out.println("4. 연락처 삭제 (ID로 삭제)");
			System.out.println(">>");
			int menu = Integer.parseInt(sc.nextLine());
			dos.writeInt(menu);

			if (menu == 1) {
				System.out.print("ID를 입력하세요>> ");
				int id = Integer.parseInt(sc.nextLine());
				dos.writeInt(id);

				System.out.print("이름을 입력하세요>> ");
				String name = sc.nextLine();
				dos.writeUTF(name);

				System.out.print("번호를 입력하세요>> ");
				String phone = sc.nextLine();
				dos.writeUTF(phone);

				dos.flush();

			} else if (menu == 2) {
				String pars = dis.readUTF();
				System.out.println("연락처 목록");
				System.out.println(pars);

				//				String parsedContacts = dis.readUTF();
				//				System.out.println("연락처 목록");
				//				System.out.print(parsedContacts);

			}else if(menu==3) {
				System.out.println("검색할 이름 : ");
				String par = sc.nextLine();
				dos.writeUTF(par);
				dos.flush();

				System.out.println("ID\t이름\t번호");
				String pa = dis.readUTF();
				System.out.print(pa);

			}else if(menu==4) {
				System.out.println("삭제할 ID");
				int par = Integer.parseInt(sc.nextLine());
				dos.writeInt(par);
				dos.flush();

				if(dis.readInt()==-1) {
					System.out.println("삭제 실패");
				}else {	
					System.out.println("삭제완료");
				}
			}
			
			String a = dis.readUTF();
			if(a.equals("ack")) {
				System.out.println("완료");
			}
			System.out.println();
		}

	}
}
