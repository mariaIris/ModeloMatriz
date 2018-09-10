package com.example.aluno.modelomatriz;

class Gestacao {

    private int qtdPartos;
    private int qtdMachos;
    private  int qtdFemeas;
    private int qtdMortalidade;
    private int qtdDesmame;

    public Gestacao() {
    }

    public Gestacao(int qtdPartos, int qtdMachos, int qtdFemeas, int qtdMortalidade, int qtdDesmame) {
        this.qtdPartos = qtdPartos;
        this.qtdMachos = qtdMachos;
        this.qtdFemeas = qtdFemeas;
        this.qtdMortalidade = qtdMortalidade;
        this.qtdDesmame = qtdDesmame;
    }

    public int getQtdPartos() {
        return qtdPartos;
    }

    public void setQtdPartos(int qtdPartos) {
        this.qtdPartos = qtdPartos;
    }

    public int getQtdMachos() {
        return qtdMachos;
    }

    public void setQtdMachos(int qtdMachos) {
        this.qtdMachos = qtdMachos;
    }

    public int getQtdFemeas() {
        return qtdFemeas;
    }

    public void setQtdFemeas(int qtdFemeas) {
        this.qtdFemeas = qtdFemeas;
    }

    public int getQtdMortalidade() {
        return qtdMortalidade;
    }

    public void setQtdMortalidade(int qtdMortalidade) {
        this.qtdMortalidade = qtdMortalidade;
    }

    public int getQtdDesmame() {
        return qtdDesmame;
    }

    public void setQtdDesmame(int qtdDesmame) {
        this.qtdDesmame = qtdDesmame;
    }

    public int qtdFilhotes(){
        return qtdFemeas + qtdMachos;
    }

    public double taxaMortalidade(){
        return (qtdMortalidade/qtdFilhotes())*100;
    }
}
