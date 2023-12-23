package config.environment;

import services.interfaces.Lock;
import services.interfaces.Repository;
import services.kvs.KvsRepositoryRemote;
import services.lock.LockRemote;

import static locator.ServiceLocator.registerService;

public class ProdEnvironment implements Environment{

    public void init() {
        RepositoryService();
        LockService();
    }

    @Override
    public void RepositoryService() {
        //La idea es en este punto definir la configracion del cliente
        registerService(Repository.class, new KvsRepositoryRemote("KVS_1"));
    }

    @Override
    public void LockService() {
        registerService(Lock.class, new LockRemote("LOCK_PROD_1"));
    }
}
