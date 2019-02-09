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

    //for private use
    private int getNextGroupID()
    {
        return groupID++;
    }

    //for public use
    public HashSet<User> getUsers()
    {
        return users;
    }

    public ArrayList<ListItem> getBucketList()
    {
        return bucketList;
    }

    public int getOwnerID()
    {
        return ownerID;
    }

    public String getGroupName()
    {
        return groupName;
    }

    public int getGroupID()
    {
        return groupID;
    }

    public void addUser(User u)
    {
        users.add(u);
    }

    public void removeUser(User u)
    {
        users.remove(u);
    }

    public void addListItem(ListItem item)
    {
        bucketList.add(item);
    }

    public void removeListItem(ListItem item)
    {
        bucketList.remove(item);
    }
}
