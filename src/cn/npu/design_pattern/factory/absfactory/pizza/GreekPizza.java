package cn.npu.design_pattern.factory.absfactory.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备希腊披萨材料");
    }
}
