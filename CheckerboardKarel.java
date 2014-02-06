/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run() {
		while(notFacingNorth()) {
			twoStep();
		}
	}
	private void twoStep() {
		putBeeper();
		moveOrChangeDirectionAndMove();
		secondMoveOrChangeDirectionAndMove();
	}
	private void moveOrChangeDirectionAndMove() {
		if (frontIsClear()) {
			move();
		} else {
			faceNorthAndOrMove();
		}
	}
	private void faceNorthAndOrMove() {
		if (facingEast()) {
			turnLeft();
			if (frontIsClear()) {
				move();
			}
		} else {
			turnRight();
			if (frontIsClear()) {
				move();
			}
		}
	}
	private void secondMoveOrChangeDirectionAndMove() {
		while(notFacingNorth()) {
			if (frontIsClear()) {
				move();
			} else {
				faceNorthAndOrMove();
			}
		}
	}
}
