/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Lucas
 */

//Interface para obrigar o programador a implementar esses métodos dentro das suas classes
// pra testar, apaga um deles de dentro da classe carro. Vai dar erro em tudo kkkkkkkkjjj
public interface Movimento {
    public void acelerar();
    public void desacelerar();
    public void frear();
    public void virarEsquerda();
    public void virarDireita();
    public void desconto();
    public void imprimir();
}
