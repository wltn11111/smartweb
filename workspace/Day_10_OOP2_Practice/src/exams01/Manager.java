package exams01;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	// Default Value (기본세팅값), 세팅하고 생성자만들면 변수값 먼저 대입, 그뒤에 생성자에서 값이있으면 덮어씌운다.
	private ArrayList<Movie> movies = new ArrayList<Movie>();	

	public void addMovie(Movie movies) {
		this.movies.add(movies);
	}	// 신규 영화 등록 가능

	public ArrayList<Movie> getMovies() {
		return movies;
	}	// 영화 목록 반환 가능

	public ArrayList<Movie> serchByTiltle(String  title) {

		ArrayList<Movie> result = new ArrayList<>();

		for(Movie mov: movies) {
			if(mov.getName().contains(title)) {		// 제목이 같은 영화를 찾아낸다면 가장 먼저 찾아낸 Movie instance를반환
				result.add(mov); 					// result ArrayList에 옮겨 저장
			}	
		}
		return result;	// 찾지 못하면 null값을 반환
	}

	public int getIndexByTitle(String  title) {

		for(int i =0; i < movies.size(); i++) {
			if(movies.get(i).getName().equals(title)) {
				return i;	//영화를 찾으면 해당 영화의 index 반환
			}
		}
		return -1;			// 영화를 찾지 못할시 -1 반환
	}

	public void updateByIndex(int index, Movie dst) {
		movies.set(index,dst);
	}

	public int deleteByTitle(String title){
		int index= this.getIndexByTitle(title);
		if(index == -1) {
			return index;	// 삭제하려는 영화가 없으면
							// -1을 반환하여 main에서 출력
		}
		else {
			movies.remove(index);
			return 0;		//삭제가 잘됐으면
							// 0을 반환하여 main에서 출력
		}
	}


} 


//	public void updateByTitle(Movie m, Movie dst) {
//
//		m.setName(dst.getName());
//		m.setGan(dst.getGan());
//		m.setStar(dst.getStar());
//
//	}	

/*
 * 	public void listMovie() {
		System.out.println("제목\t장르\t평점");
		for(int i=0; i < index; i++) {
			System.out.println(movies[i].getName()+"\t"+movies[i].getGan()+"\t"+movies[i].getStar());
		}	
	}

	public void searchMovie() {
		Scanner sc = Scanner(System.in);
		System.out.print("검색하려는 영화 제목 : ");
		String title = sc.nextLine();

		System.out.println("제목\t장르\t평점");
		for(int i = 0; i < index; i++) {
			if(movies[i]==null) {

				if(movies[i].getName().equals(title)) {
					System.out.println(movies[i].getName() +"\t"+movies[i].getGan()+"\t"+movies[i].getStar());
					break;
				}
			}

		}
	}
 * */
