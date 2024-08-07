/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciolocadora;

/**
 *
 * @author vival
 */
public class ExtratoAluguel {
    private Cliente cliente;
    private RegistroAlugueis registroAlugueis;

    public ExtratoAluguel(Cliente cliente, RegistroAlugueis registroAlugueis) {
        this.cliente = cliente;
        this.registroAlugueis = registroAlugueis;
    }

    public String gerarExtrato() {
        StringBuilder resultado = new StringBuilder("Extrato de Alugueis de " + cliente.getNome() + ":\n");

        for (Aluguel aluguel : registroAlugueis.getAlugueis()) {
            
            resultado.append("\t").append(aluguel.getFita().
            getTitulo()).append("\t").append(aluguel.calcularPreco()).
            append("\n");
        }

        resultado.append("Valor total devido: ").append(registroAlugueis.calcularTotalDevido()).append("\n");
        return resultado.toString();
    }
}

