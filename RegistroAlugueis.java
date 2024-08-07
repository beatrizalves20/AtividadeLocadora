/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciolocadora;

/**
 *
 * @author vival
 */
import java.util.ArrayList;
import java.util.List;

public class RegistroAlugueis {
    private List<Aluguel> alugueis = new ArrayList<>();

    public void adicionarAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }
    
    public List<Aluguel> getAlugueis() {
        return alugueis;
    }
    
    public double calcularTotalDevido() {
        double totalDevido = 0.0;
        for (Aluguel aluguel : alugueis) {
            totalDevido += aluguel.calcularPreco();
        }
        return totalDevido;
    }

}

