import java.security.MessageDigest;
import java.text.SimpleDateFormat;

public class Test {
	
	public static void main(String[] args) {
		
		// to_char(sysdate, 'YYYMMDD HH:MI:SS');
		// System.currentTimeMillis() == sysdate
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyMMdd hh:mm:ss"); // 대문자면 월 소문자면 분
		
		String result = sdf.format(System.currentTimeMillis());
		System.out.println(result);
		
	}
}
