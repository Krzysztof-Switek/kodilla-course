public class Notebook {

    //construktor
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

     /*  Zmodyfikuj metodę checkPrice w taki sposób, by sprawdzała kilka przedziałów cenowych:
        jeśli cena jest niższa od 600, wyświetl "This notebook is very cheap.",
        jeśli cena jest z przedziału 600-1000, wyświetl "The price is good.",
        jeśli cena jest wyższa od 1000, wyświetl "This notebook is expensive.".
     */

    public void checkPrice() {
        if (this.price <= 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price <= 1000){
            System.out.println("The price is good.");
        } else {System.out.println("This notebook is expensive.");
        }
    }

    /*  Dodaj nową metodę checkWeight, która będzie sprawdzać wagę urządzenia.
        Samodzielnie napisz instrukcję warunkową i dobierz przedziały wagowe:
        w zależności od podanej wagi ma wyświetlać się wiadomość,
        że dane urządzenie jest lekkie, niezbyt ciężkie i bardzo ciężkie.
     */
    public void checkWeight() {
        if (this.weight <= 1000) {
            System.out.println("This notebook is very light.");
        } else if (this.weight > 1000 && this.weight <= 1500){
            System.out.println("This notebook is of normal weight.");
        } else System.out.println("This notebook is rather heavy.");
        }

        /* Dodaj instrukcję warunkową (z co najmniej jednym else if), która będzie sprawdzać zarówno rok produkcji,
        jak i cenę. Samodzielnie dobierz zakresy i napisz komunikaty. Przykładowo, laptop o cenie powyżej 1500,
        wyprodukowany później niż w roku 2018, otrzyma inny komunikat, niż urządzenie z roku 2000 o cenie 600.
         */
        public void checkValue4Money() {
            if (this.year > 2000 && this.price < 1200) {
                System.out.println("That ia a good value for money");
            } else if (this.year >= 2010 && this.price < 800){
                System.out.println("That is cheap but still acceptable");
            } else System.out.println("Do not be bothered - it is a junk");
        }
}
