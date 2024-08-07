/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciolocadora;

/**
 *
 * @author vival
 */
public class FitaOnline extends Fita{

    public FitaOnline(String titulo) {
        super(titulo, Fita.ONLINE);
    }

    @Override
    public double calcularPreco(int diasAlugada) {
        double preco = 3;
        if (diasAlugada > 3){
            preco += (diasAlugada - 3) * 1.5;
        } 
            return preco;       
    }

    @Override
    public int calcularPontosDeAlugadorFrequente(int diasAlugada) {
       return 1;
    }
    
}
