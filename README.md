# JUnitTest
This is JunitTestLearning

# Contents
@Test 测试方法
  @Test(expected=xx.class)
  @Test(timeout=?)   // 毫秒为单位
@BeforeClass 在所有的测试方法运行之前运行 static 方法
@AfterClass 在所有的方法运行之后运行 static 方法
@Before 在每个测试方法运行之前运行
@After 在每个测试方法运行之后运行
@Ignore("xxx") 忽略所修饰的测试方法 xxx为测试原因
@RunWith 更改测试运行器 
  运行器需要继承org.junit.runner.Runner类
断言：assert*Equals()
