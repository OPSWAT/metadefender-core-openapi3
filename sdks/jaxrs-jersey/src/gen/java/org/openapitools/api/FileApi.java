package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.FileApiService;
import org.openapitools.api.factories.FileApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AnalysisResult;
import org.openapitools.model.BatchId;
import org.openapitools.model.BatchResponse;
import java.io.File;
import org.openapitools.model.InlineResponse20010;
import org.openapitools.model.InlineResponse2008;
import org.openapitools.model.InlineResponse2009;
import org.openapitools.model.InlineResponse400;
import org.openapitools.model.InlineResponse500;
import java.net.URI;

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

@Path("/file")


@io.swagger.annotations.Api(description = "the file API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-05-15T23:49:49.064488Z[UTC]")
public class FileApi  {
   private final FileApiService delegate;

   public FileApi(@Context ServletConfig servletContext) {
      FileApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("FileApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (FileApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = FileApiServiceFactory.getFileApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/rules")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Fetching Available Analysis Rules", notes = "Retrieve all available rules with their custom configurations. Fetching available processing rules. ", response = InlineResponse20010.class, responseContainer = "List", tags={ "analysis", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns the list of available rules.", response = InlineResponse20010.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response analysisRules(@ApiParam(value = "The user agent string value sent in the header (specified by the client).  Only those rules are returned, that:   * Match the client's user agent sent using the user_agent header, or   * Are not restricted to a specific user agent.  For details see KB article [What are Security Policies and how do I use them?](https://onlinehelp.opswat.com/corev4/What_are_Security_Policies_and_how_do_I_use_them_.html). " )@HeaderParam("user_agent") String userAgent
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.analysisRules(userAgent, securityContext);
    }
    @POST
    @Path("/{batchId}/cancel")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Cancel Batch", notes = "When cancelling a batch, the connected analysis that are still in progress will be cancelled also.   The cancelled batch will be closed.      ", response = Object.class, tags={ "batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Batch cancelled.", response = Object.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request (e.g. invalid header, apikey is missing or invalid).", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Batch not found (invalid id)", response = InlineResponse400.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response batchCancel(@ApiParam(value = "The batch identifier used to submit files in the batch and to close the batch.", required = true) @PathParam("batchId") @NotNull  String batchId
,@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.batchCancel(batchId, apikey, securityContext);
    }
    @POST
    @Path("/batch/{batchId}/close")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Close Batch", notes = "The batch will be closed and files can no longer can be added to the current batch.      ", response = BatchResponse.class, tags={ "batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Batch successfully closed.", response = BatchResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request (e.g. invalid header, apikey is missing or invalid).", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Requests resource was not found.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response batchClose(@ApiParam(value = "The batch identifier used to submit files in the batch and to close the batch.", required = true) @PathParam("batchId") @NotNull  String batchId
,@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.batchClose(batchId, apikey, securityContext);
    }
    @POST
    @Path("/batch")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Initiate Batch", notes = "Create a new batch and retrieve the batch_id", response = BatchId.class, tags={ "batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Batch created successfully.", response = BatchId.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request (e.g. invalid header, apikey is missing or invalid).", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response batchCreate(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@ApiParam(value = "Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)       " )@HeaderParam("rule") String rule
,@ApiParam(value = "user_agent header used to identify (and limit) access to a particular rule. For rule selection, `rule` header should be used. " )@HeaderParam("user_agent") String userAgent
,@ApiParam(value = "Additional custom information (max 1024 bytes, URL encoded UTF-8 string)       " )@HeaderParam("user-data") String userData
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.batchCreate(apikey, rule, userAgent, userData, securityContext);
    }
    @GET
    @Path("/batch/{batchId}/certificate")
    
