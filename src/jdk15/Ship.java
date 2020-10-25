package jdk15;

// www.TestingDocs.com
public sealed class Ship permits CargoShip,PassengerShip {
    protected String name;

    public Ship(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                '}';
    }
}

