package com.java.designPatterns.create.singleton;

/***
 * 饿汉式
 */
public class HungryLazySingleton {

    private HungryLazySingleton() {
    }
    private static HungryLazySingleton hungryLazySingleton = new HungryLazySingleton();

    public static HungryLazySingleton getHungryLazySingleton() {
        return hungryLazySingleton;
    }
}
