package quiz02;

import java.util.ArrayList;

public class Manager {
	private ArrayList<Contact> serv = new ArrayList<Contact>();
	
	public void addServer(Contact s) {
		this.serv.add(s);
	}
	
	public ArrayList<Contact> getServ() {
		return serv;
	}

	

//	public int indexServer(Server se) {
//		for(int i=0; i< serv.size(); i++) {
//			int sum =0;
//			return sum=i+1;
//		}
//		return -1;
//	}
}




