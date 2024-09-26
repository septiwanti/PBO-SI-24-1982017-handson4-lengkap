public class ContohClassMethod {
    public static class Student {
        private String Name;
        private int Age;
        private double Grade;

        public Student(String name, int age, double grade) {
            this.Name = name;
            this.Age = age;
            this.Grade = grade;
        }

        public String getName() {
            return Name;
        }

        public int getAge() {
            return Age;
        }

        public double getGrade() {
            return Grade;
        }

        public void displayStudentInfo() {
            System.out.println("Name: " + Name);
            System.out.println("Age: " + Age);
            System.out.println("Grade: " + Grade);
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 20, 85.5);
        Student student2 = new Student("Jane Doe", 21, 90.2);

        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}
