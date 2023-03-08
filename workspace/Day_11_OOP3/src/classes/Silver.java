package classes;

public class Silver extends Member {

	public Silver(int id, String name, double point) {
		super(id, name, point);
	}

	public double getBonus() {				// 내용이없는 오버라이딩 내용을 채워주면 임플리먼트
		return this.getPoint() * 0.02;		// 로직 에러가 난다.	
		
	}
	
	// 부모클래스로부터 상속받은 메서드를 무시하고 동일한 프로토타입을 다시 정의하면
	// 상속받은 메서드를 덮어씌우는 효과를 가진다.
	// 추상메서드는 오버라이딩 재정의하라 강제한다.
	
	
}
