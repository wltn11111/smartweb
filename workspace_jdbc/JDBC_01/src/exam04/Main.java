package exam04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {

		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "kh";
			String pw = "kh";
			Connection con = DriverManager.getConnection(url,id,pw);	//sql 로그인
			Statement stat = con.createStatement();		// sql 빈페이지

			String sql = "SELECT * FROM DEPARTMENT";

			ResultSet rs = stat.executeQuery(sql);		//

			while(rs.next()) {	// rs.next()한줄 내리기 (헤더부분에서 값을 가져올수 없기떄문)

				String dept_id = rs.getString("dept_id");	// 테이블에서 가져올 값(컬럼아이디)
				String dept_title = rs.getString("dept_title");
				String location_id = rs.getString("location_id");

				System.out.println(dept_id+"\t"+dept_title+"\t"+location_id);
			}

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}
