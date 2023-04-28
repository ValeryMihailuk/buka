package by.itacademy.valerymichailuk.buka.api;

import by.itacademy.valerymichailuk.buka.pages.Pages;
import org.json.simple.JSONObject;
import by.itacademy.valerymichailuk.buka.user.User;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class TestAPI {

    @Test
    public void testPostAuthorization200() {
        JSONObject request = new JSONObject();
        request.put("login", User.NEW_USER_NAME);
        request.put("pwd", User.NEW_USER_PASSWORD);
        baseURI = Pages.API_URL;
        given().
                body(request.toJSONString()).
                when().
                post("/f/v2/auth/login").
                then().statusCode(200);
    }

    @Test
    public void testPostResetPassword200() {
        JSONObject request = new JSONObject();
        request.put("email", User.USER_NAME);
        baseURI = Pages.API_URL;
        given().
                body(request.toJSONString()).
                when().
                post("/f/v2/auth/pwd-reset").
                then().statusCode(200);
    }

    @Test
    public void testPostAddInvalidLogin422() {
        JSONObject request = new JSONObject();
        request.put("email", "monkeyGOhome@gmail.ru");
        request.put("name", "Fixik");
        request.put("lastName", "Nolik");
        request.put("approvePersDataProcessing", "true");
        request.put("newsmailing", "false");
        baseURI = Pages.API_URL;
        given().
                body(request.toJSONString()).
                when().
                post("/f/v2/auth/register").
                then().statusCode(422);
    }

    @Test
    public void testPostNotApprovePersonalData422() {
        JSONObject request = new JSONObject();
        request.put("email", "monkeyGOhome@gmail.ru");
        request.put("name", "Fixik");
        request.put("lastName", "Nolik");
        request.put("approvePersDataProcessing", "false");
        request.put("newsmailing", "false");
        baseURI = Pages.API_URL;
        given().
                body(request.toJSONString()).
                when().
                post("/f/v2/auth/register").
                then().statusCode(422);
    }

    @Test
    public void testPostInvalidAuthorization422() {
        JSONObject request = new JSONObject();
        request.put("login", User.USER_NAME);
        request.put("pwd", "");
        request.put("", "");
        baseURI = Pages.API_URL;
        given().
                body(request.toJSONString()).
                when().
                post("/f/v2/auth/login").
                then().statusCode(422);
    }

    @Test
    public void testGetCapcha404() {
        JSONObject request = new JSONObject();
        request.put("ok", "true");
        request.put("id", "1445676438753838");
        request.put("ttl", "120000");
        baseURI = Pages.API_URL;
        given().
                body(request.toJSONString()).
                when().
                get("/f/v2/captcha/get").
                then().statusCode(502);
    }

    @Test
    public void testGetBonus404() {
        JSONObject request = new JSONObject();
        request.put("key", "fox");
        baseURI = Pages.API_URL;
        given().
                body(request.toJSONString()).
                when().
                get("/profile/activbonus").
                then().statusCode(404);
    }
    @Test
    public void testGetOutLogin302() {
        JSONObject request = new JSONObject();
        baseURI = Pages.API_URL;
        given().
                body(request.toJSONString()).
                when().
                get("/logout").
                then().statusCode(302);
    }
}