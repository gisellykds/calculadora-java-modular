package main.java.utils.internal;

import main.java.utils.internal.operacoes.DivHelper;
import main.java.utils.internal.operacoes.MultHelper;
import main.java.utils.internal.operacoes.SubHelper;
import main.java.utils.internal.operacoes.SumHelper;

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

    public void setDiv(DivHelper div) {
        this.div = div;
    }

    public MultHelper getMult() {
        return mult;
    }

    public void setMult(MultHelper mult) {
        this.mult = mult;
    }

    public SumHelper getSum() {
        return sum;
    }

    public void setSum(SumHelper sum) {
        this.sum = sum;
    }

    public SubHelper getSub() {
        return sub;
    }

    public void setSub(SubHelper sub) {
        this.sub = sub;
    }
}
