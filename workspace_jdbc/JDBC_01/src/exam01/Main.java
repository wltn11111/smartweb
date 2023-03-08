package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// JDBC : Java DataBase Connectivity
		// Java 프로그램에서 DBMS를 사용하기 위한 라이브러리 및 문법
		// OJDBC  JAR

		// executeQuery : SELECT
		// executeUpdate : UPDATE, DELETE, INSERT
		
		Scanner sc = new Scanner(System.in);
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbID = "kh";
		String dbPW = "kh";
		
		try {
			Connection con = DriverManager.getConnection(url,dbID,dbPW);
			System.out.println("연결 성공");
			Statement stat = con.createStatement();
			
			System.out.println("신규 등록할 메뉴의 이름 : ");
			String name = sc.nextLine();
			
			System.out.println(name + "메뉴의 가격 : ");
			int price = Integer.parseInt(sc.nextLine());
			
			System.out.println("ICE 가능 여부 ('Y','N') : ");
			String isIce = sc.nextLine();
			
			
			
			String sql = 
					"insert into cafe values(cafe_seq.nextval,'"+name+"',"+price+",'"+isIce+"')";
			int result = stat.executeUpdate(sql);
			
			if(result>0) {
				System.out.println("입력 성공");
			}else {
				System.out.println("입력 실패");
			}
			con.commit();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		}
	}
}






















