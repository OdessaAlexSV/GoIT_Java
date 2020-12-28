package main.java.botChat.firNum;

public class FirNumFactorial extends FirNum {

    @Override
    public int calc(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calc(n - 1);
    }
/*
    @Override
    public int calc(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
*/
}

