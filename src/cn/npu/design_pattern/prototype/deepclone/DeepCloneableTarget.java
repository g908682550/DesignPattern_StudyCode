package cn.npu.design_pattern.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTarget implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
