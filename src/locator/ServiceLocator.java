package locator;

import services.interfaces.IService;

import java.util.HashMap;
import java.util.Map;

public final class ServiceLocator {
    private static final Map<Class<? extends IService>, IService> serviceMap = new HashMap<>();

    private ServiceLocator() {}

    public static <T extends IService> void registerService(
            Class<T> serviceType,
            T service) {
        serviceMap.put(serviceType, service);
    }

    public static <T extends IService> T getService(Class<T> serviceType) {
        return (T)serviceMap.get(serviceType);
    }
}
