public class RewardValue {
    double cashValue;
    double milesValue;

    private static final double CONVERSION_RATE = 0.0035;

    // * Constructor 1
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / CONVERSION_RATE;
    }

    // * Constructor 2
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * CONVERSION_RATE;
    }

    public double getCashValue(){
        return this.cashValue;
    }

    public double getMilesValue(){
        return this.milesValue;
    }
}