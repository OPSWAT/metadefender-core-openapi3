package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.LogoutApiService;
import org.openapitools.api.factories.LogoutApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

@Path("/logout")


@io.swagger.annotations.Api(description = "the logout API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-05-15T23:49:49.064488Z[UTC]")
public class LogoutApi  {
   private final LogoutApiService delegate;

   public LogoutApi(@Context ServletConfig servletContext) {
      LogoutApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("LogoutApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (LogoutApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = LogoutApiServiceFactory.getLogoutApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Logout", notes = "Destroy session for not using protected REST APIs.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "auth", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "OK", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response userLogout(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userLogout(apikey, securityContext);
    }
}
