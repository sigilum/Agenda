package model;

/**
 *
 * @author dpMelian
 */
public class Address {
    private String streetName;
    private int number;
    private int floor;

    public Address(String streetName, int number, int floor) {
        this.streetName = streetName;
        this.number = number;
        this.floor = floor;
    }

    public Address(String streetName, int number) {
        this.streetName = streetName;
        this.number = number;
    }
}