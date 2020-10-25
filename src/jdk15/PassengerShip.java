package jdk15;

public sealed class PassengerShip extends Ship permits WarShip{
    private int noOfPassengers;

    public PassengerShip(String name,int p) {
        super(name);
        this.noOfPassengers=p;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    @Override
    public String toString() {
        return "Passenger Ship{" +
                "Number of passengers=" + getNoOfPassengers()  +
                ", name='" + name + '\'' +
                '}';
    }
}

