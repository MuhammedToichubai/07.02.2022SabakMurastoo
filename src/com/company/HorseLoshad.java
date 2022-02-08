package com.company;

public class HorseLoshad {
    private String name;
    private byte age;
    private double weightVes;

    public HorseLoshad(){

    }

    public HorseLoshad(String name, byte age, double weightVes) {
        this.name = name;
        this.age = age;
        this.weightVes = weightVes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public double getWeightVes() {
        return weightVes;
    }

    public void setWeightVes(double weightVes) {
        this.weightVes = weightVes;
    }
}
