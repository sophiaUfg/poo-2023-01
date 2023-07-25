package com.github.sophiaufg.t07.ensino;

public class TesteSomaNaturais {

    public static long SomaNaturais(int n) {
        int c = 1;
        long s = 0;

        while (c <= n) {
            s += c;
            c += 1;
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(SomaNaturais(10));
    }
}
