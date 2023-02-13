class Temperature {
    private double temperature;

    public Temperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }
}

class Celsius extends Temperature {
    public Celsius(double temperature) {
        super(temperature);
    }

    public double toFahrenheit() {
        return (getTemperature() * 9 / 5) + 32;
    }
}

class Fahrenheit extends Temperature {
    public Fahrenheit(double temperature) {
        super(temperature);
    }

    public double toCelsius() {
        return (getTemperature() - 32) * 5 / 9;
    }
}

public class Main {
    public static void main(String[] args) {
        Celsius celsius = new Celsius(100.0);
        System.out.println(celsius.getTemperature() + "°C = " + celsius.toFahrenheit() + "°F");

        Fahrenheit fahrenheit = new Fahrenheit(100.0);
        System.out.println(fahrenheit.getTemperature() + "°F = " + fahrenheit.toCelsius() + "°C");
    }
}