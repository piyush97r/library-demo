package com.sessions;


import static java.lang.Math.sqrt;

public class Upgrad {
    public static boolean prime(int n) {
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
