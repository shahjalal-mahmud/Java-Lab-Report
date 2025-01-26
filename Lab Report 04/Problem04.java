public class Problem04 {

    public static void change(int number) {
        number = number + 10;
        System.out.println("Inside change: " + number);
    }

    public static void changeValue(MyObject obj) {
        obj.value = obj.value + 10;
        System.out.println("Inside changeValue: " + obj.value);
    }

    public static void main(String[] args) {

        int num = 5;
        System.out.println("Before change: " + num);
        change(num); 
        System.out.println("After change: " + num); 

        System.out.println();

        MyObject myObj = new MyObject(5);
        System.out.println("Before changeValue: " + myObj.value);
        changeValue(myObj); 
        System.out.println("After changeValue: " + myObj.value);
    }
}

class MyObject {
    int value;

    public MyObject(int value) {
        this.value = value;
    }
}
