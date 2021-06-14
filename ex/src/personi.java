//klasa
// klasë gjithashtu mund të përcaktohet si një plan, nga i cili mund të krijoni një objekt individual
 class personi {
    private String emri;
    private String mbiemri;
    private int age;

    public String getEmri() {

        return getEmri();
    }
    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //konstruktori
    public personi(String emri, String mbiemri, int age) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.age = age;
    }

    void eat(String food){
        System.out.println("eat "+food);
    }
    void learn(String programing){
        System.out.println("learn"+programing);
    }
    void test(personi p1){
        System.out.println(p1.getEmri());
        System.out.println(p1.getMbiemri());
        System.out.println(p1.getAge());
    }
    personi getobj(){
        return new personi("arlind","krasniqi",20);
    }
}
