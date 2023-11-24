package org.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarroTest {

    @BeforeEach
    void setUp() {
        BD.addCarro(new Carro("ABC1234", "Gol", "Volkswagen", "Branco", "2015", 20000.0f));
        BD.addCarro(new Carro("DEF5678", "Celta", "Chevrolet", "Preto", "2010", 15000.0f));
    }

    @Test
    void deveRetornarDadosDoCarro() {
        CarroProxy carro = new CarroProxy("ABC1234");
        assertEquals(Arrays.asList("Gol", "Volkswagen", "Branco", "2015"), carro.obterDadosCarro());
    }

    @Test
    void deveRetornarPrecoDoCarro() {
        Funcionario funcionario = new Funcionario("João", true, false);
        CarroProxy carro = new CarroProxy("ABC1234");
        assertEquals(20000.0f, carro.obterPrecoCarro(funcionario));
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioNaoAutorizado() {
        try {
            Funcionario funcionario = new Funcionario("Joana", false, false);
            CarroProxy carro = new CarroProxy("ABC1234");

            carro.obterPrecoCarro(funcionario);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Funcionário não autorizado", e.getMessage());
        }
    }
}