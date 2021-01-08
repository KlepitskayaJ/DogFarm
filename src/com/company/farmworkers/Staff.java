package com.company.farmworkers;

import com.company.Dog;
import com.company.placetypes.Aviary;
import com.company.placetypes.TrainingGround;
import com.company.placetypes.Work;

import java.util.ArrayList;

public class Staff {
    public void toFeedAllDogs(ArrayList<Dog> dogs) {
        for (Dog dog : dogs) {
            System.out.println(dog.getName() + " is eating " + dog.getDogsAge().getMenu());
            dog.setHungry(false);
        }
        System.out.println("All dogs have eated");
    }

    public void toCleanAllAviaries(ArrayList<Aviary> aviaries) {
        for (Aviary aviary : aviaries) {
            aviary.setClean(true);
        }
        System.out.println("All aviaries has been cleaned");
    }

    public void toTrainPuppiesAndGetDogsToWork(ArrayList<Dog> puppies, TrainingGround whereToTrain, ArrayList<Dog> dogs, Work workingCenter) {
        whereToTrain.everydayTraining(puppies);
        workingCenter.dogsWorking(dogs);
    }

    public void toBringDogsAndPuppiesBack(ArrayList<Dog> puppies, TrainingGround whereToTrain, ArrayList<Dog> dogs, Work workingCenter) {
        whereToTrain.backToAviaries(puppies);
        workingCenter.dogsLeftWork(dogs);
    }
}

