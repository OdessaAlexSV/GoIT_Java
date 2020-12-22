package main.java.botChat;

public class CheapStocks {

    public String getCheapStocks(String[] stocks) {
        String result = " ";
        for (String exp : stocks) {
            String[] parts = exp.split(" ");
            if (Integer.parseInt(parts[1]) < 200){
                result += parts[0]+" ";
            }
        }
        return result.strip();
    }

    public static void main(String[] args) {
        CheapStocks goods = new CheapStocks();

        System.out.println(goods.getCheapStocks(new String[] {"gun 500", "firebow 70", "pixboom 200"}));
    }
}
