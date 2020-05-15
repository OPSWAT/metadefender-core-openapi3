package org.openapitools.api;

import org.openapitools.model.AdminConfigSession;
import org.openapitools.model.AdminConfigUpdate;
import org.openapitools.model.AdminConfigWebhook;
import org.openapitools.model.InlineObject1;
import org.openapitools.model.InlineResponse200;
import org.openapitools.model.InlineResponse2001;
import org.openapitools.model.InlineResponse500;
import org.openapitools.model.SkipList;
import org.openapitools.model.UNKNOWN_BASE_TYPE;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * MetaDefender Core
 *
 * <p>## Developer Guide This is the API documentation for *MetaDefender Core Public API*.  If you would like to evaluate or have any questions about this documentation, please contact us via our [Contact Us](https://opswat.com/contact) form.  ## How to Interact with MetaDefender Core using REST Beginning with MetaDefender Core 4.x, OPSWAT recommends using the JSON-based REST API. The available methods are documented below. > _**Note**:_ MetaDefender API doesn't support chunk upload, however is recommended to stream the files to MetaDefender as part of the upload process.  --- ## File Analysis Process    MetaDefender's main functionality is to analyze large volumes with a high throughput. Depending on the configuration and licensed technologies, the analysis times can vary.    Below is a brief description of the API integration flow:    1. Upload a file for analysis (`POST /file`), which returns the `data_id`: [File Analysis](#operation/fileAnalysisPost)).           > _**Note**:_ The performance depends on:           > - number of nodes (scaling)     > - number of engines per node     > - type of file to be scanned     > - Metadefender Core and nodes' hardware       2. You have 2 ways to retrieve the analysis report:      - **Polling**: Fetch the result with previously received data_id (`GET /file/{data_id}` resource) until scan result belonging to data_id doesn't reach the 100 percent progress_percentage: ( [Fetch processing result](#operation/userLogin))        > _**Note**:_ Too many data_id requests can reduce performance. It is enough to just check every few hundred milliseconds.          - **Callbackurl**: Specify a callbackurl that will be called once the analysis is complete.     3. Retrieve the analysis results anytime after the analysis is completed with hash for files (md5, sha1, sha256) by calling [Fetch processing result](#operation/userLogin).      - The hash can be found in the scan results    4. Retrieve processed file (sanitized, redacted, watermarked, etc.) after the analysis is complete.      > _**Note**:_ Based on the configured retention policy, the files might be available for retrieval at a later time.   --- OPSWAT provides some sample codes on [GitHub](https://github.com/OPSWAT) to make it easier to understand how the MetaDefender REST API works. 
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ConfigApi  {

    /**
     * Audit clean up
     *
     * Setting audit records (update history) clean up time (clean up records older than).  &gt; _**Note**_:The clean up range is defined in &#x60;hours&#x60;.  
     *
     */
    @PUT
    @Path("/admin/config/auditlog")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Audit clean up", tags={ "config",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request processed successfully", response = InlineResponse200.class),
        @ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        @ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        @ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public InlineResponse200 configAuditLog(@HeaderParam("apikey")   String apikey, @Valid UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE);

    /**
     * Get &#39;skip by hash&#39; list
     *
     * Get the list of hashes whitelisted or blacklisted.
     *
     */
    @GET
    @Path("/admin/config/skip")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get 'skip by hash' list", tags={ "config",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of all skip/white/black-listed hashes.", response = SkipList.class),
        @ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        @ApiResponse(code = 404, message = "Requests resource was not found.", response = InlineResponse500.class),
        @ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public SkipList configGetSkipHash(@HeaderParam("apikey")   String apikey);

    /**
     * Quarantine clean up
     *
     * Setting quarantine clean up time (clean up records older than).  &gt; _**Note**_:The clean up range is defined in &#x60;hours&#x60;.  
     *
     */
    @PUT
    @Path("/admin/config/quarantine")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Quarantine clean up", tags={ "config",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request processed successfully", response = InlineResponse200.class),
        @ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        @ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        @ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public InlineResponse200 configQuarantine(@HeaderParam("apikey")   String apikey, @Valid UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE);

    /**
     * Sanitized files clean up
     *
     * Setting sanitized files clean up time (clean up records older than).  &gt; _**Note**_:The clean up range is defined in &#x60;minutes&#x60;.  
     *
     */
    @PUT
    @Path("/admin/config/sanitize")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Sanitized files clean up", tags={ "config",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request processed successfully", response = InlineResponse2001.class),
        @ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        @ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        @ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public InlineResponse2001 configSanitizedRepo(@HeaderParam("apikey")   String apikey, @Valid InlineObject1 inlineObject1);

    /**
     * Processing history clean up
     *
     * Setting processing history clean up time (clean up records older than).  &gt; _**Note**_:The clean up range is defined in &#x60;hours&#x60;.  
     *
     */
    @PUT
    @Path("/admin/config/scanhistory")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Processing history clean up", tags={ "config",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request processed successfully", response = InlineResponse200.class),
        @ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        @ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        @ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public InlineResponse200 configScanHistory(@HeaderParam("apikey")   String apikey, @Valid UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE);

    /**
     * Session settings
     *
     * Configure settings for session generated upon a successful login See more at [Login](#operation/userLogin) 
     *
     */
    @PUT
    @Path("/admin/config/session")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Session settings", tags={ "config",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request processed successfully", response = AdminConfigSession.class),
        @ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        @ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        @ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public AdminConfigSession configSession(@HeaderParam("apikey")   String apikey, @Valid AdminConfigSession adminConfigSession);

    /**
     * Modules Update Source and Frequency
     *
     * Setting update frequency for all modules and engines.  &gt; _**Note**_:The clean up range is defined in &#x60;minutes&#x60;.  
     *
     */
    @PUT
    @Path("/admin/config/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modules Update Source and Frequency", tags={ "config",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request processed successfully", response = AdminConfigUpdate.class),
        @ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        @ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        @ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public AdminConfigUpdate configUpdate(@HeaderParam("apikey")   String apikey, @Valid AdminConfigUpdate adminConfigUpdate);

    /**
     * Modify &#39;skip by hash&#39; list
     *
     * Modify one (or more) of the sources for the Yara Engine. The request body containing whitelist&#39;s rules in array under \&quot;whitelist\&quot; key; Each object in the array represents a whitelist: comment: same comment for detailed more information this whitelist settings. engines: containing engine id&#39;s strings in array hash: md5, sha1 or sha256 hash 
     *
     */
    @PUT
    @Path("/admin/config/skip")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modify 'skip by hash' list", tags={ "config",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of all skip/white/black-listed hashes.", response = SkipList.class),
        @ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        @ApiResponse(code = 404, message = "Requests resource was not found.", response = InlineResponse500.class),
        @ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public SkipList configUpdateSkipHash(@HeaderParam("apikey")   String apikey, @Valid SkipList skipList);

    /**
     * Webhook set configuration
     *
     * Modifying settings supported for webhook mode 
     *
     */
    @PUT
    @Path("/admin/config/webhook")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Webhook set configuration", tags={ "config",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request processed successfully.", response = AdminConfigWebhook.class),
        @ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        @ApiResponse(code = 404, message = "Requests resource was not found.", response = InlineResponse500.class),
        @ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public AdminConfigWebhook configUpdateWebhook(@HeaderParam("apikey")   String apikey, @Valid AdminConfigWebhook adminConfigWebhook);

    /**
     * Webhook get configuration
     *
     * Getting settings supported for webhook mode 
     *
     */
    @GET
    @Path("/admin/config/webhook")
    @Produces({ "application/json" })
    @ApiOperation(value = "Webhook get configuration", tags={ "config" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request processed successfully.", response = AdminConfigWebhook.class),
        @ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        @ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        @ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public AdminConfigWebhook configWebhook(@HeaderParam("apikey")   String apikey);
}

