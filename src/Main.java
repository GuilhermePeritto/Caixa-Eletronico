import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner ler = new Scanner(System.in);
        Loading carregar = new Loading();
        CalculoCedulasSaque calcular = new CalculoCedulasSaque();
        LimparConsole limpar = new LimparConsole();
        String Mensagem = "";

        //popula o array definindo quant 0 para todas as notas
        calcular.IniciarCedulas();


        //menu

        for(int contmenu = 0;contmenu<1;contmenu--){

            LimparConsole.Limpar();
            System.out.println(Mensagem);
            System.out.print("\n\nEscolha uma opção: \n"+
                    "1 - Sacar\n" +
                    "2 - Depositar\n" +
                    "3 - Consultar \n"+
                    "4 - Sair\n\n"+
                    "Infome o numero a frente de sua escolha: "
            );
            Mensagem = "";

            int opcao = ler.nextInt();
            int confirmar;

            switch (opcao){

                case 1:
                    for( int j = 0;j<1;j--) {
                        System.out.println("Infome o valor para o saque: ");
                        int saque = ler.nextInt();
                            //loading
                            carregar.carregar();

                            //Estrutura para calcular a quantidade de notas e imprimir na tela
                            calcular.calcular(saque);

                            //Estrutura para servir como menu de confirmação de recebimento
                            while (calcular.cedulasSuficientes) {
                                System.out.println("\nConfirmar recebimento:\n" +
                                        "1 - Sim" +
                                        "    2 - Não\n");
                                confirmar = ler.nextInt();

                                if (confirmar == 1) {
                                    Mensagem = "Saque realizado com sucesso! ";
                                    break;

                                } else if (confirmar == 2) {
                                    break;
                                } else {
                                    LimparConsole.Limpar();
                                    System.out.println("\nInforme um valor valido!\n");
                                }
                            }
                            break;
                        }
                    break;
                case 2:
                    calcular.adicionarcedulas();
                    Mensagem = "Valores depositados com sucesso! ";
                    break;

                case 3:
                    calcular.mostrarcedulas();
                    System.out.println("\nPrecione qualquer tecla para continuar: ");
                    ler.nextInt();
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