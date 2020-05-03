package pu.fmi.design.pattern.command_and_observer;

import pu.fmi.design.pattern.command_and_observer.data.Trainee;
import pu.fmi.design.pattern.command_and_observer.data.Trainer;
import pu.fmi.design.pattern.command_and_observer.data.Watcher;
import pu.fmi.design.pattern.command_and_observer.data.exercise.GetUpExercise;
import pu.fmi.design.pattern.command_and_observer.data.exercise.LieDownExercise;

import java.util.function.Supplier;

public class Application {

    public static void main(String[] args) throws Exception {
        Trainee trainee = new Trainee();
        Trainer trainer = new Trainer();

        trainee.addWatcher(new Watcher("Ivan"));
        trainee.addWatcher(new Watcher("Gosho"));
        trainee.addWatcher(new Watcher("Pesho"));

        Supplier<GetUpExercise> getUpExerciseSupplier = () -> new GetUpExercise(trainee);
        Supplier<LieDownExercise> lieDownExerciseSupplier = () -> new LieDownExercise(trainee);

        boolean isGetUpCommand = false;
        while (true) {
            if(isGetUpCommand) {
                trainer.executeExercise(getUpExerciseSupplier.get());
            } else {
                trainer.executeExercise(lieDownExerciseSupplier.get());
            }
            isGetUpCommand = !isGetUpCommand;
            Thread.sleep(1000);
        }
    }
}
