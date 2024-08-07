/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciolocadora;

/**
 *
 * @author vival
 */
public class FitaNormal extends Fita{

    public FitaNormal(String titulo) {
        super(titulo, Fita.NORMAL);
    }

        public double calcularPreco(int diasAlugada) {
        double preco = 2;
        if (diasAlugada > 2) {
            preco += (diasAlugada - 2) * 1.5;
        }
        return preco;
    }

    @Override
    public int calcularPontosDeAlugadorFrequente(int diasAlugada) {
        // Para fitas normais, sempre retorna 1 ponto
        return 1;
    }

    
}
