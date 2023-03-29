package by.itacademy.valerymichailuk.buka;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class TestAPI {
    @Test
    @DisplayName("Post422BadLoginPwd")
    public void testPost() {
        Map<String, Object> map = new HashMap<String, Object>();
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
    @DisplayName("Get200Login")
    public void testGet() {
        Map<String, Object> map = new HashMap<String, Object>();
        JSONObject request = new JSONObject();
        request.put("login", User.LOGIN_TEXT);
        request.put("pwd", User.PASSWORD_TEXT);
        baseURI = "https://shop.buka.ru/api";
        given().
                body(request.toJSONString()).
                when().
                post("/f/v2/auth/login").
                then().statusCode(200)
                .log().all();
    }
}
