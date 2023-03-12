package lifeCycle;

public class PiggyBank {
    private int money;

    public int getMoney() {
        return money;
    }

    public PiggyBank() {

    }

    public void init(){
        System.out.println("piggy bank safe");
    }
    public void destroy(){
        System.out.println("piggy bank destroyed");
    }

    public void setMoney(int money) {
        System.out.println("Money Inserted");
        this.money = money;
    }

    public PiggyBank(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "PiggyBank{" +
                "money=" + money +
                '}';
    }
}
