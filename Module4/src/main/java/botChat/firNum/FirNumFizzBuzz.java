package main.java.botChat.firNum;

public class FirNumFizzBuzz extends FirNum {

    @Override
    public int calc(int n) {
        int res = 0;
        while (n >= 1) {
            if ((n % 3 == 0) ^ (n % 5 == 0)) {
                res += n;
            }
            n--;
        }
        return res;
    }

/*
    @Override
    public int calc(int n) {
        int res = 0;
        while (n >= 1) {
            if ((n % 3 == 0 && n % 5 == 0)) {
            } else if (n % 3 == 0) {
                res += n;
            } else if (n % 5 == 0) {
                res += n;
            }
            n--;
        }
        return res;
    }

    @Override
    public int calc(int n) {
        int result = 0;
        for(int i = 1; i <= n; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 15 == 0)) {
                result += i;
            }
        }
        return result;
    }
*/
}
