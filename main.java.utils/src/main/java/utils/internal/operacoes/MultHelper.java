package main.java.utils.internal.operacoes;

import main.java.utils.internal.Operacao;

public class MultHelper implements Operacao {
    @Override
    public Integer execute(Integer a, Integer b) {
        return a * b;
    }
}
