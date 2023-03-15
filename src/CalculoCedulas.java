import java.util.ArrayList;
import java.util.Collections;

public class CalculoCedulas {
    public void calcular(int saque, int tiposaque) {


        ArrayList<Integer> quantidades = new ArrayList<>();
        ArrayList<Integer> disponiveis = new ArrayList<>();

        int[] notas = {200, 100, 50, 20, 10, 5};


        if(tiposaque == 1) {
            //maiores
            for (int i = 0; i < notas.length; i++) {
                int quantidade = (int) (saque / notas[i]);
                quantidades.add(quantidade);
               // disponiveis.remove(quantidade);
                saque %= notas[i];
            }

            for (int i = 0; i < 6; i++) {
                if (quantidades.get(i) > 0) {
                    System.out.println("Notas de R$" + notas[i] + ": " + quantidades.get(i));
                }
            }

            for (int i = 7; i < notas.length; i++) {
                if (quantidades.get(i) > 0) {
                    System.out.println("Moedas de R$" + notas[i] + ": " + quantidades.get(i));
                }
            }
        }
        //menores
        else{
            System.out.println("Ainda nao desenvolvelmos essa funçõa, favor entrar em contato com o mundial do palmeiras");
        }
    }
}