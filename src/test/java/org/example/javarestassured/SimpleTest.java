package org.example.javarestassured;

import io.restassured.response.Response;
import org.example.javarestassured.steps.DiskSteps;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTest {
    //    private final DiskSpec diskSpec = new DiskSpec();
    private final DiskSteps diskSteps = new DiskSteps();

    @Test
    public void getDiskTest() {
        Response response = diskSteps.getDiskInfo();
        Assertions.assertEquals(response.statusCode(), 200);
    }
}
