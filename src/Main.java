import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double valorUm;
        Double valorDois;
        int operacao;
        char continuar = 'S';


        do{
            System.out.println("Digite o valor um: ");
            valorUm = sc.nextDouble();

            System.out.println("Digite o valor dois: ");
            valorDois = sc.nextDouble();


            System.out.println("Digite a operação( 1 Soma, 2 Subtração, 3 Multiplicação, 4 Divisão,): ");
            operacao = sc.nextInt();


            System.out.println("Resultado:" + realizarCalculo(valorUm, valorDois, operacao));

            System.out.println("Deseja realizar uma nova operação? (S ou N): ");
            continuar = sc.next().toUpperCase().charAt(0);

        }while (continuar == 'S');
        sc.close();
    }



    public static Double realizarCalculo(Double valorUm, Double valorDois, int operacao){
        Double respostaCalculo = 0.0;

//        switch (operacao) {
//            case "1":
//                respostaCalculo = valorUm + valorDois;
//                break;
//            case "2":
//                respostaCalculo = valorUm - valorDois;
//                break;
//            case "3":
//                respostaCalculo = valorUm * valorDois;
//                break;
//            case "4":
//                respostaCalculo = valorUm / valorDois;
//                break;
//
//            default:
//                System.out.println("Operação é invalida ");
//
//        }

        // Usei if, else if e else para fazer de outra forma e aumentar meu aprendizado

        if (operacao == 1 ) {
            respostaCalculo = valorUm + valorDois;


        } else if (operacao == 2) {
            respostaCalculo = valorUm - valorDois;



        }  else if (operacao == 3) {
            respostaCalculo = valorUm * valorDois;



        }  else if (operacao == 4) {
            respostaCalculo = valorUm / valorDois;


        } else {
            System.out.println("Operação é invalida ");
        }


        return respostaCalculo;
    }

}