package cn.npu.design_pattern.factory.fatorymethod.pizza;

public class ChessPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备奶酪披萨原材料");
    }
}