import java.util.*;

public class Inventory {

    //Variables
    private List guitars;

    public Inventory(){
        guitars = new LinkedList();
    }

    //Add a guitar into the Guitar list
    public void addGuitar(String serialNumber, double price, String builder,
                          String model, String type, String backWood, String topWood) {

        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }

    //get a serial number as a parameter and return
    // the guitar with that serial number
    public Guitar getGuitar (String serialNumber){
        for(Iterator i = guitars.iterator(); i.hasNext();){
            Guitar guitar = (Guitar)i.next();
            if (guitar.getSerialNumber().equals(serialNumber))
                return guitar;
        }
        return null;
    }

    //it is getting the Guitar from parameter
    //return the guitar if there was a guitar with that criteria
    public Guitar search(Guitar searchGuitar) {
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
            // Ignore serial number since that’s unique
            // Ignore price since that’s unique
            String builder = searchGuitar.getBuilder();
            if ((builder != null) && (!builder.equals("")) &&
                    (!builder.equals(guitar.getBuilder())))
                continue;
            String model = searchGuitar.getModel();
            if ((model != null) && (!model.equals("")) &&
                    (!model.equals(guitar.getModel())))
                continue;
            String type = searchGuitar.getType();
            if ((type != null) && (!searchGuitar.equals("")) &&
                    (!type.equals(guitar.getType())))
                continue;
            String backWood = searchGuitar.getBackWood();
            if ((backWood != null) && (!backWood.equals("")) &&
                    (!backWood.equals(guitar.getBackWood())))
                continue;
            String topWood = searchGuitar.getTopWood();
            if ((topWood != null) && (!topWood.equals("")) &&
                    (!topWood.equals(guitar.getTopWood())))
                continue;
        }
        return null;
    }

}

public enum Type {
    ACOUSTIC, ELECTRIC;
    public String toString() {
        switch(this) {
            case ACOUSTIC: return "acoustic";
            case ELECTRIC: return "electric";
            default: return "unspecified";
        }
    }
}
