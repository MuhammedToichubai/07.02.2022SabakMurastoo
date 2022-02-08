package com.company;

public class Main {

    public static void main(String[] args) {

    CowKorova cowKorova1 = new CowKorova("Seydana",(byte) 10,200.7d);
    CowKorova cowKorova2 = new CowKorova("Tumar",(byte) 6,170.5d);
    CowKorova cowKorova3 = new CowKorova("Keremet",(byte) 4,110.7d);
    CowKorova cowKorova4 = new CowKorova("Deniz",(byte) 3,250.0d);
    CowKorova cowKorova5 = new CowKorova("Jumong",(byte) 2,150.9d);
    CowKorova[] cowsFirma1 = {cowKorova1,cowKorova2,cowKorova3,cowKorova4,cowKorova5};

    SheepOvsa sheepOvsa1 = new SheepOvsa("Koy1",(byte) 4,25.6d);
    SheepOvsa sheepOvsa2= new SheepOvsa("Koy2",(byte) 4,25.6d);
    SheepOvsa sheepOvsa3 = new SheepOvsa("Koy3",(byte) 4,25.6d);
    SheepOvsa sheepOvsa4 = new SheepOvsa("Kochkor1",(byte) 5,25.6d);
    SheepOvsa sheepOvsa5 = new SheepOvsa("Kochkor2",(byte) 6,25.6d);
    SheepOvsa sheepOvsa6 = new SheepOvsa("Toktu1",(byte) 2,25.6d);
    SheepOvsa sheepOvsa7 = new SheepOvsa("Kozu1",(byte) 1,25.6d);
    SheepOvsa sheepOvsa8 = new SheepOvsa("Kozu2",(byte) 1,25.6d);
    SheepOvsa[] sheepsFirma1 = {sheepOvsa1,sheepOvsa2,sheepOvsa3,sheepOvsa4,sheepOvsa5,sheepOvsa6,sheepOvsa7,sheepOvsa8};

    HorseLoshad horseLoshad1 = new HorseLoshad("Duldul",(byte) 5,280.0d);
    HorseLoshad horseLoshad2 = new HorseLoshad("Symsym",(byte) 8,300.3d);
    HorseLoshad[] horsesFirma1 ={horseLoshad1,horseLoshad2};

    MountainsGory mountainsGoryFirma1 = new MountainsGory("KaraDobo","KokJar","Muhammed",cowsFirma1,sheepsFirma1,horsesFirma1);

    CowKorova[] cowsFirma2 = {cowKorova1,cowKorova5};
    SheepOvsa[] shepsFirma2 = {sheepOvsa1,sheepOvsa4,sheepOvsa6,sheepOvsa7};
    HorseLoshad horseLoshad3 = new HorseLoshad("At",(byte) 6,280.0d);
    HorseLoshad horseLoshad4 = new HorseLoshad("Bee",(byte) 7,320.0d);
    HorseLoshad horseLoshad5 = new HorseLoshad("Tay",(byte) 3,175.23d);
    HorseLoshad[] horsesFirma2 ={horseLoshad1,horseLoshad2,horseLoshad3,horseLoshad4,horseLoshad5};

    MountainsGory mountainsGoryFirma2 = new MountainsGory("KaraKoy","Nookat","Ulanbek",cowsFirma2,shepsFirma2,horsesFirma2);
    
        System.out.println("+---------------------------------------------------------------------------------------");
        System.out.print("Jayloonun aty - "+mountainsGoryFirma1.getName()+"! Address - "+mountainsGoryFirma1.getAddress()+"! Chabanchy - "+mountainsGoryFirma1.getEshepherdSNam()+"!\n");
        System.out.println(mountainsGoryFirma1.getName()+" firmasyny tomonku janybarlar kamtyit");
        System.out.println("+---------------------------------------------------------------------------------------");
        for (CowKorova o : mountainsGoryFirma1.getCows()){
            System.out.println("Uidun aty  "+ o.getName() + ", "+o.getAge()+" jashta, massasy "+ o.getWeightVes()+" kg.");
        }System.out.println("+---------------------------------------------------------------------------------------");
        for (SheepOvsa s:mountainsGoryFirma1.getSheeps()){
            System.out.println("Koidun aty  "+ s.getName() + ", "+s.getAge()+" jashta, massasy "+ s.getWeightVes()+" kg.");
        }System.out.println("+---------------------------------------------------------------------------------------");
        for (HorseLoshad h:mountainsGoryFirma1.getHorses()) {
            System.out.println("Attyn aty  "+ h.getName() + ", "+h.getAge()+" jashta, massasy "+ h.getWeightVes()+" kg.");
        }System.out.println("+---------------------------------------------------------------------------------------");
        System.out.println(mountainsGoryFirma1.getName()+" fyrmasy menen taanyshkaynyzdarga yraazychylyk!");
        System.out.println("+---------------------------------------------------------------------------------------");

        System.out.print("Jayloonun aty - "+mountainsGoryFirma2.getName()+"! Address - "+mountainsGoryFirma2.getAddress()+"! Chabanchy - "+mountainsGoryFirma2.getEshepherdSNam()+"\n");
        System.out.println(mountainsGoryFirma2.getName()+" firmasyny tomonku janybarlar kamtyit");
        System.out.println("+---------------------------------------------------------------------------------------");
        for (CowKorova o : mountainsGoryFirma2.getCows()){
            System.out.println("Uidun aty  "+ o.getName() + ", "+o.getAge()+" jashta, massasy "+ o.getWeightVes()+" kg.");
        }System.out.println("+---------------------------------------------------------------------------------------");
        for (SheepOvsa s:mountainsGoryFirma2.getSheeps()){
            System.out.println("Koidun aty  "+ s.getName() + ", "+s.getAge()+" jashta, massasy "+ s.getWeightVes()+" kg.");
        }System.out.println("+---------------------------------------------------------------------------------------");
        for (HorseLoshad h:mountainsGoryFirma2.getHorses()) {
            System.out.println("Attyn aty  "+ h.getName() + ", "+h.getAge()+" jashta, massasy "+ h.getWeightVes()+" kg.");
        }System.out.println("+---------------------------------------------------------------------------------------");
        System.out.println(mountainsGoryFirma2.getName()+" fyrmasy menen taanyshkaynyzdarga yraazychylyk!");
        System.out.println("+---------------------------------------------------------------------------------------");
    }
}
