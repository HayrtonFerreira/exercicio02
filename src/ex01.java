import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valor1, valor2, resultado;
        
        System.out.println("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();
        
        do {
            System.out.println("Digite o segundo valor (não pode ser zero): ");
            valor2 = scanner.nextDouble();
        } while (valor2 == 0);
        
        resultado = valor1 / valor2;
        System.out.println("O resultado da divisão é: " + resultado);
        
        scanner.close();
    }
}

/*O programa lê os dois valores digitados pelo usuário e entra em um loop `do-while` que só termina quando o segundo valor for diferente de zero. Depois, é feita a divisão dos dois valores e o resultado é exibido na tela. 
 */

