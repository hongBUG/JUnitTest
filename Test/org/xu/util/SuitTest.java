package org.xu.util;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@Suite.SuiteClasses({TaskTest1.class, TaskTest2.class})
public class SuitTest {
    /*
     * 1. 测试套件是组织测试类一起运行
     * 
     * 写一个类作为测试套件的入口类， 类为空类
     * 更改运行测试器为Suite.class
     * 然后将要进行的测试的类，以数组形式传入Suite.SuiteClasses({classname1.class, classname2.class, etc})
     */

}
