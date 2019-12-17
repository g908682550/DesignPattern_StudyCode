package cn.npu.design_pattern.adapter.SpringMVC;

public interface HandlerAdapter {
    public boolean supports(Object handler);

    public void handle(Object object);
}
//多种适配器类
class SimpleHandlerAdapter implements HandlerAdapter{
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    @Override
    public void handle(Object object) {
        ((SimpleController)object).doAnnotationHandler();
    }
}
class HttpHandlerAdapter implements HandlerAdapter{
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handle(Object object) {
        ((HttpController)object).doHttpHandler();
    }
}
