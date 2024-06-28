package ch06.Homework;

public class ShirtApp {

    public static void main(String[] args) {
        System.out.println("===== Object 1 =====");
        Shirt sl = new Shirt();
        sl.setName("코튼/린넨 버튼 다운 셔츠");
        sl.setColor("White");
        sl.setCompany("Wow");
        sl.setSize("L");
        sl.setPrice(35000);
        sl.printInfo();

        System.out.println("\n===== Object 2 =====");
        Shirt s2 = new Shirt("린넨 밴드칼라 하프 플라켓 셔츠", "black", 25000);
        s2.setCompany("Wow");
        s2.setSize("L");
        s2.printInfo();

        System.out.println("\n===== Object 3 =====");
        Shirt s3 = new Shirt("코튼/린넨 버튼 다운 셔츠", "blue", "Wow", "М", 30000);
        s3.printInfo();
    }
}
