package services.lock;

import services.interfaces.Lock;

public class LockLocal implements Lock {
    @Override
    public void lock() {
        System.out.println("LOCK EN LOCAL");
    }

    @Override
    public void unlock() {
        System.out.println("UNLOCK EN LOCAL");
    }
}
