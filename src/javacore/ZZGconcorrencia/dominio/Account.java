package javacore.ZZGconcorrencia.dominio;

public class Account {
    private int balance = 50;

    public int withdrawal(int amount){
        this.balance = this.balance - amount;
        return amount;
    }
    public int getBalance() {
        return balance;
    }
}
