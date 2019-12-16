package cn.npu.design_pattern.factory.fatorymethod.order;

import cn.npu.design_pattern.factory.absfactory.order.AbsFactory;
import cn.npu.design_pattern.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {

    FactoryInterface factoryInterface;
    //不依赖具体的工厂，而依赖该工厂的接口，任意实现该接口的工厂都可以
    public OrderPizza(FactoryInterface factoryInterface){
        this.factoryInterface=factoryInterface;
        Pizza pizza=null;
        String orderType="";
        do{
            orderType=getType();
            pizza=factoryInterface.createPizza(orderType);
            pizza.setName(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    private String getType(){
        try{
            BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str=strin.readLine();
            return str;
        }catch (Exception e){
            e.printStackTrace();
            return "";
        }
    }
}
