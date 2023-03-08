package classes;

public class Gold extends Member{

	public Gold(int id, String name, double point) {
		super(id, name, point);
	} 	
	
	public double getBonus() {
		return this.getPoint()*0.04;
	}
	// extends  상속
	// super 부모클래스
	// derived 자식클래스
	
	


}
