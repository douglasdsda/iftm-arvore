package com.company;

import com.company.models.No;

import java.util.Scanner;

public class App {
    int lista [];
    No root;
    int n = 0;

    App(int n){
        lista = new int[10];
        root = null;
        this.n = n;
    }

    public void lerDados(){
        Scanner ler = new Scanner(System.in);
        try {
            for(int i =0 ; i < this.n ; i ++){
                System.out.println("Digite um valor: ");
                this.lista[i] = ler.nextInt();
            }
        }catch (Exception e){

        }
    }

    void processar(){
        No node = null;
        for(int i =0 ; i < this.n ; i ++){


            inserir( this.lista[i]);
        }


        System.out.println("-------------------INICIO-----------------------------");
        imprimir(this.root);

        System.out.println("\n---------------------FIM----------------------------");
    }

    public void inserir(int v) {
        No novo = new No();
        novo.setValor(v) ;
        novo.setDir(null);
        novo.setEsq(null);

        if (root == null) root = novo;
        else  {
            No atual = root;
            No anterior;
            while(true) {
                anterior = atual;
                if (v <= atual.getValor()) {
                    atual = atual.getEsq();
                    if (atual == null) {
                        anterior.setEsq(novo);
                        return;
                    }
                }
                else {
                    atual = atual.getDir();
                    if (atual == null) {
                        anterior.setDir(novo);
                        return;
                    }
                }
            }
        }

    }

    void imprimir(No no){
        if(no != null){

            imprimir(no.getEsq());

            System.out.print(no.getValor());
            imprimir(no.getDir());


        }
    }
}
