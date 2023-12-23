import config.Bootstrap;

public class Main {
    public static void main(String[] args) {

        new Bootstrap().init("prod");

        EntityService entityService = new EntityService();
        entityService.createEntity();
        entityService.getEntity();
    }
}