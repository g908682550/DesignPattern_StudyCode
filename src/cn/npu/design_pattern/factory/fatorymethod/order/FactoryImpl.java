package cn.npu.design_pattern.factory.fatorymethod.order;

import cn.npu.design_pattern.factory.simplefactory.pizza.GreekPizza;
import cn.npu.design_pattern.factory.simplefactory.pizza.Pizza;

public class FactoryImpl implements FactoryInterface {
    @Override
    public Pizza createPizza(String orderType) {
        if(orderType.equals("greek")) return new GreekPizza();
        else return null;
    }
}
