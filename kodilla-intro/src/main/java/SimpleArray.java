public class SimpleArray {
    public static void main(String[] args) {
         String [] animals = new String[5];

         animals[0] = "Dog";
         animals[1] = "Cow";
         animals[2] = "Hippo";
         animals[3] = "Horse";
         animals[4] = "Dragon";

         String animal = animals[2];
         System.out.println(animal);

         int arrayLength = animals.length;

         System.out.println("My array has: " + arrayLength+ " elements");

    }
}
