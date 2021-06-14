public class d3 {
    public static void main(String[] args) {

        String txt = "lorem ipsum eshte nje tekst shabllon i industrise se printimit dhe shtypshkronjave.lorem ipsum ka qene teksti shabllon i industrise qe nga vitet 1500,kur nje shtypes i panjohur morri nje galeri shkriemesh dhe i ngaterroi per te krijuar nje liber moster.teksti i ka mbijetuar jo vetem pese shekujve por edhe kalimit te ne shtypshkrimin elektronik duke ndenjur ne thelb i pandryshuar ";

        int charCount = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == 'e') {
                charCount++;
            }
        }
        System.out.println("shkronja |e| paraqitet:" + charCount);
    }
}
