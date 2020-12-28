package main.java.botChat.stars;

public class Stars {
    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        String[] stars = new String[]{"1000 X", "100 Y", "10 Z", "1 *"};
        String result = "";
        int sum = getCount();

        while (sum > 0) {
            for (String exp : stars) {
                String[] parts = exp.split(" ");
                int currentStar = Integer.parseInt(parts[0]);

                while (sum >= currentStar) {
                    result += parts[1];
                    sum -= currentStar;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());
        System.out.println("+".repeat(15));
        stars.setCount(101);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }

}
