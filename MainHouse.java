public class MainHouse {
     public static void main(String[] args) {
        double mortgage = 67000;
        double energyCost = 2300;
        double taxRate = 0.025;

        House house = new House(mortgage, energyCost, taxRate);

        double totalCost = house.calculateTotalCost();

        System.out.println("The total cost of the house in the next five years is: $" + totalCost);
    }
}
