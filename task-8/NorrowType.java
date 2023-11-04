package org.example;

public class NorrowType {
    public static void main(String[] args) {
        byte b=10;
        double l=b;
        int c=(int)l;
        System.out.println(b);
        System.out.println(l);
System.out.println(c);
}
}
