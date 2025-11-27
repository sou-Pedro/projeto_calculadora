package calculadora; 

public class TesteCalculadora {


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