public class Problem05 {

    static class Obj {
        int num;

        public Obj(int num) {
            this.num = num;
        }
    }

    public static Obj updateObj(Obj o) {
        o.num = o.num + 10; 
        return o;
    }

    public static void main(String[] args) {

        Obj obj1 = new Obj(5);

        System.out.println("Before update: " + obj1.num);

        Obj obj2 = updateObj(obj1);

        System.out.println("After update: " + obj2.num);
    }
}
