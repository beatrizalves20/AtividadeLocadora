/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciolocadora;

/**
 *
 * @author vival
 */
public class Locadora {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juliana");
        RegistroAlugueis registro = new RegistroAlugueis();

        registro.adicionarAluguel(new Aluguel(new FitaNormal("O Exorcista"), 3));
        registro.adicionarAluguel(new Aluguel(new FitaNormal("Men in Black"), 2));
        registro.adicionarAluguel(new Aluguel(new FitaLancamento("Jurassic Park III"), 3));
        registro.adicionarAluguel(new Aluguel(new FitaLancamento("Planeta dos Macacos"), 4));
        registro.adicionarAluguel(new Aluguel(new FitaInfantil("Pateta no Planeta dos Macacos"), 10));
        registro.adicionarAluguel(new Aluguel(new FitaInfantil("O Rei Leao"), 30));
        registro.adicionarAluguel(new Aluguel(new FitaOnline("O Show de Truman"), 10));
        registro.adicionarAluguel(new Aluguel(new FitaOnline("GODZILLA vs KONG"), 15));
        registro.adicionarAluguel(new Aluguel(new FitaGravada("Homem-Aranha 2"), 25));
        
        
        ExtratoAluguel extrato = new ExtratoAluguel(cliente, registro);
        System.out.println(extrato.gerarExtrato());
    }
}

