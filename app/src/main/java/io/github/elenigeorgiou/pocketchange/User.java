package io.github.elenigeorgiou.pocketchange;

import java.util.HashSet;

public class User {
	private int userID;
	private String username;
	private HashSet<GroupSpace> groupSpaces;
	private static int nextUserID;

	public User(String u) {
	    username = u;
		userID = getNextUserID();
		groupSpaces = new HashSet<GroupSpace>();
	}

	private int getNextUserID(){ return nextUserID++; }
}