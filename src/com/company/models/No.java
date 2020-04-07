package com.company.models;

public class No {
    private int valor;
    private No esq;
    private No dir;

    public No(int valor, No esq, No dir) {
        this.valor = valor;
        this.esq = esq;
        this.dir = dir;
    }

    public No(){}

    public int getValor() {
        return valor;
    }

    public No getEsq() {
        return esq;
    }

    public No getDir() {
        return dir;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "Arvore{" +
                "valor=" + valor +
                ", esq=" + esq +
                ", dir=" + dir +
                '}';
    }
}
