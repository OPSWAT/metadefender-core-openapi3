package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.StatApiService;
import org.openapitools.api.factories.StatApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.InlineResponse20012;
import org.openapitools.model.InlineResponse20013;
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

@Path("/stat")


@io.swagger.annotations.Api(description = "the stat API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-05-15T23:49:49.064488Z[UTC]")
public class StatApi  {
   private final StatApiService delegate;

   public StatApi(@Context ServletConfig servletContext) {
      StatApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("StatApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (StatApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = StatApiServiceFactory.getStatApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/engines")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Engines Status", notes = "The response is an array of engines with database information.", response = InlineResponse20012.class, responseContainer = "List", tags={ "stats", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array with all the engines and their details.", response = InlineResponse20012.class, responseContainer = "List") })
    public Response enginesStatus(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.enginesStatus(apikey, securityContext);
    }
    @GET
    @Path("/nodes")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Nodes Status", notes = "Get a list of all connected nodes and their status.", response = InlineResponse20013.class, responseContainer = "List", tags={ "stats", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array with all the engines and their details.", response = InlineResponse20013.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class) })
    public Response nodesStatus(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.nodesStatus(apikey, securityContext);
    }
}
