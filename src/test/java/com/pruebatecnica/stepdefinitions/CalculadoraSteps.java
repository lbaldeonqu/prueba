package com.pruebatecnica.stepdefinitions;

import com.pruebatecnica.Calculadora;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculadoraSteps {
    
    private Calculadora calculadora;
    private double numero1;
    private double numero2;
    private double resultado;
    private String mensajeError;
    private boolean numero1Asignado = false;
    
    @Dado("que tengo una calculadora disponible")
    public void que_tengo_una_calculadora_disponible() {
        calculadora = new Calculadora();
        // Resetear variables para cada escenario
        numero1 = 0;
        numero2 = 0;
        resultado = 0;
        mensajeError = null;
        numero1Asignado = false;
    }
    @Dado("que ingreso el número {int}")
    public void que_ingreso_el_numero(int numero) {
        if (!numero1Asignado) {
            numero1 = numero;
            numero1Asignado = true;
        } else {
            numero2 = numero;
        }
    }

    @Cuando("realizo la operación division")
    public void realizo_la_operacion_division() {
    try {
        resultado = calculadora.dividir(numero1, numero2);
        } catch (ArithmeticException e) {
            mensajeError = e.getMessage();
        }
    }
    
    @Cuando("realizo la operación {string}")
    public void realizo_la_operacion(String operacion) {
        switch (operacion.toLowerCase()) {
            case "suma":
                realizo_la_operacion_suma();
                break;
            case "resta":
                realizo_la_operacion_resta();
                break;
            case "multiplicacion":
                realizo_la_operacion_multiplicacion();
                break;
            case "division":
                realizo_la_operacion_division();
                break;
            default:
                throw new IllegalArgumentException("Operación no soportada: " + operacion);
        }
    }
    
    @Entonces("el resultado debe ser {int}")
    public void el_resultado_debe_ser(int resultadoEsperado) {
        assertThat(resultado).isEqualTo((double) resultadoEsperado);
    }

    
    @Entonces("debe mostrar el error {string}")
    public void debe_mostrar_el_error(String errorEsperado) {
        assertThat(mensajeError).isEqualTo(errorEsperado);
    }
}