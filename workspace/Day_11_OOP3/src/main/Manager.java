package main;

import java.util.ArrayList;

import classes.Gold;
import classes.Member;
import classes.Silver;

public class Manager {
//	private Gold[] goldMembers = new Gold[10];
//	private Silver[] silverMembers = new Silver[10];
	private ArrayList<Member> member = new ArrayList<>();
	
	
//	private int goldindex=0;
//	private int silverindex=0;
	
	
	public void insert(Member member) {
		this.member.add(member);
	}

	public ArrayList getMember() {
		return member;
	}	

}
