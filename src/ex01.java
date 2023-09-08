import java.util.Scanner;

/* public class ex01 { 
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
*/
    public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor1, valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = input.nextDouble();

        do {
        System.out.print("Digite o segundo valor (não pode ser zero): ");
        valor2 = input.nextDouble();
        } while (valor2 == 0);

        double resultado = valor1 / valor2;
        System.out.println("O resultado da divisão é: " + resultado);
        }
    }


/*O programa lê os dois valores digitados pelo usuário e entra em um loop `do-while` que só termina quando o segundo valor for diferente de zero. Depois, é feita a divisão dos dois valores e o resultado é exibido na tela. 
 */

