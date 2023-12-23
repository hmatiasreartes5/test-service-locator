package config.environment;

public class FactoryEnvironment {

    private static final String LOCAL = "local";
    private static final String PROD = "prod";

    public static Environment getEnvironment(String environment) {
        switch (environment) {
            case LOCAL -> {
                return new LocalEnvironment();
            }
            case PROD -> {
                return new ProdEnvironment();
            }
            default -> {
                return null;
            }
        }
    }
}
