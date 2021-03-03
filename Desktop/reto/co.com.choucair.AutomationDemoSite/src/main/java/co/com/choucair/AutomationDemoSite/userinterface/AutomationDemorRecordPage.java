package co.com.choucair.AutomationDemoSite.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationDemorRecordPage {
    public  static final Target INPUT_FIRST_NAME = Target.the("where do we write the First name").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
    public  static final Target INPUT_lAST_NAME = Target.the("where do we write the last name").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
    public  static final Target ADDRESS = Target.the("where do we write the address").located(By.xpath("//textarea"));
    public  static final Target INPUT_EMAIL_ADDRESS = Target.the("where we write the email address").located(By.xpath("//*[@id=\"eid\"]/input"));
    public  static final Target INPUT_PHONE = Target.the("where do we write the phone").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
    public  static final Target INPUT_GENDER = Target.the("where we select the genre").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
    public  static final Target INPUT_HOBBIES = Target.the("where we select the hobbies").located(By.id("checkbox2"));
    public  static final Target LANGUAGES = Target.the("").located(By.id("msdd"));
    public  static final Target LANGUAGES_SELECT = Target.the("").located(By.xpath("//li/a[contains(text(),'Spanish')]"));
    public  static final Target SELECT_SKILLS = Target.the("where we select the skills").located(By.id("Skills"));
    public  static final Target SELECT_CONTRY = Target.the("where we select the country").located(By.id("countries"));
    public  static final Target SELECT_SELECT_CONTRY = Target.the("where we select the city").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
    public  static final Target OPTION_SELECT_CONTRY = Target.the("where we select the city").located(By.xpath("//li[contains(text(),'United States of America')]"));
    public  static final Target SELECT_DATE_YEAR = Target.the("where we select the date of birth (year)").located(By.id("yearbox"));
    public  static final Target SELECT_FIRST_MONTH = Target.the("where we select the date of birth (month)").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
    public  static final Target OPTION_FIRST_MONTH = Target.the("where we select the date of birth (month)").located(By.xpath("//select/option[contains(text(),'October')]"));
    public  static final Target SELECT_FIRST_DAY = Target.the("where we select the date of birth (day)").located(By.id("daybox"));
    public  static final Target INPUT_PASSWORD = Target.the("where we assign the password").located(By.id("firstpassword"));
    public  static final Target INPUT_CONFIRM_PASSWORD = Target.the("where we confirm the password").located(By.id("secondpassword"));
   //public  static final Target PHOTO = Target.the("where we upload a photo").located(By.id("imagesrc"));
    public  static final Target BUTTON_SUBMIT = Target.the("where we send the record").located(By.id("submitbtn"));
    public  static final Target SUCCESSFUL_REGISTRATION = Target.the("Registration name extraction").located(By.xpath("//h1[contains(text(),'Automation Demo Site ')]"));
}
