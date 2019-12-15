package cn.npu.principle;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person=new Person();
        person.receive(new Email0());
        person.receive(new WeChat0());
    }
}

//完成Person接受消息的功能
//方式1 分析
// 1.简单，容易想到 2.如果获取的对象是微信，短信，则新增类，同时Persons也要增加相应方法
//解决思路：引入一个抽象的接口IReceiver，表示接受者，这样Person类与接口发生依赖，而不依赖具体的类，使得消息方只需实现IReceiver接口
class Email{ public String getInfo(){ return "电子邮件信息：~~~"; }}
class Person{
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}
interface IReceiver{ String getInfo();}
class Email0 implements IReceiver{
    @Override
    public String getInfo() {
        return "电子邮件信息";
    }
}
class WeChat0 implements IReceiver{
    @Override
    public String getInfo() {
        return "WeChat消息";
    }
}
