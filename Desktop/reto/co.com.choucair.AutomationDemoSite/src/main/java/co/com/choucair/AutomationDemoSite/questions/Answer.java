package co.com.choucair.AutomationDemoSite.questions;

import co.com.choucair.AutomationDemoSite.userinterface.AutomationDemorRecordPage;
import net.serenitybdd.screenplay.Actor;
import  net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question <Boolean> {
    private String validation;

    public Answer(String validation) {
        this.validation = validation;
    }

    public static Answer toThe(String validation) {
        return new Answer(validation);
    }
    @Override
    public Boolean answeredBy(Actor actor){
        boolean result;
        String registration = Text.of(AutomationDemorRecordPage.SUCCESSFUL_REGISTRATION).viewedBy(actor).asString();
        if (validation.equals(registration)){
            result = true;
        } else {
            result = false;
        }

        return result;

    }
}
