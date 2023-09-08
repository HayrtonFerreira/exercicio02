import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char resposta = 'S';

        while (resposta == 'S') {
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

            System.out.print("NOVO CÁLCULO (S/N)? ");
            resposta = scanner.next().charAt(0);
        }

        scanner.close();
    }
}
//Após calcular e exibir a média, o programa solicitará ao usuário se deseja fazer um novo cálculo. Se o usuário responder 'S', o programa retornará ao início e executará um novo cálculo. Caso contrário, o programa será encerrado.

