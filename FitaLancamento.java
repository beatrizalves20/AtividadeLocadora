/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciolocadora;

/**
 *
 * @author vival
 */
public class FitaLancamento extends Fita{

   public FitaLancamento(String titulo) {
        super(titulo, Fita.LANCAMENTO);
    }

    @Override
    public double calcularPreco(int diasAlugada) {
        return diasAlugada * 3;
    }

    @Override
    public int calcularPontosDeAlugadorFrequente(int diasAlugada) {
        // Retorna pontos extras se alugada por mais de um dia
        return diasAlugada > 1 ? 2 : 1;
    }
    
}
