public class Notebook {

    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000){
            System.out.println("The price is good.");
        } else {System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight <= 1000) {
            System.out.println("This notebook is very light.");
        } else if (this.weight > 1000 && this.weight <= 1500){
            System.out.println("This notebook is of normal weight.");
        } else System.out.println("This notebook is rather heavy.");
        }

        public void checkValue4Money() {
            if (this.year > 2000 && this.price < 1200) {
                System.out.println("That ia a good value for money");
            } else if (this.year >= 2010 && this.price < 800){
                System.out.println("That is cheap but still acceptable");
            } else System.out.println("Do not be bothered - it is a junk");
        }
}
