package cn.npu.design_pattern.factory.absfactory.order;

import cn.npu.design_pattern.factory.simplefactory.pizza.Pizza;

//抽象工厂模式的接口，对某一类工厂进行抽象，使实现其方法的子类工厂自身具有高关联性。
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
