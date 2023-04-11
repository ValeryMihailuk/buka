package by.itacademy.valerymichailuk.buka.api;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import by.itacademy.valerymichailuk.buka.user.User;

import static io.restassured.RestAssured.*;

public class TestAPI {
    @Test
    @DisplayName("Post422BadLoginPwd")
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
    @DisplayName("Post403BadPwd")
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
    @DisplayName("Post200Authorization")
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
