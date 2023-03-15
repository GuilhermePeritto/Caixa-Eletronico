import java.io.IOException;

public class LimparConsole {
    public static void Limpar() throws IOException, InterruptedException {
        {
            for(int i = 0; i < 200; i++)
                System.out.println("");
        }
        System.out.println("Sucesso!\n\n");
    }
}