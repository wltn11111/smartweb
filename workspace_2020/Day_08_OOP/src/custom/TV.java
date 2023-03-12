package custom;

// 클래스를 더 좋게 만드는 방법
// 정보은닉 - 접근제한자 public, protected, package, private
// 외부에 노출 될 필요가 없는 정보를 private 키워드로 숨겨서
// 클래스 설계자의 의도대로 안정적인 클래스 운용이 가능하게 만드는 방식
// 클래스 설계자에게 안정성을 제공할 수 있음.
// 클래스 사용자의 편의성에도 영향을 미침.
// package : 자신과 같은 패키지 내에서만 가능.

public class TV {
	String brand;			// 접근제한자를 지정안해주면 기본 package 셋팅
	private int price;
	private int weight;
	private int channel;
	// 설계도에서 속성을 저장하는 변수 - 멤버 변수 ( Member Field )

	public void setChannel(int cha) {	// main에 channel값 한도 지정.									
		if(cha > 0 ) {					// method로 음수 판별 가능
			channel = cha;
		}
	}

	public int getChannel() {	
		return channel;
	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
			this.brand = brand;	
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPirce() {
		return price;
	}

	public void setPirce(int pirce) {
		this.price = pirce;
	}

	void powerON() {}
	void powerOFF() {}
	// Member Method


	// Constructor


	// Nested Class


}

// public : 모든곳에서 접근가능
// private : 

