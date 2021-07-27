package com.cyyttaaioo.nowcoder.sfo;

public class JZ9 {

    public int jumpFloorII(int target) {
        //规律
        return target <= 0 ? 0 : 1 << (target - 1);

        //f[n] = f[n-1] + f[n-2] + ... + f[0]
        //f[n-1] = f[n-2] + f[n-3] + ... + f[0]
        //f[n] = 2*f[n-1]
        // 公式计算
        //    if (n==0 || n==1) return 1;
        //    int a = 1, b;
        //    for (int i=2; i<=n; ++i) {
        //        b = a << 1; //  口诀：左移乘2，右移除2
        //        a = b;
        //    }
        //    return b;

    }
}
