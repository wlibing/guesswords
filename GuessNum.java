package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by ttc on 18-1-2.
 */
public class GuessNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = (int) (random.nextInt(1000)) + 1;
        int index = 1;
        while (true) {

            System.out.println("输入数");
            int n = scanner.nextInt();
            if (n > num) {
                System.out.println("太大");
            } else if (n == num) {
                System.out.println("祝贺你,共猜了" + index + "次");
                break;
            } else {
                System.out.println("太小");
            }
            index++;
        }

    }
}
