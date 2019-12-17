package cn.npu.design_pattern.adapter;

public class VoltageAdapter2 implements IVoltage5V {

    Voltage220V voltage220V;

    public VoltageAdapter2(Voltage220V voltage220V){
        this.voltage220V=voltage220V;
    }

    @Override
    public int output5V() {
        int src=voltage220V.output220V();
        int dst=src/44;
        return dst;
    }
}
