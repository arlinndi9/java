public class d8 {
    public static void main(String[] args) {
        int day = 14540;
        int sec = day * 24 * 60 * 60;
        int min = day * 24 * 60;
        int days = day;
        int year = day / 365;
        int de = (day / year/10);
        int shek = day / year/de/100;

        System.out.println("14540 dite bejne:" + sec + " sekonda");
        System.out.println("14540 dite bejne:" + min + " minuta");
        System.out.println("14540 dite bejne:" + days + " dite");
        System.out.println("14540 dite bejne:" + year + " vite");
        System.out.println("14540 dite bejne:" + de + " dekada");
        System.out.println("14540 dite bejne:" + shek + " shekuj");
    }
}
