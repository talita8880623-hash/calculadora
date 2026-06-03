import java.util.Scanner;

    public class ExCalculadora {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int opcao = 0;

            do {

                System.out.println("\n--- Escolha uma Operação ---");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtracao");
                System.out.println("3 - Multiplicacao");
                System.out.println("4 - Divisao");
                System.out.println("0 - Sair");
                System.out.print("Opção: ");
                System.out.print("Opção: ");
                opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o primeiro número: ");
                        double n1 = sc.nextDouble();

                        System.out.print("Digite o segundo número: ");
                        double n2 = sc.nextDouble();

                        System.out.println("Resultado = " + (n1 + n2));
                        break;

                    case 2:
                        System.out.print("Digite o primeiro número: ");
                        n1 = sc.nextDouble();

                        System.out.print("Digite o segundo número: ");
                        n2 = sc.nextDouble();

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