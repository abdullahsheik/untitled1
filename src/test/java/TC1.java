import javafx.scene.layout.Priority;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {
    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("This will execute before every method");
    }
    @AfterMethod
    void afterMethod()
    {
        System.out.println("This will execute after every method");
    }
    @Test(priority=0)
    void test1() {
        System.out.println("This is testl ...");
    }
    @Test(priority=1, enabled = false)
    void test2()
    {
        System.out.println("This is test2 ...");
    }
    @Test
    void test3()
    {
        System.out.println("This is test3 ...");
    }
    @Test
    void test4()
    {
        System.out.println("This is test4 ...");
    }

}
