public class student {
    public student(String emri, String mbiemri, int age, student.contactinfo contactinfo) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.age = age;
        this.contactinfo = contactinfo;
    }

    String emri;
    String mbiemri;
    int age;
    private contactinfo contactinfo;

    void study(String study) {
        System.out.println("studenti po meson" + study);
    }

    void play(String play) {
        System.out.println("free time" + play);
    }

    class contactinfo {
        String adresa;
        String email;
        int numriitelefonit;

    }
}
