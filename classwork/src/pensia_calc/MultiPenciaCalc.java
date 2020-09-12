package pensia_calc;

import oop.Man;

public class MultiPenciaCalc implements IPensiaCalc {

    @Override
    public double calc(Man man) {
        return getCalculator(man).calc(man);
    }

    public static IPensiaCalc getCalculator(Man man) {
        switch (man.getType()) {
            case PRESIDENT:
                return new PresidentPensiaCala();
            case MILITARY:
                return new MilataryPensiaCala();
            case HUMAN:
            default:
                return new HumanPensiaCala();
        }
    }
}
