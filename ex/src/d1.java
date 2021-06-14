import java.lang.reflect.Array;
import java.util.Arrays;

public class d1 {
    public static void main(String[] args) {
       /* String str="ariu";
        int n=3;
        System.out.println(str.substring(0,n)+str.substring(n+1,str.length()));

        String fjala="basketball";
        if (fjala.startsWith("ba")){
            System.out.println(fjala+"fillon me ba");
        }
        else {
            System.out.println("nuk eshte mire");
        }

          String txt="hahaha arlind";
        System.out.println(txt.replaceAll("hahaha","lol"));



        String txt="heeololeo";
        for (int i = 0; i < txt.length(); i+=2) {
            System.out.println(txt.charAt(i));
        }


        String fjala="ben";
        System.out.println(fjala.repeat(4)); repeat e perserit stringun

        String txt="arlind## krasni##qi";
        System.out.println(txt.replace("#",""));
        //replace e zevenedson


        String s="aaaabbaabbabaab";
        System.out.println(s.indexOf("aab"));


        String[]fjala={"aab","cabcab","bac"};
        String str= Arrays.toString(fjala);
        System.out.println(str);
        System.out.println(str.indexOf(1));


        int []a={1,2,3,4,5,6,7};
        int[]b={1,2,3,4,5,6,7};
        if (a.length==b.length){
            System.out.println("same");
        }else {
            System.out.println("error");
        }

        //gjetja e numrit ne array
        int[]a={4,5,6,12,60,9,7,8,7,2,1};
        int numriqekerkohet=5;
        boolean test=false;
        for (int element:a){
            if (element==numriqekerkohet){
                test=true;
            }
        }
        System.out.println(test);


        int shpejtesia=65;
        if (shpejtesia==1||shpejtesia<=60){
            System.out.println("nuk merr denim");
        }
        else if (shpejtesia==61||shpejtesia<=80){
            System.out.println("denimi 50euro");
        }
        else if (shpejtesia==81||shpejtesia<=100){
            System.out.println("denimi 100euro");
        }
        else if (shpejtesia>100){
            System.out.println("konfiskimi");
        }


        int a=5;
        int b=2;
        boolean bo=false;
        if (a==7||b==7){
            bo=true;
            System.out.println(bo);
        }
        else if (a+b==7){
            bo=true;
            System.out.println(bo);
        }
        else if (a-b==7){
            bo=true;
            System.out.println(bo);
        }
            */

        String s="forb";
        if (s.endsWith("b")&&s.startsWith("f")) {
            System.out.println("fillon me shkronjen f dhe mbaron me b");
        }
        else if (s.startsWith("f")){
            System.out.println("fillon me b");
        }
        else if (s.endsWith("b")){
            System.out.println("mbaraon me b");
        }


    }
}
