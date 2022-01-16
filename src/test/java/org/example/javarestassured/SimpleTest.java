package org.example.javarestassured;

import io.restassured.RestAssured;
import org.example.javarestassured.specs.requests.DiskSpec;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTest {
    private final DiskSpec diskSpec = new DiskSpec();

    @Test
    public void getDiskTest() {
        int statusCode = RestAssured.given(diskSpec.getSpec())
                .get("/")
                .statusCode();
        Assertions.assertEquals(statusCode, 200);
    }
}
