package autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    @Autowired

    private Address address;

    private Address address1;

    public Address getAddress1() {
        return address1;
    }

    @Autowired
    @Qualifier("Pune")
    public void setAddress1(Address address1) {
        this.address1 = address1;
    }

    private int id;
    private String name;

    public Employee() {
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(Address address, int id, String name) {
        this.address = address;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                ", address1=" + address1 +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
