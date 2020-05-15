package org.openapitools.api;

import org.openapitools.model.InlineResponse20011;
import org.openapitools.model.InlineResponse20012;
import org.openapitools.model.InlineResponse20013;
import org.openapitools.model.InlineResponse500;

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
public interface StatsApi  {

    /**
     * Engines Status
     *
     * The response is an array of engines with database information.
     *
     */
    @GET
    @Path("/stat/engines")
    @Produces({ "application/json" })
    @ApiOperation(value = "Engines Status", tags={ "stats",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array with all the engines and their details.", response = InlineResponse20012.class, responseContainer = "List") })
    public List<InlineResponse20012> enginesStatus(@HeaderParam("apikey")   String apikey);

    /**
     * Nodes Status
     *
     * Get a list of all connected nodes and their status.
     *
     */
    @GET
    @Path("/stat/nodes")
    @Produces({ "application/json" })
    @ApiOperation(value = "Nodes Status", tags={ "stats",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array with all the engines and their details.", response = InlineResponse20013.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        @ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class) })
    public List<InlineResponse20013> nodesStatus(@HeaderParam("apikey")   String apikey);

    /**
     * Get Product Version
     *
     * Fetch details about the product version.
     *
     */
    @GET
    @Path("/version")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Product Version", tags={ "stats" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Provides productId and version information.", response = InlineResponse20011.class),
        @ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public InlineResponse20011 productVersion(@HeaderParam("apikey")   String apikey);
}

