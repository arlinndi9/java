import java.util.Scanner;

public class ekuleta2 {
    public static void main(String[] args) {
       /* Scanner reader=new Scanner(System.in);
        int sa1cent,sa2cent,sa5cent,sa10cent,sa20cent,sa50cent,sa1euro,sa2euro;
        System.out.println("sa 1 cent");
        sa1cent=reader.nextInt();
        System.out.println("sa 2 cent");
        sa2cent=reader.nextInt();

        System.out.println("-----------------------------------" );
        System.out.printf("sa 1 centshe:%5d %10.2f eur %n",sa1cent,sa1cent*0.01);
        System.out.printf("sa 2 centshe %5d %10.2f eur %n",sa2cent,sa2cent*0.02);

            */
        //widening
        int myint=10;
        double myDouble = myint;
        System.out.println(myint);
        System.out.println(myDouble);
        //narroving
        double d=9.8;
         int i=(int)d;
        System.out.println(i);
        //caststring
        String s="22";
        int a=Integer.parseInt(s);
        System.out.println(a);
        byte b=Byte.parseByte(s);
        System.out.println(b);

        //random
        int nr=100;
        double rnd=Math.random();
        int numri=(int) (rnd*100);
        System.out.println(numri);

        double random=Math.random()*50;
        System.out.println(random);
    }
}
