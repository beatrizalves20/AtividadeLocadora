/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciolocadora;
/**
 *
 * @author vival
 */
public abstract class Fita {
    public static final int NORMAL = 0;
    public static final int LANCAMENTO = 1;
    public static final int INFANTIL = 2;
    public static final int ONLINE = 3;
    public static final int GRAVADA = 4;
    private String titulo;
    private int codigoDePreco;

    public Fita(String titulo, int codigoDePreco) {
        this.titulo = titulo;
        this.codigoDePreco = codigoDePreco;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCodigoDePreco() {
        return codigoDePreco;
    }

    public abstract double calcularPreco(int diasAlugada);

    public abstract int calcularPontosDeAlugadorFrequente(int diasAlugada);
}
