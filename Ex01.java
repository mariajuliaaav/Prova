import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        double n1 = entrada.nextInt();

        System.out.print("Insira o segundo número: ");
        double n2 = entrada.nextInt();

        System.out.print("Insira a operação (+, -, * ou /): ");
        char operacao = entrada.next().charAt(0);

        double resultado;

        switch (operacao) {
            case '+':
                resultado = n1 + n2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = n1 - n2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = n1 * n2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                resultado = n1 / n2;
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Erro.");
        }

        entrada.close();
    }
}