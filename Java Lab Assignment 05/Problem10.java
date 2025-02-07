class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Overriding toString() method to provide a custom representation
    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + "}";
    }

    // Overriding equals() method to compare Student objects based on id
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Student) {
            Student other = (Student) obj;
            return this.id == other.id;
        }
        return false;
    }
}

public class Problem10 {
    public static void main(String[] args) {
        Student s1 = new Student("Pranto", 1567);
        Student s2 = new Student("Afiafh", 1532);
        Student s3 = new Student("Rifat", 1532);

        // Using toString() (calls overridden method)
        System.out.println("Student 1: " + s1.toString());
        System.out.println("Student 2: " + s2.toString());

        // Using equals() to compare objects
        System.out.println("s1 equals s2? " + s1.equals(s2)); 
        System.out.println("s1 equals s3? " + s1.equals(s3));
    }
}

