package core.basesyntax;
public class Bulldozer extends Machine{
    @Override
    public void doWork() {
        System.out.println(getTypeMachine() + " started its work !");
    }
    @Override
    public void stopWork() {
        System.out.println(getTypeMachine() + " stopped its work.");
    }
}
