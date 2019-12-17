package cn.npu.design_pattern.adapter.SpringMVC;

public interface Controller {
}

class HttpController implements Controller{
    public void doHttpHandler(){
        System.out.println("http..");
    }
}

class SimpleController implements Controller{
    public void doAnnotationHandler(){
        System.out.println("annotation...");
    }
}
