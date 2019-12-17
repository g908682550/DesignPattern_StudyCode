package cn.npu.design_pattern.build.improve;

public class CommonHouseBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("打地基5m");
    }

    @Override
    public void buildWalls() {
        System.out.println("砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子屋顶");
    }
}
