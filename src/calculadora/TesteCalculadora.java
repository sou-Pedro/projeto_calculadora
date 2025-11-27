package calculadora;

/**
 * Classe de teste para a Calculadora.
 * Demonstra o uso dos métodos da calculadora com exemplos de operações válidas e tratamento de exceções.
 *
 * @author Pedro
 * @version 1.0
 * @since 2025
 */
public class TesteCalculadora {

    /**
     * Construtor padrão da classe TesteCalculadora.
     * Classe utilitária com método main para testes.
     */
    public TesteCalculadora() {
        // Construtor padrão
    }

    /**
     * Método principal que executa os testes da calculadora.
     * Realiza operações aritméticas válidas e demonstra o tratamento de exceções para casos de erro.
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.calcular(2, 3, "+")); // 5
        System.out.println(calc.calcular(10, 4, "-")); // 6
        System.out.println(calc.calcular(3, 5, "*")); // 15
        System.out.println(calc.calcular(8, 2, "/")); // 4

        try {
            System.out.println(calc.calcular(8, 0, "/")); // Exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }   

        try {
            System.out.println(calc.calcular(5, 5, "x")); // Exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
