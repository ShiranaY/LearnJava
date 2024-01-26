package cn.izrr.jdk8;

import cn.izrr.jdk8.service.JDK8InterFace;
import cn.izrr.jdk8.service.JDK8InterFaceImpl;

public class Test01 {
    public static void main(String[] args) {
        JDK8InterFaceImpl interFace = new JDK8InterFaceImpl();
        interFace.defaultGet();
        interFace.add();
        JDK8InterFace.staticDel();

    }
}
