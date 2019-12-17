package cn.npu.design_pattern.brige;

public class Apple implements Brand {
    @Override
    public void open() {
        System.out.println("apple手机开机");
    }

    @Override
    public void close() {
        System.out.println("apple手机关机");
    }

    @Override
    public void call() {
        System.out.println("apple手机打电话");
    }
}
