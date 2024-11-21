/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Carro extends Veiculo implements Movimento{
    private int numeroPassageiros, volumeMala;
    
    public void setNumeroPassageiros(int np){numeroPassageiros = np;}
    public int getNumeroPassageiros(){return numeroPassageiros;}
    
    public void setVolumeMala(int vm){volumeMala = vm;}
    public int getVolumeMala(){return volumeMala;}
    
    public void acelerar(){this.motor.setRpm(this.motor.getRpm() + 100 );}
    //Usando o metodo Get para pegar o valor dos RPM, fazer o cálculo e adicionar o resultado dentro do RPM com o método Set
    public void desacelerar(){this.motor.setRpm(this.motor.getRpm() - 100 );}
    public void frear(){System.out.println("Carro freado");}
    public void virarEsquerda(){System.out.println("Carro virando a esquerda");}
    public void virarDireita(){System.out.println("Carro virando a direita");}
    
    public void cadastro(float pr, String m, String pl, int vm, int np){
        super.cadastro(pr, m, pl);
        this.setNumeroPassageiros(np);
        this.setVolumeMala(vm);
    }
    
    public void desconto(){this.setPreco(this.getPreco() - ((this.getPreco()/100)*10));} 
        //O mesmo esquema do RPM, mas com um calculo um pouco mais complexo
    
    public void entrada(){
        Scanner input = new Scanner(System.in);
        super.entrada();
        
        System.out.println("Informe o numero de passageiros: ");
        this.setNumeroPassageiros(Integer.parseInt(input.nextLine()));
        
        System.out.println("Informe o volume da mala: ");
        this.setVolumeMala(Integer.parseInt(input.nextLine()));
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Número de passageiros: " + this.getNumeroPassageiros());
        System.out.println("Volume de malas: " + this.getVolumeMala());
    }
    
    //OBS: Não fiz os outros métodos de propósito pra você poder fazer sozinho usando esse como base. as regras são as mesmas, a interface também.
    //Não é difícil, mas é bem chatinho.
    
}
