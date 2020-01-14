package com.zeroten.javales.interfaces;

import java.util.Date;

public class MasterManager extends Manager {

    @Override
    public  String getName(){
        return "【" + super.getName() + "】";
    }

    public MasterManager(String name, Date hireDay, Integer salary, Integer bonus)
    {
        super(name, hireDay,salary,bonus);
        System.out.println("执行 MasterManager 的有参数构造方法");
    }

}
