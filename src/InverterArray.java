import java.util.ArrayList;
import java.util.Collections;

public class InverterArray {
    public void teste (int[] entrada, int[] saida) {
        ArrayList<Integer> lista = new ArrayList<Integer>();


        //processo de inverter o vetor para calcular apartir de notas maiores
        for(int i = 0; i < entrada.length; i++) {
            lista.add(entrada[i]);
        }
        Collections.reverse(lista);
        saida = new int[lista.size()];
        for(int i = 0; i < lista.size(); i++) {
            saida[i] = lista.get(i);
        }
        // fim do provesso de inverter

    }
}