package entities;

import java.util.Objects;

public class Item {
    public String city;
    public String street;
    public int house;
    public int floor;
    public int count = 0;

    public Item(String city, String street, int house, int floor) {
        this.city = city;
        this.street = street;
        this.floor = floor;
        this.house = house;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getHouse() {
        return house;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return house == item.house && floor == item.floor && Objects.equals(city, item.city) && Objects.equals(street, item.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, house, floor);
    }

    @Override
    public String toString() {
        return "Город: " + city +
                ", Улица: " + street +
                ", Дом: " + house +
                ", Этажей: " + floor;
    }
}
