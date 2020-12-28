package main.java.botChat.firNum;

class FirNumSum extends FirNum {

    @Override
    public int calc(int n) {
        if (n == 0)  {
           return 0;
        }
        return n + calc(n - 1);
    }
/*
    @Override
    public int calc(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
*/
}
