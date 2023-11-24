package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Carro implements ICarro {
    private String placa;
    private String modelo;
    private String marca;
    private String cor;
    private String ano;
    private Float valor;
    
    public Carro(String placa) {
        this.placa = placa;
        Carro objeto = BD.getCarro(placa);
        this.modelo = objeto.modelo;
        this.marca = objeto.marca;
        this.cor = objeto.cor;
        this.ano = objeto.ano;
        this.valor = objeto.valor;
    }

    public Carro(String placa, String modelo, String marca, String cor, String ano, Float valor) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public List<String> obterDadosCarro() {
        return Arrays.asList(
            this.modelo,
            this.marca,
            this.cor,
            this.ano
        );
    }

    @Override
    public Float obterPrecoCarro(Funcionario funcionario) {
        return this.valor;
    }
}
