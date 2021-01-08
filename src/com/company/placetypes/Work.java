package com.company.placetypes;


import com.company.Dog;

import java.util.ArrayList;

public class Work extends Place {
    private static final ArrayList<Dog> dogsEmergency = new ArrayList<>();
    private static final ArrayList<Dog> dogsPolice = new ArrayList<>();

    public void dogsWorking(ArrayList<? extends Dog> enteringdogs) {
        for (Dog enteringdog : enteringdogs) {
            enteringdog.getWhereabouts().dogMoved(enteringdog, this);
            if (enteringdog.getDogsJob() == Dog.job.POLICE) {
                dogsPolice.add(enteringdog);
            } else if (enteringdog.getDogsJob() == Dog.job.EMERGENCY) {
                dogsEmergency.add(enteringdog);
            }
            System.out.println(enteringdog.getName() + " is working in " + enteringdog.getDogsJob());
            enteringdog.setHungry(true);
        }
    }

    public void dogsLeftWork(ArrayList<Dog> exitingdogs) {
        System.out.println("Dogs are going home");
        for (Dog exitingdog : exitingdogs) {
            if (exitingdog.getDogsJob() == Dog.job.POLICE) {
                dogsPolice.remove(exitingdog);
            } else if (exitingdog.getDogsJob() == Dog.job.EMERGENCY) {
                dogsEmergency.remove(exitingdog);
            }
            this.dogMoved(exitingdog, exitingdog.getHisAviery());
        }
    }
}

