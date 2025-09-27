import java.util.Scanner;

public class App {
    public static void resposta (int resp){
        if (resp == 1) {
            System.out.println("Que bom");
        }
        else{
            System.out.println("Que pena");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CALCULADORA SIMPLES ===");

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (op) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero não é permitida!");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.println("Resultado: " + resultado);
        }

        System.out.println("Obrigado por testar nossa calculadora");
        System.out.println("\nVocê gostou? (1-sim ou 2-não)");

        int resp = sc.nextInt();

        resposta(resp);

        sc.close();
    }
}
