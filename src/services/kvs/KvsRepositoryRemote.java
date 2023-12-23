package services.kvs;

import services.interfaces.Repository;

public class KvsRepositoryRemote extends KvsBase implements Repository {

    public KvsRepositoryRemote(String client) {
        super(client);
    }

    @Override
    public void save() {
        saveBase();
        System.out.println("SAVE EN PROD");
    }

    @Override
    public void get() {
        System.out.println("GET EN PROD");
    }
}
