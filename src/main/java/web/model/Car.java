package web.model;


public class Car {
    private String name;
    private String color;
    private String engine;

    public Car() {
    }

    public Car(String name, String color, String engine) {
        this.name = name;
        this.color = color;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}