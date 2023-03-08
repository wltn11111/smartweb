package exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//		} catch (ClassNotFoundException e) {
//			System.out.println("라이브러리를 찾을수 없습니다.");
//			System.exit(0);
//		}
		
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String id = "kh";
		String pw = "kh";
		
		try {
			Connection con = DriverManager.getConnection(url,id,pw);
			
			Statement stat = con.createStatement();
			
			System.out.print("삭제할 이름 : ");
			String name = sc.nextLine();
			
			String sql ="DELETE FROM CAFE WHERE NAME='"+name+"'";
			int result = stat.executeUpdate(sql);
			
			if(result>0) {
				System.out.println("삭제 성공");
			}else {
				System.out.println("삭제 실패");
			}
			
			con.commit();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		}
	}
}
