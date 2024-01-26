package cn.izrr.jdk8.service;

public class JDK8InterFaceImpl implements JDK8InterFace {
    /**
     * 定义之类实现接口
     */
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void defaultGet() {
        JDK8InterFace.super.defaultGet();
    }
}

