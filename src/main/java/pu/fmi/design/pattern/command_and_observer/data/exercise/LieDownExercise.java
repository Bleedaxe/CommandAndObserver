package pu.fmi.design.pattern.command_and_observer.data.exercise;

import pu.fmi.design.pattern.command_and_observer.data.Trainee;

public class LieDownExercise implements Exercise {

    private final Trainee trainee;

    public LieDownExercise(Trainee trainee) {
        this.trainee = trainee;
    }

    @Override
    public void execute() {
        trainee.lieDown();
    }
}
