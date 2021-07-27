package com.cyyttaaioo.nowcoder.sfo;

public class JZ7 {
    public int Fibonacci(int n) {
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }

        int sum = 1;
        int one = 0;

        //第n项 F(n) = F(n - 1) + F(n - 2)
        //F(n - 1) = F(n) - F(n - 2)
        //eg: F(5) = F(4) + F(3)
        for(int i = 2; i <= n; i++){
            sum = sum + one;//F(5) = F(4) + F(3)
            one = sum - one;//F(4) = F(5) - F(3)
        }
        return sum;
    }
}
