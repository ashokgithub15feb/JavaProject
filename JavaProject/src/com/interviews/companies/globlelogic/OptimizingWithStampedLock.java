package com.interviews.companies.globlelogic;

import java.util.concurrent.locks.StampedLock;

//More sophisticated read-write lock with optimistic reading.



class Point {
    private double x, y;
    private final StampedLock sl = new StampedLock();

    void move(double deltaX, double deltaY) {
        long stamp = sl.writeLock();
        try {
            x += deltaX;
            y += deltaY;
        } finally {
            sl.unlockWrite(stamp);
        }
    }

    double distanceFromOrigin() {
        long stamp = sl.tryOptimisticRead();
        double currentX = x, currentY = y;
        if (!sl.validate(stamp)) {
            stamp = sl.readLock();
            try {
                currentX = x;
                currentY = y;
            } finally {
                sl.unlockRead(stamp);
            }
        }
        return Math.sqrt(currentX * currentX + currentY * currentY);
    }
}
public class OptimizingWithStampedLock {

	public static void main(String[] args) {
		
		Point point = new Point();
		point.move(10, 10);
		System.out.println(point.distanceFromOrigin());
	}
}
