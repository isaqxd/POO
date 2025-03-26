package xdisaq.AulaPoo;
public class Product{
    private String name;
    private int code;
    private String label;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode(){
        return this.code;
    }

    public void setLabel (String label){
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }
    public void setPrice (double price) {
        if (price > 0) {
            this.price = price;
        }
        else {
            System.out.println('.');
        }
    }
    public double getPrice(){
        return this.price;
    }
}
