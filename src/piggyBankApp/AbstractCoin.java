package piggyBankApp;

public abstract class AbstractCoin {

    // fields/state
    protected int add;

    // constructor

    public AbstractCoin(int add) {
        // initial state
        this.add = add;
    }

    public AbstractCoin() {
        this.add = 1;
    }

    // abstract methods, will be implemented differently on each coin

    // gets value of coin
    public abstract double getValue();

    // gets amount of coins added to piggy bank
    public abstract int getAdd();

    // gets total value of coins added to piggy bank for subclass
    public abstract double getTotal();

    // Gets type of coin the subclass is
    public abstract String getCoin();

}