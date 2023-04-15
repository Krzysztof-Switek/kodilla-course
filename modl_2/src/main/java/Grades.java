public class Grades {
    public static void main(String[] args) {
        Grades grades = new Grades();               // obiekt grades w klasie Grades
        grades.addGrade(4);
        grades.addGrade(5);
        grades.addGrade(3);
        grades.addGrade(1);
        grades.addGrade(6);
        grades.addGrade(2);
        grades.addGrade(4);
        grades.addGrade(3);
        grades.addGrade(1);
        grades.addGrade(4);

        System.out.println("Last added grade: " + grades.getLastAdded());
        System.out.println("Grade's average: " + grades.getAverage());
    }


    private int[] grades;
    private int size;
    private int lastAdded;


    public Grades() {                   // constructor
        this.grades = new int[10];
        this.size = 0;
        this.lastAdded = -1;
    }

    //
    public void addGrade(int grade) {
        if (this.size < this.grades.length) {
            this.grades[this.size] = grade;
            this.size++;
            this.lastAdded = grade;
        }
    }

    public int getLastAdded() {
        return this.lastAdded;
    }

    public double getAverage() {
        if (this.size == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum += this.grades[i];
        }
        return sum / this.size;
    }
}
