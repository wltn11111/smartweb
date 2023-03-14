package quiz03;

import java.util.ArrayList;

public class Manager {
	private ArrayList<Member> members = new ArrayList<Member>();

	public void addMember(Member mm) {
		members.add(mm);
	}
	
//	public int numMember() {
//		for(int i =0; i<members.size(); i++) {		
//				return i;		
//		}
//		return -1;
//	}
	
	public String menuMember() {
		String parsedContacts = "";
		
		for (Member m : members) {
			parsedContacts += m.getId()+"\t"+ m.getName() + "\t" + m.getPhone() + "\n";
		}
		return parsedContacts;	
	}
	
	public String changeName(String par) {
		String parsedContacts = "";
		
		for (Member m : members) {
			if(m.getName().contains(par)) {
				parsedContacts += m.getId()+"\t"+m.getName() + "\t" + m.getPhone() + "\n";
			}
		}
		return parsedContacts;
	}
	
	public int remoId(int a) {
		for (int i=0; i<members.size(); i++) {
			if(members.get(i).getId()==a) {
				members.remove(i);
				return i;
				
			}
		}
		return -1;
	}
	
	public ArrayList<Member> getMembers() {
		return members;
	}
	
	
}
