package com.jrdadev.fair.repartition;

public class FairRepartition {
    private double totalAmount;
    private double numberOfPersons;
    private double numberOfBirthdays;

    public FairRepartition(double totalAmount, int numberOfPersons, int numberOfBirthdays){
        this.totalAmount = totalAmount;
        this.numberOfPersons = numberOfPersons;
        this.numberOfBirthdays = numberOfBirthdays;
    }

    public double getNoBirthdayAmount() {
        return numberOfBirthdays * (totalAmount / (numberOfPersons * numberOfPersons - numberOfPersons)) + totalAmount / numberOfPersons;
    }

    public double getBirthdayAmount() {
        return (numberOfBirthdays - 1) * (totalAmount / (numberOfPersons * numberOfPersons - numberOfPersons));
    }

    public double getNormalAmount() {
        return totalAmount / numberOfPersons;
    }

    public double getAmountPayed() {
        return getNoBirthdayAmount() * (numberOfPersons - numberOfBirthdays) + getBirthdayAmount() * (numberOfBirthdays);
    }
}
