package org.openapitools.api;

import org.openapitools.model.InlineResponse2007;
import org.openapitools.model.InlineResponse500;
import org.openapitools.model.YaraSourcesObject;

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
public interface YaraApi  {

    /**
     * Generate Yara package
     *
     * Generate a new package based on the new added sources.
     *
     */
    @PUT
    @Path("/yara/generate")
    @Produces({ "application/json" })
    @ApiOperation(value = "Generate Yara package", tags={ "yara",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request processed successfully.", response = InlineResponse2007.class),
        @ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        @ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public InlineResponse2007 yaraPackageGenerate(@HeaderParam("apikey")   String apikey);

    /**
     * Yara Generation Status
     *
     * Get status of Yara package generation.
     *
     */
    @GET
    @Path("/yara/package")
    @Produces({ "application/json" })
    @ApiOperation(value = "Yara Generation Status", tags={ "yara",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request processed successfully.", response = InlineResponse2007.class),
        @ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        @ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public InlineResponse2007 yaraPackageStatus(@HeaderParam("apikey")   String apikey);

    /**
     * Get Yara sources
     *
     * Retrieve a list of all sources for the Yara Engine.
     *
     */
    @GET
    @Path("/admin/config/yara/sources")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Yara sources", tags={ "yara",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of Yara Engine sources.", response = YaraSourcesObject.class),
        @ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        @ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public YaraSourcesObject yaraSourcesGet(@HeaderParam("apikey")   String apikey);

    /**
     * Modify Yara sources
     *
     * Modify one (or more) of the sources for the Yara Engine.
     *
     */
    @PUT
    @Path("/admin/config/yara/sources")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modify Yara sources", tags={ "yara" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of Yara Engine sources.", response = YaraSourcesObject.class),
        @ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        @ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public YaraSourcesObject yaraSourcesPut(@HeaderParam("apikey")   String apikey, @Valid YaraSourcesObject yaraSourcesObject);
}

