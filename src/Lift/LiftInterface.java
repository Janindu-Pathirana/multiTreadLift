package Lift;

public interface LiftInterface {

    public void goUp(int floor);
    public void goDown(int floor);
    public String getLiftName();
    public int getLiftCurrentFloor();
    public boolean isActive();

}
