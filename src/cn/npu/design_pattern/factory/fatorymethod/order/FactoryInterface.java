package cn.npu.design_pattern.factory.fatorymethod.order;

import cn.npu.design_pattern.factory.simplefactory.pizza.Pizza;

public interface FactoryInterface {
    Pizza createPizza(String orderType);
}
