package cn.npu.principle;

public class LisKov {
    public static void main(String[] args) {
        Son son=new Son();
        System.out.println(son.fun2(2,3));
    }

}
class Parent{
    public int fun1(int a,int b){ return a-b;}
}
class Son extends Parent{
    //重写了父类方法，可能是无意识的
    public int fun1(int a,int b){ return a+b;}
    public int fun2(int a,int b){ return fun1(a,b)+5;}
}

//improve
class Base{
    //把更加基础的方法和成员写到Base类
    public int fun1(int a,int b){return a-b;}
}

