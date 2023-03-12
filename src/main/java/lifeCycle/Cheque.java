package lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cheque implements InitializingBean, DisposableBean {
    private int money;

    public void destroy() throws Exception {
        System.out.println("Cheque sum is collected");
    }

    //init
    public void afterPropertiesSet() throws Exception {
        System.out.println("cheque ready to submit");
    }

    @Override
    public String toString() {
        return "Cheque{" +
                "money=" + money +
                '}';
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Cheque() {
    }

    public Cheque(int money) {
        this.money = money;
    }
}
