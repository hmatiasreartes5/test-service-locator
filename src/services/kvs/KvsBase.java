package services.kvs;

public abstract class KvsBase {
    private String clientKvs;

    public KvsBase(String client) {
        this.clientKvs = client;
    }

    public void saveBase() {
        System.out.printf("Client kvs %s%n", clientKvs);
    }
}
