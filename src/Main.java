import javax.swing.text.html.HTMLDocument;
import java.util. *;

public class Main {
    public static void main(String[] args) {
        // Set up Rick’s guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        GuitarSpec whatErinLikes = new GuitarSpec("radi", Builder.FENDER, Type.ACOUSTIC, Wood.ALDER, Wood.ALDER);
        List guitars = inventory.search(whatErinLikes);
        if (guitars != null) {
            for (Iterator i = guitars.iterator(); i.hasNext(); ){
                Guitar guitar = (Guitar)i.next();
                System.out.println("Erin, you might like this " +
                        guitar.getSpec().getBuilder() + " " + guitar.getSpec().getModel() + " " +
                        guitar.getSpec().getType() + " guitar:\n " +
                        guitar.getSpec().getBackWood() + " back and sides,\n " +
                        guitar.getSpec().getTopWood() + " top.\nYou can have it for only $" +
                        guitar.getPrice() + "!");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }
    private static void initializeInventory(Inventory inventory) {
        // Add guitars to the inventory...
        GuitarSpec spec = new GuitarSpec("radi", Builder.FENDER, Type.ACOUSTIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("R1", 1.1, spec);

    }
}