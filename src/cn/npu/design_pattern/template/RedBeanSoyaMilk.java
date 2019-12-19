package cn.npu.design_pattern.template;

public class RedBeanSoyaMilk extends SoyaMilk {
    @Override
    void select() {
        System.out.println("RedBeanMilk select");
    }

    @Override
    void addConditions() {
        System.out.println("RedBeanMilk addConditions");
    }

    @Override
    void soak() {
        System.out.println("RedBeanMilk soak");
    }

    @Override
    void beat() {
        System.out.println("RedBeanMilk beat");
    }
}
