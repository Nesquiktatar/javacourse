package ru.innopolis.stc.java.lesson8.task4;

public class Act {

    private int numberAct;
    private String dateAct;
    private String[] massivAct;


    Act(int numberAct, String dateAct, String[] massivAct) {
        this.massivAct=massivAct;
        this.numberAct=numberAct;
        this.dateAct=dateAct;
    }



    public void setDateAct(String dateAct) {
        this.dateAct = dateAct;
    }

    public void setMassivAct(String[] massivAct) {
        this.massivAct = massivAct;
    }

    public void setNumberAct(int numberAct) {
        this.numberAct = numberAct;
    }

    public int getNumberAct() {
        return numberAct;
    }

    public String getDateAct() {
        return dateAct;
    }

    public String[] getMassivAct() {
        return massivAct;
    }
}
