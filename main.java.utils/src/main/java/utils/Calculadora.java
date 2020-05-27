package main.java.utils;

import main.java.utils.internal.*;

public class Calculadora {
    private Helper hp;

    public Calculadora(){
        hp = new Helper();
    }

    public Integer sum(Integer a, Integer b){
        return hp.getSum().execute(a,b);
    }

    public Integer sub(Integer a, Integer b){
        return hp.getSub().execute(a,b);
    }

    public Integer mult(Integer a, Integer b){
        return hp.getMult().execute(a,b);
    }

    public Integer div(Integer a, Integer b){
        return hp.getDiv().execute(a,b);
    }
}
