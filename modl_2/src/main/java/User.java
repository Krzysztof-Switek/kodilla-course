import java.util.Random;
public class User {

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public static void main(String[] args) {
            User[] users = new User[6];
            users[0] = new User("Tomasz", 23);
            users[1] = new User("Sylwia", 21);
            users[2] = new User("Marta", 42);
            users[3] = new User("Sebastian", 18);
            users[4] = new User("Mateusz", 29);
            users[5] = new User("Aleksandra", 56);

            int result = 0;
            for (User user : users) {
                result += user.getAge();
            }
            double aver = result / (double) users.length;

            System.out.println("Users below average age:");
            for (User user : users) {
                if (user.getAge() < aver) {
                    System.out.println(user.getName());
                }
            }
        }

    public class RandomNumbers {
        private int sum;
        private int min;
        private int max;

        public RandomNumbers() {
            this.sum = 0;
            this.min = 30;
            this.max = 0;
        }

        public void generateNumbers() {
            Random rand = new Random();
            int num;
            while (this.sum < 5000) {
                num = rand.nextInt(31);
                this.sum += num;
                if (num > this.max) {
                    this.max = num;
                }
                if (num < this.min) {
                    this.min = num;
                }
            }
        }

        public int getMax() {
            return this.max;
        }

        public int getMin() {
            return this.min;
        }
    }
}





