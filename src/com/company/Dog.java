package com.company;

import com.company.placetypes.Place;

public class Dog {
    private String name;
    private age dogsAge;
    private boolean isHealthy;
    private boolean isHungry = true;
    private boolean trainedToday = false;
    private Place whereabouts;
    private Place hisAviary;
    private job dogsJob;


    public enum job {POLICE, EMERGENCY}

    public enum age {
        PUPPY("Puppies menu"), ADULT("Adult dog's menu"), ELDERLY("Elderly dog's menu");

        private final String menu;

        age(String menu) {
            this.menu = menu;
        }

        public String getMenu() {
            return menu;
        }
    }

    public String getName() {
        return name;
    }

    public age getDogsAge() {
        return dogsAge;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public Place getWhereabouts() {
        return whereabouts;
    }

    public Place getHisAviery() {
        return hisAviary;
    }

    public job getDogsJob() {
        return dogsJob;
    }

    public static class Builder {
        private final Dog newDog;

        public Builder() {
            newDog = new Dog();
        }

        public Builder withName(String name) {
            newDog.name = name;
            return this;
        }

        public Builder withAge(age dogsAge) {
            newDog.dogsAge = dogsAge;
            return this;
        }

        public Builder withHealth(boolean isHealthy) {
            newDog.isHealthy = isHealthy;
            return this;
        }

        public Builder withAviary(Place hisAviary) {
            newDog.hisAviary = hisAviary;
            hisAviary.addNewDog(newDog);
            newDog.whereabouts = hisAviary;
            return this;
        }

        public Builder withJob(job dogsJob) {
            newDog.dogsJob = dogsJob;
            return this;
        }

        public Dog build() {
            return newDog;
        }

    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public void setTrainedToday(boolean trainedToday) {
        this.trainedToday = trainedToday;
    }

    public void setWhereabouts(Place whereabouts) {
        this.whereabouts = whereabouts;

    }

    @Override
    public String toString() {
        return name;
    }
}
