package cn.npu.design_pattern.template;

public class Client {
    public static void main(String[] args) {
        SoyaMilk milk = new RedBeanSoyaMilk();
        //调用抽象类中的方法
        milk.make();
        SoyaMilk milk1=new PureSoyaMilk();
        milk1.make();
    }

}
