import java.util.ArrayList;
public class CalculoCedulas {
    public void calcular(double saque, int tiposaque) {

        double[] notas = {200, 100, 50, 20, 10, 5, 2, 0.50, 0.25, 0.10, 0.05};
        ArrayList<Integer> quantidades = new ArrayList<>();

        if(tiposaque == 1) {
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

        else if(tiposaque == 2){

            //menores
//            //387 ~=
//            if(saque<=387) {
//                for (int i = 0; i < notas.length; i++) {
//                    int quantidade = (int) (saque / notas[i]);
//                    if (quantidade > 1) {
//                        saque %= notas[i];
//                    } else {
//                        quantidades.add(quantidade);
//                        saque %= notas[i];
//                    }
//                }
//            }
//            else if(saque<=774) {
//                for (int i = 0; i < notas.length; i++) {
//                    int quantidade = (int) (saque / notas[i]);
//                    if (quantidade > 2) {
//                        saque %= notas[i];
//                    } else {
//                        quantidades.add(quantidade);
//                        saque %= notas[i];
//                    }
//                }
//            }
//            //1162 ~=
//            else if(saque<=1162) {
//                for (int i = 0; i < notas.length; i++) {
//                    int quantidade = (int) (saque / notas[i]);
//                    if (quantidade > 3) {
//                        saque %= notas[i];
//                    } else {
//                        quantidades.add(quantidade);
//                        saque %= notas[i];
//                    }
//                }
//            }
//            //1162 ~=
//            else if(saque<=1162) {
//                for (int i = 0; i < ; i++) {
//                    int quantidade = (int) (saque / notas[i]);
//                    if (quantidade > 4) {
//                        saque %= notas[i];
//                    } else {
//                        quantidades.add(quantidade);
//                        saque %= notas[i];
//                    }
//                }
//            }
                for (int i = notas.length; i >=-1 ; i--) {
                    int quantidade = (int) (saque / notas[i]);
                    if (quantidade > 4) {
                        saque %= notas[i];
                    } else {
                        quantidades.add(quantidade);
                        saque %= notas[i];
                    }
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
    }
}