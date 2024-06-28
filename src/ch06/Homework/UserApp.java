package ch06.Homework;

public class UserApp {
    public static void main(String[] args) {
        
        System.out.println("===== Object 1 =====");
        User u1 = new User();
        u1.setName("James");
        u1.setAge(30);
        u1.setHeight(178.5F);
        u1.setSex('M');
        u1.setMarriageYn(true);
        u1.PrintInfo();
        
        System.out.println("\n===== Object 2 =====");
        User u2 = new User("Paige", 25, 'W');
        u2.setHeight(175.2F);
        u2.setMarriageYn(true);
        u2.PrintInfo();
        
        System.out.println("\n===== Object 3 =====");
        User u3 = new User("Victoria", 30, 'W', 180.0F, false);
        u3.PrintInfo();
    }
}

