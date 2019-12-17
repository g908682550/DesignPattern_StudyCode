package cn.npu.design_pattern.build.improve;

public class HighHouseBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼屋顶");
    }
}
