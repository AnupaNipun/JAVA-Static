public class TestStatic {
    static int age;
    static void show(){
        System.out.println("This ia stataic method");
    }

    public static void main(String[] args) {
        age = 25;
        System.out.println("Age is " + age);
        show();
    }
}

