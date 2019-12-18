package cn.npu.design_pattern.composite;

//所有子类的父类，子类进行组合
public abstract class OrganizationComponent {
    private String name;
    private String des;
    protected void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    public abstract void print();
    public OrganizationComponent(String name,String des){
        this.name=name;
        this.des=des;
    }

    @Override
    public String toString() {
        return "OrganizationComponent{" +
                "name='" + name + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}
