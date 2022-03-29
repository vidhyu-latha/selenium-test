import org.testng.annotations.*;

public class RunParticularTestCase {
    @BeforeClass
    public void beforeClass1(){
        System.out.println("beforeClass1");
    }
    @BeforeMethod
    public void beforeMethod1(){
        System.out.println("beforeMethod1");
    }
    @Test
    public void testMethod1()throws Exception {
        System.out.println("testMethod1");
    }
    @Test
    public void testMethod2()throws Exception {
        System.out.println("testMethod2");
    }
    @Test(enabled = false)
    public void testMethod3()throws Exception {
        System.out.println("testMethod3");
    }
    @Test
    public void testMethod4()throws Exception {
        System.out.println("testMethod4");
    }

    @AfterClass
    public void afterClass1(){
        System.out.println("afterClass1");
    }
    @AfterMethod
    public void afterMethod1(){
        System.out.println("afterMethod1");
    }
}
