package services.lock;

import services.interfaces.Lock;

public class LockRemote extends LockBase implements Lock{

    public LockRemote(String client) {super(client);}

    @Override
    public void lock() {
        lockBase();
        System.out.println("LOCK EN PROD");
    }

    @Override
    public void unlock() {
        System.out.println("UNLOCK EN PROD");
    }
}
