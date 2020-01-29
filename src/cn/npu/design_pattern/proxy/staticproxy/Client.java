package cn.npu.design_pattern.proxy.staticproxy;


public class Client {
    public static void main(String[] args) {
        ITeacherDAO proxy = new TeacherDAOProxy(new TeacherDAO());
        proxy.teach();
    }
}
