package com.porcelani;

import com.jayway.restassured.RestAssured;
import org.junit.Ignore;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class MiddleIT {

    @Test
    public void should_review_password() {
        RestAssured.port = 8090;

        given()
                .header("Content-Type", "application/json;charset=UTF-8")
                .body("{\"password\": \"simplePassword\"}")
        .expect()
                .statusCode(200)
                .body("score", equalTo("46"))
                .body("complexity", equalTo("Good"))
        .when()
                .post("/");
    }
}
