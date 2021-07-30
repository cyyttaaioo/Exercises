package com.cyyttaaioo.nowcoder.sfo;

public class JZ23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return recur(sequence, 0, sequence.length-1);
    }
    boolean recur(int[] sequence, int i, int j){

        if(i >= j - 1) return true;
        int p = i;
        while(sequence[p] < sequence[j]) p++;

        int m = p;
        while(sequence[p] > sequence[j]) p++;

        return p==j && recur(sequence, i, m - 1) && recur(sequence, m, j - 1);
    }
}
