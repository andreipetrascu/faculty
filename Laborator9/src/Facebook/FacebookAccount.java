package Facebook;

import java.util.ArrayList;

public class FacebookAccount {
    private String name;
    private int age;
    private String location;
    private ArrayList<FacebookAccount> friends;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<FacebookAccount> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<FacebookAccount> friends) {
        this.friends = friends;
    }

    public FacebookAccount(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.friends = new ArrayList<FacebookAccount>();
    }

    public FacebookAccount() {
        this.friends = new ArrayList<FacebookAccount>();
    }

    public void addFriend(FacebookAccount friend) {
        this.friends.add(friend);
    }

    public String toString() {
        return this.name + " " + this.age + " " + this.location;
    }

    public void showFriends() {
        for (FacebookAccount i : this.friends) {
            System.out.println(i.toString());
        }
    }

    public void delete(FacebookAccount account) {
        this.friends.remove(account);
    }

    public ArrayList<FacebookAccount> search(String location) {
        ArrayList<FacebookAccount> newArray = new ArrayList<FacebookAccount>();
        for (FacebookAccount i : this.friends) {
            if (i.getLocation().equals(location))
                newArray.add(i);
        }
        return newArray;
    }
}
