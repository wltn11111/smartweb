package main;

import java.util.ArrayList;
import java.util.Scanner;

import classes.Gold;
import classes.Member;
import classes.Ruby;
import classes.Silver;

public class Main {
	public static void main(String[] args) {
		
		
		// 상속
		// 다형성
		// 추상화
		
		
		// Collection
		// 배열 문제를 해결하기 위한 첫 번째 대안
		// 1. 동적 배열 - Vector -> ArrayList
		// 2. LinkedList 
		// 3. Hash / Tree
		
		// 회원관리 시스템
		// 등급 클래스 설계 ( Silver )
		// 회원 ID
		// 회원 이름
		// 회원 포인트
		
		
		// 완성된 코드 문제점 3가지
		// 코드 중복도 (유지 보수 문제점) - 상속 [ IS - A 관계 ]
		// 코드 결합도 (유지 보수 문제점) - 다형성 
		// 저장소 - Collection
		
		
		Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();
		
		
		while(true) {
			System.out.println("===회원 관리 시스템===");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 출력");
			System.out.println("0.종료");
			System.out.print(">>");
			int menu = Integer.parseInt(sc.nextLine());
			
			if(menu==1) {
				
				manager.insert(new Silver(1001, "Tom",1000));
				manager.insert(new Silver(1002, "Jane", 2000));
				manager.insert(new Silver(1003, "Mike", 3000));
				manager.insert(new Gold(1004, "Susan", 4000));
				manager.insert(new Ruby(1005, "jung", 6000));
							
			}else if(menu==2) {

				ArrayList<Member> members = manager.getMember();
				
				System.out.println("ID\tName\tpoint\tbonus");
				
				for(Member mem : members) {
					System.out.println(mem.getId()+"\t"
										+mem.getName()+"\t"
										+mem.getPoint()+"\t"
										+mem.getBonus());
				}	// member. 까지는 ArrayList, members.get(i)까지 Object, getId() int
				
			
			}else if(menu==0) {
				System.out.println("회원 관리 종료");
				System.exit(0);
			}
		}
		
	}
}
