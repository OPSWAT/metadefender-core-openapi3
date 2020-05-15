package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.YaraApiService;
import org.openapitools.api.factories.YaraApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.InlineResponse2007;
import org.openapitools.model.InlineResponse500;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/yara")


@io.swagger.annotations.Api(description = "the yara API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-05-15T23:49:49.064488Z[UTC]")
public class YaraApi  {
   private final YaraApiService delegate;

   public YaraApi(@Context ServletConfig servletContext) {
      YaraApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("YaraApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (YaraApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = YaraApiServiceFactory.getYaraApi();
      }

      this.delegate = delegate;
   }

    @PUT
    @Path("/generate")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Generate Yara package", notes = "Generate a new package based on the new added sources.", response = InlineResponse2007.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "yara", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request processed successfully.", response = InlineResponse2007.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response yaraPackageGenerate(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.yaraPackageGenerate(apikey, securityContext);
    }
    @GET
    @Path("/package")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Yara Generation Status", notes = "Get status of Yara package generation.", response = InlineResponse2007.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "yara", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request processed successfully.", response = InlineResponse2007.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response yaraPackageStatus(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.yaraPackageStatus(apikey, securityContext);
    }
}
