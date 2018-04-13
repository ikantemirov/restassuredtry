package io.ikantemirov;

import static io.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Test;

public class GithubTest {

    @Test
    public void
    shouldRepoNameBeCalculator() {

        when().
                get("https://api.github.com/users/ikantemirov/repos").
        then().
                statusCode(200).
                body("name[3]", equalTo("retrofitest"));

    }
}
