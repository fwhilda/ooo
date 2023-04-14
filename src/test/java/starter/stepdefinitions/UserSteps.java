package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.*;

public class UserSteps {
    @Steps
    Get get;

    @Steps
    GetById getById;

    @Steps
    Post post;

    @Steps
    PutById putByid;

    @Steps
    DeleteById deleteById;

    @Given("I set GET api endpoint")
    public void setGetApiEndpoints(){
        get.setApiEndpoints();
    }

    @When("I send GET HTTP request from User")
    public void sendGETHttpRequestUser(){
        get.sendHttpRequestFromUser();
    }

    @Then("I receive valid HTTP response code GET 200")
    public void validateHttpResponseCodeGET200(){

        get.validateResponseCode200();
    }

    @And("I receive valid all post data")
    public void receiveValidAllPostData(){

        get.validateAllPostData();
    }
    @Given("I set POST api endpoints")
    public void setPostApiEndpoints(){
        post.setPostApiEndpoint();

    }
    @When("I send POST HTTP request")
    public void sendPostHTTPRequest(){
        post.sendPostHttpRequest();

    }

    @Then("I receive valid HTTP response code 201")
    public void receiveValidHttp201(){
        post.receiveHttpResponseCode201();

    }

    @And("I receive valid data for new post")
    public void validateDataForNewPost(){
        post.validateDatanewPost();

    }
    @Given("I set GET endpoint")
    public void setGetApiEndpoint(){

        getById.setApiEndpoint();
    }

    @When("I send GET HTTP request Based On ID")
    public void sendGetHttpRequestBasedOnID(){
        getById.sendGetHttpRequestId();
    }

    @Then("I receive valid HTTP response code 200 OK")
    public void receiveValidHttpResponseCode200OK(){

        getById.validateHttpResponseCode200();
    }

    @And("I receive valid post data based on ID")
    public void receiveValidDataBasedOnId(){

        getById.validateDataByID();
    }

    @Given("I set PUT endpoints")
    public void setPutEndpoint(){
        putByid.setPutEndpoint();

    }

    @When("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        putByid.sendPutHttpRequest();

    }
    @Then("I receive valid HTTP response code PUT 200")
    public void validateHttpResponseCodePUT200() {

        putByid.receiveHTTPResponseCodePUT200();
    }

    @And("I receive valid data that has been updated")
    public void validDataThatHasBeenUpdated(){
        putByid.ValidateDataHasBeenUpdated();

    }

    @Given("I set DELETE endpoints")
    public void setDeleteEndpoint(){
        deleteById.setDeleteEndpoint();


    }
    @When("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){
        deleteById.sendDeleteHttpRequest();

    }

    @Then("I receive valid HTTP response code DELETE 200")
    public void validateHttpResponseCodeDELETE200(){
        deleteById.validHttpresponseCode200();

    }
}
