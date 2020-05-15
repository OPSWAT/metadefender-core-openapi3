package org.openapitools.api.factories;

import org.openapitools.api.FileApiService;
import org.openapitools.api.impl.FileApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-05-15T23:49:49.064488Z[UTC]")
public class FileApiServiceFactory {
    private final static FileApiService service = new FileApiServiceImpl();

    public static FileApiService getFileApi() {
        return service;
    }
}
