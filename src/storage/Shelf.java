/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Student
 */
public class Shelf {

    private final List<Box> boxShelf = new ArrayList();

    void addBox(Box box) {
        if (box != null) {
            boxShelf.add(box);
        } else {
            throw new IllegalArgumentException("Object can't be null.");
        }
    }

    void printSelf() {
        for (Box box : boxShelf) {
            System.out.println("Box name: " + box.name + ", width: " + box.width);
        }
    }

    int totalWith() {
        int amount = 0;
        for (Box box : boxShelf) {
            amount += box.width;
        }
        return amount;
    }

    void removeBox(String name) {
        Iterator<Box> it = boxShelf.iterator();
        
        while (it.hasNext()) {
            Box box = it.next();
            if (name.equals(box.name)) {
                it.remove();
            }
        }
    }
}
