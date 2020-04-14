package ru.innopolis.stc.java.lesson8.task4;

public class Convertation {
    Contract contract = new Contract() {};

    public Act contracttoAct() {
        return new Act(contract.getNumberContract(), contract.getDateContract(), contract.getMassivContract());
    }

    public static void main(String[] args) {

    }
}