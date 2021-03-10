package Facebook;

import Facebook.FacebookAccount;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        FacebookAccount account1 = new FacebookAccount("Andrei", 20, "Cluj");
        FacebookAccount account2 = new FacebookAccount("Iosif", 20, "Alba Iulia");
        FacebookAccount account3 = new FacebookAccount("Diana", 20, "Cluj");
        FacebookAccount account4 = new FacebookAccount("John", 20, "Cluj");
        FacebookAccount account5 = new FacebookAccount("Alex", 20, "Alba Iulia");

        account1.addFriend(account2);
        account1.addFriend(account3);
        account1.addFriend(account4);
        account1.addFriend(account5);

        account1.delete(account2);
        account1.showFriends();

        ArrayList<FacebookAccount> array = account1.search("Alba Iulia");
        System.out.println(array);

    }
}
