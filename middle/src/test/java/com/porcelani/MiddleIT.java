package com.porcelani;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.parsing.Parser;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class MiddleIT {

    public static final String SIMPLE_PASSWORD = "simple";

    @Test
    public void should_review_password() {
        RestAssured.baseURI="http://localhost";
        RestAssured.port=8090;

        given()
                .header("Content-Type", "application/json;charset=UTF-8")
                .body(SIMPLE_PASSWORD)
        .expect()
                .statusCode(200)
                .body("passwordCharacters", equalTo(SIMPLE_PASSWORD))
                .body("score", equalTo(8))
                .body("complexity", equalTo("Very Weak"))
        .when()
                .post("/");
    }
}
