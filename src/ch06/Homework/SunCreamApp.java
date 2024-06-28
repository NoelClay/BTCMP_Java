package ch06.Homework;

public class SunCreamApp {

    public static void main(String[] args) {
        
        // ================================
        // # 피부타입(SkinType)
        // - s(sensitive, 민감성),
        // - o(oily, 지성)
        // - n(neutral, 중성)
        // - d(dry, 건성)
        // ================================

        SunCream sc1 = new SunCream();
        sc1.setCompany("니베아");
        sc1.setName("선 페이스 수딩 센서티브 크림");
        sc1.setStickiness(false);  // 끈적임 여부
        sc1.setSkinType('s');
        sc1.setCapacity(50);  // 용량
        sc1.setSpf(50);
        sc1.setPa("+++");

        sc1.printInfo();
    }
}

