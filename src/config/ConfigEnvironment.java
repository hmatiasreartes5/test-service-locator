package config;

import config.environment.LocalEnvironment;
import config.environment.ProdEnvironment;

public class ConfigEnvironment {

    public ConfigEnvironment(String environment) {
        switch (environment) {
            case "local" -> new LocalEnvironment().init();
            case "prod" -> new ProdEnvironment().init();
        }
    }
}
