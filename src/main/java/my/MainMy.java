package my;

import java.util.*;

public class MainMy {
    public static void main(String[] args) {


        RandomsMy randomsMy = new RandomsMy()
                .addMax(100)
                .addMin(80)
                .addLimit(50)
                .creatArray();
        for (int i : randomsMy.array) {
            System.out.println("Случайное число: " + i);
            if (i == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }

    }
}
