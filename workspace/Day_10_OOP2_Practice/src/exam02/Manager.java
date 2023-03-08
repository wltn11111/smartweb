package exam02;

import java.util.ArrayList;

public class Manager {
	private ArrayList<CafeMenu> cafe = new ArrayList<CafeMenu>();

	public void addMenu(CafeMenu menu) {	//메뉴 등록
		cafe.add(menu);
	}
	
	public ArrayList<CafeMenu> serchByMenu(String name) {	// 메뉴 출력
		ArrayList<CafeMenu> result = new ArrayList<>();
		
		for(CafeMenu ca : cafe) {
			if(ca.getMen().contains(name)) {
				result.add(ca);
			}
		}
		return result;
	}
	
	public int indexMenu(String name){		// 메뉴 검색
		
		for(int i=0; i<cafe.size(); i++) {
			if(cafe.get(i).getMen().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public void updateMenu(int index, CafeMenu me) {
		cafe.set(index, me);
	}
	
	public int deleMenu(String st) {
		int index = this.indexMenu(st);
		if(index == -1) {
			return index;
		}else {
			cafe.remove(index);
			return 0;
		}
	}
	
	public ArrayList<CafeMenu> getCafe() {
		return cafe;
	}
	
	

}
