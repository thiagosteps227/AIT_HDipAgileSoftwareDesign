package ait.com.catpoundexercise;

import java.util.ArrayList;
import java.util.List;

public class CatPound {
	
	List<Cat> cats = new ArrayList<Cat>();
	
	public void addCat(Cat aCat) {
		aCat.setName(aCat.getName());
		aCat.setAge(aCat.getAge());
		aCat.setColor(aCat.getColor());
		cats.add(aCat);
	}
	
	public int getNumberOfCats() {
		int numberOfCats = 0;
		for(int i=0; i<cats.size();i++) {
			numberOfCats += 1;
		}
		return numberOfCats;
	}

	public void removeCat(Cat aCat) {
		cats.remove(aCat);
	}
	
	public boolean searchCat(String name) {
		boolean catFound = false;
		for(Cat cat: cats) {
			if(cat.getName().contains(name)) {
				catFound = true;
			}
		}
		return catFound;
	}
	
	public boolean findCat(Cat aCat) {
		boolean catIsThere = false;
		for (Cat cat: cats) {
			if(cats.contains(aCat)) {
				catIsThere = true;
			}
		};
		
		return catIsThere;
	}
	
	public int getNumberOlderThan(int age) {
		
		int catsOlderThanAge = 0;
		for(Cat cat: cats) {
			int lookedAge = cat.getAge();
			if(lookedAge > age) {
				catsOlderThanAge = catsOlderThanAge + 1;
			} 
		}
		return catsOlderThanAge;
	}
	
}
