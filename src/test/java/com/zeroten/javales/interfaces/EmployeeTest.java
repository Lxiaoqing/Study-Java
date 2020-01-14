package com.zeroten.javales.interfaces;

import org.junit.Test;

import java.util.Date;

public class EmployeeTest {

    @Test
    public void testPrint(){
        Employee yg1 = new Employee("员工1", new Date(), 100);
//        yg1.setName("员工1");
//        yg1.setHireDay(new Date());
//        yg1.setSalary(100);
        yg1.printInfo();

        Manager jl1 = new Manager("经理1", new Date(), 120, 30);
//        jl1.setName("经理1");
//        jl1.setHireDay(new Date());
//        jl1.setSalary(120);
//        jl1.setBonus(30);
        jl1.printInfo();
    }

    @Test
    public void testDuoTai(){
        Employee yg1 = new Employee("员工1", new Date(), 100);
        Manager jl1 = new Manager("经理1", new Date(), 120, 30);
        System.out.println("我的奖金是：" + jl1.getBonus());
        MasterManager zjl1 = new MasterManager("总经理1", new Date(), 120, 30);
        System.out.println("我的奖金是：" + zjl1.getBonus());

        Employee yg = yg1;
        yg.printInfo();

        yg = jl1;
        yg.printInfo();

        yg = zjl1;
        yg.printInfo();

        Object object = new Date();
        if(object instanceof Manager){
            Manager m2 = (Manager) object;
        } else{
            System.out.println("object 不是一个 Manager");
        }

    }

    @Test
    public void testObjectMethod() {
        Employee employee = new Employee();
        System.out.println(employee.getClass().getName());
        System.out.println(employee.getClass().getSimpleName());
        System.out.println(employee.hashCode());
        System.out.println(employee.toString());

        int[] arr = new int[0];
        System.out.println(arr.getClass().getName());
        System.out.println(arr.getClass().getSimpleName());
        System.out.println(arr.hashCode());
        System.out.println(arr.toString());

        Employee employee2 = new Manager();
        System.out.println(employee2.getClass().getName());
        System.out.println(employee2.getClass().getSimpleName());
        System.out.println(employee2.hashCode());
        System.out.println(employee2.toString());
    }

}
