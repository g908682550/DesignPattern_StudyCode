package cn.npu.principle;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new RectangleA());
        graphicEditor.drawShape(new CircleA());
    }
}
//方式1. 易于理解，简单易操作，违反ocp原则，即对扩展开放，对修改关闭
class GraphicEditor{
    //接受Shape对象，根据type绘制不同图形
//    public void drawShape(Shape s){
//        if(s.m_type==1) drawRectangle(s);
//        else if(s.m_type==2) drawCircle(s);
//    }
//
//    private void drawCircle(Shape s) {
//        System.out.println("矩形");
//    }
//
//    private void drawRectangle(Shape s) {
//        System.out.println("圆形");
//    }
    public void drawShape(AbstractShape s){s.draw();}
}
class Shape{
    int m_type;
}
class Rectangle extends Shape{
    Rectangle(){super.m_type=1;}
}
class Circle extends Shape{
    Circle(){super.m_type=2;}
}
//方式2 创建一个抽象类，提供一个抽象方法draw
abstract class AbstractShape{
    public abstract void draw();
}
class RectangleA extends AbstractShape{
    public void draw() {
        System.out.println("绘制矩形");
    }
}
class CircleA extends AbstractShape{
    public void draw(){
        System.out.println("绘制圆形");
    }
}