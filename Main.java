import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Avaliação Git com Java");

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Escolha a operação (+ para soma, * para multiplicação): ");
        char operacao = scanner.next().charAt(0);

        double resultado;

        if (operacao == '+') {
            resultado = num1 + num2;
            System.out.println("Resultado da soma: " + resultado);
        } else if (operacao == '*') {
            resultado = num1 * num2;
            System.out.println("Resultado da multiplicação: " + resultado);
        } else {
            System.out.println("Operação inválida.");
        }

        scanner.close();
    }
}