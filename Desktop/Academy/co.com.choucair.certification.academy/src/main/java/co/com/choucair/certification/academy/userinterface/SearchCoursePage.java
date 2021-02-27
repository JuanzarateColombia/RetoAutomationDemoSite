package co.com.choucair.certification.academy.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {
 public   static  final Target BUTTON_UC = Target.the("select Choucair University").located(By.xpath("//*[@id=\"certificaciones\"]/div[1]/a"));
 public   static  final Target INPUT_COURSE = Target.the("look for the course").located(By.id("coursesearchbox"));
 public   static  final  Target BUTTON_GO = Target.the("click to find the course").located(By.xpath("//button[@class='btn btn-secondary']"));
 public   static final Target SELECT_COURSE = Target.the("click to find the course").located(By.xpath("//*[contains(text(),'Tutorial')]"));
 public  static  final Target NAME_CURSE = Target.the("Name Curse").located(By.xpath("//*[contains(text(),'Tutorial')]"));
}
