//package ch15.HW.BookStore;
//
//import java.util.*;
//
//public class OrderApp {
//
//    public static void main(String[] args) {
//
//        // ===== 주문 1 =====
//        List<Book> menuList1 = new ArrayList<Book>();
//        menuList1.add(new Coffee("아메리카노", 3000, "에티오피아 예가체프"));
//        menuList1.add(new Coffee("카푸치노", 3500, "케냐 오클랜드"));
//        menuList1.add(new Ade("레몬에이드", 4000, "레몬,시럽"));
//
//        Biz order1 = new Biz(menuList1);
//        order1.printOrder();
//
//        // ===== 주문 2 =====
//        List<Book> menuList2 = new ArrayList<Book>();
//        menuList2.add(new Coffee("아메리카노", 3000, "에티오피아 예가체프"));
//
//        Biz order2 = new Biz(menuList2);
//        order2.printOrder();
//
//        // ===== 주문 3 =====
//        List<Book> menuList3 = new ArrayList<Book>();
//        menuList3.add(new Ade("한라봉에이드", 4000, "한라봉,시럽"));
//        menuList3.add(new Ade("레몬에이드", 4000, "레몬,시럽"));
//
//        Biz order3 = new Biz(menuList3);
//        order3.printOrder();
//
//        // ===== 정산 =====
//        Biz.printSummary();
//    }
//}
//
