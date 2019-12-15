package cn.npu.principle;

public class SingleResponsibility {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托");
        vehicle.run("飞机");
        vehicle.run("轮船");

        RoadVehicle roadVehicle=new RoadVehicle();
        AirVehicle airVehicle=new AirVehicle();
        WaterVehicle waterVehicle=new WaterVehicle();
        roadVehicle.run("摩托");
        airVehicle.run("飞机");
        waterVehicle.run("轮船");

        Vehicle2 vehicle2=new Vehicle2();
        vehicle2.run("摩托");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }
}

//交通工具类
//方式1 1.在方式1的run方法中，违反了单一职责原则
//      2.根据交通工具运行的方式不同，分解不同类
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行");
    }
}

//方式1 分解成3个类进行，改动较大
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路运行");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在天上运行");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在水中运行");
    }
}

//方式3 1.没有对原来的类做大修改，只是增加方法
//      2.虽然没在类这个级别遵守单一职责，但是在方法级别上遵守了单一职责
class Vehicle2{
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行");
    }

    public void runAir(String vehicle){
        System.out.println(vehicle + "在天空上运行");
    }

    public void runWater(String vehicle){
        System.out.println(vehicle + "在水中运行");
    }
}

