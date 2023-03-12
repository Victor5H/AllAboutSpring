package lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Carton {
    private String dimension;

    @Override
    public String toString() {
        return "Carton{" +
                "Dimension='" + dimension + '\'' +
                '}';
    }
    @PostConstruct
    public void init(){
        System.out.println("Post construct");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Pre destroy");
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Carton() {
    }

    public Carton(String dimension) {
        this.dimension = dimension;
    }
}
