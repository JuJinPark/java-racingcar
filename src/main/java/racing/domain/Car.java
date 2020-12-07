package racing.domain;

import java.util.Objects;

public class Car implements Cloneable {
    private static final int LOW_POWER = 3;
    private static final int MOVE_POSITION = 1;
    private CarName carName;
    private int position;

    public Car(CarName name) {
        this.carName = name;
        this.position = 0;
    }

    Car(CarName name, int position) {
        this.carName = name;
        this.position = position;
    }

    public void move(int power) {
        this.position = isPowerEnough(power) ? this.position + MOVE_POSITION : this.position;
    }

    private boolean isPowerEnough(int power) {
        return power > LOW_POWER;
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return carName.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return position == car.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        Car clone = (Car)super.clone();
        clone.carName = carName.clone();
        return clone;
    }
}