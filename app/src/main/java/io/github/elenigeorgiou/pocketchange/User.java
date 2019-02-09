package io.github.elenigeorgiou.pocketchange;

import java.util.HashSet;

public class User {
	private int userID;
    private static int nextUserID;
	private String username;
	private HashSet<GroupSpace> groupSpaces;

	public User(String u) {
	    username = u;
		userID = getNextUserID();
		groupSpaces = new HashSet<GroupSpace>();
	}

	private int getNextUserID(){ return nextUserID++; }

	public boolean addGroupSpace(GroupSpace gs) { return groupSpaces.add(gs); }
    public void removeGroupSpace(GroupSpace gs) { groupSpaces.remove(gs); }

	public int getUserID() { return userID; }
	public String getUsername() { return username; }
	public HashSet<GroupSpace> getGroupSpaces() { return new HashSet<GroupSpace>(groupSpaces);}
}