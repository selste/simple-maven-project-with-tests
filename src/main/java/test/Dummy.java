package test;

import java.math.BigDecimal;
import java.util.Random;

public class Dummy {
    /**
     * Führt eine - sinnlose - mathematische Operation aus
     *
     * @param value der übergebene Wert
     */
    public void anotherCalculation(long value) {
        final Random rnd = new Random();

        BigDecimal result = new BigDecimal(Math.abs(rnd.nextInt()) + rnd.nextDouble());
    }

}
