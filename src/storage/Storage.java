package storage;

/**
 *
 * @author Student
 */
public class Storage {

    public static void main(String[] args) {
        Shelf shelf = new Shelf();

        shelf.addBox(new Box("Pudło 1", 10));
        shelf.addBox(new Box("Pudlo 2", 30));
        shelf.addBox(new Box("Pudlo 3", 20));
        shelf.addBox(new Box("Pudło 1", 10));

        try {
            shelf.addBox(new Box("", 5));
        } catch (IllegalArgumentException e) {
            System.err.println("Erorr adding box name null.");
        }

        shelf.printSelf();
        System.out.println("Total amount of shelf: " + shelf.totalWith());

        shelf.removeBox("Pudło 1");
        shelf.printSelf();
    }

}
