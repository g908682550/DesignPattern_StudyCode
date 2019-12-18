package cn.npu.design_pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{
    //此处包含Department
    List<OrganizationComponent> lists=new ArrayList<>();
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        lists.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        lists.remove(organizationComponent);
    }

    @Override
    public void print() {
        System.out.println(lists);
    }

    public College(String name, String des) {
        super(name, des);
    }
}
