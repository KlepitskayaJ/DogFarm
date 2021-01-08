package com.company;

import com.company.farmworkers.Staff;
import com.company.farmworkers.Vet;
import com.company.placetypes.Aviary;
import com.company.placetypes.Place;
import com.company.placetypes.TrainingGround;
import com.company.placetypes.Work;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Aviary aviary1 = new Aviary();
        Aviary aviary2 = new Aviary();
        Aviary aviary3 = new Aviary();
        ArrayList<Aviary> allAviaries = new ArrayList<>();
        allAviaries.add(aviary1);
        allAviaries.add(aviary2);
        allAviaries.add(aviary3);

        TrainingGround ourTrGround = new TrainingGround();
        Work workingCenter = new Work();
        Staff ourStaff = new Staff();
        Vet ourVet = new Vet();

        Dog dog1 = new Dog.Builder()
                .withName("Penny")
                .withAge(Dog.age.PUPPY)
                .withHealth(true)
                .withAviary(aviary1)
                .build();
        Dog dog2 = new Dog.Builder()
                .withName("Sheldon")
                .withAge(Dog.age.PUPPY)
                .withHealth(false)
                .withAviary(aviary2)
                .build();
        Dog dog3 = new Dog.Builder()
                .withName("Leonard")
                .withAge(Dog.age.ADULT)
                .withHealth(true)
                .withAviary(aviary3)
                .withJob(Dog.job.EMERGENCY)
                .build();
        Dog dog4 = new Dog.Builder()
                .withName("Govard")
                .withAge(Dog.age.ADULT)
                .withHealth(false)
                .withAviary(aviary1)
                .withJob(Dog.job.POLICE)
                .build();
        Dog dog5 = new Dog.Builder()
                .withName("Rag")
                .withAge(Dog.age.ADULT)
                .withHealth(true)
                .withAviary(aviary2)
                .withJob(Dog.job.EMERGENCY)
                .build();
        Dog dog6 = new Dog.Builder()
                .withName("Bernadeth")
                .withAge(Dog.age.ELDERLY)
                .withHealth(false)
                .withAviary(aviary3)
                .build();
        Dog dog7 = new Dog.Builder()
                .withName("Emmy")
                .withAge(Dog.age.ELDERLY)
                .withHealth(false)
                .withAviary(aviary3)
                .build();

        ArrayList<Dog> puppyDogs = new ArrayList<>();
        puppyDogs.add(dog1);
        puppyDogs.add(dog2);
        ArrayList<Dog> adultDogs = new ArrayList<>();
        adultDogs.add(dog3);
        adultDogs.add(dog4);
        adultDogs.add(dog5);
        ArrayList<Dog> elderDogs = new ArrayList<>();
        elderDogs.add(dog6);
        elderDogs.add(dog7);

        ArrayList<Dog> allFarmDogs = new ArrayList<>();
        allFarmDogs.addAll(puppyDogs);
        allFarmDogs.addAll(adultDogs);
        allFarmDogs.addAll(elderDogs);

        // THE DAY BEGINS
        ourStaff.toFeedAllDogs(allFarmDogs);
        Place.whereAllDogs(aviary1, aviary2, aviary3, ourTrGround, workingCenter);
        ourVet.checkup(allFarmDogs);
        ourStaff.toCleanAllAviaries(allAviaries);
        ourStaff.toTrainPuppiesAndGetDogsToWork(puppyDogs, ourTrGround, adultDogs, workingCenter);
        Place.whereAllDogs(aviary1, aviary2, aviary3, ourTrGround, workingCenter);
        ourStaff.toBringDogsAndPuppiesBack(puppyDogs, ourTrGround, adultDogs, workingCenter);
        Place.whereAllDogs(aviary1, aviary2, aviary3, ourTrGround, workingCenter);
        ourStaff.toFeedAllDogs(allFarmDogs);
    }
}

