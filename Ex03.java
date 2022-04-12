import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int num = entrada.nextInt();

    if (num % 2 == 0) {
        System.out.print("Par.\n");}
    else {
        System.out.println("Insira um número: ");}
    
    System.out.println("Se o resto da divisão for 0 o número é par, caso contrário, se o resto for 1, o número é ímpar.");

    }
}