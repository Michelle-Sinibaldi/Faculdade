/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duracel;

import pilha.AAA;

/**
 *
 * @author mia_a
 */
public class Duracel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AAA MinhaPilha = new AAA();

        System.out.println("Minha Pilha está cheia?");
        System.out.println(MinhaPilha.isFull());

        System.out.println("Minha Pilha está vazia?");
        System.out.println(MinhaPilha.isEmpty());

        String Nome;

        for (int i = 0; i < MinhaPilha.dados.length; i++) {
            
            MinhaPilha.push(i);
        }
        
        System.out.println("vou varrer a minha pilha!");
        System.out.println(MinhaPilha.top());
        
        for (int i = 0; i < 51; i++){
            
            System.out.println(MinhaPilha.pop());
        }
        
//        Nome = "Michelle";
//        MinhaPilha.push(Nome);
//        Nome = "Murilo";
//        MinhaPilha.push(Nome);
//        Clayton = 100;
//        MinhaPilha.push(Clayton);
//        Clayton = 50;
//        MinhaPilha.push(Clayton);
//        celular = 2.5;
//        MinhaPilha.push(celular);

     
    }

}
