package cn.npu.design_pattern.template;

//抽象类
public abstract class SoyaMilk {
    //模板方法，不让子类覆盖，子类统一调用该方法
    final void make(){
        select();
        if(customerWantCondiments()) addConditions();
        soak();
        beat();
    }

    //子类实现这些方法
    abstract void select();
    abstract void addConditions();
    abstract void soak();
    abstract void beat();

    //钩子方法
    boolean customerWantCondiments(){
        return true;
    }
}
