package cn.npu.design_pattern.brige;

public class Client {
    public static void main(String[] args) {
        Phone phone1 = new FoldPhone(new Apple());
        phone1.call();
        Phone phone2=new FoldPhone(new XiaoMi());
        phone2.open();
    }
}
