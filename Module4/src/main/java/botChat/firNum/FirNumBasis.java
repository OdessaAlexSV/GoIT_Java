package main.java.botChat.firNum;

class FirNumBasis extends FirNum{

    @Override
    public int calc(int n) {
        int res = 0;
        while (n>=1) {
            if (n % 2 == 0){
                res += n;
            }
            n--;
        }
        return res/2;
    }
}
