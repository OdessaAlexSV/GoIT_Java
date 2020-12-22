package main.java.botChat;

import java.util.Arrays;

public class UberShop {

    public void printPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i] + " jup.");
        }
        System.out.println("---------------------");
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            float newPrice = (prices[i] < 1000) ? prices[i] * 2 : (float) (prices[i] * 1.5);
            prices[i] = newPrice;

//            if (prices[i] < 1000) {
//                prices[i] *= 2f;
//            } else {
//                prices[i] *= 1.5f;
//            }
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
//        if (prices.length == 0) {
//            return new int[0];
//        } else {
//            int tmp;
//            for (int i = 0; i < prices.length - 1; i++) {
//                for (int j = 0; j < prices.length - 1; j++) {
//                    if (prices[j] >= prices[j + 1]) {
//                        tmp = prices[j];
//                        prices[j] = prices[j + 1];
//                        prices[j + 1] = tmp;
//                    }
//                }
//            }
//        }
//
//        if (prices[0] == prices[prices.length-1]) {
//            return new int[]{prices[0]};
//        } else {
//            return new int[]{prices[0], prices[prices.length-1]};
//        }

        if (prices.length == 0) {
            return new int[0];
        }

        int min = prices[0];
        int max = prices[0];

        for (int price : prices) {
            if (price > max) {
                max = price;
            }

            if (price < min) {
                min = price;
            }
        }

        if (min == max) {
            return new int[]{min};
        }

        return new int[]{min, max};
    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
        }

        int counter = 0;
        for (int price : prices) {
            if (price == min) {
                counter++;
            }
        }
        return counter;
    }

    public int[] removePrice(int[] prices, int toRemove) {
        int counter = 0;
        for (int price : prices) {
            if (price != toRemove) {
                counter++;
            }
        }

        int[] result = new int[counter];

        int poz = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] != toRemove) {
                result[poz] = prices[i];
                poz++;
            }
        }
        return result;
    }

    public int[] leavePrice9(int[] prices) {
        int counter = 0;
        if (prices.length == 0) {
            return new int[0];
        }

        for (int price : prices) {
            if (price % 10 == 9) {
                counter++;
            }
        }

        int[] result = new int[counter];
        counter = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                result[counter] = price;
                counter++;
            }
        }
        return result;
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        String[] result = new String[showcaseStocks.length + warehouseStocks.length];

        int index = 0;
        for(String stock: showcaseStocks) {
            result[index] = stock;
            index++;
        }

        for(String stock: warehouseStocks) {
            result[index] = stock;
            index++;
        }

        return result;
    }

    public int getPricesSum(int[] prices, int minPrice, int maxPrice) {
        int result = 0;
        for (int price : prices) {
            if (price >= minPrice && price <= maxPrice){
                result += price;
            }
        }
        return result;
    }

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
//        float[] prices = new float[]{100f, 23.5f, 400f};
//        shop.printPrices(prices);
//        shop.multiplyPrices(prices);
//        System.out.println(Arrays.toString(prices));


        //Should be [200, 2250]
//        float[] prices = new float[]{402.78f, 293.71f, 126.49f};
//        shop.multiplyPrices(prices);
//        System.out.println(Arrays.toString(prices));

        //Should be [50, 1500]
//        int[] prices = new int[]{100, 1500, 300, 50};
//        int[] minMax = shop.findMinMaxPrices(prices);
//        System.out.println(Arrays.toString(minMax));

        //Should be [50, 1500]
//        int[] prices = new int[]{100, 1500, 300, 50, 10, 10, 70};
//        System.out.println(shop.getMinPriceCount(prices)); //Should be 2

        //Should be [150, 200]
//        int[] prices = new int[]{150, 100, 200};
//        int toRemove = 100;
//        System.out.println(Arrays.toString(shop.removePrice(prices, toRemove)));

        //Should be [1599, 399]
//        int[] prices = new int[] {399, 1599, 399, 50, 10, 10, 70};
//        System.out.println(Arrays.toString(shop.leavePrice9(prices)));

        //Final result should be ["gun", "firebow", "firegun"]
//        String[] showcaseStocks = new String[]{"gun", "firebow"};
//        String[] warehouseStocks = new String[]{"firegun"};
//        System.out.println(Arrays.toString(shop.mergeStocks(showcaseStocks, warehouseStocks)));

        //Should be 144 - 20 + 50 + 40 + 34
        int[] prices = new int[] {10, 20, 50, 40, 34, 500};
        System.out.println(shop.getPricesSum(prices, 20, 50));
    }

}


