package com.company;

import com.company.models.Arvore;

import java.util.Scanner;

public class App {
    int lista [];
    Arvore raiz;
    int n = 0;

    App(int n){
        lista = new int[10];
        raiz = null;
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
        Arvore node = null;
        for(int i =0 ; i < this.n ; i ++){


            inserir(node,this.lista[i]);
        }


        System.out.println("-------------------INICIO-----------------------------");
        imprimir(node);
        System.out.println("---------------------FIM----------------------------");
    }

    public void inserir(Arvore node, int valor) {
        //verifica se a árvore já foi criada
        if (node != null) {
            //Verifica se o valor a ser inserido é menor que o nodo corrente da árvore, se sim vai para subárvore esquerda
            if (valor < node.getValor()) {
                //Se tiver elemento no nodo esquerdo continua a busca
                if (node.getEsq() != null) {
                    inserir(node.getEsq(), valor);
                } else {
                    //Se nodo esquerdo vazio insere o novo nodo aqui
                    System.out.println("  Inserindo " + valor + " a esquerda de " + node.getValor());
                    node.setEsq(new Arvore(valor, null, null));
                }
                //Verifica se o valor a ser inserido é maior que o nodo corrente da árvore, se sim vai para subárvore direita
            } else if (valor > node.getValor()) {
                //Se tiver elemento no nodo direito continua a busca
                if (node.getDir() != null) {
                    inserir(node.getDir(), valor);
                } else {
                    //Se nodo direito vazio insere o novo nodo aqui
                    System.out.println("  Inserindo " + valor + " a direita de " + node.getValor());
                    node.setDir(new Arvore(valor, null, null));
                }
            }
        }
    }

    void imprimir(Arvore no){
        if(no != null){
            imprimir(no.getEsq());
            System.out.println(no.getValor());
            imprimir(no.getDir());
        }
    }
}
