package org.example;

public class RelationOperator {
    public static void main(String[] args) {
        class Main {
            public static void main(String[] args) {
                int a = 7, b = 11;
                System.out.println("a is " + a + " and b is " + b);
                System.out.println(a == b);  // false
                System.out.println(a != b);  // true
                System.out.println(a > b);  // false
                System.out.println(a < b);  // true
                System.out.println(a >= b);  // false
                System.out.println(a <= b);  // true
            }
        }
    }
}
