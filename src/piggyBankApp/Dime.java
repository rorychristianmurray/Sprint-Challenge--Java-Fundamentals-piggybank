package piggyBankApp;

public class Dime extends AbstractCoin {
    // fields/state
    // the initial state of value is hardcoded to a double of 1.00
    private double value = 0.10;
    private String coin = "Dime";

    // constructor
    public Dime(int add) {
        // initial state
        // super connects the add parameter to the AbstractCoin class, giving it the
        // same state
        super(add);
        this.value = value;

    }

    public Dime() {
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

    @Override
    public String removeCoin(int add) {
        this.add = this.add - add;
    }

}