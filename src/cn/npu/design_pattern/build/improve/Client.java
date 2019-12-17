package cn.npu.design_pattern.build.improve;

public class Client {
    public static void main(String[] args) {
        HouseBuilder houseBuilder=new CommonHouseBuilder();
        HouseDirect houseDirect=new HouseDirect(houseBuilder);
        House house = houseDirect.constructHouse();
        System.out.println(house);
    }
}
