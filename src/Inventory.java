import java.util.*;

public class Inventory {

    //Variables
    private List guitars;

    public Inventory(){
        guitars = new LinkedList();
    }

    //Add a guitar into the Guitar list
    public void addGuitar(String serialNumber, double price, GuitarSpec spec) {

        Guitar guitar = new Guitar(serialNumber, price, spec);
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
    public List search(GuitarSpec searchSpec) {
        List matchingGuitars = new LinkedList();
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
            GuitarSpec guitarSpec = guitar.getSpec();
            if (searchSpec.getBuilder() != guitarSpec.getBuilder())
                continue;
            String model = searchSpec.getModel();
            if ((model != null) && (!model.equals("")) &&
                    (!model.equals(guitarSpec.getModel().toLowerCase())))
                continue;
            if (searchSpec.getType() != guitarSpec.getType())
                continue;
            if (searchSpec.getBackWood() != guitarSpec.getBackWood())
                continue;
            if (searchSpec.getTopWood() != guitarSpec.getTopWood())
                continue;
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }

}


