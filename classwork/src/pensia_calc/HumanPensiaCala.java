package pensia_calc;

import oop.ETypeMan;
import oop.Man;

public class HumanPensiaCala implements IPensiaCalc {
    @Override
    public double calc(Man man) {
        if (!man.getType().equals(ETypeMan.HUMAN)) {
            return Integer.MIN_VALUE;
        }
        return 7 * man.getYearOld() * man.getHairLength();
    }

}
