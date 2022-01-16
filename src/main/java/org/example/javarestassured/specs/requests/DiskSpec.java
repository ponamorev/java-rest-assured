package org.example.javarestassured.specs.requests;

import io.restassured.specification.RequestSpecification;
import org.example.javarestassured.specs.BaseSpec;

public class DiskSpec extends BaseSpec {

    public RequestSpecification getSpec() {
        String basePath = "/v1/disk";
        return baseSpec.basePath(basePath);
    }
}
