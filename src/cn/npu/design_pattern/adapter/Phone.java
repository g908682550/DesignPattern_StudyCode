package cn.npu.design_pattern.adapter;

public class Phone {
    //充电
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V()==5){
            System.out.println("充电");
        }
    }
}
