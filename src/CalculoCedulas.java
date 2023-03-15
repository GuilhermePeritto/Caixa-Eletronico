import java.util.ArrayList;
public class CalculoCedulas {
    public void calcular(double saque, int tiposaque) {


        ArrayList<Integer> quantidades = new ArrayList<>();

        if(tiposaque == 1) {
            double[] notas = {200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05};
            //maiores
            for (int i = 0; i < notas.length; i++) {
                int quantidade = (int) (saque / notas[i]);
                quantidades.add(quantidade);
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
            double[] notas = {0.05,0.10,0.25,0.50,1,2,5,10,20,50,100,200};
            for (int i = 0; i < notas.length; i++) {
                int quantidade = (int) (saque / notas[i]);
                if(quantidade>5){
                    int resto = quantidade-5;
                    quantidades.add(5);
                    saque = resto;
                }
                else {
                    quantidades.add(quantidade);
                    saque %= notas[i];
                }
            }

            for (int i = 0; i <= 4; i++) {
                if (quantidades.get(i) > 0) {
                    System.out.println("Moedas de R$" + notas[i] + ": " + quantidades.get(i));
                }
            }

            for (int i = 5; i < notas.length; i++) {
                if (quantidades.get(i) > 0) {
                    System.out.println("Notas de R$" + notas[i] + ": " + quantidades.get(i));
                }
            }
        }
    }
}