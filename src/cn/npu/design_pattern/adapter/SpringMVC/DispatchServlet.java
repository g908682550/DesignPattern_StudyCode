package cn.npu.design_pattern.adapter.SpringMVC;

import java.util.ArrayList;
import java.util.List;

public class DispatchServlet {
    public static List<HandlerAdapter> handlerAdapters=new ArrayList<>();
    public DispatchServlet(){
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }
    public void doDispatch(){
        //模拟SpringMVC从request获取handler的对象
        //适配器可以获得希望的handler
        HttpController controller=new HttpController();
        HandlerAdapter handlerAdapter=getHandler(controller);
        handlerAdapter.handle(controller);
    }
    public HandlerAdapter getHandler(Controller controller){
        for(HandlerAdapter handlerAdapter:handlerAdapters){
            if(handlerAdapter.supports(controller)) return handlerAdapter;
        }
        return null;
    }

    public static void main(String[] args) {
        new DispatchServlet().doDispatch();
    }
}
