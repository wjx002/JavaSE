package com.jiaxu.base;

/**
 * @Author：吴家旭
 * @date：2021/3/12 - 21:06
 * @version 1.0
 * @since 1.8
 */
public class Doc {
    String name;

    /**
     *
     * @param name
     * @return
     * @throws Exception
     */
    public String test(String name) throws Exception{
        return name;
    }
    //命令行生成doc注释文档  javadoc （参数） java文件
    //去百度一下如何用IDEA生成javadoc文档
    //tool--> generate doc --->选择whole project/当前的东西
}
