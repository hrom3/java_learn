package oop.calculator.dto;

public class CalcWithCounter2 {
        private final CalcWithOper calc1;
        private final CalcWithCopy calc2;
        private int count = 0;

        public CalcWithCounter2(CalcWithOper calc) {
            this.calc1 = calc;
            this.calc2 = null;
        }

        public CalcWithCounter2(CalcWithCopy calc) {
            this.calc1 = null;
            this.calc2 = calc;
        }

        public CalcWithCounter2(CalcWithExtend calc) {
            this.calc1 = calc;
            this.calc2 = null;
        }

        public double add(double a, double b) {
           this.count++;
           if (this.calc1 != null) {
               return calc1.add(a, b);
           } else {
               return calc2.add(a, b);
           }
        }

        public double minus(double a, double b) {
            this.count++;
            if (this.calc1 != null) {
                return calc1.minus(a, b);
            } else {
                return calc2.minus(a, b);
            }
        }

        public double mult(double a, double b) {
            this.count++;
            if (this.calc1 != null) {
                return calc1.mult(a, b);
            } else {
                return calc2.mult(a, b);
            }
        }

        public double div(double a, double b) {
            this.count++;
            if (this.calc1 != null) {
                return calc1.div(a, b);
            } else {
                return calc2.div(a, b);
            }
        }

        public double mod(double a) {
            this.count++;
            if (this.calc1 != null) {
                return calc1.mod(a);
            } else {
                return calc2.mod(a);
            }
        }

        public double power(double a, int b) {
            this.count++;
            if (this.calc1 != null) {
                return calc1.power(a, b);
            } else {
                return calc2.power(a, b);
            }
        }

        public double sqrt(double a) {
            this.count++;
            if (this.calc1 != null) {
                return calc1.sqrt(a);
            } else {
                return calc2.sqrt(a);
            }
        }
}
