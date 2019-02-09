package io.github.elenigeorgiou.pocketchange;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class GroupSpace implements Serializable
{
    private HashSet<User> users;
    private ArrayList<ListItem> bucketList;
    private int ownerID;
    private String groupName;
    private static int groupID;
    private static HashMap<Integer, GroupSpace> allGroups = new HashMap<Integer, GroupSpace>();

    public GroupSpace(User user, String name)
    {
        users =  new HashSet<User>();
        addUser(user);
        bucketList =  new ArrayList<ListItem>();
        ownerID = user.getUserID();
        groupName = name;
        groupID = getNextGroupID();
        allGroups.put(groupID, this);
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

    public ArrayList<ListItem> generateList(int price, HashSet<Integer> categories)
    {
        ArrayList<ListItem> results = new ArrayList<ListItem>();

        //loop through and remove items that don't match criteria
        for (ListItem item: bucketList) {
            if(item.getPrice() <= price || categories.contains(item.getCategory()))
                results.add(item);
        }

        return results;
    }

    public ListItem pickRandom(int price, HashSet<Integer> categories)
    {
        ArrayList<ListItem> list = generateList(price,categories);
        if(list.size() == 0)
            return bucketList.get((int)(Math.random()*list.size()));
        else
            return list.get((int)(Math.random()*list.size()));
    }

    public static GroupSpace getGroupFromID(String gid) { return allGroups.get(Integer.parseInt(gid)); }
}
