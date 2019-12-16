package cn.npu.design_pattern.factory.simplefactory.order;

import cn.npu.design_pattern.factory.simplefactory.pizza.ChessPizza;
import cn.npu.design_pattern.factory.simplefactory.pizza.GreekPizza;
import cn.npu.design_pattern.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {

//    构造器 传统方法依赖了具体的Pizza类
//    public OrderPizza(){
//        Pizza pizza=null;
//        String orderType="";
//        do{
//            orderType=getType();
//            do{
//                orderType=getType();
//                if(orderType.equals("greek")){
//                    pizza=new GreekPizza();
//                    pizza.setName(orderType);
//                }else if(orderType.equals("chess")){
//                    pizza=new ChessPizza();
//                    pizza.setName(orderType);
//                }else break;
//                makePiece(pizza);
//            }while (true);
//        }while (true);
//    }

    //不依赖具体的Pizza类，而是依赖工厂来进行创建。
//    Pizza pizza=null;
//    SimpleFactory simpleFactory;
//    public OrderPizza(SimpleFactory simpleFactory){
//        setSimpleFactory(simpleFactory);
//    }
//    public void setSimpleFactory(SimpleFactory simpleFactory){
//        String orderType="";
//        this.simpleFactory=simpleFactory;
//        do{
//            orderType=getType();
//            Pizza pizza = this.simpleFactory.createPizza(orderType);
//            makePiece(pizza);
//        }while(true);
//    }

    //可以使用静态工厂
    public OrderPizza(){
        Pizza pizza=null;
        String orderType="";
        do{
            orderType=getType();
            do{
                orderType=getType();
                if(orderType.equals("greek")){
                    pizza=SimpleFactory.createPizza0(orderType);
                    pizza.setName(orderType);
                }else if(orderType.equals("chess")){
                    pizza=SimpleFactory.createPizza0(orderType);
                    pizza.setName(orderType);
                }else break;
                makePiece(pizza);
            }while (true);
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
    public void makePiece(Pizza pizza){
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
