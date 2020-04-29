package ru.innopolis.stc.java.lesson8.task4;

public class Contract {

    private int numberContract;
    private String dateContract;
    private String[] massivContract ;

    Contract(int numberContract, String dateContract, String[] massivContract){
        this.numberContract=numberContract;
        this.dateContract=dateContract;
        this.massivContract=massivContract;
    }

    public void setDateContract(String dateContract) {
        this.dateContract = dateContract;
    }

    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }

    public void setMassivContract(String[] massivContract) {
        this.massivContract = massivContract;
    }

    public int getNumberContract() {
        return numberContract;
    }

    public String getDateContract() {
        return dateContract;
    }

    public String[] getMassivContract() {
        return massivContract;
    }
}
