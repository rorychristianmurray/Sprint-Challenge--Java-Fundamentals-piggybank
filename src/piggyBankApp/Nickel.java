package piggyBankApp;

public class Nickel extends AbstractCoin {
    // fields/state
    // the initial state of value is hardcoded to a double of 1.00
    private double value = 0.05;
    private String coin = "Nickel";

    // constructor
    public Nickel(int add) {
        // initial state
        // super connects the add parameter to the AbstractCoin class, giving it the
        // same state
        super(add);
        this.value = value;

    }

    public Nickel() {
        // initial state coming in from AbstractCoin
    }

    // declare abstract methods

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public double getTotal() {
        return value * add;
    }

    @Override
    public int getAdd() {
        return add;
    }

    @Override
    public String getCoin() {
        return coin;
    }

}