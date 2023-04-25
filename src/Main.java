import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double valorUm;
        Double valorDois;
        String operacao;

        System.out.println("Digite o valor um: ");
        valorUm = sc.nextDouble();

        System.out.println("Digite a operação( +, -, /, *,): ");
        operacao = sc.next();

        System.out.println("Digite o valor dois: ");
        valorDois = sc.nextDouble();

        System.out.println("Resultado:" + realizarCalculo(valorUm, valorDois, operacao));
    }

    public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao){
        Double respostaCalculo = 0.0;
        switch (operacao){
            case "+":
                respostaCalculo = valorUm + valorDois;
                break;
            case "-":
                respostaCalculo = valorUm - valorDois;
                break;
            case "*":
                respostaCalculo = valorUm * valorDois;
                break;
            case "/":
                respostaCalculo = valorUm / valorDois;
                break;

            default:
                System.out.println("Operação é invalida ");

        }

        return respostaCalculo;
    }

}