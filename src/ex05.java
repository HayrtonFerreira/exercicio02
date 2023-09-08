import java.util.Scanner;

 public class ex05{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1 = -1;
        while (nota1 < 0 || nota1 > 10) {
            System.out.print("Informe a nota da primeira avaliação (0 a 10): ");
            nota1 = scanner.nextDouble();
        }

        double nota2 = -1;
        while (nota2 < 0 || nota2 > 10) {
            System.out.print("Informe a nota da segunda avaliação (0 a 10): ");
            nota2 = scanner.nextDouble();
        }

        double media = (nota1 + nota2) / 2;
        System.out.println("A média do aluno é: " + media);

        scanner.close();
    }
}
//Este código utiliza dois laços `while` para garantir que apenas valores válidos sejam aceitos durante a leitura das notas. Se o usuário informar um valor fora do intervalo de 0 a 10, o programa solicita que ele informe um novo valor. Depois que as notas são lidas corretamente, o código calcula e imprime a média simples do aluno.

