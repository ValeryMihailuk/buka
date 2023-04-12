package by.itacademy.valerymichailuk.buka.api;

import org.json.simple.JSONObject;
import by.itacademy.valerymichailuk.buka.user.User;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class TestAPI {
    @Test
    public void testPost422() {
        JSONObject request = new JSONObject();
        request.put("login", "err");
        request.put("pwd", "err2");
        baseURI = "https://shop.buka.ru/api";
        given().
                body(request.toJSONString()).
                when().
                post("/f/v2/auth/login").
                then().statusCode(422)
                .log().all();
    }

    @Test
    public void testPost403() {
        JSONObject request = new JSONObject();
        request.put("login", User.USER_NAME);
        request.put("pwd", "err");
        baseURI = "https://shop.buka.ru/api";
        given().
                body(request.toJSONString()).
                when().
                post("/f/v2/auth/login").
                then().statusCode(403)
                .log().all();
    }

    @Test
    public void testPost200() {
        JSONObject request = new JSONObject();
        request.put("login", User.USER_NAME);
        request.put("pwd", User.USER_PASSWORD);
        baseURI = "https://shop.buka.ru/api";
        given().
                body(request.toJSONString()).
                when().
                post("/f/v2/auth/login").
                then().statusCode(200)
                .log().all();
    }
}
