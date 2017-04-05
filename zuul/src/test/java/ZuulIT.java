import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class ZuulIT {

    public static final String SIMPLE_PASSWORD = "simple";

    @Test
    public void should_create_customer() {
        given()
                .header("Content-Type", "application/json;charset=UTF-8")
                .body(SIMPLE_PASSWORD)
        .expect()
                .statusCode(200)
                .body("passwordCharacters", equalTo(SIMPLE_PASSWORD))
                .body("score", equalTo(8))
                .body("complexity", equalTo("Very Weak"))
        .when()
                .post("/passwords");
    }
}
