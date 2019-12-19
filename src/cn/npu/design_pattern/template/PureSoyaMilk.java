package cn.npu.design_pattern.template;

public class PureSoyaMilk extends SoyaMilk{
    @Override
    void select() {
        System.out.println("select..");
    }

    @Override
    void addConditions() {

    }

    @Override
    void soak() {
        System.out.println("soak...");
    }

    @Override
    void beat() {
        System.out.println("beat");
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
