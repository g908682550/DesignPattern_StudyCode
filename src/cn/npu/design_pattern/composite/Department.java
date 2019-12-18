package cn.npu.design_pattern.composite;

public class Department extends OrganizationComponent {
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public void print() {
        System.out.println("学院");
    }
}
