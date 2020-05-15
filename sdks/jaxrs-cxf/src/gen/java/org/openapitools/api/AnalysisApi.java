package org.openapitools.api;

import org.openapitools.model.AnalysisResult;
import java.io.File;
import org.openapitools.model.InlineResponse20010;
import org.openapitools.model.InlineResponse2008;
import org.openapitools.model.InlineResponse2009;
import org.openapitools.model.InlineResponse400;
import org.openapitools.model.InlineResponse500;
import java.net.URI;

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
public interface AnalysisApi  {

    /**
     * Fetching Available Analysis Rules
     *
     * Retrieve all available rules with their custom configurations. Fetching available processing rules. 
     *
     */
    @GET
    @Path("/file/rules")
    @Produces({ "application/json" })
    @ApiOperation(value = "Fetching Available Analysis Rules", tags={ "analysis",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the list of available rules.", response = InlineResponse20010.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public List<InlineResponse20010> analysisRules(@HeaderParam("user_agent")   String userAgent);

    /**
     * Cancel File Analysis
     *
     * When cancelling a file analysis, the connected analysis (e.g. files in an archive) that are still in progress will be cancelled also.   The cancelled analysis will be automatically closed. 
     *
     */
    @POST
    @Path("/file/{data_id}/cancel")
    @Produces({ "application/json" })
    @ApiOperation(value = "Cancel File Analysis", tags={ "analysis",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Analysis was successfully cancelled.", response = Object.class),
        @ApiResponse(code = 400, message = "Bad Request (e.g. invalid header, apikey is missing or invalid).", response = InlineResponse500.class),
        @ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        @ApiResponse(code = 404, message = "Requests resource was not found.", response = InlineResponse500.class),
        @ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        @ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Object fileAnalysisCancel(@PathParam("data_id") String dataId, @HeaderParam("apikey")   String apikey);

    /**
     * Fetch Analysis Result
     *
     * Retrieve scan results. Scan is done asynchronously and each scan request is tracked by a data ID. Initiating file scans and retrieving the results need to be done using two separate API calls. This request needs to be made multiple times until the scan is complete. Scan completion can be traced using &#x60;scan_results.progress_percentage&#x60; value from the response. 
     *
     */
    @GET
    @Path("/file/{data_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Fetch Analysis Result", tags={ "analysis",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Entire analysis report generated by MetaDefender", response = AnalysisResult.class),
        @ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public AnalysisResult fileAnalysisGet(@PathParam("data_id") String dataId, @HeaderParam("apikey")   String apikey);

    /**
     * Analyze File
     *
     * ## Scanning a file using a specified workflow. Scan is done asynchronously and each scan request is tracked by data id of which result can be retrieved by API Fetch Scan Result. &gt; _**Note**_: Chunked transfer encoding (applying header Transfer-Encoding: Chunked) is **not supported** on &#x60;/file&#x60; API.
     *
     */
    @POST
    @Path("/file")
    @Consumes({ "application/octet-stream" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Analyze File", tags={ "analysis",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful file submission", response = InlineResponse2008.class),
        @ApiResponse(code = 400, message = "Callbackurl and/or apikey is invalid.", response = InlineResponse400.class),
        @ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        @ApiResponse(code = 411, message = "Content-Length header is missing from the request.", response = InlineResponse400.class),
        @ApiResponse(code = 422, message = "Body input is empty.", response = InlineResponse400.class),
        @ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class),
        @ApiResponse(code = 503, message = "Server is too busy, scan queue is full. Try again later.", response = InlineResponse400.class) })
    public InlineResponse2008 fileAnalysisPost(@HeaderParam("apikey")   String apikey, @HeaderParam("filename")   String filename, @HeaderParam("filepath")   String filepath, @HeaderParam("user_agent")   String userAgent, @HeaderParam("rule")   String rule, @HeaderParam("workflow")   String workflow, @HeaderParam("batch")   String batch, @HeaderParam("archivepwd")   String archivepwd, @HeaderParam("metadata")   String metadata, @HeaderParam("callbackurl")   URI callbackurl, @Valid File body);

    /**
     * Download Sanitized Files
     *
     * Retrieve sanitized file based on the &#x60;data_id&#x60; 
     *
     */
    @GET
    @Path("/file/converted/{data_id}")
    @Produces({ "application/octet-stream", "application/json" })
    @ApiOperation(value = "Download Sanitized Files", tags={ "analysis",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns the sanitized content.", response = File.class),
        @ApiResponse(code = 404, message = "Requests resource was not found.", response = InlineResponse500.class),
        @ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        @ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public File sanitizedFile(@PathParam("data_id") String dataId, @HeaderParam("apikey")   String apikey);

    /**
     * Query webhook status
     *
     * Prior to being notified by Core when webhooks mode is set, client can anytime ask Core for file / batch processing webhooks status. 
     *
     */
    @GET
    @Path("/file/webhook/{data_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Query webhook status", tags={ "analysis" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Webhooks status is fetched successfully.", response = InlineResponse2009.class),
        @ApiResponse(code = 400, message = "Bad Request (e.g. invalid header, apikey is missing or invalid).", response = InlineResponse500.class),
        @ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        @ApiResponse(code = 404, message = "Requests resource was not found.", response = InlineResponse500.class),
        @ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public InlineResponse2009 webhookStatus(@PathParam("data_id") String dataId, @HeaderParam("apikey")   String apikey);
}

