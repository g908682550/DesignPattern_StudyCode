package cn.npu.design_pattern.factory.fatorymethod.order;

import cn.npu.design_pattern.factory.simplefactory.order.OrderPizza;

//相当于客户端，发出订购,调用函数
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza();
    }
}
