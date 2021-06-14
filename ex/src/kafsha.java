public class kafsha {
    private String emri;
    private String tipi;
    private String origjina;
    private char gjinia;
    private int ditelindja;
    private int id;

    public kafsha(String emri, String tipi, String origjina, char gjinia, int ditelindja, int id) {
        this.emri = emri;
        this.tipi = tipi;
        this.origjina = origjina;
        this.gjinia = gjinia;
        this.ditelindja = ditelindja;
        this.id = id;
    }

    void eat(String food) {
        System.out.println("eat " + food);
    }


    void shfaqtedhenat() {
        System.out.println(emri + tipi + origjina + gjinia + ditelindja + id);
    }
}
