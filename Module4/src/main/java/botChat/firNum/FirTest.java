package main.java.botChat.firNum;

class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNum();
        FirTest firTest = new FirTest();

        //Should be 10
        System.out.println(firTest.test(firNum, 10));

        //Should be 6
        System.out.println(new FirNumSum().calc(3));

        System.out.println(firTest.test(firNum, 5));
        System.out.println(new FirNumFactorial().calc(4)); // возвращает 24
        System.out.println(new FirNumFactorial().calc(0)); // возвращает 1


        FirNum firNum2 = new FirNumMultiplyOdd();
        FirTest firTest2 = new FirTest();

        //Should be 15
        System.out.println(firTest2.test(firNum2, 5));

        //Should be 83
        System.out.println(new FirNumFizzBuzz().calc(20));

        //Should be 10
        System.out.println(new FirNumBasis().calc(9));
    }
}
