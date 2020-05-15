package org.openapitools.api.factories;

import org.openapitools.api.LogoutApiService;
import org.openapitools.api.impl.LogoutApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-05-15T23:49:49.064488Z[UTC]")
public class LogoutApiServiceFactory {
    private final static LogoutApiService service = new LogoutApiServiceImpl();

    public static LogoutApiService getLogoutApi() {
        return service;
    }
}
