package com.yifan.EnumTest;

public enum OrderState {
    // 先写这个类所有的对象
    // OderState PAYMENT_PENDING = new OderState("待支付");
    PAYMENT_PENDING("待支付"),
    PROCESSING("处理中"),
    SHIPPED("已发货"),
    OUT_FOR_DELIVERY("配送中"),
    DELIVERED("己送达"),
    CANCELLED("已取消");

    private String name;

    private OrderState(String name) {
        System.out.println("看看我执行了吗  " + name);
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
