public class Loading {
    public void carregar() throws InterruptedException {
        int i = 0;
        while (i <= 100) {
            System.out.print("\rCarregando: " + i + "% ");
            switch (i % 3) {
                case 0:
                    System.out.print("\033[0;33m|\033[0m");
                    break;
                case 1:
                    System.out.print("\033[0;33m/\033[0m");
                    break;
                case 2:
                    System.out.print("\033[0;33m-\033[0m");
                    break;
                default:
                    break;
            }
            Thread.sleep(30);
            i++;
        }
        System.out.println("\n\n");
    }
}