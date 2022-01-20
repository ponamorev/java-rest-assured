package org.example.javarestassured.steps;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.example.javarestassured.specs.requests.DiskSpec;

public class DiskSteps {
    private final DiskSpec diskSpec = new DiskSpec();

    // TODO: here can be a @Step annotation for allure e.g.
    public Response getDiskInfo() {
        return RestAssured.given(diskSpec.getSpec()).get("/");
    }
}
