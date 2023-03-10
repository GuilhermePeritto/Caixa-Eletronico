import javafx.animation.PauseTransition;
import javafx.scene.paint.Stop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //menu

        for(int i = 0;i<1;i--){

            System.out.print("Escolha uma opção: \n"+
                    "1 - Sacar\n" +
                    "2 - Depositar\n" +
                    "3 - Sair\n\n"+
                    "Infome o numero a frente de sua escolha: "
            );

            String opcao = ler.nextLine();

            switch (opcao){

                case "1":
                    System.out.println("Voce selecionou a opção 1");
                    break;

                case "2":
                    System.out.println("Voce selecionou a opção 2");
                    break;

                case "3":
                    System.exit(1);

                default:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.flush();
                    System.out.println("Atenção!\nVoce inseriu uma opção invalida. Por favor\n"+
                            "Informe o numero a frente da sua opção escolhida\n\n");

            }
        }
        //Fim Menu
    }
}