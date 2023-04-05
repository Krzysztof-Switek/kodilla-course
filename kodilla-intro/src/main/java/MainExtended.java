public class MainExtended {
    public static void main(String[] args) {
        String patientName = "Tomasz Skory";
        short patientWeight = 85;
        int patientBirthYear= 2007;
        double patientHeight = 1.64;
        boolean patientSmoke = false;
        float patientBMI;


        System.out.println("Patient's name: " + patientName);
        System.out.println("Patient's weight: " + patientWeight);
        System.out.println("Patient's height: " + patientHeight);
        System.out.println("Patient was born in: " + patientBirthYear);
        System.out.println(patientName + " BMI is: " + patientWeight/(patientHeight*patientHeight));
        System.out.println("Patient smokes (true / false): " + patientSmoke);
        //System.out.println("It is not " + isGoodProgrammer + " that I'm a good programmer ;)");
    }
}
