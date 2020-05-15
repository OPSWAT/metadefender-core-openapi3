package org.openapitools.api.factories;

import org.openapitools.api.StatApiService;
import org.openapitools.api.impl.StatApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-05-15T23:49:49.064488Z[UTC]")
public class StatApiServiceFactory {
    private final static StatApiService service = new StatApiServiceImpl();

    public static StatApiService getStatApi() {
        return service;
    }
}
