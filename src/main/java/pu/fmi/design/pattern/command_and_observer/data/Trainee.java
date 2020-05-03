package pu.fmi.design.pattern.command_and_observer.data;

import java.util.Observable;

public class Trainee extends Observable {

    private String currentExercise;

    public void addWatcher(Watcher watcher) {
        addObserver(watcher);
    }

    public void getUp() {
        setCurrentExercise("Get Up");
    }

    public void lieDown() {
        setCurrentExercise("Lie Down");
    }

    private void setCurrentExercise(String currentExercise) {
        this.currentExercise = currentExercise;
        System.out.printf("Trainee executed %s exercise%n", currentExercise);
        setChanged();
        notifyObservers(currentExercise);
    }

    public String getCurrentExercise() {
        return currentExercise;
    }
}
