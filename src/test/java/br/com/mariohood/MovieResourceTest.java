package br.com.mariohood;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

import org.junit.jupiter.api.*;


import io.quarkus.test.junit.QuarkusTest;
import jakarta.ws.rs.core.Response;

@QuarkusTest
@Tag("integration")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MovieResourceTest {

 
    @Test
    @Order(1)
    void getAll() {
        given()
            .when()
            .get("/movies")
            .then()
            .body("size()", equalTo(2))
            .body("id", hasItems(1, 2))
            .body("title", hasItems("FirstMovie", "SecondMovie"))
            .body("description", hasItems("MyFirstMovie", "MySecondMovie"))
            .body("director", hasItems("Me"))
            .body("country", hasItems("Planet"))
            .statusCode(Response.Status.OK.getStatusCode());
    }

    @Test
    @Order(1)
    void getByCountry() {

    }

    @Test
    @Order(1)
    void getById() {

    }

    @Test
    @Order(1)
    void testGetByTitle() {

    }

    @Test
    @Order(2)
    void testCreate() {

    }

    @Test
    @Order(3)
    void testUpdateById() {

    }

    @Test
    @Order(4)
    void testDeleteById() {

    }
    
}
