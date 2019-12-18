package cn.npu.design_pattern.composite;

import java.util.ArrayList;
import java.util.List;

//包含一个OrganizationComponent的具体实现类，即college
public class University extends OrganizationComponent {
    public University(String name, String des) {
        super(name, des);
    }

    List<OrganizationComponent> lists=new ArrayList<>();
    @Override
    public void print() {
        System.out.println(lists);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        lists.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        lists.remove(organizationComponent);
    }
}
