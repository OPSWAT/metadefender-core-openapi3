package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AdminApiService;
import org.openapitools.api.factories.AdminApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AdminConfigSession;
import org.openapitools.model.AdminConfigUpdate;
import org.openapitools.model.AdminConfigWebhook;
import java.io.File;
import org.openapitools.model.InlineObject1;
import org.openapitools.model.InlineResponse200;
import org.openapitools.model.InlineResponse2001;
import org.openapitools.model.InlineResponse2002;
import org.openapitools.model.InlineResponse2003;
import org.openapitools.model.InlineResponse2004;
import org.openapitools.model.InlineResponse2005;
import org.openapitools.model.InlineResponse2006;
import org.openapitools.model.InlineResponse500;
import org.openapitools.model.LicenseInformation;
import org.openapitools.model.NewUserRoleRequest;
import org.openapitools.model.NewUserRoleResponse;
import org.openapitools.model.SkipList;
import org.openapitools.model.UNKNOWN_BASE_TYPE;
import org.openapitools.model.UserRequest;
import org.openapitools.model.UserResponse;
import org.openapitools.model.YaraSourcesObject;

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

@Path("/admin")


@io.swagger.annotations.Api(description = "the admin API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-05-15T23:49:49.064488Z[UTC]")
public class AdminApi  {
   private final AdminApiService delegate;

   public AdminApi(@Context ServletConfig servletContext) {
      AdminApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AdminApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AdminApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = AdminApiServiceFactory.getAdminApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/import")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Import configuration", notes = "Import configuration from file.", response = InlineResponse2006.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "admin", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request processed successfully", response = InlineResponse2006.class),
        
        @io.swagger.annotations.ApiResponse(code = 304, message = "The configuration has not changed", response = Object.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request (e.g. invalid header, apikey is missing or invalid).", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response adminImport(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@ApiParam(value = "")  File body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adminImport(apikey, body, securityContext);
    }
    @PUT
    @Path("/config/auditlog")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Audit clean up", notes = "Setting audit records (update history) clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  ", response = InlineResponse200.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request processed successfully", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response configAuditLog(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@ApiParam(value = "") @Valid  UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.configAuditLog(apikey, UNKNOWN_BASE_TYPE, securityContext);
    }
    @GET
    @Path("/config/skip")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get 'skip by hash' list", notes = "Get the list of hashes whitelisted or blacklisted.", response = SkipList.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of all skip/white/black-listed hashes.", response = SkipList.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Requests resource was not found.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response configGetSkipHash(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.configGetSkipHash(apikey, securityContext);
    }
    @PUT
    @Path("/config/quarantine")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Quarantine clean up", notes = "Setting quarantine clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  ", response = InlineResponse200.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request processed successfully", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response configQuarantine(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@ApiParam(value = "") @Valid  UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.configQuarantine(apikey, UNKNOWN_BASE_TYPE, securityContext);
    }
    @PUT
    @Path("/config/sanitize")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Sanitized files clean up", notes = "Setting sanitized files clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `minutes`.  ", response = InlineResponse2001.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request processed successfully", response = InlineResponse2001.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response configSanitizedRepo(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@ApiParam(value = "") @Valid  InlineObject1 inlineObject1
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.configSanitizedRepo(apikey, inlineObject1, securityContext);
    }
    @PUT
    @Path("/config/scanhistory")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Processing history clean up", notes = "Setting processing history clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  ", response = InlineResponse200.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request processed successfully", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response configScanHistory(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@ApiParam(value = "") @Valid  UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.configScanHistory(apikey, UNKNOWN_BASE_TYPE, securityContext);
    }
    @PUT
    @Path("/config/session")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Session settings", notes = "Configure settings for session generated upon a successful login See more at [Login](#operation/userLogin) ", response = AdminConfigSession.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request processed successfully", response = AdminConfigSession.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response configSession(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@ApiParam(value = "") @Valid  AdminConfigSession adminConfigSession
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.configSession(apikey, adminConfigSession, securityContext);
    }
    @PUT
    @Path("/config/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modules Update Source and Frequency", notes = "Setting update frequency for all modules and engines.  > _**Note**_:The clean up range is defined in `minutes`.  ", response = AdminConfigUpdate.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request processed successfully", response = AdminConfigUpdate.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response configUpdate(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@ApiParam(value = "") @Valid  AdminConfigUpdate adminConfigUpdate
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.configUpdate(apikey, adminConfigUpdate, securityContext);
    }
    @PUT
    @Path("/config/skip")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modify 'skip by hash' list", notes = "Modify one (or more) of the sources for the Yara Engine. The request body containing whitelist's rules in array under \"whitelist\" key; Each object in the array represents a whitelist: comment: same comment for detailed more information this whitelist settings. engines: containing engine id's strings in array hash: md5, sha1 or sha256 hash ", response = SkipList.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of all skip/white/black-listed hashes.", response = SkipList.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Requests resource was not found.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response configUpdateSkipHash(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@ApiParam(value = "A list of all skip/white/black-listed hashes.") @Valid  SkipList skipList
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.configUpdateSkipHash(apikey, skipList, securityContext);
    }
    @PUT
    @Path("/config/webhook")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Webhook set configuration", notes = "Modifying settings supported for webhook mode ", response = AdminConfigWebhook.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request processed successfully.", response = AdminConfigWebhook.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Requests resource was not found.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response configUpdateWebhook(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@ApiParam(value = "") @Valid  AdminConfigWebhook adminConfigWebhook
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.configUpdateWebhook(apikey, adminConfigWebhook, securityContext);
    }
    @GET
    @Path("/config/webhook")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Webhook get configuration", notes = "Getting settings supported for webhook mode ", response = AdminConfigWebhook.class, tags={ "config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request processed successfully.", response = AdminConfigWebhook.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response configWebhook(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.configWebhook(apikey, securityContext);
    }
    @POST
    @Path("/engine/{engineId}/disable")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Disable engines", notes = "Disable to use the selected engines on the nodes.", response = InlineResponse2005.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "engines", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request processed successfully", response = InlineResponse2005.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request (e.g. invalid header, apikey is missing or invalid).", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response engineDisable(@ApiParam(value = "The unique engine identifier", required = true) @PathParam("engineId") @NotNull  String engineId
,@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.engineDisable(engineId, apikey, securityContext);
    }
    @POST
    @Path("/engine/{engineId}/enable")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Enable engines", notes = "Enable to use the selected engine on the nodes.", response = InlineResponse2004.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "engines", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request processed successfully", response = InlineResponse2004.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request (e.g. invalid header, apikey is missing or invalid).", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response engineEnable(@ApiParam(value = "The unique engine identifier", required = true) @PathParam("engineId") @NotNull  String engineId
