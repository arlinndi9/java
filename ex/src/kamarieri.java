public class kamarieri {
    private String emri;
    private String mbiemri;
    private String lokali = "caffebar";
    private int id;

    public kamarieri(String emri, String mbiemri, int id) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.id = id;
    }

    public void paraqite() {
        System.out.println("emri: " + emri);
        System.out.println("mbiemri: " + mbiemri);
        System.out.println("lokali: " + lokali);
        System.out.println("id: " + id);
    }
}
