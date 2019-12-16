package cn.npu.design_pattern.singleton;

public class SingletonPattern {
    public static void main(String[] args) {
        //饿汉式
        Singleton7 singleton1= Singleton7.getInstance();
        Singleton7 singleton2= Singleton7.getInstance();
        System.out.println(singleton1==singleton2);
    }
}

/**
 * 饿汉式（静态常量）
 */
class Singleton1{
    //1.构造器私有化、外部不能new
    private Singleton1(){}
    //2.本类内部创建对象实例
    private final static Singleton1 instance=new Singleton1();
    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton1 getInstance(){
        return instance;
    }
}

/**
 * 饿汉式（静态代码块）
 */
class Singleton2{
    private Singleton2(){}
    private static Singleton2 instance;
    static {
        instance=new Singleton2();
    }
    public static Singleton2 getInstance(){
        return instance;
    }
}

/**
 * 懒汉式（线程不安全）
 */
class Singleton3{
    private static Singleton3 instance;
    private Singleton3(){}
    public static Singleton3 getInstance(){
        if(instance==null) instance=new Singleton3();
        return instance;
    }
}

/**
 * 懒汉式（同步代码块）
 */
class Singleton4{
    private static Singleton4 instance;
    private Singleton4(){}
    public static synchronized Singleton4 getInstance(){
        if(instance==null) instance=new Singleton4();
        return instance;
    }
}

/**
 * 懒汉式（同步代码块）（实际上并不能）
 */
class Singleton5{
    private static Singleton5 instance;
    private Singleton5(){}
    public static Singleton5 getInstance(){
        if(instance==null){
            synchronized (Singleton5.class){
                instance=new Singleton5();
            }
        }
        return instance;
    }
}

/**
 * 双重检查法
 */
class Singleton6{
    private volatile static Singleton6 instance;
    private Singleton6(){}
    public static Singleton6 getInstance(){
        if(instance==null){
            synchronized(Singleton6.class){
                if(instance==null)
                    instance=new Singleton6();
            }
        }
        return instance;
    }
}

/**
 * 静态内部类
 */
class Singleton7{
    private Singleton7(){}
    private static class Singleton7Instance{
        private static final Singleton7 instance=new Singleton7();
    }
    public static Singleton7 getInstance(){
        return Singleton7Instance.instance;
    }
}

/**
 * 枚举类
 */
enum Singleton8{
    INSTANCE;
    public void sayOk(){
        System.out.println("ok");
    }
}