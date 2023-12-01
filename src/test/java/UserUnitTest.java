import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.user.UserRegTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static org.junit.jupiter.api.Assertions.*;

public class UserUnitTest {

    @BeforeAll
    public static void beforeall(){
        System.out.println("Started Testing");
    }

    @AfterAll
    public static void AfterAll(){
        System.out.println("Ended Testing");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Testcase start");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("Testcase end");   
    }

    //tests for First name
    @ParameterizedTest
    @ValueSource(strings = {"Ritika","Ri","ritika","RitikA","12Yri","Hyuna"})
    public void fName(String data){
        UserRegTest testData=new UserRegTest();
        assertTrue(testData.validateFirstName(data));
    }

    //test for last name
    @ParameterizedTest
    @ValueSource(strings = {"Saha","Sah","saha","Sa","1Saha","SahA"})
    public void lName(String data){
        UserRegTest testData=new UserRegTest();
        assertTrue(testData.validateLastName(data));
    }

    //test for email
    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com",
    "abc-100@yahoo.com",
    "abc.100@yahoo.com",
    "abc111@abc.com",
    "abc-100@abc.net",
    "abc.100@abc.com.au",
    "abc@1.com",
    "abc+100@gmail.com",
    "abc",
    "abc@.com.my",
    "abc123@gmail.a",
    "abc123@.com",
    "abc123@.com.com",
    ".abc@abc.com",
    "abc()*@gmail.com",
    "abc@%*.com",
    "abc..2002@gmail.com",
    "abc.@gmail.com",
    "abc@abc@gmail.com",
    "abc@gmail.com.1a",
    "abc@gmail.com.aa.au"})
    public void email(String data){
         UserRegTest testData=new UserRegTest();
        assertTrue(testData.validateEmail(data));
    }

    //validate phone number
    @ParameterizedTest
    @ValueSource(strings = {"91 4848484848","914040404040","4949494949","91 696969","91 0919191919","uu 3838383838","91 939393939r"})
    public void phoneNumber(String data){
        UserRegTest testData=new UserRegTest();
        assertTrue(testData.validatePhone(data));
    }

    //validate password
    @ParameterizedTest
    @ValueSource(strings = {"Passw0rd!", "SecurePwd123$", "StrongPwd&", "WeakPwd", "Mbbbbbbbbbbo1%"})
    public void password(String data){
        UserRegTest testData=new UserRegTest();
        assertTrue(testData.validatePassword(data));
    }
}
