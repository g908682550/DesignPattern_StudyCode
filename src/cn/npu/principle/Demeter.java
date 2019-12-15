package cn.npu.principle;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

public class Demeter {
    public static void main(String[] args) {
        SchoolManager schoolManager=new SchoolManager();
        CollegeManager collegeManager=new CollegeManager();
        schoolManager.printAllEmployee(collegeManager);
    }
}
//Employee及CollegeManager为直接朋友，而CollegeEmployee不是，违背了迪米特法则
//解决方法，将输出学院员工的方法放到CollegeEmployee中
class SchoolManager{
    public List<Employee> getAllEmployee(){
        return new ArrayList<Employee>();
    }
    public void printAllEmployee(CollegeManager sub){
//        List<CollegeEmployee> list=sub.getAllEmployee();
//        System.out.println(list);
        sub.printAllEmployee();
        System.out.println(getAllEmployee());
    }
}
class Employee{
    String name;
}
class CollegeEmployee{
    String name;
}
class CollegeManager{
    List<CollegeEmployee> getAllEmployee(){
        return new ArrayList<CollegeEmployee>();
    };
    //解决方案
    public void printAllEmployee(){
        System.out.println(getAllEmployee());
    }
}

