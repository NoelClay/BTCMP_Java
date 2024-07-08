package ch15.HW.PersonApp;

public class App {

    public static void main(String[] args) {

        Person p = new Person("Paige", 20);
        Student s = new Student("James", 30, "2023-001");
        Teacher t = new Teacher("Victoria", 40, "Music");

        Biz biz = new Biz();

        System.out.println("===== top() =====");
        biz.top(p); 
        biz.top(s);
        biz.top(t);

        System.out.println("\n===== down() =====");
        biz.down(p);
        biz.down(s);
        biz.down(t);
        
        Person[] personArray = new Person[3];
        personArray[0] = new Person("Paige", 20);
        personArray[1] = new Student("James", 30, "2023-001");
        personArray[2] = new Teacher("Victoria", 40, "Music");
        
        System.out.println("===== printInfo() =====");
        for(int i=0; i<personArray.length;i++) {
        	personArray[i].printInfo();
        }

    }
}
