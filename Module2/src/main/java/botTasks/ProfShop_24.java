package main.java.botTasks;

class ProfShop_24 {

    public boolean isPriceOk(int price) {
        return price != 1000;
    }

    public float calculateRegularDiscountPrice(float price) {
        return (float) (price * 0.9);
    }

    public boolean isDiscount50(int price) {
        return 4 * price == 1000;
    }

    public boolean isPriceHappy(int price, int year, int day) {
        return (price == year * day);
    }

    public static void main(String[] args) {

        ProfShop_24 shop = new ProfShop_24();

        System.out.println(shop.isPriceOk(1500));
        System.out.println(shop.calculateRegularDiscountPrice(1500));
        System.out.println(shop.isDiscount50(256));
        System.out.println(shop.isPriceHappy(23700, 3950, 6));
    }
}
