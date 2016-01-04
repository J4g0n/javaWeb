package JVA210;

/**
 * Created by ipi on 04/01/2016.
 */
public class Exo140 {
    public static void main(String[] args) {
        int [] tableau = { 7, 4, 9, 2, 1, 8, 3 };
        afficher(tableau);
        int [] tableauTrie = trier(tableau, 0, tableau.length);
        afficher(tableauTrie);
    }

    public static void afficher(int [] tab) {
        int i;

        for(i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + "\t");
        }
        System.out.print("\n");
    }

    public static int [] echanger(int [] tab, int i, int j) {
        int tmp = tab[i];
        tab[i] = tab[j];
        tab[j] = tmp;
        return tab;
    }

    public static int trierSousTableau(int [] tab, int dbt, int fin, int pivot) {
        int i = dbt,  j = dbt;
        echanger(tab, fin, pivot);

        while ( i < fin ) {
            if (tab[i] <= tab[fin]) {
                echanger(tab, i, j);
                j++;
            }
            i++;
        }

        echanger(tab, fin, j);

        return j;
    }

    public static int [] trier(int [] tab, int dbt, int fin) {
        if (dbt < fin) {
            int pivot = dbt;
            pivot = trierSousTableau(tab, dbt, fin - 1, pivot);
            trier(tab, dbt, pivot);
            trier(tab, pivot + 1, fin);
        }

        return tab;
    }
}
