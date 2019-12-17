package cn.npu.design_pattern.adapter;

//类适配器
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int src=output220V();
        int dst=src/44;
        return dst;
    }
}
