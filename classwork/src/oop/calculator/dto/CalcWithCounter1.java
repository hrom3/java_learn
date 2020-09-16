package oop.calculator.dto;

public class CalcWithCounter1 {
        private final CalcWithOper calc1;
        private final CalcWithCopy calc2;
        private final CalcWithExtend calc3;
        private int count = 0;

        public CalcWithCounter1(CalcWithOper calc) {
            this.calc1 = calc;
            this.calc2 = null;
            this.calc3 = null;
        }

        public CalcWithCounter1(CalcWithCopy calc) {
            this.calc1 = null;
            this.calc2 = calc;
            this.calc3 = null;
        }

        public CalcWithCounter1(CalcWithExtend calc) {
            this.calc1 = null;
            this.calc2 = null;
            this.calc3 = calc;
        }

        public double add(double a, double b) {
           this.count++;
           if (this.calc1 != null) {
               return calc1.add(a, b);
           } else if (this.calc2 != null) {
               return calc2.add(a, b);
           } else {
               return calc3.add(a, b);
           }
        }

        public double minus(double a, double b) {
            this.count++;
            if (this.calc1 != null) {
                return calc1.minus(a, b);
            } else if (this.calc2 != null) {
                return calc2.minus(a, b);
            } else {
                return calc3.minus(a, b);
            }
        }

        public double mult(double a, double b) {
            this.count++;
            if (this.calc1 != null) {
                return calc1.mult(a, b);
            } else if (this.calc2 != null) {
                return calc2.mult(a, b);
            } else {
                return calc3.mult(a, b);
            }
        }

        public double div(double a, double b) {
            this.count++;
            if (this.calc1 != null) {
                return calc1.div(a, b);
            } else if (this.calc2 != null) {
                return calc2.div(a, b);
            } else {
                return calc3.div(a, b);
            }
        }

        public double mod(double a) {
            this.count++;
            if (this.calc1 != null) {
                return calc1.mod(a);
            } else if (this.calc2 != null) {
                return calc2.mod(a);
            } else {
                return calc3.mod(a);
            }
        }

        public double power(double a, int b) {
            this.count++;
            if (this.calc1 != null) {
                return calc1.power(a, b);
            } else if (this.calc2 != null) {
                return calc2.power(a, b);
            } else {
                return calc3.power(a, b);
            }
        }

        public double sqrt(double a) {
            this.count++;
            if (this.calc1 != null) {
                return calc1.sqrt(a);
            } else  if (this.calc2 != null) {
                return calc2.sqrt(a);
            } else {
                return calc3.sqrt(a);
            }
        }
}
