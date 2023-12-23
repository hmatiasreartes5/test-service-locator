package services.kvs;

import services.interfaces.Repository;

public class KvsRepositoryLocal implements Repository {
    @Override
    public void save() {
        System.out.println("SAVE EN LOCAL");
    }

    @Override
    public void get() {
        System.out.println("GET EN LOCAL");
    }
}
