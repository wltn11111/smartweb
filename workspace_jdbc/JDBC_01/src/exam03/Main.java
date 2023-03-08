package exam03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("라이브러리를 찾을수 없습니다.");
			System.exit(0);
		}
		
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String id ="kh";
		String pw ="kh";
		
		try {
			Connection con = DriverManager.getConnection(url,id,pw);
			
			Statement stat = con.createStatement();
			
			String sql ="UPDATE CAFE SET PRICE=5000 WHERE NAME='Americano'";
			
			int result = stat.executeUpdate(sql);
			
			if(result>0) {
				System.out.println("업데이트 성공");
			}else {
				System.out.println("업데이트 실패");
			}
			
			con.commit();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		}
		
	}
}
