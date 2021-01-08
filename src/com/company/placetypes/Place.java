package com.company.placetypes;

import com.company.Dog;
import java.util.ArrayList;

public abstract class Place {
    /**
     * This list contains of dogs, who are right now in the Place
     */
    private final ArrayList<Dog> dogsHere = new ArrayList<>();

    public void addNewDog(Dog dog) {
        dogsHere.add(dog);
    }

    public ArrayList<Dog> getDogsHere() {
        return dogsHere;
    }

    public void dogMoved(Dog movingDog, Place whereToMove) {
        movingDog.getWhereabouts().getDogsHere().remove(movingDog);
        whereToMove.getDogsHere().add(movingDog);
        movingDog.setWhereabouts(whereToMove);
    }

    /**
     * This function is used to show right work of lists in Places (that consists of dogs in this places in the moment)
     */
    public static void whereAllDogs(Place... places) {
        for (Place place : places) {
            System.out.println("Place: " + place.getClass().getSimpleName() + " --- Dogs there: " + place.getDogsHere());
        }
    }
}

