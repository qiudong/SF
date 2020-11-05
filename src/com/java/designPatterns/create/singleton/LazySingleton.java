package com.java.designPatterns.create.singleton;

/***
 * 懒汉式
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getLazySingleton() {
        if (null == lazySingleton) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
