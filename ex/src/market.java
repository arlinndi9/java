public class market {
    private String prduct;
    private int quantity;
    private int price;
    private String date;

    public market(String prduct, int quantity, int price, String date) {
        this.prduct = prduct;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
    }

    public String getPrduct() {
        return prduct;
    }

    public void setPrduct(String prduct) {
        this.prduct = prduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int returnprice() {
        return price * quantity;

    }
}
