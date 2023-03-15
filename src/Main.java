import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner ler = new Scanner(System.in);
        Loading carregar = new Loading();
        CalculoCedulasSaque calcular = new CalculoCedulasSaque();
        LimparConsole limpar = new LimparConsole();
        ArrayList<Integer> cedulasDisponiveis = new ArrayList<Integer>();


        //menu

        for(int contmenu = 0;contmenu<1;contmenu--){

            LimparConsole.Limpar();
            System.out.print("Escolha uma opção: \n"+
                    "1 - Sacar\n" +
                    "2 - Depositar\n" +
                    "3 - Consultuar \n"+
                    "4 - Sair\n\n"+
                    "Infome o numero a frente de sua escolha: "
            );

            int opcao = ler.nextInt();

            switch (opcao){

                case 1:
                    for( int j = 0;j<1;j--) {
                        int confirmar;
                        System.out.println("Infome o valor para o saque: ");
                        int saque = ler.nextInt();
                        System.out.println("Voce deseja receber o valor em cedulas maiores ou menores?\n" +
                                "1 - Maiores\n" +
                                "2 - Menores\n");
                        int tiposaque = ler.nextInt();
                        if (tiposaque != 1 && tiposaque != 2) {
                            System.out.println("Voce inseriu uma resposta invalida!");
                            continue;
                        }
                        else {
                            //loading
                            carregar.carregar();

                            //Estrutura para calcular a quantidade de notas e imprimir na tela
                            calcular.calcular(saque, tiposaque);

                            //Estrutura para servir como menu de confirmação de recebimento
                            while(10<100){
                                System.out.println("\nConfirmar recebimento:\n" +
                                        "1 - Sim" +
                                        "    2 - Não\n");
                                confirmar = ler.nextInt();

                                if (confirmar == 1) {
                                    // futuramente decrementar da quant de cedulas
                                    break;

                                }
                                else if (confirmar == 2){
                                    break;
                                }
                                else {
                                    LimparConsole.Limpar();
                                    System.out.println("\nInforme um valor valido!\n");
                                }
                            }
                            if(confirmar==1){
                                break;
                            }
                        }
                    }
                case 2:
                    calcular.adicionarcedulas();
                    break;

                case 3:
                        calcular.mostrarcedulas();
                    break;

                case 4:
                    System.exit(1);

                default:

                    System.out.println("\n\n\n\nAtenção!\nVoce inseriu uma opção invalida. Por favor\n"+
                            "Informe o numero a frente da sua opção escolhida\n\n");

            }
        }
        //Fim Menu
    }
}