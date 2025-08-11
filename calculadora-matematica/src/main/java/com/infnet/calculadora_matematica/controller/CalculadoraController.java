package com.infnet.calculadora_matematica.controller;

import com.infnet.calculadora_matematica.model.OperacaoRequest;
import com.infnet.calculadora_matematica.model.OperacaoResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculadora")
@Slf4j
public class CalculadoraController {

    // ADIÇÃO - GET
    @GetMapping("/add")
    public OperacaoResponse addGet(@RequestParam double a, @RequestParam double b) {
        log.info("Adição via GET: {} + {}", a, b);
        double resultado = a + b;

        return OperacaoResponse.builder()
                .operacao("adição")
                .numero1(a)
                .numero2(b)
                .resultado(resultado)
                .metodo("GET")
                .build();
    }

    // ADIÇÃO - POST
    @PostMapping("/add")
    public OperacaoResponse addPost(@RequestBody OperacaoRequest request) {
        log.info("Adição via POST: {} + {}", request.getNumero1(), request.getNumero2());
        double resultado = request.getNumero1() + request.getNumero2();

        return OperacaoResponse.builder()
                .operacao("adição")
                .numero1(request.getNumero1())
                .numero2(request.getNumero2())
                .resultado(resultado)
                .metodo("POST")
                .build();
    }

    // SUBTRAÇÃO - GET
    @GetMapping("/subtract")
    public OperacaoResponse subtractGet(@RequestParam double a, @RequestParam double b) {
        log.info("Subtração via GET: {} - {}", a, b);
        double resultado = a - b;

        return OperacaoResponse.builder()
                .operacao("subtração")
                .numero1(a)
                .numero2(b)
                .resultado(resultado)
                .metodo("GET")
                .build();
    }

    // SUBTRAÇÃO - POST
    @PostMapping("/subtract")
    public OperacaoResponse subtractPost(@RequestBody OperacaoRequest request) {
        log.info("Subtração via POST: {} - {}", request.getNumero1(), request.getNumero2());
        double resultado = request.getNumero1() - request.getNumero2();

        return OperacaoResponse.builder()
                .operacao("subtração")
                .numero1(request.getNumero1())
                .numero2(request.getNumero2())
                .resultado(resultado)
                .metodo("POST")
                .build();
    }

    // MULTIPLICAÇÃO - GET
    @GetMapping("/multiply")
    public OperacaoResponse multiplyGet(@RequestParam double a, @RequestParam double b) {
        log.info("Multiplicação via GET: {} * {}", a, b);
        double resultado = a * b;

        return OperacaoResponse.builder()
                .operacao("multiplicação")
                .numero1(a)
                .numero2(b)
                .resultado(resultado)
                .metodo("GET")
                .build();
    }

    // MULTIPLICAÇÃO - POST
    @PostMapping("/multiply")
    public OperacaoResponse multiplyPost(@RequestBody OperacaoRequest request) {
        log.info("Multiplicação via POST: {} * {}", request.getNumero1(), request.getNumero2());
        double resultado = request.getNumero1() * request.getNumero2();

        return OperacaoResponse.builder()
                .operacao("multiplicação")
                .numero1(request.getNumero1())
                .numero2(request.getNumero2())
                .resultado(resultado)
                .metodo("POST")
                .build();
    }

    // DIVISÃO - GET
    @GetMapping("/divide")
    public OperacaoResponse divideGet(@RequestParam double a, @RequestParam double b) {
        log.info("Divisão via GET: {} / {}", a, b);

        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }

        double resultado = a / b;

        return OperacaoResponse.builder()
                .operacao("divisão")
                .numero1(a)
                .numero2(b)
                .resultado(resultado)
                .metodo("GET")
                .build();
    }

    // DIVISÃO - POST
    @PostMapping("/divide")
    public OperacaoResponse dividePost(@RequestBody OperacaoRequest request) {
        log.info("Divisão via POST: {} / {}", request.getNumero1(), request.getNumero2());

        if (request.getNumero2() == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }

        double resultado = request.getNumero1() / request.getNumero2();

        return OperacaoResponse.builder()
                .operacao("divisão")
                .numero1(request.getNumero1())
                .numero2(request.getNumero2())
                .resultado(resultado)
                .metodo("POST")
                .build();
    }

    // EXPONENCIAÇÃO - GET
    @GetMapping("/power")
    public OperacaoResponse powerGet(@RequestParam double a, @RequestParam double b) {
        log.info("Exponenciação via GET: {} ^ {}", a, b);
        double resultado = Math.pow(a, b);

        return OperacaoResponse.builder()
                .operacao("exponenciação")
                .numero1(a)
                .numero2(b)
                .resultado(resultado)
                .metodo("GET")
                .build();
    }

    // EXPONENCIAÇÃO - POST
    @PostMapping("/power")
    public OperacaoResponse powerPost(@RequestBody OperacaoRequest request) {
        log.info("Exponenciação via POST: {} ^ {}", request.getNumero1(), request.getNumero2());
        double resultado = Math.pow(request.getNumero1(), request.getNumero2());

        return OperacaoResponse.builder()
                .operacao("exponenciação")
                .numero1(request.getNumero1())
                .numero2(request.getNumero2())
                .resultado(resultado)
                .metodo("POST")
                .build();
    }
}