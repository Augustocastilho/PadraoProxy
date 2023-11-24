package org.example;

import java.util.Arrays;
import java.util.List;

public class CarroProxy implements ICarro {

    private Carro carro;
    private String placa;
    
    
    public CarroProxy(String placa) {
        this.placa = placa;
    }

    @Override
    public List<String> obterDadosCarro() {
        if(this.carro == null) {
            this.carro = new Carro(this.placa);
        }
        return this.carro.obterDadosCarro();
    }

    @Override
    public Float obterPrecoCarro(Funcionario funcionario) {
        if (!funcionario.isVendedor() && !funcionario.isGerente()) {
            throw new IllegalArgumentException("Funcionário não autorizado");
        }
        if(this.carro == null) {
            this.carro = new Carro(this.placa);
        }
        return this.carro.obterPrecoCarro(funcionario);
    }
}