,@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.engineEnable(engineId, apikey, securityContext);
    }
    @POST
    @Path("/engine/{engineId}/pin")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Pin engine to prevent auto-updates", notes = "Pin engines to prevent applying automatic updates on them. Manual updates still can be applied.", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "engines", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request processed successfully", response = InlineResponse2002.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request (e.g. invalid header, apikey is missing or invalid).", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response enginePin(@ApiParam(value = "The unique engine identifier", required = true) @PathParam("engineId") @NotNull  String engineId
,@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@ApiParam(value = "Pin engine or database to prevent applying automatic updates on it. (If the type is not defined both engine and database will be pinned.)" , allowableValues="engine, database")@HeaderParam("type") String type
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.enginePin(engineId, apikey, type, securityContext);
    }
    @POST
    @Path("/engine/{engineId}/unpin")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Unpin engine to prevent auto-updates", notes = "Unpin engines so automatic updates will be applied on them.", response = InlineResponse2003.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "engines", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request processed successfully", response = InlineResponse2003.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request (e.g. invalid header, apikey is missing or invalid).", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response engineUnpin(@ApiParam(value = "The unique engine identifier", required = true) @PathParam("engineId") @NotNull  String engineId
,@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@ApiParam(value = "Unpin engine or database to applying automatic updates on it. (If it is not defined both engine and database will be unpinned.)" , allowableValues="engine, database")@HeaderParam("type") String type
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.engineUnpin(engineId, apikey, type, securityContext);
    }
    @POST
    @Path("/license/activation")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Activate license", notes = "This API initiates an online activation of the deployment.  In case of error, check the application logs for more details.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "license", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request processed successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response licenseActivation(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@ApiParam(value = "") @Valid  UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.licenseActivation(apikey, UNKNOWN_BASE_TYPE, securityContext);
    }
    @GET
    @Path("/license")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Current License Information", notes = "Fetch all details about the licensing status of the product.", response = LicenseInformation.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "license", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Information about the licensed product (product type, number of activations, deploymentId, expiration date and days left)", response = LicenseInformation.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response licenseGet(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.licenseGet(apikey, securityContext);
    }
    @POST
    @Path("/license")
    @Consumes({ "application/octet-stream" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Upload license key", notes = "Uploading a license file to the Metadefender Core.  There are two ways two obtain a license key file:  - via https://portal.opswat.com/activation portal  - via activation server REST API: https://activation.dl.opswat.com/activation?key=%activation_key%&deployment=%deployment_unique_ID%&quantity=%quantity%  Deployment unique ID can be fetched via Get Current License Information API.      ", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "license", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request processed successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid license file", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response licenseUpload(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@ApiParam(value = "")  String body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.licenseUpload(apikey, body, securityContext);
    }
    @POST
    @Path("/role")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create new role", notes = "Add a new user role to the system.", response = NewUserRoleResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "admin", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request processed successfully", response = NewUserRoleResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request (e.g. invalid header, apikey is missing or invalid).", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response roleCreate(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@ApiParam(value = "") @Valid  NewUserRoleRequest newUserRoleRequest
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.roleCreate(apikey, newUserRoleRequest, securityContext);
    }
    @POST
    @Path("/user")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create user", notes = "", response = UserResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "admin", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request processed successfully.", response = UserResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request (e.g. invalid header, apikey is missing or invalid).", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response userCreate(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@ApiParam(value = "") @Valid  UserRequest userRequest
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userCreate(apikey, userRequest, securityContext);
    }
    @GET
    @Path("/config/yara/sources")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Yara sources", notes = "Retrieve a list of all sources for the Yara Engine.", response = YaraSourcesObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "yara", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of Yara Engine sources.", response = YaraSourcesObject.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response yaraSourcesGet(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.yaraSourcesGet(apikey, securityContext);
    }
    @PUT
    @Path("/config/yara/sources")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modify Yara sources", notes = "Modify one (or more) of the sources for the Yara Engine.", response = YaraSourcesObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apikey")
    }, tags={ "yara", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of Yara Engine sources.", response = YaraSourcesObject.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response yaraSourcesPut(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@ApiParam(value = "A list of Yara Engine sources.") @Valid  YaraSourcesObject yaraSourcesObject
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.yaraSourcesPut(apikey, yaraSourcesObject, securityContext);
    }
}
