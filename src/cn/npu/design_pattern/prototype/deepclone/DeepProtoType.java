package cn.npu.design_pattern.prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable {
    public String name;
    //引用类型
    public DeepCloneableTarget deepCloneableTarget;
    public DeepProtoType(){
        super();
    }

    //深拷贝-方式一 使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
//        Object deep=null;
//        //完成对基本数据类型（属性）和String的克隆
//        deep=super.clone();
        //对引用类型的属性进行单独处理
        DeepProtoType deepProtoType=(DeepProtoType)super.clone();
        deepProtoType.deepCloneableTarget=(DeepCloneableTarget)deepCloneableTarget.clone();
        return deepProtoType;
    }

    //深拷贝-方式二 通过对象的序列化实现
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream bos=null;
        ObjectOutputStream oos=null;
        ByteArrayInputStream bis=null;
        ObjectInputStream ois=null;
        try{
            //序列化
            bos=new ByteArrayOutputStream();
            oos=new ObjectOutputStream(bos);
            //当前这个对象以对象流的方式输出
            oos.writeObject(this);

            //反序列化
            bis=new ByteArrayInputStream(bos.toByteArray());
            ois=new ObjectInputStream(bis);
            DeepProtoType deepProtoType=(DeepProtoType) ois.readObject();
            return deepProtoType;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try{
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
