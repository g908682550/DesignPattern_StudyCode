package cn.npu.design_pattern.build.improve;

public class HouseDirect {

    private HouseBuilder houseBuilder;

    public HouseDirect(HouseBuilder houseBuilder){
        this.houseBuilder=houseBuilder;
    }

    //建房子的过程交给指挥者,最终返回产品
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }

}
