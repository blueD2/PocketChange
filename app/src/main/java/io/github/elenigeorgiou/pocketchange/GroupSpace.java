package io.github.elenigeorgiou.pocketchange;

import java.util.HashSet;
import java.util.ArrayList;

public class GroupSpace
{
    private HashSet<User> users;
    private ArrayList<ListItem> bucketList;
    private int ownerID;
    private String groupName;
    private static int groupID;

    public GroupSpace(User user, String name)
    {
        users =  new HashSet<User>();
        addUser(user);
        bucketList =  new ArrayList<ListItem>();
        ownerID = user.getUserID();
        groupName = name;
        groupID = getNextGroupID();
    }

    private int getNextGroupID()
    {
        return groupID++;
    }

    public void addUser(User u)
    {
        users.add(u);
    }
}
