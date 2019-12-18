package cn.npu.design_pattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *用来生成代理对象，需要的参数：目标对象，增强(增强方法也可以采用接口，即可更改）
 * @param
 */
public class ProxyFactory {

    //目标对象
    private Object targetObject;

    public ProxyFactory() {
    }

    public void setObject(Object object) {
        this.targetObject = object;
    }

    public Object createProxy(){
        ClassLoader classLoader=targetObject.getClass().getClassLoader();
        Class[] interfaces=targetObject.getClass().getInterfaces();
        InvocationHandler invocationHandler=new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                /**
                 * 调用代理对象方法时会执行这里
                 */
                System.out.println("前置增强");
                Object result= method.invoke(targetObject, args);
                System.out.println("后置增强");
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);
    }
 }

