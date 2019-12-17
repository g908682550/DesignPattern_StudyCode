package cn.npu.design_pattern.build.improve;

//抽象的建造者，不同的产品有不同的建造者
public abstract class HouseBuilder {

    protected House house=new House();
    //将建造的流程写好
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    //建造房子，将产品返回
    public House buildHouse(){
        return house;
    }
}
