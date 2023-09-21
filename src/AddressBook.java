import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfos;

    public AddressBook() {
        buddyInfos = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddyInfo) {
        if (!buddyInfos.contains(buddyInfo)) {
            buddyInfos.add(buddyInfo);
        }
    }

    public void removeBuddy(BuddyInfo buddyInfo) {
        buddyInfos.remove(buddyInfo);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
