/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 potencia inteiro
 * RPM inteiro
 * TipoConbustivel texto
 */
public class Motor{
    private int potencia, rpm = 0;
    private String tipoCombustivel;
    
    public void setPotencia(int p){this.potencia = p;}
    public int getPotencia(){return potencia;}
    
    public void setRpm(int r){this.rpm = r;}
    public int getRpm(){return rpm;}
    
    public void setTipoDeCombustivel(String tc){this.tipoCombustivel = tc;}
    public String getTipoCombustivel(){return tipoCombustivel;}
    
    public void imprimir(){
        System.out.println("Potencia: " + this.getPotencia());
        System.out.println("RPM: " + this.getRpm());
        System.out.println("Tipo de Combustível: " + this.getTipoCombustivel());
    }
    
    public void entrada(){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a Potencia: ");
        this.setPotencia(Integer.parseInt(input.nextLine()));
        
        System.out.println("Informe os RPM: ");
        this.setRpm(Integer.parseInt(input.nextLine()));
        
        System.out.println("Informe o tipo deo combustível: ");
        this.setTipoDeCombustivel(input.nextLine());
    }
    public void cadastro(int p, int r, String tc){
        this.setPotencia(p);
        this.setRpm(r);
        this.setTipoDeCombustivel(tc);
    }
    
}
