/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciolocadora;

/**
 *
 * @author vival
 */
public class FitaInfantil extends Fita{
    public FitaInfantil(String titulo) {
        super(titulo, Fita.INFANTIL);
    }

    @Override
    public double calcularPreco(int diasAlugada) {
        double preco = 1.5;
        if (diasAlugada > 3) {
            preco += (diasAlugada - 3) * 1.5;
        }
        return preco;
    }

    @Override
    public int calcularPontosDeAlugadorFrequente(int diasAlugada) {
        // Para fitas infantis, sempre retorna 1 ponto
        return 1;
    }
}
