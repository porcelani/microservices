import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class CustomerIT {

    @Test
    public void should_create_customer() {
        given()
                .header("Content-Type", "application/json;charset=UTF-8")
                .body("{\n" +
                        "  \"firstName\": \"Danilo\",\n" +
                        "  \"lastName\": \"Porcelani\"\n" +
                        "}")
        .expect()
                .statusCode(200)
                .body("firstName", equalTo("Danilo"))
                .body("lastName", equalTo("Porcelani"))
        .when()
                .post("/customers");
    }
}
