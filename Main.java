import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Magazzino prodotti = new Magazzino();

        int scelta = 0, quantità = 0, exit = 0;
        double prezzo = 0;
        String nome, codice;

        while (exit != 1) {
            System.out.println("1:aggiungi prodotti, 2.EliminaProdotto, 4:MostraTutti. 5:esci");
            scelta = sc.nextInt();
            switch (scelta) {
                case 1:

                    System.out.println("Nome prodotto: ");
                    nome = sc.next();

                    System.out.println("Quanti prodotti vuoi inserire: ");
                    quantità = sc.nextInt();

                    System.out.println("Codice prodotto: ");
                    codice = sc.next();

                    System.out.println("Prezzo: ");
                    prezzo = sc.nextDouble();

                    prodotti.AggiuntaProdotto(nome, codice, quantità, prezzo);
                    break;

                case 2:
                    System.out.println("Codice prodotto da eliminare: ");
                    codice = sc.next();
                    prodotti.EliminaProdotto(codice);
                    break;

                case 4:
                    prodotti.StampaProdotti();
                    break;

                case 5:
                    exit = 1;
                    sc.close();
                    break;
            }
        }
    }
}
