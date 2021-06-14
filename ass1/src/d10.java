public class d10 {
    public static void main(String[] args) {
        int base = 2;
        int power = 16;
        int result = 1;


        while (power != 0) {
            result = result * base;
            power--;
            System.out.println(result);

        }
    }
}

