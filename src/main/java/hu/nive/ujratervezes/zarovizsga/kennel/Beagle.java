package hu.nive.ujratervezes.zarovizsga.kennel;

public class Beagle extends Dog{

    public Beagle(String name) {
        super(name);
    }

    @Override
    public void feed() {
        incrementHappiness(2);
    }

    @Override
    public void play(int hours) {
        incrementHappiness(hours * 2);
    }
}