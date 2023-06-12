    public class House {
    private double mortgage;
    private double energyCost;
    private double taxRate;

    public House(double mortgage, double energyCost, double taxRate) {
        this.mortgage = mortgage;
        this.energyCost = energyCost;
        this.taxRate = taxRate;
    }

    public double calculateTotalCost() {
        double energyCostFiveYears = energyCost * 5;
        double mortgagePlusEnergyCost = mortgage + energyCostFiveYears;
        double taxFiveYears = mortgage * taxRate * 5;
        return mortgagePlusEnergyCost + taxFiveYears;
    }

}
