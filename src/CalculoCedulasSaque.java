import java.util.ArrayList;
import java.util.Scanner;

public class CalculoCedulasSaque {
    ArrayList<Integer> cedulasDisponiveis = new ArrayList<Integer>();
    Scanner ler = new Scanner(System.in);
    ArrayList<Integer> quantidades = new ArrayList<>();
    int[] notas = {200, 100, 50, 20, 10, 5};

    public void calcular(int saque, int tiposaque) {

        if(tiposaque == 1) {
            //maiores
            for (int i = 0; i < notas.length; i++) {
                int quantidade = saque / notas[i];
                quantidades.add(quantidade);
                saque %= notas[i];
            }
            boolean cedulasSuficientes = true;

            for (int i = 0; i < quantidades.size(); i++) {
                if (cedulasDisponiveis.get(i) < quantidades.get(i)) {
                    System.out.println("Não há cédulas disponíveis suficientes para efetuar o saque.");
                    cedulasSuficientes = false;
                    break;
                }
            }

            for (int i = 0; i < notas.length; i++) {
                if (cedulasSuficientes) {
                    for (i = 0; i < quantidades.size(); i++) {
                        cedulasDisponiveis.set(i, cedulasDisponiveis.get(i) - quantidades.get(i));
                    }
//                    if (quantidades.get(i) > 0) {
//                        System.out.println("Notas de R$" + notas[i] + ": " + quantidades.get(i));
                    System.out.println("Notas de R$" + notas[i] + ": " + quantidades.get(i));
                }
            }
        }
        //menores
        else{
            System.out.println("Ainda nao desenvolvelmos essa funçõa, favor entrar em contato com o mundial do palmeiras");
        }
    }
    public void mostrarcedulas() {
         for(int i = 0; i < cedulasDisponiveis.size();i++) {
            System.out.println(cedulasDisponiveis.get(i));
        }
    }

    public void adicionarcedulas() {
        for (int i = 0; i < notas.length; i++){
            System.out.println("Quantas notas de " + notas[i] + " R$ voce quer depositar?");
           cedulasDisponiveis.add(ler.nextInt());
        }
    }
}