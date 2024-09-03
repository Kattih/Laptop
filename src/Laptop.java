import java.util.Objects;

public class Laptop {
    private String OS;
    private String colour;

    public Laptop(String OS, String colour){
        //поля, геттерыб конструктор, из класса Object переопределить методы: toString, equals, hashCode
        this.OS = OS;
        this.colour = colour;
    }
    @Override
    public String toString() {
        return "Laptop{" +
                "OS='" + OS + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(OS, laptop.OS) && Objects.equals(colour, laptop.colour);
    }
    @Override
    public int hashCode() {
        return Objects.hash(OS, colour);
    }

    public String getOS() {
        return OS;
    }

    public String getColour() {
        return colour;
    }
}
