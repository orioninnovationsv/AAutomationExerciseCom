import java.nio.charset.Charset;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class AutomationExerciseAccountInfo {

   /* public String setGeneratedString(){

        byte[] array = new byte[6];
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        return generatedString;
    } */

    public static String NewEmailAddress2 = "ruyatest"+ ThreadLocalRandom.current().nextInt(0, 99999999+ 1)+"@adfkldknmd1fdl.com";



    public static String RegisteredEmail = "test@asd.com";
    public static String RegisteredPassword = "2312sfdfd";
    public static String NewName = "Baris12";
    public static String NewEmailAddress = NewEmailAddress2;
    public static String NewPassword ="B1234f*";
    public static String NewFirstName ="Baris12";
    public static String NewLastName ="Test1";
    public static String NewAddress1 ="Pendik, Istanbul";
    public static String NewCountry ="Canada";
    public static String NewState ="Europe";
    public static String NewCity ="Istanbul";
    public static String NewZipCode = "34000";
    public static String NewMobileNumber ="901234567890";
    public static String LoginEmailAddress = "kandysv1@gmail.com";
    public static String LoginPassword ="Kandy-1234";
    public static String LoginIncorrectEmailAddress = "wrongusername@gmail.com";
    public static String LoginIncorrectPassword = "WrongPassword";
}
