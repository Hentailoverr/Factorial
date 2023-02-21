public class Main {
    static int b = 1;
    static int c = 1;
    public static void main(String[] args) {

        int num = 6;
        while (c < num + 1){
            b = c * b;
            c++;
            System.out.println(b);  // -vv, can be erased
        }
        System.out.println(b);
    }
}