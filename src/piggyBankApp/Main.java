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
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

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

        // get total amount of coin sub class

        // declare coin variabes
        // loop through piggy bank
        // when find a coin, add it to running coin total
        // print coin totals

        // declare coin variabes
        int dime = 0;
        int dollar = 0;
        int nickel = 0;
        int penny = 0;
        int quarter = 0;

        // loop through piggy bank
        // when find a coin, add it to running coin total

        for (AbstractCoin c : piggyBank)
        {
            if (c.getCoin == "Dime")
            {
                dime += c.getAdd()
            }
            if else (c.getCoin == "Dollar")
            {
                dollar += c.getAdd()
            }
            if else (c.getCoin == "Nickel")
            {
                nickel += c.getAdd()
            }
            if else (c.getCoin == "Penny")
            {
                penny += c.getAdd()
            }
            if else (c.getCoin == "Quarter")
            {
                quarter += c.getAdd()
            }
        }

        // print coin totals
        
        for (AbstractCoin c : piggyBank)
        {
            System.out.println("Dollar: " + dollar)
            System.out.println("Quarter: " + quarter)
            System.out.println("Dime: " + dime)
            System.out.println("Nickel: " + nickel)
            System.out.println("Penny: " + penny)
        }

    }
}