/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {
	public void run() {
		moveToWall();
		turnRight();
		getToDoorway();
		pickUpNewspaper();
		turnAround();
		moveToWall();
		returnToOriginalPosition();
	}
	
	private void moveToWall() {
		if(frontIsClear()){
			move();
		}
	}
	
	private void getToDoorway() {
		if(leftIsClear()) {
			move();
		}
	}
	private void pickUpNewspaper() {
		turnLeft();
		move();
		if(beepersPresent()) {
			pickBeeper();
		}
	}
	private void returnToOriginalPosition() {
		turnRight();
		move();
		turnRight();
	}

}