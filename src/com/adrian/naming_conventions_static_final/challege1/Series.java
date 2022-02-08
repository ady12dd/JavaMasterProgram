package com.adrian.naming_conventions_static_final.challege1;

public class Series {
    public static int nSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    static int prev=0;
    static int next=1;
    public static int fibonacci(int n) {
        Integer fibonaci=0;
        for(int i=0;i<n;i++){
            prev=next;
            next=fibonaci;
            fibonaci=prev+next;
        }
        return fibonaci;
    }
}
