package cn.npu.principle;

public class DependencyPass {
    public static void main(String[] args) {
        InterfaceBImplAll interfaceB=new InterfaceBImplAll();
//方式1 可以调用任意实现接口B的类
        InterfaceAImpl interfaceAImpl=new InterfaceAImpl();
        interfaceAImpl.methodA(interfaceB);

//方式2 传递一个实现接口B的任意类
//        InterfaceAImpl interfaceAImpl=new InterfaceAImpl(interfaceB);
//        interfaceAImpl.methodA();

//方式3 设置一个任意实现接口B的类
//        InterfaceAIml interfaceAIml=new InterfaceAIml();
//        interfaceAIml.setter(interfaceB);
//        interfaceAImpl.methodA();
    }
}
//所有实现接口B的子类
class InterfaceBImplAll implements InterfaceB{
    @Override
    public void methodB() {
        System.out.println("B实现了");
    }
}
//方式一：通过接口传递实现依赖
interface InterfaceA{void methodA(InterfaceB interfaceB);}
interface InterfaceB{void methodB();}

class InterfaceAImpl implements InterfaceA{
    public void methodA(InterfaceB interfaceB) {
        interfaceB.methodB();
    }
}
//方式二：通过构造方法传递
//interface InterfaceA{void methodA();}
//interface InterfaceB{void methodB();}
//class InterfaceAImpl implements InterfaceA{
//    public InterfaceB interfaceB;
//    public InterfaceAImpl(InterfaceB interfaceB){ this.interfaceB=interfaceB;}
//    public void methodA() {
//         this.interfaceB.methodB();
//    }
//}
//方式三：通过setter方式传递
//interface InterfaceA{
//    void setter(InterfaceB interfaceB);
//    void methodA();
//}
//interface InterfaceB{void methodB();}
//class InterfaceAIml implements InterfaceA{
//    private InterfaceB interfaceB;
//
//    public void setter(InterfaceB interfaceB) {
//        this.interfaceB=interfaceB;
//    }
//
//    public void methodA() {
//        this.interfaceB.methodB();
//    }
//}