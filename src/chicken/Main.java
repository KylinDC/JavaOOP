package chicken;

public class Main {
    public static void main(String[] args) {
        getChickenCombination(100.0, 100);
    }

    public static void getChickenCombination(Double finance, int chickenTotalAmount) {
        Rooster rooster = new Rooster();
        Hen hen = new Hen();
        Chick chick = new Chick();

        for (int roosterAmount = 1;
                roosterAmount <= finance / rooster.getPrice();
                roosterAmount++) {
            for (int henAmount = 1; henAmount <= finance / hen.getPrice(); henAmount++) {
                int chickAmount = chickenTotalAmount - roosterAmount - henAmount;
                if (roosterAmount * rooster.getPrice()
                                + henAmount * hen.getPrice()
                                + chickAmount * chick.getPrice()
                        == finance) {
                    System.out.println(
                            "公鸡个数为："
                                    + roosterAmount
                                    + "\t母鸡个数为："
                                    + henAmount
                                    + "\t小鸡个数为："
                                    + chickAmount);
                }
            }
        }
    }
}
