package main.java.com.bjsxt.cucumberTest.steps;

public class Colour {
    private String color;

    public Colour(String color) {
        this.color = color;
    }

    public Colour() {
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Colour{" +
                "color='" + color + '\'' +
                '}';
    }



}
