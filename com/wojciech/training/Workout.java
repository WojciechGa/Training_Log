package exercise;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Workout implements Comparable<Workout>{

    private LocalDate workoutDay;
    private String notes;
    private List<Exercise> exercises = new ArrayList<Exercise>();

    public void addExercise(Exercise e){
        exercises.add(e);
    }

    private void add(){};

    public LocalDate getWorkoutDay() {
        return workoutDay;
    }

    public void setWorkoutDay(LocalDate day) {
        this.workoutDay = day;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int compareTo(Workout o) {
        return this.getWorkoutDay().compareTo(o.getWorkoutDay());

    }

    @Override
    public String toString() {
        return "Workout{" +
                "workoutDay=" + workoutDay +
                ", notes='" + notes + '\'' +
                "\n" + exercises+
                '}';
    }
}
