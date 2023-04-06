public class Loops {
    public static void main(String[] args) {
     /*   for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
     */
        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
        int arrayLength = names.length;

        for (int i = 0; i < arrayLength; i++) {
            System.out.println(names[i]);
       }
        int[] numbersArray = new int[4];
        numbersArray[0] = 1;
        numbersArray[1] = 1;
        numbersArray[2] = 1;
        numbersArray[3] = 1;
        int arraySum = 0;

        for (int i = 0; i <= arrayLength; i++){
            arraySum = arraySum + numbersArray[i];
            //System.out.println(arraySum);
        }
        System.out.println(arraySum);
    }
}
