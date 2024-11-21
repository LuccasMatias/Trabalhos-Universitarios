/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
abstract class Veiculo{
    
    private float preco;
    private String marca, placa;
    private final int idadeMinimaMotorista = 18; //Final é o CONST do C. Se for declarado como "final" não dá para modificar mais.
    Motor motor = new Motor(); //Objeto criado separadamente no arquivo Motor
    
    
// ---------- Metodos Setters e Getters -----------------
    public void setPreco(float pr){preco = pr;}
    public float getPreco(){return this.preco;}
    
    
    public void setMarca(String m){marca = m;}
    public String getMarca(){return this.marca;}
    
    public void setPlaca(String pl){placa = pl;}
    public String getPlaca(){return this.placa;}
    
    public int getIdadeMinimaMotorista(){return this.idadeMinimaMotorista;} // Sem SETTER, por que se é final, não dá pra mudar
    
    public void imprimir(){
        System.out.println("Preço: " + this.getPreco());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Idade Mínima para Dirigir: " + this.getIdadeMinimaMotorista());
    }
    public void entrada(){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o preço: ");
        this.setPreco(Float.parseFloat(input.nextLine()));
        //Explicação desse método abaixo
                                    // input.nextLine() = Recebimento do texto via teclado ---------------
                    //Float.parseFloat(input.nextLine() = Conversão do valor recebido (String) para Float
       //this.setPreco = função para adicionar o valor convertido dentro do preço
       //Entender essa parte é extremamente importante, por que como tudo tá "private" só dá pra mudar fazendo criação
//       e a aplicação dos métodos.
        //a regra acima se aplica a todos os outros dentro do método de entrada
        
        
        System.out.println("Informe a marca: ");
        this.setMarca(input.nextLine());
        
        System.out.println("Informe a placa: ");
        this.setPlaca(input.nextLine());
    }
    public void cadastro(float pr, String m, String pl){
        this.setPreco(pr);
        this.setMarca(m);
        this.setPlaca(pl);
    }
}