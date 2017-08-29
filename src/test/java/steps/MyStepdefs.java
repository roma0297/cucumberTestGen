package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import entitites.User;

import java.util.ArrayList;
import java.util.List;

public class MyStepdefs {

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {

    }

    @And("^I enter the following for login$")
    public void iEnterTheFollowingForLogin(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        List <User> usersList = new ArrayList<User>();

        usersList = dataTable.asList(User.class);

        for (User currentUser: usersList) {
            System.out.println(currentUser.userName + " " + currentUser.password);
        }

        //throw new Exception();
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUserNameAndPassword(String userName, String password) throws Throwable {
        System.out.println(userName + " " + password);
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
    }
}
