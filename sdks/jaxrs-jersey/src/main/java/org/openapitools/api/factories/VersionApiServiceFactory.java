package org.openapitools.api.factories;

import org.openapitools.api.VersionApiService;
import org.openapitools.api.impl.VersionApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-05-15T23:49:49.064488Z[UTC]")
public class VersionApiServiceFactory {
    private final static VersionApiService service = new VersionApiServiceImpl();

    public static VersionApiService getVersionApi() {
        return service;
    }
}
