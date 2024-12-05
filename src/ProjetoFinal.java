import java.util.Scanner;

public class ProjetoFinal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Jonas Kelvin Costa";
        double saldo = 5000.00;
        int opcao = 0;
        double valorReceber = 0.00;
        double valorSacar = 0;

        System.out.println("**************************");

        System.out.println("Dados iniciais do cliente: ");

        System.out.println("Nome: "+nome);

        System.out.println("Tipo de conta: Corrente");

        System.out.println("Saldo inicial: R$"+saldo);

        System.out.println("**************************");

        System.out.println("");
        System.out.println("");


        String menu = """
                Digite a opção desejada:
                1 - Verificar saldo:
                2 - Receber valor:
                3 - Transferir valor
                4 - Sair""";


        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("Seu saldo é: R$"+saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor você deseja depositar:");
                valorReceber = leitura.nextDouble();
                saldo = saldo + valorReceber;

                System.out.println("Seu saldo atual é: R$"+saldo);
            } else if (opcao == 3) {
                System.out.println("Qual valor você deseja retirar:");
                valorSacar = leitura.nextDouble();
                if (saldo < valorSacar){
                    System.out.println("Você não tem saldo suficiente para realizar essa operação!");
                } else {
                    saldo = saldo - valorSacar;
                    System.out.println("Seu saldo atual é: R$"+saldo);
                }
            }else {
                System.out.println("Finalizando!");
            }
        }




    }
}
