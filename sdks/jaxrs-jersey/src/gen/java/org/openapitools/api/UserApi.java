package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.UserApiService;
import org.openapitools.api.factories.UserApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.InlineObject2;
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

@Path("/user")


@io.swagger.annotations.Api(description = "the user API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-05-15T23:49:49.064488Z[UTC]")
public class UserApi  {
   private final UserApiService delegate;

   public UserApi(@Context ServletConfig servletContext) {
      UserApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("UserApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (UserApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = UserApiServiceFactory.getUserApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/changepassword")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Change Password", notes = "Modify the current password for the user identified by apikey", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "auth", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request processed successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request (e.g. invalid header, apikey is missing or invalid).", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response userChangePass(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@ApiParam(value = "") @Valid  InlineObject2 inlineObject2
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userChangePass(apikey, inlineObject2, securityContext);
    }
}
