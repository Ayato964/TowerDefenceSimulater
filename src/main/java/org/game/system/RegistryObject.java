package org.game.system;

import java.util.function.Supplier;

public class RegistryObject<T> {
    private Supplier<T> object;

    private RegistryObject(){}

    public static <T> RegistryObject<T> create(Supplier<T> o){
        RegistryObject<T> r = new RegistryObject<>();
        r.object = o;
        return r;
    }
    public T get(){
        return object.get();
    }
    public Supplier<T> getSupObject(){
        return object;
    }

}
