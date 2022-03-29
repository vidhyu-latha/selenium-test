import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import schemasMicrosoftComVml.STTrueFalse;

public class SoftAndHardAsserts {

    @Test
    public void hardAssert1()throws Exception {
        System.out.println("HardAssert1-Started");
        Assert.assertTrue(false);
        System.out.println("HardAssert1-Executed");
    }

    @Test
    public void hardAssert2()throws Exception {
        System.out.println("HardAssert2-Started");
        Assert.assertTrue(true);
        System.out.println("HardAssert2-Executed");
    }
    @Test
    public void softAssert1()throws Exception {
        SoftAssert sa=new SoftAssert();
        System.out.println("SoftAssert1-Started");
        sa.assertTrue(false);
        System.out.println("SoftAssert1-Executed");
    }

    @Test
    public void softAssertAll1()throws Exception {
        SoftAssert sa=new SoftAssert();
        System.out.println("softAssertAll1-Started");
        sa.assertTrue(false);
        System.out.println("softAssertAll1-Executed");
        sa.assertAll();
    }

    @Test
    public void softAssert2()throws Exception {
        SoftAssert sa=new SoftAssert();
        System.out.println("SoftAssert2-Started");
        sa.assertTrue(true);
        System.out.println("SoftAssert2-Executed");
    }
}
