package com.company.placetypes;

import com.company.Dog;

import java.util.ArrayList;

public class TrainingGround extends Place {
    public void everydayTraining(ArrayList<Dog> puppies) {
        for (Dog puppy : puppies) {
            puppy.getWhereabouts().dogMoved(puppy, this);
            System.out.println(puppy.getName() + " is training");
            puppy.setTrainedToday(true);
            puppy.setHungry(true);
        }
    }

    public void backToAviaries(ArrayList<Dog> puppies) {
        for (Dog puppy : puppies) {
            this.dogMoved(puppy, puppy.getHisAviery());
        }
        System.out.println("All puppies are back in their aiviaries after training");
    }
}
