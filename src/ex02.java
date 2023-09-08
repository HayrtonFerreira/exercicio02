import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valor1, valor2, resultado;
        
        System.out.println("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo valor (não pode ser zero): ");
        valor2 = scanner.nextDouble();
        
        while (valor2 == 0) {
            System.out.println("Valor inválido! Digite novamente: ");
            valor2 = scanner.nextDouble();
        }
        
        resultado = valor1 / valor2;
        System.out.println("O resultado da divisão é: " + resultado);
        
        scanner.close();
    }
}

