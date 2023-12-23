package services.lock;

public abstract class LockBase {
    private String lockClient;

    public LockBase(String client) {
        this.lockClient = client;
    }

    public void lockBase() {
        System.out.printf("Client lock %s%n", lockClient);
    }
}
