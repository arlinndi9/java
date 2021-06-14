import java.util.Locale;

public class d6 {
    public static void main(String[] args) {

        int count=0;
        String str = "Nata ra në fshat. Hena e bukur se bashku me yjet ndriconin qiellin";
        str=str.toLowerCase(Locale.ROOT);
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='a'||str.charAt(i)=='e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'||str.charAt(i)=='y'){
                count++;
            }
        }
        System.out.println(count);


    }
}
