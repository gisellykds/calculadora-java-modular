package main.java.utils;

import main.java.utils.internal.DivHelper;
import main.java.utils.internal.MultHelper;
import main.java.utils.internal.SubHelper;
import main.java.utils.internal.SumHelper;

public class Calculadora {

    private DivHelper div;
    private MultHelper mult;
    private SumHelper sum;
    private SubHelper sub;

    public Calculadora(){
        div = new DivHelper();
        mult = new MultHelper();
        sum = new SumHelper();
        sub = new SubHelper();
    }

    public Integer sum(Integer a, Integer b){
        return sum.execute(a,b);
    }

    public Integer sub(Integer a, Integer b){
        return sub.execute(a,b);
    }

    public Integer mult(Integer a, Integer b){
        return mult.execute(a,b);
    }

    public Integer div(Integer a, Integer b){
        return div.execute(a,b);
    }
}
