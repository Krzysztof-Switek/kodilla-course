public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,500, 2000);             // w tym miejscu tworzę obiekt?
        Notebook heavyNotebook = new Notebook( 2000, 1000, 2023);
        Notebook oldNotebook = new Notebook( 1400, 700, 2010);

        System.out.println("Notebook weight: " + notebook.weight +";"+ " Notebook price: " + notebook.price +";"+ " Production year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkValue4Money();
        System.out.println("Notebook weight: " + heavyNotebook.weight +";"+ " Notebook price: " + heavyNotebook.price +";"+ " Production year: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkValue4Money();
        System.out.println("Notebook weight: " + oldNotebook.weight +";"+ " Notebook price: " + oldNotebook.price +";"+ " Production year: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        heavyNotebook.checkValue4Money();





        /*


        if (notebook.price < 600) {                                 // sprawdzam pojedyńczy obiekt w Klasie
            System.out.println("This notebook is cheep ");
        } else {
            System.out.println("This notebook is quite expensive");
        }
*/
    }
}
