package sepl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Calculation {

    private int x;
    private boolean flag;

    public boolean isFlag() {
        return flag;
    }
    @Value("#{8>4}")
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Value("#{T(Math).pow(5,2)}")
    private int y;
    @Value("#{new String('Harshit')}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getZ() {
        return z;
    }

    @Value("#{T(Math).PI}")
    public void setZ(double z) {
        this.z = z;
    }

    private double z;


    public int getX() {
        return x;
    }

    @Value("#{2+4}")
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Calculation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Calculation() {
    }

    @Override
    public String toString() {
        return "Calculation{" +
                "x=" + x +
                ", flag=" + flag +
                ", y=" + y +
                ", name='" + name + '\'' +
                ", z=" + z +
                '}';
    }
}