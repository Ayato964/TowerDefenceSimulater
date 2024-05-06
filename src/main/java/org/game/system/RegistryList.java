package org.game.system;

import java.util.HashMap;
import java.util.function.Supplier;

public class RegistryList<T> {
    private final String ID;
    private  final HashMap<String, RegistryObject<T>> MAP;

    private RegistryList(String id){
        MAP = new HashMap<>();
        ID = id;
    }
    public static <T> RegistryList<T> create(String id){
        return new RegistryList<>(id);
    }
    public <B extends T> RegistryObject<B> create(Supplier<B> o, String id){
        RegistryObject<B> r = RegistryObject.create(o);
        MAP.put(id, (RegistryObject<T>) r);
        return r;
    }
    public RegistryObject<T> get(String id){
        return MAP.get(id);
    }

}
