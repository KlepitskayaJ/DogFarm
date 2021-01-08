package com.company.farmworkers;

import com.company.Dog;

import java.util.ArrayList;

public class Vet {
    public void checkup(ArrayList<Dog> dogs) {
        for (Dog dog : dogs) {
            if (dog.isHealthy()) {
                System.out.println(dog.getName() + " is already healthy");
            } else {
                System.out.println(dog.getName() + " been cured");
            }
        }
        System.out.println("All dogs are healthy now");
    }
}
