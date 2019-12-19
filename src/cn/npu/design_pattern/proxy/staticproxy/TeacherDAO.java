package cn.npu.design_pattern.proxy.staticproxy;

public class TeacherDAO implements ITeacherDAO{
    @Override
    public void teach() {
        System.out.println("老师上课中...");
    }
}
