import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("shkruaj emrin: ");
        String emri = sc.nextLine();  // local variable
        System.out.print("Please mbiemrin: ");
        String mbiemri = sc.next();// another local variable
        System.out.println("shkruaj id: ");
        int id = sc.nextInt();
        kamarieri k1 = new kamarieri(emri, mbiemri, id);//konstruktori
        k1.paraqite();//metoda i paraqet te dhenat qe i marrim nga useri me ane te konstruktrorit

        album album=new album("aa","saa",21,445);
        album.plotpjesetueshem();

        nenpunes n1=new nenpunes();
        n1.emri="ar";
        n1.mbiemri="krasniqi";
        n1.age=20;
        System.out.println(n1.age+n1.emri+n1.mbiemri);

        // use local variables in constructor call
        // FOO foo = new FOO(name, number);

//        auto bmw = new auto();
//        System.out.println("brandi: " + bmw.brand);
//        System.out.println("model: " + bmw.model);
//        System.out.println("color: " + bmw.color);
//        System.out.println("gears: " + bmw.totalgears);
//
//        bmw.currentgear = 5;
//        System.out.println("current gear " + bmw.currentgear);
//        bmw.increasegear();
//        bmw.increasegear();
//        bmw.decreasegear();
//        bmw.decreasegear();
//        bmw.decreasegear();
//        System.out.println("current gear " + bmw.currentgear);
//
        //Çdo entitet që ka gjendje dhe sjellje njihet si objekt psh personi ka emer mbiemer
        //  personi p1 = new personi("a", "krasniqi", 20);
        // p1.learn("java programing");
        //mbushim te dhena me ane te konstruktorit
//        kafsha k1 = new kafsha("bubi", "qen", "europ", 'm', 10, 2);
//        System.out.println(k1.emri);
//        System.out.println(k1.tipi);
//        System.out.println(k1.origjina);
//        System.out.println(k1.gjinia);
//        System.out.println(k1.ditelindja);
//        System.out.println(k1.id);
//        e thirrum metoden me i shfaq te dhenat
//        k1.shfaqtedhenat();
//        k1.eat("mish");

//        market m=new market("molla",2,6,"7/6/2021");
//        System.out.println("data "+m.getDate());
//        System.out.println("product "+m.getPrduct());
//        System.out.println("price "+m.getPrice());
//        System.out.println("quantity "+m.getQuantity());
//        System.out.println(m.returnprice());
//
//        album album1 = new album("mc kresha", "usa", 105, 10000);
//        System.out.println("artisti: " + album1.artist);
//        System.out.println("titulli: " + album1.titulli);
//        System.out.println("qmimi: " + album1.qmimi);
//        System.out.println("numri i kopjeve: " + album1.numriikopjeve);
//        album1.sellcopies();
//        album1.sellcopies();
//        album1.sellcopies();


//        kamarieri k1=new kamarieri("arlind","krasniqi",1);
//         k1.paraqite();

//        double nr1=sc.nextDouble();
//        System.out.println("numri i pare "+nr1);
//        double nr2=sc.nextDouble();
//        System.out.println("numri i dyte"+nr2);
//        System.out.println("rezultati"+nr1%nr2);


    }
}
