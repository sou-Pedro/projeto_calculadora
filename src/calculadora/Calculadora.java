package calculadora;

/**
 * Classe que representa uma calculadora simples para operações aritméticas básicas.
 * Suporta adição, subtração, multiplicação e divisão com tratamento de erros.
 *
 * @author Pedro
 * @version 1.0
 * @since 2025
 */
public class Calculadora {

    /**
     * Construtor padrão da classe Calculadora.
     */
    public Calculadora() {
        // Construtor padrão
    }

    //métodos puros e simples
    /**
     * Soma dois números inteiros.
     * @param a o primeiro número
     * @param b o segundo número
     * @return a soma de a e b
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai dois números inteiros.
     * @param a o minuendo
     * @param b o subtraendo
     * @return a diferença de a menos b
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     * @param a o multiplicando
     * @param b o multiplicador
     * @return o produto de a e b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dois números inteiros.
     * @param a o dividendo
     * @param b o divisor
     * @return o quociente de a dividido por b
     * @throws IllegalArgumentException se b for zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        } 
        return a / b;
    }

    /**
     * Calcula o resultado de uma operação aritmética baseada no operador fornecido.
     * @param a o primeiro operando
     * @param b o segundo operando
     * @param operador o operador da operação (+, -, *, /)
     * @return o resultado da operação
     * @throws IllegalArgumentException se o operador for inválido ou se houver divisão por zero
     */
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }
}
