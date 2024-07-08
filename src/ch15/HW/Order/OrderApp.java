package ch15.HW.Order;

import java.util.*;

public class OrderApp {

    public static void main(String[] args) {

        // ===== 주문 1 =====
        List<Menu> menuList1 = new ArrayList<Menu>();
        menuList1.add(new Coffee("아메리카노", 3000, "에티오피아 예가체프"));
        menuList1.add(new Coffee("카푸치노", 3500, "케냐 오클랜드"));
        menuList1.add(new Ade("레몬에이드", 4000, "레몬,시럽"));

        Order order1 = new Order(menuList1);
        order1.printOrder();

        // ===== 주문 2 =====
        List<Menu> menuList2 = new ArrayList<Menu>();
        menuList2.add(new Coffee("아메리카노", 3000, "에티오피아 예가체프"));

        Order order2 = new Order(menuList2);
        order2.printOrder();

        // ===== 주문 3 =====
        List<Menu> menuList3 = new ArrayList<Menu>();
        menuList3.add(new Ade("한라봉에이드", 4000, "한라봉,시럽"));
        menuList3.add(new Ade("레몬에이드", 4000, "레몬,시럽"));

        Order order3 = new Order(menuList3);
        order3.printOrder();

        // ===== 정산 =====
        Order.printSummary();
    }
}

