package numeric_calculation._2_nonlinear_euqation;

import cn.edu.ecnu.io.print.MyPrint;
import numeric_calculation._0_basic_interface.BasicFunction;
import numeric_calculation._2_nonlinear_equation.Bisection;
import org.junit.Test;

public class BisectionTest {
    @Test
    public void fun1() {
        BasicFunction basicFunction = (double... x) -> Math.exp(x[0]) - 2;
        double[] resultArray = Bisection.getResult_v1(basicFunction, -1, 1, 10e-6);
        MyPrint.showDoubleArray(resultArray);
    }
}
