package exercise;

import java.util.ArrayList;

public class StrengthExercise implements Exercise {

    private String exerciseName;
    private ArrayList<Set> workSets = new ArrayList<>();
    private ArrayList<Set> warmup = new ArrayList<>();
    private String notes;

    public StrengthExercise(){};
    public StrengthExercise(String name, ArrayList<Set> warmup, ArrayList<Set> workSets){
        setExerciseName(name);
        this.warmup.addAll(warmup);
        this.workSets.addAll(workSets);
    }

    public String showExerciseType(){
        return "strength";
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }


    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    private String sameSets(){
        if(workSets.get(0).equals(workSets.get(1))){
            return String.format("%s x 2" ,workSets.get(0).toString());
        }else {
            return workSets.toString();
        }
    }
    @Override
    public String toString() {
        return String.format("" +
                        "%s\n" +
                        "warmup sets= %s\n" +
                        "work sets= %s\n" +
                        "notes: %s",
                exerciseName, warmup, sameSets(), notes);
    }
}
