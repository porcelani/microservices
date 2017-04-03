package com.porcelani;

import com.jayway.restassured.RestAssured;
import com.porcelani.models.Customer;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class CustomerIT {

    @Test
    public void should_create_customer() {
        RestAssured.port = 8090;

        given()
                .header("Content-Type", "application/json;charset=UTF-8")
                .body(new Customer("Danilo", "Porcelani"))
        .expect()
                .statusCode(200)
                .body("firstName", equalTo("Danilo"))
                .body("lastName", equalTo("Porcelani"))
        .when()
                .post("/");
    }
}
