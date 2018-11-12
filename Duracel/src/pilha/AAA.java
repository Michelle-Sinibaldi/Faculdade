/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author mia_a
 */
public class AAA {

    public Object[] dados;
    private int topo;
// Construtor - Cria uma pilha vazia 

    public AAA() {
        dados = new Object[50];
        topo = -1;
    }

    public boolean isFull() {
        return (topo == dados.length - 1);
    }

    public boolean isEmpty() {
        return (topo == -1);
    }

    public void push(Object x) {
        if (!isFull()) {
            topo++;
            dados[topo] = x;
        } else {
            System.out.println("Pilha Cheia");
        }
    }

    public Object pop() {
        if (!isEmpty()) {
            Object x = dados[topo];
            topo--;
            return x;
        } else {
            System.out.println("Pilha Vazia");
            return null;
        }
    }

    public Object top() {
        if (!isEmpty()) {
            return dados[topo];
        } else {
            System.out.println("Pilha Vazia");
            return null;
        }
    }

}
