import java.util.Scanner;

    public class ex04 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double primeiroValor = scanner.nextDouble();

        System.out.print("Informe o segundo valor: ");
        double segundoValor = scanner.nextDouble();

        while (segundoValor == 0) {
            System.out.println("O segundo valor não pode ser zero.");
            System.out.print("Informe um novo valor: ");
            segundoValor = scanner.nextDouble();
        }

        double resultado = primeiroValor / segundoValor;
        System.out.println("O resultado da divisão é: " + resultado);

        scanner.close();
    }
}