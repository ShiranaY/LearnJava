package cn.izrr.jdk8.service;

public interface JDK8InterFace {
    void add();

    /**
     * jdk8 提供的默认方法
     */
    default void defaultGet() {
        System.out.println("defaultGet");
    }

    static void staticDel() {
        System.out.println("staticDel");
    }
}
