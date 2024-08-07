/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciolocadora;

/**
 *
 * @author aluno
 */
public class FitaGravada extends Fita {

    public FitaGravada(String titulo) {
        super(titulo, Fita.GRAVADA);
    }

    @Override
    public double calcularPreco(int diasAlugada) {
        double preco = 5;
        if (diasAlugada > 2) {
            preco += (diasAlugada - 2) * 1.5;
        }
        return preco;
    }

    @Override
    public int calcularPontosDeAlugadorFrequente(int diasAlugada) {
        return 1;
    }
    
}
