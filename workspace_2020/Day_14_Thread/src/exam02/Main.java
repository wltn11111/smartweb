package exam02;

class Plus extends Thread {
	public void run() {
		while(true) {
			Main.target++;
		}
	}
}

class Minu extends Thread {
	public void run() {
		while(true) {
			Main.target--;
		}
	}
}

public class Main {
	
	public static int target = 0;
	
	public static void main(String[] args) {
		
		new Plus().start();
		new Minu().start();
		
		while(true) {
			System.out.println(target);
		}
		
	}
}
