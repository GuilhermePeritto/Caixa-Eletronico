import javax.lang.model.element.QualifiedNameable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CalculoCedulasSaque {
    ArrayList<Integer> cedulasDisponiveis = new ArrayList<Integer>();
    Scanner ler = new Scanner(System.in);
    ArrayList<Integer> quantidades = new ArrayList<>();

    int[] notas = {200, 100, 50, 20, 10, 5, 2, 1};

    boolean cedulasSuficientes;

    public void calcular(int saque) throws IOException, InterruptedException {
            //maiores
            cedulasSuficientes = true;
            //zerar o array quantidades para a proxima execução
            while (quantidades.size()>0){
                quantidades.clear();
            }
            for (int i = 0; i < notas.length; i++) {
                int quantidade = saque / notas[i];
                quantidades.add(quantidade);
                saque %= notas[i];
            }

            for (int i = 0; i < quantidades.size(); i++) {
                if (cedulasDisponiveis.get(i) < quantidades.get(i)) {
                    cedulasSuficientes = false;
                    LimparConsole.Limpar();
                    while (!cedulasSuficientes) {
                        System.out.println("\n\"Não há cédulas disponíveis suficientes para efetuar o saque!\"\n" +
                                "\nPrecione 1 para continuar: ");
                        int confirmar = ler.nextInt();

                        if (confirmar == 1) {
                            break;
                        }
                        else {
                            LimparConsole.Limpar();
                            System.out.println("\nInforme um valor valido!\n");
                        }
                    }
                    break;
                }
            }
            //remover cedulas
            for (int i = 0; i < cedulasDisponiveis.size(); i++) {
                if (cedulasSuficientes) {
                    for (i = 0; i < quantidades.size(); i++) {
                        cedulasDisponiveis.set(i, cedulasDisponiveis.get(i) - quantidades.get(i));
                    }
                }
            }
            LimparConsole.Limpar();
            for(int i = 0; i<notas.length;i++) {
                if (quantidades.get(i) > 0 && cedulasSuficientes) {
                    System.out.println("Notas de R$" + notas[i] + ": " + quantidades.get(i));
                }
            }
    }


    public void mostrarcedulas() throws IOException, InterruptedException {
        LimparConsole.Limpar();
         for(int i = 0; i < cedulasDisponiveis.size();i++) {
            System.out.println("Notas de "+ notas[i] + " R$: " + cedulasDisponiveis.get(i));
        }
    }

    public void adicionarcedulas() throws IOException, InterruptedException {
        for (int i = 0; i < notas.length; i++){
            LimparConsole.Limpar();
            System.out.println("\nQuantas notas de " + notas[i] + " R$ voce quer depositar?");
           cedulasDisponiveis.set(i, cedulasDisponiveis.get(i)+ler.nextInt());
        }
    }

    public void IniciarCedulas(){
        for (int i = 0; i < notas.length; i++){
            cedulasDisponiveis.add(0);
        }
    }
}