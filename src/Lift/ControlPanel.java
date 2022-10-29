package Lift;

import java.util.ArrayList;
import java.util.Scanner;

public class ControlPanel extends Thread{

    ArrayList<Lift> lifts ;

    @Override
    public void run(){
        super.run();
        controllers();
    }

    ControlPanel(ArrayList<Lift> lifts){
        this.lifts = lifts;
    }

    private Lift findAvailableLift(){
        for(Lift lift : lifts){
            if(!lift.isActive()) return lift;
        }
        return null;
    }


    public void controllers(){

        System.out.println(lifts.size()+" Lifts available and 6 floors");

        Scanner input = new Scanner(System.in);

        x:
        while (true){
            System.out.println("Enter your current Floor or -1 to exit");
            int currentFloor = input.nextInt();

            if(currentFloor == -1){
                break x;
            }else{

                System.out.println("Enter Floor you need to go");
                int nextFloor = input.nextInt();

                Lift availableLift = findAvailableLift();

                if(availableLift.getLiftCurrentFloor()>currentFloor){
                    availableLift.goDown(currentFloor);
                }else{
                    availableLift.goUp(currentFloor);
                }

                try{

                    System.out.println("Get in");

                    if (currentFloor > nextFloor) {
                        availableLift.goDown(nextFloor);
                    } else if (currentFloor < nextFloor) {
                        availableLift.goUp(nextFloor);
                    }

                }catch (Exception e){
                    System.out.println(e);
                }

            }
        }
    }
}
