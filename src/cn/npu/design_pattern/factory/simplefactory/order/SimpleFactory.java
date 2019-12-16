package cn.npu.design_pattern.factory.simplefactory.order;

import cn.npu.design_pattern.factory.simplefactory.pizza.ChessPizza;
import cn.npu.design_pattern.factory.simplefactory.pizza.GreekPizza;
import cn.npu.design_pattern.factory.simplefactory.pizza.Pizza;

public class SimpleFactory {

    public Pizza createPizza(String orderType){
        Pizza pizza=null;
        System.out.println("简单工厂模式");
        if(orderType.equals("greek")){
            pizza=new GreekPizza();
            pizza.setName(orderType);
        }else if(orderType.equals("chess")){
            pizza=new ChessPizza();
            pizza.setName(orderType);
        }
        return pizza;
    }
    //静态方法
    public static Pizza createPizza0(String orderType){
        Pizza pizza=null;
        System.out.println("简单工厂模式");
        if(orderType.equals("greek")){
            pizza=new GreekPizza();
            pizza.setName(orderType);
        }else if(orderType.equals("chess")){
            pizza=new ChessPizza();
            pizza.setName(orderType);
        }
        return pizza;
    }

}
