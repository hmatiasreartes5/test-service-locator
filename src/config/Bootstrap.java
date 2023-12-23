package config;

import config.environment.Environment;
import config.environment.FactoryEnvironment;

public class Bootstrap {

    public void init(String environment) {
        Environment env = FactoryEnvironment.getEnvironment(environment);
        assert env != null;
        env.init();
    }
}
