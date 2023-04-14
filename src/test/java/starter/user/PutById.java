package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PutById {
    protected String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set PUT endpoints")
    public String setPutEndpoint(){
        return url + "posts/1";
    }

    @Step("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", "1");
        requestBody.put("title", "Updated Title");
        requestBody.put("Body", "Updated Body");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpoint());
    }
    @Step("I receive valid HTTP response code PUT 200")
    public void receiveHTTPResponseCodePUT200(){

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data that has been updated")
    public void ValidateDataHasBeenUpdated(){
        restAssuredThat(response -> response.body("'id'", Matchers.equalTo(1)));
        restAssuredThat(response -> response.body("'title'", Matchers.equalTo("Updated Title")));
        restAssuredThat(response -> response.body("'Body'", Matchers.equalTo("Updated Body")));

    }

}
