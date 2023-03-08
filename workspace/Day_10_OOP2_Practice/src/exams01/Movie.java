package exams01;

import java.util.Scanner;

public class Movie {
	private String Name;
	private String Gan;
	private double Star;

	

	public Movie() {
		
	}

	public Movie(String name, String gan, double star) {
		this.Name = name;
		this.Gan = gan;
		this.Star = star;
		
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGan() {
		return Gan;
	}

	public void setGan(String gan) {
		Gan = gan;
	}

	public double getStar() {
		return Star;
	}

	public void setStar(double star) {
		Star = star;
	}

	public boolean equals(Object setName) {
		
		return false;
	}



}
