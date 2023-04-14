public class Application {

    double age ;
    double height ;
    String name ;

    public Application(double age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }
    public void checkApplicant () {
        if (this.name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }

    public static void main(String[] args) {
        Application aplication = new Application(55.2, 184.2, "Tomasz");
        aplication.checkApplicant();




    }
}


