package exam03;

import javax.swing.JOptionPane;
class Countdoun extends Thread{
	public static int i =10;
	public static int score =0;

	public void run() {
		for(; i> 0; i--) {
			System.out.println(i);
			score++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("버틴 시간 : " + score);
		System.out.println("Game Over");
		System.exit(0);
	}
}

public class Main {
	public static void main(String[] args) throws Exception {

		String[] quiz = new String[] {
				"public static void main(String[] args)",
				"Scanner sc = new Scanner(System.in)",
				"DataOutputStream dos = new DataOutputStream(os)"
		};

		new Countdoun().start();

		while(true) {
			int index = (int)(Math.random()*3);

			String msg = JOptionPane.showInputDialog(quiz[index]);

			if(msg.equals(quiz[index])) {
				System.out.println("Success : times + 5");
				Countdoun.i+=5;
			}else {
				System.out.println("Wrong typing : time -3");
				Countdoun.i-=3;
			}
			System.out.println("현재 남은 시간 : " + Countdoun.i);
			
		}
	}
}
