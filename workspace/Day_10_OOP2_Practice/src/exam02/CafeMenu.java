package exam02;

public class CafeMenu {

	private CafeMenu [] cafe= new CafeMenu[10];
	private int index=0;


	private int num;
	private String men;
	private int price;

	
	public void cafeadd(CafeMenu c) {
		cafe[index++]=c;
	}
	
	public CafeMenu[] getCafe() {
		return cafe;
	}

	public void setCafe(CafeMenu[] cafe) {
		this.cafe = cafe;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public CafeMenu() {

	}

	public CafeMenu(int sannum, String sanmung, int price) {
		this.num = sannum;
		this.men = sanmung;
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getMen() {
		return men;
	}

	public void setMen(String men) {
		this.men = men;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
