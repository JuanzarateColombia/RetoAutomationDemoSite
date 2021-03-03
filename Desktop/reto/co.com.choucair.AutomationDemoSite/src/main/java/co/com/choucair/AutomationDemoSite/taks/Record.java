package co.com.choucair.AutomationDemoSite.taks;

import co.com.choucair.AutomationDemoSite.userinterface.AutomationDemorRecordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.UploadToField;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Record implements Task {
    private String strFirsName;

    public Record(String strFirsName, String strLastName, String strAddress, String strEmailAddress, String srtPhone, String strSkills, String strContry, String srtYear, String srtDay, String strPassword) {
        this.strFirsName = strFirsName;
        this.strLastName = strLastName;
        this.strAddress = strAddress;
        this.strEmailAddress = strEmailAddress;
        this.srtPhone = srtPhone;
        this.strSkills = strSkills;
        this.strContry = strContry;
        this.srtYear = srtYear;
        this.srtDay = srtDay;
        this.strPassword = strPassword;
    }

    private String strLastName;
    private String strAddress;
    private String strEmailAddress;
    private String srtPhone;
    private String strSkills;
    private String strContry;
    private String srtYear;
    private String srtDay;
    private String strPassword;



    public static Record onThePage(String strFirsName, String strLastName, String strAddress, String strEmailAddress, String intPhone, String strSkills, String strContry, String intYear, String intDay, String strPassword){
        return Tasks.instrumented(Record.class, strFirsName, strLastName, strAddress, strEmailAddress, intPhone, strSkills, strContry, intYear, intDay, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strFirsName).into(AutomationDemorRecordPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(AutomationDemorRecordPage.INPUT_lAST_NAME),
                Enter.theValue(strAddress).into(AutomationDemorRecordPage.ADDRESS),
                Enter.theValue(strEmailAddress).into(AutomationDemorRecordPage.INPUT_EMAIL_ADDRESS),
                Enter.theValue(srtPhone).into(AutomationDemorRecordPage.INPUT_PHONE),
                Click.on(AutomationDemorRecordPage.INPUT_GENDER),
                Click.on(AutomationDemorRecordPage.INPUT_HOBBIES),
                Click.on(AutomationDemorRecordPage.LANGUAGES),
                Click.on(AutomationDemorRecordPage.LANGUAGES_SELECT),
                SelectFromOptions.byVisibleText(strSkills).from(AutomationDemorRecordPage.SELECT_SKILLS),
                SelectFromOptions.byVisibleText(strContry).from(AutomationDemorRecordPage.SELECT_CONTRY),
                Click.on(AutomationDemorRecordPage.SELECT_SELECT_CONTRY),
                Click.on(AutomationDemorRecordPage.OPTION_SELECT_CONTRY),
                SelectFromOptions.byVisibleText(srtYear).from(AutomationDemorRecordPage.SELECT_DATE_YEAR),
                Click.on(AutomationDemorRecordPage.SELECT_FIRST_MONTH),
                Click.on(AutomationDemorRecordPage.OPTION_FIRST_MONTH),
                SelectFromOptions.byVisibleText(srtDay).from(AutomationDemorRecordPage.SELECT_FIRST_DAY),
                Enter.theValue(strPassword).into(AutomationDemorRecordPage.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(AutomationDemorRecordPage.INPUT_CONFIRM_PASSWORD),
                //Click.on(AutomationDemorRecordPage.PHOTO),
                //Enter.theValue("C:/Users/JuanKzarate/Pictures/Saved Pictures/MetodosPago.jpg").into(AutomationDemorRecordPage.PHOTO),
                Click.on(AutomationDemorRecordPage.BUTTON_SUBMIT));







    }
}
