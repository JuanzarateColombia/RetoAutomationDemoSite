package co.com.choucair.AutomationDemoSite.stepdefinitions;

import co.com.choucair.AutomationDemoSite.model.AutomationDemoData;
import co.com.choucair.AutomationDemoSite.questions.Answer;
import co.com.choucair.AutomationDemoSite.taks.OpenUp;
import co.com.choucair.AutomationDemoSite.taks.Record;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class DemoSiteAutomationStepdefinitions {
    @Before
    public void setStage (){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^The user wants to register on the platform$")
    public void theUserWantsToRegisterOnThePlatform() {
            OnStage.theActorCalled("User").wasAbleTo(OpenUp.thePage());
    }


    @When("^register the fields requested by the platform$")
    public void registerTheFieldsRequestedByThePlatform(List<AutomationDemoData> automationDemoData) {
            OnStage.theActorCalled("User").attemptsTo(Record.onThePage(automationDemoData.get(0).getStrFirsName(),
                    automationDemoData.get(0).getStrLastName(), automationDemoData.get(0).getStrAddress(),
                    automationDemoData.get(0).getStrEmailAddress(), automationDemoData.get(0).getSrtPhone(),
                    automationDemoData.get(0).getStrSkills(), automationDemoData.get(0).getStrContry(),
                    automationDemoData.get(0).getSrtYear(), automationDemoData.get(0).getSrtDay(),
                    automationDemoData.get(0).getStrPassword()));
    }

    @Then("^register successfully$")
    public void registerSuccessfully(List<AutomationDemoData> automationDemoData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(automationDemoData.get(0).getStrValidate())));
    }
}
