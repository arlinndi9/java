import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.print("shkruaj ekipin vendas ");
        String ekipivendas=myObj.nextLine();
        System.out.println("ekipi vendas: "+ekipivendas);

        System.out.print("shkruaj ekipin mysafir ");
        String ekipimysafir=myObj.nextLine();
        System.out.println("ekipi mysafir: "+ekipimysafir);

        System.out.print("stadiumi ");
        String stadiumi=myObj.nextLine();
        System.out.println("stadiumi:"+stadiumi);

        System.out.print("shkruaj numrin e tifozve ");
        int numritifozve=myObj.nextInt();
        System.out.println("numri i tifozve: "+numritifozve);


        System.out.print("sa gola ka shenuar "+ ekipimysafir+" ");
        int golaekipimysafir=myObj.nextInt();
        System.out.print("sa gola ka shenuar "+ekipivendas+" ");
        int golaekipivendas=myObj.nextInt();
        System.out.println("-----------------------------");
        System.out.println(ekipivendas+"--"+ekipimysafir+" "+golaekipivendas+":"+golaekipimysafir);
        System.out.println("ne stadiumin "+stadiumi+" jane prezent "+numritifozve+" tifoz");
    }
}
