package cn.npu.design_pattern.prototype;

public class Client {
    public static void main(String[] args){
        //传统方法
        Sheep sheep = new Sheep("tom", 1, "white");
        new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        //改进方法,若对Sheepc增加新的属性，只需改动原型，具有很好的拓展性
        Sheepc sheepc=new Sheepc("tom",1,"white");
        Sheepc sheepc1= (Sheepc)sheepc.clone();
        Sheepc sheepc2= (Sheepc)sheepc.clone();
        Sheepc sheepc3= (Sheepc)sheepc.clone();
    }
}
