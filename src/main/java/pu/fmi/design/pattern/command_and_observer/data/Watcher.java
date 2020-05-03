package pu.fmi.design.pattern.command_and_observer.data;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {

    private final String name;

    public Watcher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(arg != null) {
            System.out.printf("Watcher %s executed %s%n", name, arg.toString());
        }
    }
}
