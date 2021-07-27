package com.cyyttaaioo.nowcoder.sfo;

public class JZ12 {
    public static double Power(double base, int exp) {
        boolean flag = exp < 0;
        if (flag) {
            exp = -exp;
        }
        double result = getPower(base, exp);
        return flag ? 1 / result : result;
    }

    public static double getPower(double base, int exp) {
        if (exp == 0) {
            return 1;
        }
        if (exp == 1) {
            return base;
        }
        double ans = getPower(base, exp >> 1);
        ans *= ans;
        if ((exp & 1) == 1) {
            ans *= base;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Power(2.000, 8));
    }
}
