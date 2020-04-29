package ru.innopolis.stc.java.lesson8.task4;

public class Convertation {

    private Act convert(Contract contract){
        return new Act(contract.getNumberContract(),contract.getDateContract(),contract.getMassivContract());
    }

    public static void main(String[] args) {
        Contract contract1 = new Contract(1,"2020", new String[10]);
    }
}

