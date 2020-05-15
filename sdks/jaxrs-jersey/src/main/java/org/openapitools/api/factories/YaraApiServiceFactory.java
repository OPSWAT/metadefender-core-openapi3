package org.openapitools.api.factories;

import org.openapitools.api.YaraApiService;
import org.openapitools.api.impl.YaraApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-05-15T23:49:49.064488Z[UTC]")
public class YaraApiServiceFactory {
    private final static YaraApiService service = new YaraApiServiceImpl();

    public static YaraApiService getYaraApi() {
        return service;
    }
}
