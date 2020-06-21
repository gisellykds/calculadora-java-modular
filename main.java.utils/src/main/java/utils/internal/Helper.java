package main.java.utils.internal;

import main.java.utils.internal.operacoes.*;

public class Helper {

    private DivHelper div;
    private MultHelper mult;
    private SumHelper sum;
    private SubHelper sub;

    public Helper(){
        div = new DivHelper();
        mult = new MultHelper();
        sum = new SumHelper();
        sub = new SubHelper();
    }

    public DivHelper getDiv() {
        return div;
    }

    public MultHelper getMult() {
        return mult;
    }


    public SumHelper getSum() {
        return sum;
    }

    public SubHelper getSub() {
        return sub;
    }

}
