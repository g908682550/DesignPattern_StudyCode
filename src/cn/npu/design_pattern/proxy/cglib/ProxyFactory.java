package cn.npu.design_pattern.proxy.cglib;

import java.lang.reflect.Method;

/**
 * 没有jar包，写代码理下思路
 */
public class ProxyFactory implements MethodInterceptor {

    //被代理对象
    private Object object;

    public ProxyFactory(Object object){
        this.object=object;
    }

    //返回一个代理对象
    public Object getProxyInstance(){
        //1、创建工具类
        Enhancer enhancer=new Enhancer();
        //2、设置父类
        enhancer.setSuperClass(object.getClass());
        //3、设置回调函数
        enhancer.setCallBack(this);
        //4、创建子类对象，即代理对象
        return enhancer.create();
    }

    //重写intercept方法，会调用目标对象的方法
    public Object intercept(Object arg0, Method method,Object[] args,MethodProxy args){
        Object returnVal=method.invoke(object,args);
        return returnVal;
    }
}
