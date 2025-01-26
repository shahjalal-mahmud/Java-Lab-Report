public class Problem08 {

    private int privateVar = 10;
    int defaultVar = 20;
    protected int protectedVar = 30;
    public int publicVar = 40;
    public int getPrivateVar() {
        return privateVar;
    }

    public void setPrivateVar(int privateVar) {
        this.privateVar = privateVar;
    }

    public static void main(String[] args) {
        Problem08 obj = new Problem08();

        System.out.println("Default Variable: " + obj.defaultVar);
        System.out.println("Protected Variable: " + obj.protectedVar);
        System.out.println("Public Variable: " + obj.publicVar);

        System.out.println("Private Variable (getter): " + obj.getPrivateVar());

        obj.setPrivateVar(50);
        System.out.println("Private Variable (setter): " + obj.getPrivateVar());
    }
}
