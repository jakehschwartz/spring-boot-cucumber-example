package demo;

import cucumber.api.java.en.When;

/**
 * Created with IntelliJ IDEA.
 * User: jacobs
 * Date: 6/11/15
 * Time: 1:04 PM
 */
public class OtherDefs extends AbstractDefs
{
    @When("^the client calls /poop$")
    public void the_client_issues_GET_version() throws Throwable
    {
        executeGet("http://localhost:8080/poop");
    }
}
