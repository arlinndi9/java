import java.util.Scanner;

public class selectfigure {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.println(" figure:1-trekendesh  2-katror   3-drejtekendshem");
        System.out.print("zgjidh njeren nga figurat: ");
        int figura=myObj.nextInt();
        switch (figura){
            case 1:
                System.out.println("ju keni zgjedhur trekendsh");
                System.out.println(
                        "    *\n" +
                        " ******\n" +
                        "*********\n"

                        );
                break;
            case 2:
                System.out.println("ju keni zgjedhur katror");
                System.out.print ("*********  \n");
                System.out.print ("*       *  \n");
                System.out.print ("*       *  \n");
                System.out.print ("*       *  \n");
                System.out.print ("*       *  \n");
                System.out.print ("*       *  \n");
                System.out.print ("*       *  \n");
                System.out.print ("*       *  \n");
                System.out.print ("*********");
               break;
            case 3:
                System.out.println("ju keni zgjedhur drejtkendesh");
                System.out.print ("****************************  \n");
                System.out.print ("*                          *  \n");
                System.out.print ("*                          *  \n");
                System.out.print ("*                          *  \n");
                System.out.print ("*                          *  \n");
                System.out.print ("*                          *  \n");
                System.out.print ("*                          *  \n");
                System.out.print ("*                          *  \n");
                System.out.print ("****************************");

                break;
        }
    }
}
