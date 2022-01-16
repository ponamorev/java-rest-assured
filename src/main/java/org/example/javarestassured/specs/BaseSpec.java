package org.example.javarestassured.specs;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.example.javarestassured.utils.PropertiesHandler;

import java.net.URI;

public abstract class BaseSpec {

    protected RequestSpecification baseSpec = new RequestSpecBuilder()
            .setBaseUri(URI.create("https://cloud-api.yandex.net"))
            .setBasePath("/v1")
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.JSON)
            .addHeader("Authorization", String.format("OAuth %s", getAccessToken()))
            .build();

    public abstract RequestSpecification getSpec();

    private String getAccessToken() {
        return PropertiesHandler.getProperties().getProperty("api.access.token");
    }
}
