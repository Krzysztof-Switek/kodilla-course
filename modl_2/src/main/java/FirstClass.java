public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,100, 2000);             // w tym miejscu tworzę obiekt?
        Notebook heavyNotebook = new Notebook( 2000, 200, 2023);
        Notebook oldNotebook = new Notebook( 1200, 300, 2010);

        System.out.println("Notebook weight: " + notebook.weight + " Notebook price: " + notebook.weight);
        notebook.checkPrice();                                          // wywołuję metodę klasy
        System.out.println("Notebook weight: " + heavyNotebook.weight + " Notebook price: " + heavyNotebook.weight);
        System.out.println("Notebook weight: " + oldNotebook.weight + " Notebook price: " + oldNotebook.weight);

        if (notebook.price < 600) {                                 // sprawdzam pojedyńczy obiekt w Klasie
            System.out.println("This notebook is cheep ");
        } else {
            System.out.println("This notebook is quite expensive");
        }

    }
}
