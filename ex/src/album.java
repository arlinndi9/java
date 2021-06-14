public class album {
    String artist;
    String titulli;
    double qmimi;
    int numriikopjeve;

    public album(String artist, String titulli, double qmimi, int numriikopjeve) {
        this.artist = artist;
        this.titulli = titulli;
        this.qmimi = qmimi;
        this.numriikopjeve = numriikopjeve;
    }


    void sellcopies() {//ë metodë është një bllok kodi ose koleksion deklaratash ose një grup kodesh të grupuar së bashku për të kryer një detyrë ose operacion të caktuar. Përdoret për të arritur ripërdorimin e kodit.
        // Ne shkruajmë një metodë një herë dhe e përdorim atë shumë herë.
        // Ne nuk kemi nevojë të shkruajmë kod përsëri dhe përsëri.
        if (numriikopjeve > 0) {
            numriikopjeve--;
            numriikopjeve = numriikopjeve;
            System.out.println("kan mbetur edhe : " + numriikopjeve + " albume");
        } else {
            System.out.println("nuk ka albume");
        }


    }
    //ushtrim ska lidhje me klasen album
    public void plotpjesetueshem(){
        for (int i = 0; i <=100; i++) {
            if (i%3==0){
                System.out.println("plotepjestohetn:"+i);
            }
        }

    }
}
