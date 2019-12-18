package cn.npu.design_pattern.proxy.staticproxy;

public class TeacherDAOProxy implements ITeacherDAO{
    private ITeacherDAO target;
    public TeacherDAOProxy(ITeacherDAO target){
        this.target=target;
    }

    @Override
    public void teach() {
        System.out.println("静态代理");
        this.target.teach();
    }
}
