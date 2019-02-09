import java.util.HashSet;

public class GroupSpace
{
    private Set<User> users;
    private List<ListItem> bucketList;
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
