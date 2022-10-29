package Lift;

public class Lift implements LiftInterface {

    private int currentFloor = 0;
    private String liftName = "";
    private boolean active = false;

    Lift(String name){
        this.liftName = name;
    }

    public void sleep(){
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void goUp(int floor) {

        active = true;

        System.out.println(liftName + " in " + currentFloor);

        for(int i = currentFloor; i<floor; i++) {
            currentFloor++;
            System.out.println(liftName + " - " + currentFloor);
            sleep();
        }

        active = false;
    }

    @Override
    public void goDown(int floor) {

        active = true;

        for(int i = currentFloor; i>=floor; i--) {
            System.out.println(liftName + " - " + currentFloor);
            currentFloor--;
            sleep();
        }

        active = false;
    }

    @Override
    public String getLiftName(){
        return liftName;
    }

    @Override
    public int getLiftCurrentFloor() {
        return currentFloor;
    }

    @Override
    public boolean isActive(){
        return active;
    }

}
