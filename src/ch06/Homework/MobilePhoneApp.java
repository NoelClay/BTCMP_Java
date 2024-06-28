package ch06.Homework;

public class MobilePhoneApp {

    public static void main(String[] args) {
        
        System.out.println("===== Object 1 =====");
        MobilePhone mp1 = new MobilePhone();
        mp1.setCompanyName("삼성전자");
        mp1.setProductName("Galaxy S23 Ultra");
        mp1.setOsName("Android");
        mp1.setColorName("black");
        mp1.setUsePen(true);
        mp1.setMemory(12);
        mp1.setStorage(512);
        mp1.setBattery(5000);
        
        mp1.PrintInfo();

        System.out.println("\n===== Object 2 =====");
        MobilePhone mp2 = new MobilePhone();
        mp2.setCompanyName("애플");
        mp2.setProductName("iPhone 14 Pro");
        mp2.setOsName("iOS");
        mp2.setColorName("gold");
        mp2.setUsePen(false);
        mp2.setMemory(8);
        mp2.setStorage(512);
        mp2.setBattery(5000);

        mp2.PrintInfo();
    }
}
