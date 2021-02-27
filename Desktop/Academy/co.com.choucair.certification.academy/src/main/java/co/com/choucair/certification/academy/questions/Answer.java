package co.com.choucair.certification.academy.questions;

import co.com.choucair.certification.academy.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question <Boolean> {
    private String strCourse;
    public Answer(String strCourse) {
        this.strCourse = strCourse;
    }

    public static Answer toThe(String strCourse) {
        return new Answer(strCourse);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String namecurse = Text.of(SearchCoursePage.NAME_CURSE).viewedBy(actor).asString();
        if (strCourse.equals(namecurse)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

public void Answer (){
    System.out.println ("strCourse");

}

}