import services.interfaces.Lock;
import services.interfaces.Repository;

import static locator.ServiceLocator.getService;

public class EntityService {

    private final Repository repository = getService(Repository.class);
    private final Lock lock = getService(Lock.class);

    public void createEntity() {
        lock.lock();
        repository.save();
        lock.unlock();
    }

    public void getEntity() {
        repository.get();
    }
}
