package pl.anna.lesson1;

public class Main {
    public static void main(String[] args) {

        String name1="imie";
        User user=new User(name1,new Address("xx","cc","yy"));
        User user1=new User("aaa","bbb","ccc","ddd");
        User[] users=new User[]{user,user1};
        String streetName="Grunwaldzka";
        Street street=new Street(streetName,users);
        System.out.println(street.toString());
        System.out.println(user1.getAddress());
        System.out.println(user.getName().length());
        System.out.println(user.getAddress());



    }
}
