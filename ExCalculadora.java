import java.util.Scanner;

public class ExCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Escolha uma Operação ---");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o primeiro número: ");
                    double num1 = sc.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    double num2 = sc.nextDouble();

                    double resultado = num1 + num2;

                    int subOpcao = -1;

                    while (subOpcao != 2) {
                        System.out.println("\nResultado atual = " + resultado);
                        System.out.println("1 - Somar outro número");
                        System.out.println("2 - Voltar ao menu principal");
                        System.out.print("Escolha: ");
                        subOpcao = sc.nextInt();

                        if (subOpcao == 1) {
                            System.out.print("Digite o novo número: ");
                            double novoNum = sc.nextDouble();
                            resultado += novoNum;
                        }
                    }
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    double n1 = sc.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    double n2 = sc.nextDouble();

                    System.out.println("Resultado = " + (n1 - n2));
                    break;

                case 3:
                    System.out.print("Digite o primeiro número: ");
                    n1 = sc.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    n2 = sc.nextDouble();

                    System.out.println("Resultado = " + (n1 * n2));
                    break;

                case 4:
                    System.out.print("Digite o primeiro número: ");
                    n1 = sc.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    n2 = sc.nextDouble();

                    if (n2 != 0) {
                        System.out.println("Resultado = " + (n1 / n2));
                    } else {
                        System.out.println("Erro: divisão por zero!");
                    }
                    break;

                case 5:
                    System.out.print("Base: ");
                    double base = sc.nextDouble();

                    System.out.print("Expoente (N): ");
                    int exp = sc.nextInt();

                    double resultadoPot = Math.pow(base, exp);

                    System.out.println(base + "^" + exp + " = " + resultadoPot);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}