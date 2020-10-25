package jdk15;

//www.TestingDocs.com
public non-sealed class CargoShip extends Ship {
    private double cargoWeight; // kgs

    public CargoShip(String name, double w) {
        super(name);
        this.cargoWeight=w;
    }

    protected double convertToTons() {
        return this.cargoWeight/1000;
    }

    @Override
    public String toString() {
        return "Cargo Ship{" +
                "Cargo Weight in Tons=" + convertToTons()  +
                ", name='" + name + '\'' +
                '}';
    }
}

