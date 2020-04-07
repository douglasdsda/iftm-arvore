package com.company.models;

public class Arvore {
    private int valor;
    private Arvore esq;
    private Arvore dir;

    public Arvore(int valor, Arvore esq, Arvore dir) {
        this.valor = valor;
        this.esq = esq;
        this.dir = dir;
    }

    public int getValor() {
        return valor;
    }

    public Arvore getEsq() {
        return esq;
    }

    public Arvore getDir() {
        return dir;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setEsq(Arvore esq) {
        this.esq = esq;
    }

    public void setDir(Arvore dir) {
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
