package pensia_calc;

import oop.ETypeMan;
import oop.Man;

public class MilataryPensiaCala implements IPensiaCalc {
    @Override
    public double calc(Man man) {
        if (!man.getType().equals(ETypeMan.MILLITARY)) {
            return Integer.MIN_VALUE;
        }
        return 10 * man.getYearOld();
    }

}
