package com.need.proxy.demo;

/**
 * 实际对象
 */
public class RealSubject implements Subject,SubjectTest
{

    /**
     * 你好
     *
     * @param name
     * @return
     */
    public String SayHello(String name)
    {
        return "hello " + name;
    }

    /**
     * 再见
     *
     * @return
     */
    public String SayGoodBye()
    {
        return " good bye ";
    }

    @Override
    public String aaa(String name) {

        {
            return "aaa";
        }
    }
}
