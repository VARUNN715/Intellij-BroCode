package Static_keyword;

public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Varun");
        Friend friend2 = new Friend("Venki");
        Friend friend3 = new Friend("Shiva");

        System.out.println(Friend.numberOfFriends);
    }
}
