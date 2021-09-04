package com.bl.BirdSanctuary;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BirdSancturayRepository {

	private static BirdSancturayRepository instance;
	private Set<Bird> birdList = new HashSet<>();
 BirdSancturayRepository() {

	}

	static synchronized BirdSancturayRepository getInstance() {
		if (instance == null) {
			instance = new BirdSancturayRepository();
		}
		return instance;
	}

	public void add(Bird bird) {
		birdList.add(bird);
	}

	public void remove(Bird bird) {
		birdList.remove(bird);
	}
	
	
	public Bird getBird(String name) {
		for (Bird items : birdList) {
			if (items.name.equals(name)) {
				return items;
			}
		}
		return null;
	}
	
	public Set<Bird> getAllBirds() {
		return birdList;
	}
	
	public int getTotalBird() {
		return birdList.size();
	}

}
