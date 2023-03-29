package by.itacademy.valerymichailuk.buka;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class TestAPI {
    @Test
    @DisplayName("Post422NoLogin")
    public void testPost() {
        Map<String, Object> = new HashMap<String, Object>();
Map put
    }

    @Test
    @DisplayName("Get200Login")
    public void testGet() {
        given().
                get("/api/f/v2/auth/login").
                then().
                statusCode(200).
                body().
    }
}
