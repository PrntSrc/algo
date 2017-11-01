package Singleton;

/**
 * 恶汉式
 */
class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton() {}
    public static HungrySingleton getInstance() {
        return instance;
    }
}

/**
 * 懒汉式
 */
class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton() {}
    public static LazySingleton getInstance() {
        if (instance == null)
            instance = new LazySingleton();
        return instance;
    }
}


class Resource {

}

enum EnumSingleton {
    INSTANCE;
    private Resource instance;

    EnumSingleton() {
        instance = new Resource();
    }

    public Resource getInstance() {
        return instance;
    }
}

public class Singleton {
    Resource instance = EnumSingleton.INSTANCE.getInstance();
}
