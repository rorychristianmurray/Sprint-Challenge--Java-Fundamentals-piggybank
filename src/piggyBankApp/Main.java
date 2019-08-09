package piggyBankApp;

// import libraries/dependencies
import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // add formatting
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        // create ArrayList holding AbstractCoin types as items
        ArrayList<AbstractCoin> piggyBank = new ArrayList<>();

        // add items to ArrayList
        piggyBank.add(new Dollar());
        piggyBank.add(new Dollar());

        // Output
        System.out.println("*** OUTPUT ***");
        System.out.println();
        System.out.println();

        System.out.println("*** piggyBank ***");
        System.out.println();
        System.out.println();
        System.out.println(piggyBank);

        System.out.println("*** piggyBank coin value ***");
        System.out.println();
        System.out.println();

        for (AbstractCoin c : piggyBank) {
            System.out.println(c.getValue());
        }

        System.out.println();
        System.out.println();

        System.out.println("*** PIGGY BANK CURRENT CONTENTS ***");
        System.out.println();
        System.out.println();

        for (AbstractCoin c : piggyBank) {

            if (c.getAdd() > 1) {
                System.out.println(c.getAdd() + " " + c.getCoin() + "s");

            } else {
                System.out.println(c.getAdd() + " " + c.getCoin());
            }

        }

        System.out.println();
        System.out.println();

        double myValue = 0;

        for (AbstractCoin c : piggyBank) {
            myValue += c.getTotal();
        }

        System.out.println("The piggy bank holds " + fp.format(myValue));
        System.out.println();
    }
}