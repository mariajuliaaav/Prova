import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o valor do produto: ");
        float produto = entrada.nextFloat();

        System.out.print("Insira o estado de entrega (MG, SP, RJ, MS ou Outros): ");
        String estado = entrada.next();

        double resultado;
        double imposto;

        switch (estado) {
            case "MG":
                imposto = produto * 7/100;
                resultado = produto + imposto;
                System.out.println("Valor: " + resultado);
                break;
            case "SP":
                imposto = produto * 12/100;
                resultado = produto + imposto;
                System.out.println("Valor: " + resultado);
                break;
            case "RJ":
                imposto = produto * 15/100;
                resultado = produto + imposto;
                System.out.println("Valor: " + resultado);
                break;
            case "MS":
                imposto = produto * 8/100;
                resultado = produto + imposto;
                System.out.println("Valor: " + resultado);
                break;
            case "Outros":
                imposto = produto * 9/100;
                resultado = produto + imposto;
                System.out.println("Valor: " + resultado);
                break;
            default:
                System.out.println("Erro.");
        }

        entrada.close();
    }
}