    @Produces({ "text/plain", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Download Signed Batch Result", notes = "Download digitally signed status report for the entire batch", response = Void.class, tags={ "batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Signed batch result and certificate are sent back in response body (YAML format).", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request (e.g. invalid header, apikey is missing or invalid).", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Requests resource was not found.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response batchSignedResult(@ApiParam(value = "The batch identifier used to submit files in the batch and to close the batch.", required = true) @PathParam("batchId") @NotNull  String batchId
,@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.batchSignedResult(batchId, apikey, securityContext);
    }
    @GET
    @Path("/batch/{batchId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Status of Batch Analysis", notes = "Retrieve status report for the entire batch", response = BatchResponse.class, tags={ "batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Batch progress paginated report (50 entries/page).", response = BatchResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request (e.g. invalid header, apikey is missing or invalid).", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Requests resource was not found.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response batchStatus(@ApiParam(value = "The batch identifier used to submit files in the batch and to close the batch.", required = true) @PathParam("batchId") @NotNull  String batchId
,@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.batchStatus(batchId, apikey, securityContext);
    }
    @POST
    @Path("/{data_id}/cancel")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Cancel File Analysis", notes = "When cancelling a file analysis, the connected analysis (e.g. files in an archive) that are still in progress will be cancelled also.   The cancelled analysis will be automatically closed. ", response = Object.class, tags={ "analysis", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Analysis was successfully cancelled.", response = Object.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request (e.g. invalid header, apikey is missing or invalid).", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Requests resource was not found.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response fileAnalysisCancel(@ApiParam(value = "", required = true) @PathParam("data_id") @NotNull  String dataId
,@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.fileAnalysisCancel(dataId, apikey, securityContext);
    }
    @GET
    @Path("/{data_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Fetch Analysis Result", notes = "Retrieve scan results. Scan is done asynchronously and each scan request is tracked by a data ID. Initiating file scans and retrieving the results need to be done using two separate API calls. This request needs to be made multiple times until the scan is complete. Scan completion can be traced using `scan_results.progress_percentage` value from the response. ", response = AnalysisResult.class, tags={ "analysis", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Entire analysis report generated by MetaDefender", response = AnalysisResult.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response fileAnalysisGet(@ApiParam(value = "", required = true) @PathParam("data_id") @NotNull  String dataId
,@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.fileAnalysisGet(dataId, apikey, securityContext);
    }
    @POST
    
    @Consumes({ "application/octet-stream" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Analyze File", notes = "## Scanning a file using a specified workflow. Scan is done asynchronously and each scan request is tracked by data id of which result can be retrieved by API Fetch Scan Result. > _**Note**_: Chunked transfer encoding (applying header Transfer-Encoding: Chunked) is **not supported** on `/file` API.", response = InlineResponse2008.class, tags={ "analysis", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful file submission", response = InlineResponse2008.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Callbackurl and/or apikey is invalid.", response = InlineResponse400.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 411, message = "Content-Length header is missing from the request.", response = InlineResponse400.class),
        
        @io.swagger.annotations.ApiResponse(code = 422, message = "Body input is empty.", response = InlineResponse400.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Server is too busy, scan queue is full. Try again later.", response = InlineResponse400.class) })
    public Response fileAnalysisPost(@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@ApiParam(value = "The name of the submitted file" )@HeaderParam("filename") String filename
,@ApiParam(value = "if local file scan is enabled the path to the file (see Security rule configuration)" )@HeaderParam("filepath") String filepath
,@ApiParam(value = "user_agent header used to identify (and limit) access to a particular rule. For rule selection, `rule` header should be used. " )@HeaderParam("user_agent") String userAgent
,@ApiParam(value = "Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)       " )@HeaderParam("rule") String rule
,@ApiParam(value = "name of the selected workflow (deprecated, use \"rule\" header parameter instead)" )@HeaderParam("workflow") String workflow
,@ApiParam(value = "Batch id to scan with, coming from `Initiate Batch` (If it is not given, it will be a single file scan.)" )@HeaderParam("batch") String batch
,@ApiParam(value = "password for archive ( URL encoded UTF-8 string)   Multiple passwords is also supported, format: archivepwd<X>     * X: Could be empty     * When having value, X must be a number >= 1   For example:     archivepwd1: \"fox\"     archivepwd2: \"cow\"     archivepwd3: \"bear\" " )@HeaderParam("archivepwd") String archivepwd
,@ApiParam(value = "could be utilized for: Additional parameter for pre-defined post actions and external scanners (as a part of STDIN input). Customized macro variable for watermarking text (Proactive DLP engine feature). Additional context / verbose information for each file submission (appended into JSON response scan result). " )@HeaderParam("metadata") String metadata
,@ApiParam(value = "Client's URL where MetaDefender Core will notify scan result back to whenever scan is finished (webhooks model). See details at 8.1.11.1. Individual file processing   * Format: <protocol://><ip | domain>:<port></path>   * Example: http://10.0.1.100:8081/listenback " )@HeaderParam("callbackurl") URI callbackurl
,@ApiParam(value = "")  File body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.fileAnalysisPost(apikey, filename, filepath, userAgent, rule, workflow, batch, archivepwd, metadata, callbackurl, body, securityContext);
    }
    @GET
    @Path("/converted/{data_id}")
    
    @Produces({ "application/octet-stream", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Download Sanitized Files", notes = "Retrieve sanitized file based on the `data_id` ", response = File.class, tags={ "analysis", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns the sanitized content.", response = File.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Requests resource was not found.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "The user has no rights for this operation.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response sanitizedFile(@ApiParam(value = "The data_id comes from the result of `Analyze a file`. In case of sanitizing the content of an archive, the data_id of contained file can be found in `Fetch analysis result`.", required = true) @PathParam("data_id") @NotNull  String dataId
,@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sanitizedFile(dataId, apikey, securityContext);
    }
    @GET
    @Path("/webhook/{data_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Query webhook status", notes = "Prior to being notified by Core when webhooks mode is set, client can anytime ask Core for file / batch processing webhooks status. ", response = InlineResponse2009.class, tags={ "analysis", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Webhooks status is fetched successfully.", response = InlineResponse2009.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request (e.g. invalid header, apikey is missing or invalid).", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid user information or Not Allowed", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Requests resource was not found.", response = InlineResponse500.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Unexpected event on server", response = InlineResponse500.class) })
    public Response webhookStatus(@ApiParam(value = "Either `data_id` or `batch_id`.", required = true) @PathParam("data_id") @NotNull  String dataId
,@ApiParam(value = "Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                " )@HeaderParam("apikey") String apikey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.webhookStatus(dataId, apikey, securityContext);
    }
}
