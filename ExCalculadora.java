import java.util.Scanner;

public class ExCalculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            mostrarMenu();
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    procedimentoSoma(sc);
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    double n1 = sc.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    double n2 = sc.nextDouble();

                    System.out.println("Resultado = " + funcaoSubtracao(n1, n2));
                    break;

                case 3:
                    System.out.print("Digite o primeiro número: ");
                    n1 = sc.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    n2 = sc.nextDouble();

                    System.out.println("Resultado = " + funcaoMultiplicacao(n1, n2));
                    break;

                case 4:
                    System.out.print("Digite o primeiro número: ");
                    n1 = sc.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    n2 = sc.nextDouble();

                    if (n2 != 0) {
                        System.out.println("Resultado = " + funcaoDivisao(n1, n2));
                    } else {
                        System.out.println("Erro: divisão por zero!");
                    }
                    break;

                case 5:
                    System.out.print("Base: ");
                    double base = sc.nextDouble();

                    System.out.print("Expoente: ");
                    int exp = sc.nextInt();

                    System.out.println(base + "^" + exp + " = " + funcaoPotencia(base, exp));
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

    // ---------------- PROCEDIMENTOS ----------------

    public static void mostrarMenu() {
        System.out.println("\n--- Escolha uma Operação ---");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Potência");
        System.out.println("0 - Sair");
        System.out.print("Opção: ");
    }

    public static void procedimentoSoma(Scanner sc) {
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double resultado = funcaoSoma(num1, num2);

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
                resultado = funcaoSoma(resultado, novoNum);
            }
        }
    }

    // ---------------- FUNÇÕES ----------------

    public static double funcaoSoma(double a, double b) {
        return a + b;
    }

    public static double funcaoSubtracao(double a, double b) {
        return a - b;
    }

    public static double funcaoMultiplicacao(double a, double b) {
        return a * b;
    }

    public static double funcaoDivisao(double a, double b) {
        return a / b;
    }

    public static double funcaoPotencia(double base, int expoente) {
        return Math.pow(base, expoente);
    }
}