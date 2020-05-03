package pu.fmi.design.pattern.command_and_observer.data;

import pu.fmi.design.pattern.command_and_observer.data.exercise.Exercise;

public class Trainer {

    public void executeExercise(Exercise exercise) {
        exercise.execute();
    }
}
