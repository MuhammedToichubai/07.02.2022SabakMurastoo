package com.company;

public class MountainsGory {
    private String name;
    private String address;
    private String eshepherdSNam;
    private CowKorova[] cows;
    private SheepOvsa[] sheeps;
    private HorseLoshad[] horses;

    public MountainsGory(String karaDobo, String kokJar){

    }

    public MountainsGory(String name, String address, String eshepherdSNam, CowKorova[] cows, SheepOvsa[] sheeps, HorseLoshad[] horsels) {
        this.name = name;
        this.address = address;
        this.eshepherdSNam = eshepherdSNam;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horsels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEshepherdSNam() {
        return eshepherdSNam;
    }

    public void setEshepherdSNam(String eshepherdSNam) {
        this.eshepherdSNam = eshepherdSNam;
    }

    public CowKorova[] getCows() {
        return cows;
    }

    public void setCows(CowKorova[] cows) {
        this.cows = cows;
    }

    public SheepOvsa[] getSheeps() {

        return sheeps;
    }

    public void setSheeps(SheepOvsa[] sheeps) {
        this.sheeps = sheeps;
    }

    public HorseLoshad[] getHorses() {

        return horses;
    }

    public void setHorses(HorseLoshad[] horses) {
        this.horses = horses;
    }
}
