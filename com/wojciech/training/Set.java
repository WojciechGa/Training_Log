package exercise;

import java.util.Objects;

public class Set {
    private double weight;
    private int reps;

    public Set(double weight, int reps){
        this.weight = weight;
        this.reps = reps;
    }

    @Override
    public String toString() {
        return String.format("%.2f x %d",weight, reps);
    }

    public double getWeight() {
        return weight;
    }

    public int getReps() {
        return reps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Set set = (Set) o;
        return Double.compare(set.weight, weight) == 0 &&
                reps == set.reps;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, reps);
    }
}
