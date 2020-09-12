package pensia_calc;

import oop.ETypeMan;
import oop.Man;

public class PresidentPensiaCala implements IPensiaCalc {
    @Override
    public double calc(Man man) {
        if (!man.getType().equals(ETypeMan.PPRESIDENT)) {
            return Integer.MIN_VALUE;
        }
        return 0;
    }

}
