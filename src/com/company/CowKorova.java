package com.company;

public class CowKorova {
    private String name;
    private byte age;
    private double weightVes;

    public CowKorova(){

    }

    public CowKorova(String name, byte age, double weightVes) {
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
