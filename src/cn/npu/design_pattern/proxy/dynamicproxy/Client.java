package cn.npu.design_pattern.proxy.dynamicproxy;


public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setObject(new TeacherDAO());
        ITeacherDAO proxy = (ITeacherDAO)proxyFactory.createProxy();
        proxy.teach();
    }
}
