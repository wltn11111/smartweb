package custom;

public class Car {
	
	// this : (자기참조변수)
	// 클래스를 바탕으로 인스턴스가 생성되면 , 클래스 내부에서 인스턴스 주소를 알수 있게
	// 자바에 의해 미리 준비된 멤버필드.(this)
	
	private String model;	// 메모리 위치상에서 다르기때문에 오류x
	private String color;	// 매개 변수는 heap, set은 stack
	private int price;		// this도 
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}



//model = model 은 매개변수랑 set변수 헷갈리지 않기위해
