public class d9 {
    public static void main(String[] args) {

        //int a=100;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("numri " + i + " plotepjesetohet me 3 edhe 5");
            else if (i % 3 == 0)
                System.out.println("numri " + i + " plotespjestohet me 3");
            else if (i % 5 == 0)
                System.out.println("numri " + i + " plotepjesetohet me 5");
        }

    }
}


