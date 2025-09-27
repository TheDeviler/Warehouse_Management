import java.util.Objects;

public class Magazzino
{
    Prodotto[] prodotti = new Prodotto[50];
    int aum=0, contatore=1, verifica=0;
    static class Prodotto
    {
        String nome;
        String codice;
        int quantita;
        double prezzoUnitario;

        Prodotto(String nome, String codice, int quantita, double prezzoUnitario)
        {
            this.nome=nome;
            this.codice=codice;
            this.quantita=quantita;
            this.prezzoUnitario=prezzoUnitario;
        }
    }

    void AggiuntaProdotto(String nome, String codice, int quantita, double prezzoUnitario)
    {
        if (aum!=50)
        {
            if(verifica==0)
            {
                prodotti[aum] = new Prodotto(nome, codice, quantita, prezzoUnitario);
                aum++;
                verifica++;
            }
            else
            {
                for (Prodotto prodotto : prodotti)
                {
                    if (!codice.equals(prodotto.codice))
                    {
                        prodotti[aum] = new Prodotto(nome, codice, quantita, prezzoUnitario);
                        aum++;
                    }
                    else
                    {
                        System.out.println("Codice già esistente");
                        break;
                    }
                }
            }
        }
        else
        {
            System.out.println("Magazzino pieno");
        }
    }

    void StampaProdotti()
    {
        for (Prodotto prodotto : prodotti)
        {
            if (prodotto!=null)
            {
                System.out.println("Prodotto Numero: " + contatore++);
                System.out.println("Nome prodotto: " + prodotto.nome);
                System.out.println("Codice prodotto: " + prodotto.codice);
                System.out.println("Quantità prodotto: " + prodotto.quantita);
                System.out.println("Prezzo prodotto: " + prodotto.prezzoUnitario + "€");
            }
        }
        contatore=1;
    }

    void EliminaProdotto(String codice)
    {
        for (Prodotto prodotto : prodotti)
        {
            if (codice.equals(prodotto.codice))
            {
                System.out.println("Prodotto Eliminato");
                prodotto.nome=null;
                prodotto.codice=null;
                prodotto.prezzoUnitario=0;
                prodotto.codice="";
                break;
            }
        }
    }
}
