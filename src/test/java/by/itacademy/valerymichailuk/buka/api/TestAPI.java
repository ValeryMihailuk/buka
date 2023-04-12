package by.itacademy.valerymichailuk.buka.api;

import org.json.simple.JSONObject;
import by.itacademy.valerymichailuk.buka.user.User;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class TestAPI {

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
    @Test
    public void testPostNewProfile200() {
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
    public void testPost502() {
        JSONObject request = new JSONObject();
        request.put("email", "doggi2000@mail.ru");
        request.put("name", "Rat");
        request.put("lastName", "Junior");
        request.put("", "");
        baseURI = "https://shop.buka.ru/api";
        given().
                body(request.toJSONString()).
                when().
                post("/f/v2/auth/register").
                then().statusCode(502)
                .log().all();
    }
    @Test
    public void testPost50() {
        JSONObject request = new JSONObject();
        request.put("email", "doggi2000@mail.ru");
        request.put("name", "Rat");
        request.put("approvePersDataProcessing" , "");
        baseURI = "https://shop.buka.ru/api";
        given().
                body(request.toJSONString()).
                when().
                post("/f/v2/auth/register").
                then().statusCode(502)
                .log().all();
    }

    @Test
    public void testPost422() {
        JSONObject request = new JSONObject();
        request.put("login", User.USER_NAME);
        request.put("pwd", "");
        request.put("", "");
        baseURI = "https://shop.buka.ru/api";
        given().
                body(request.toJSONString()).
                when().
                post("/f/v2/auth/login").
                then().statusCode(422)
                .log().all();
    }

}
