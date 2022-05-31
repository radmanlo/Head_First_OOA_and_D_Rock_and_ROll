public class Guitar {

    //Variables
    private final String serialNumber;
    private double price;
    private final GuitarSpec spec;

    //initialization of Guitar class
    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
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

    public GuitarSpec getSpec() {
        return spec;
    }
}
