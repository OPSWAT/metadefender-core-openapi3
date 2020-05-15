package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.VersionApiService;
import org.openapitools.api.factories.VersionApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.InlineResponse20011;
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

@Path("/version")


@io.swagger.annotations.Api(description = "the version API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-05-15T23:49:49.064488Z[UTC]")
public class VersionApi  {
   private final VersionApiService delegate;

   public VersionApi(@Context ServletConfig servletContext) {
      VersionApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("VersionApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (VersionApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = VersionApiServiceFactory.getVersionApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Product Version", notes = "Fetch details about the product version.", response = InlineResponse20011.class, tags={ "stats", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Provides productId and version information.", response = InlineResponse20011.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response productVersion(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.productVersion(apikey, securityContext);
    }
}
