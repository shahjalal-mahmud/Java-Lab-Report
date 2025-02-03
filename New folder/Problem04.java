public class Problem04 {

    public static void modify(int n) {
        n = n + 10;
        System.out.println("Inside modify: " + n);
    }

    public static void modifyObj(MyClass obj) {
        obj.val = obj.val + 10;
        System.out.println("Inside modifyObj: " + obj.val);
    }

    public static void main(String[] args) {

        int num = 5;
        System.out.println("Before modify: " + num);
        modify(num); 
        System.out.println("After modify: " + num); 

        System.out.println();

        MyClass myObj = new MyClass(5);
        System.out.println("Before modifyObj: " + myObj.val);
        modifyObj(myObj); 
        System.out.println("After modifyObj: " + myObj.val);
    }
}

class MyClass {
    int val;

    public MyClass(int val) {
        this.val = val;
    }
}
