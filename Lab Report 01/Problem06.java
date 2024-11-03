
public class Problem06 {
    public static void main(String[] args) {
        double principle, rate, time;
        principle = 10000;
        rate = 5;
        time = 3;
        double interest = principle * (rate / 100) * time;
        System.out.println("Simple interest: " + interest);
    }
}
