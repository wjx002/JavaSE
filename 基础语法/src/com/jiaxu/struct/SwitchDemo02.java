package com.jiaxu.struct;

import javax.lang.model.element.Name;
import javax.lang.model.element.VariableElement;

/**
 * @Author：吴家旭
 * @date：2021/3/13 - 21:14
 */
public class SwitchDemo02 {
    public static void main(String[] args) {
        String name = "狂生";
        //字符的本质还是数字
        //反编译 java -- class
        switch(name){
            case "狂生":
                System.out.println("nihao");
            default:
                break;
        }
    }

}
