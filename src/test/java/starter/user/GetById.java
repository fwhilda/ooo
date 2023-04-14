package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetById {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set GET endpoint")
    public String setApiEndpoint(){

        return url + "posts/1";
    }

    @Step("I send GET HTTP request Based On ID")
    public void sendGetHttpRequestId(){
        SerenityRest.given().when().get(setApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200 OK")
    public void validateHttpResponseCode200(){

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid post data based on ID")
    public void validateDataByID(){
        restAssuredThat(response -> response.body("'id'", equalTo(1)));
        restAssuredThat(response -> response.body("'title'", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")));
    }
}
