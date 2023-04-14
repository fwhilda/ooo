package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Get {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set GET api endpoint")
    public String setApiEndpoints(){

        return url + "posts";
    }
    @Step("I send GET HTTP request from User")
    public void sendHttpRequestFromUser(){
        SerenityRest.given().when().get(setApiEndpoints());
    }
    @Step("I receive valid HTTP response code GET 200")
    public void validateResponseCode200(){

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid all post data")
    public void validateAllPostData(){
        restAssuredThat(response -> response.body("'id'",  equalTo(1)));
        restAssuredThat(response -> response.body("'title'", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")));
    }

}
