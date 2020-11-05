package com.java.designPatterns.create.singleton;

/***
 * 双向检查
 */
public class DoubleCheckSingleton {

    private DoubleCheckSingleton() {
    }

    private static volatile DoubleCheckSingleton doubleCheckSingleton;

    public static DoubleCheckSingleton getDoubleCheckSingleton() {
        if (null == doubleCheckSingleton) {
            synchronized(doubleCheckSingleton) {
                if (null == doubleCheckSingleton) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
