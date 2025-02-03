public class Problem08 {

    private int pVar = 10;
    int dVar = 20;
    protected int prVar = 30;
    public int pubVar = 40;

    public int getPVar() {
        return pVar;
    }

    public void setPVar(int pVar) {
        this.pVar = pVar;
    }

    public static void main(String[] args) {
        Problem08 obj = new Problem08();

        System.out.println("Default Variable: " + obj.dVar);
        System.out.println("Protected Variable: " + obj.prVar);
        System.out.println("Public Variable: " + obj.pubVar);

        System.out.println("Private Variable (getter): " + obj.getPVar());

        obj.setPVar(50);
        System.out.println("Private Variable (setter): " + obj.getPVar());
    }
}
