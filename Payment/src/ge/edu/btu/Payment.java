package ge.edu.btu;

import org.apache.log4j.Logger;

public class Payment {

    static Logger logger = Logger.getLogger(Payment.class);

    public static void main(String[] args) {
        Electricity electricity = new Electricity("Electricity", 44.45);
        Water water = new Water("Water", 44.5);
        pay(water);
        pay(electricity);
    }

    public static <T> void pay(T x) {
        logger.info(x);
    }
}
