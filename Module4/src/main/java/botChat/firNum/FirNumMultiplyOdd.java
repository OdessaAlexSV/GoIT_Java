package main.java.botChat.firNum;

public class FirNumMultiplyOdd extends FirNum{

    @Override
    public int calc(int n) {
        int res = 1;
        while (n >= 1) {
            if (n % 2 !=0) {
                res *= n;
            }
            n--;
        }
        return res;
    }
/*
    @Override
    public int calc(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            if (i%2 != 0) {
                result *= i;
            }
        }
        return result;
    }
*/
}
