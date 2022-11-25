package org.example;
import java.util.Scanner;
public enum MonthEnum {
        January(1),February(2),March(3),April(4),May(5),June(6),July(7),August(8),September(9),October(10),November(11),December(12);
        private int month;
        private MonthEnum(int month)
        {
            this.month = month;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();

            for (MonthEnum m: MonthEnum.values()) {
                if (m.month==x) {
                    System.out.println(m);
                }
            }
        }
}

