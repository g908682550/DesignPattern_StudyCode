package cn.npu.principle;

public class Segregation {
    public static void main(String[] args) {
        A a=new A();
        A1 a1=new A1();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());
        a1.depend1(new B1());
        a1.depend2(new B1());
        a1.depend3(new B1());
    }

}
//接口
interface Interface0{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}
//A依赖B，只使用到接口1,2,3的方法，而B需实现全部接口。
class A{
    public void depend1(Interface0 i){
        i.operation1();
    }
    public void depend2(Interface0 i){
        i.operation2();
    }
    public void depend3(Interface0 i) { i.operation3(); }
}
//C依赖D，只使用到接口1,4,5的方法，而D需要实现全部接口。
class C{
    public void depend1(Interface0 i){
        i.operation1();
    }
    public void depend4(Interface0 i){
        i.operation4();
    }
    public void depend5(Interface0 i){
        i.operation5();
    }
}
class B implements Interface0{
    @Override
    public void operation1() { System.out.println("B实现了operation1"); }
    @Override
    public void operation2() { System.out.println("B实现了operation2"); }
    @Override
    public void operation3() { System.out.println("B实现了operation3"); }
    @Override
    public void operation4() { System.out.println("B实现了operation4"); }
    @Override
    public void operation5() { System.out.println("B实现了operation5"); }
}
class D implements Interface0 {
    @Override
    public void operation1() { System.out.println("D实现了operation1"); }
    @Override
    public void operation2() { System.out.println("D实现了operation2"); }
    @Override
    public void operation3() { System.out.println("D实现了operation3"); }
    @Override
    public void operation4() { System.out.println("D实现了operation4"); }
    @Override
    public void operation5() { System.out.println("D实现了operation5"); }
}
//将Interface1接口进行分解。
interface Interface1{
    void operation1();
}
interface Interface2{
    void operation2();
    void operation3();
}
interface Interface3{
    void operation4();
    void operation5();
}
//A1依赖B1，B1只需实现相应方法接口
class A1{
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface2 i){
        i.operation2();
    }
    public void depend3(Interface2 i) { i.operation3(); }
}
//C1依赖D1，D1只需实现相应方法接口
class C1{
    public void depend1(Interface0 i){
        i.operation1();
    }
    public void depend4(Interface3 i){
        i.operation4();
    }
    public void depend5(Interface3 i){
        i.operation5();
    }
}
class B1 implements Interface1,Interface2{
    @Override
    public void operation1() { System.out.println("B1实现operation1");}
    @Override
    public void operation2() { System.out.println("B1实现operation2");}
    @Override
    public void operation3() { System.out.println("B1实现operation3");}
}
class D1 implements Interface1,Interface3{
    @Override
    public void operation1() { System.out.println("D1实现operation1");}
    @Override
    public void operation4() { System.out.println("D1实现operation4");}
    @Override
    public void operation5() { System.out.println("D1实现operation5");}
}