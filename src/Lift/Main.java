package Lift;

import java.util.ArrayList;

public class Main {

	static ArrayList<Lift> lifts = new ArrayList<Lift>();

    public static void main(String[] args) {

		for (int i = 0; i< 2; i++){
			Lift newLift = new Lift(i+"Lift");
			lifts.add(newLift);
		}

    	ControlPanel controlPanel1 = new ControlPanel(lifts);
    	controlPanel1.start();
    	controlPanel1.controllers();

		ControlPanel controlPanel2 = new ControlPanel(lifts);
		controlPanel2.start();
		controlPanel2.controllers();

    }
}
