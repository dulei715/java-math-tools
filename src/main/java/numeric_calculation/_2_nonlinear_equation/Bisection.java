package numeric_calculation._2_nonlinear_equation;

import numeric_calculation._0_basic_interface.BasicFunction;

public class Bisection {
    public static double[] getResult_v1(BasicFunction function, double a, double b, double precision) {
        double fA = function.getValue(a);
        double fB = function.getValue(b);
        double x, fX;
        double times = 0;
        if (fA * fB > 0) {
            return new double[]{(a+b)/2, times};
        }
        while (Math.abs(b - a)/2 > precision) {
            ++times;
            x = (a + b) / 2;
            fX = function.getValue(x);
            if (fX * fA < 0) {
                b = x;
                fB = fX;
            } else {
                a = x;
                fA = fX;
            }
        }
        return new double[]{(a+b)/2, times};
    }
}
