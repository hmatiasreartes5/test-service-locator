package config.environment;

import services.interfaces.Lock;
import services.interfaces.Repository;
import services.kvs.KvsRepositoryLocal;
import services.lock.LockLocal;

import static locator.ServiceLocator.registerService;

public class LocalEnvironment implements Environment {

    public void init() {
        RepositoryService();
        LockService();
    }

    @Override
    public void RepositoryService() {
        registerService(Repository.class, new KvsRepositoryLocal());
    }

    @Override
    public void LockService() {
        registerService(Lock.class, new LockLocal());
    }
}
