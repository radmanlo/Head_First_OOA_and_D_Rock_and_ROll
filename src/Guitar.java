public class Guitar {

    //Variables
    private final String serialNumber, builder, model, type, backWood, topWood;
    private double price;

    //initialization of Guitar class
    public Guitar(String serialNumber, double price, String builder, String model, String type, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    //get value of serial number
    public String getSerialNumber() {
        return serialNumber;
    }

    //get price of the guitar
    public double getPrice() {
        return price;
    }

    //set the price of the guitar
    public void setPrice(double price) {
        this.price = price;
    }

    //get the builder of the guitar
    public String getBuilder() {
        return builder;
    }

    //get the model of the guitar
    public String getModel() {
        return model;
    }

    //get the type of the guitar
    public String getType() {
        return type;
    }

    //get the back wood of the guitar
    public String getBackWood() {
        return backWood;
    }

    //get the top wood of the guitar
    public String getTopWood() {
        return topWood;
    }
}
