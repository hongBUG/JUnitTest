package org.xu.util;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;


/*
 * @Test 将一个普通的方法修饰成为一个测试方法
 *   @Test(timeout=?)
 *   @Test(expected=xxx.class)
 * @BeforeClass 所有方法运行之前 static
 * @AfterClass 所有方法运行之后 static
 * @Before 每个方法前
 * @After 每个方法后都会被执行一次
 * @Ignore 忽略所修饰的测试方法
 * @RunWith 更改测试运行器 运行器需继承org.junit.runner.Runner
 * 断言：assert*Equals()
 */
public class AnotationTest {

	@Test(expected=ArithmeticException.class)
	public void testDivide() {
		assertEquals(1, new Calculate().divide(1, 0));
	}
	
	@Ignore("no reasib")
	@Test(timeout=2000) 
	public void testTimeout() {
		while(true) {
			System.out.println("hello world!");
		}
	}
	
	@Test(timeout=3000)
	public void testReadFIle() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
