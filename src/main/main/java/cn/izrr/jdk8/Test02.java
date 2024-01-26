package cn.izrr.jdk8;

import cn.izrr.jdk8.service.OrderService;

public class Test02 {
    public static void main(String[] args) {
        /* 1.使用匿名内部类创建OrderService 并调用get*/
//        OrderService orderService = new OrderService () {
//            @Override
//            public void get() {
//                System.out.println("get");
//            }
//        };
//        orderService.get();
        /* 2.使用lambda表达式*/
//        OrderService orderService = () -> System.out.println("get");
//        orderService.get();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "线程执行了");
            System.out.println("执行完毕!");
        }).start();

    }
}
