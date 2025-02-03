public class Problem05 {

    static class MyObject {
        int value;

        public MyObject(int value) {
            this.value = value;
        }
    }

    public static MyObject modifyObj(MyObject obj) {
        obj.value = obj.value + 10; 
        return obj;
    }

    public static void main(String[] args) {

        MyObject obj1 = new MyObject(5);

        System.out.println("Before modify: " + obj1.value);

        MyObject obj2 = modifyObj(obj1);

        System.out.println("After modify: " + obj2.value);
    }
}
