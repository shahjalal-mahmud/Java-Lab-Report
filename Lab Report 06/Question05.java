class Student {
    private String name;
    private String id;
    private String address;
    private double cgpa;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getID() {
        return id;
    }

    public void setID(String i) {
        this.id = i;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String a) {
        this.address = a;
    }

    public double getCGPA() {
        return cgpa;
    }

    public void setCGPA(double c) {
        this.cgpa = c;
    }
    @Override
    public String toString(){
        return ("Name: " + name + "\tID: " + id + "\tAddress: " + address +"\n");
    }
}

public class Question05 {
    public static void main(String[] args) {
        Student jalal = new Student();
        Student preo = new Student();
        Student munna = new Student();

        jalal.setName("Md Shahajalal Mahmud");
        jalal.setID("CSE230321539");
        jalal.setAddress("Batiaghata, Khulna");
        jalal.setCGPA(3.5);

        preo.setName("Preota Saha");
        preo.setID("CSE230321538");
        preo.setAddress("Nirala, Khulna");
        preo.setCGPA(3.8);

        munna.setName("Md Munna Sardar");
        munna.setID("CSE230321540");
        munna.setAddress("Batiaghata, Khulna");
        munna.setCGPA(3.9);

        System.out.println("Student Information:");
        System.err.println(jalal);
        System.err.println(preo);
        System.err.println(munna);
    }
}
