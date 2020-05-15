package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import org.openapitools.model.InlineResponse2007;
import org.openapitools.model.InlineResponse500;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-05-15T23:49:49.064488Z[UTC]")
public abstract class YaraApiService {
    public abstract Response yaraPackageGenerate(String apikey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response yaraPackageStatus(String apikey,SecurityContext securityContext) throws NotFoundException;
}
