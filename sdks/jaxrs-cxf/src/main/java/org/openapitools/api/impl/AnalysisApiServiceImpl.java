package org.openapitools.api.impl;

import org.openapitools.api.*;
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
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * MetaDefender Core
 *
 * <p>## Developer Guide This is the API documentation for *MetaDefender Core Public API*.  If you would like to evaluate or have any questions about this documentation, please contact us via our [Contact Us](https://opswat.com/contact) form.  ## How to Interact with MetaDefender Core using REST Beginning with MetaDefender Core 4.x, OPSWAT recommends using the JSON-based REST API. The available methods are documented below. > _**Note**:_ MetaDefender API doesn't support chunk upload, however is recommended to stream the files to MetaDefender as part of the upload process.  --- ## File Analysis Process    MetaDefender's main functionality is to analyze large volumes with a high throughput. Depending on the configuration and licensed technologies, the analysis times can vary.    Below is a brief description of the API integration flow:    1. Upload a file for analysis (`POST /file`), which returns the `data_id`: [File Analysis](#operation/fileAnalysisPost)).           > _**Note**:_ The performance depends on:           > - number of nodes (scaling)     > - number of engines per node     > - type of file to be scanned     > - Metadefender Core and nodes' hardware       2. You have 2 ways to retrieve the analysis report:      - **Polling**: Fetch the result with previously received data_id (`GET /file/{data_id}` resource) until scan result belonging to data_id doesn't reach the 100 percent progress_percentage: ( [Fetch processing result](#operation/userLogin))        > _**Note**:_ Too many data_id requests can reduce performance. It is enough to just check every few hundred milliseconds.          - **Callbackurl**: Specify a callbackurl that will be called once the analysis is complete.     3. Retrieve the analysis results anytime after the analysis is completed with hash for files (md5, sha1, sha256) by calling [Fetch processing result](#operation/userLogin).      - The hash can be found in the scan results    4. Retrieve processed file (sanitized, redacted, watermarked, etc.) after the analysis is complete.      > _**Note**:_ Based on the configured retention policy, the files might be available for retrieval at a later time.   --- OPSWAT provides some sample codes on [GitHub](https://github.com/OPSWAT) to make it easier to understand how the MetaDefender REST API works. 
 *
 */
public class AnalysisApiServiceImpl implements AnalysisApi {
    /**
     * Fetching Available Analysis Rules
     *
     * Retrieve all available rules with their custom configurations. Fetching available processing rules. 
     *
     */
    public List<InlineResponse20010> analysisRules(String userAgent) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Cancel File Analysis
     *
     * When cancelling a file analysis, the connected analysis (e.g. files in an archive) that are still in progress will be cancelled also.   The cancelled analysis will be automatically closed. 
     *
     */
    public Object fileAnalysisCancel(String dataId, String apikey) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Fetch Analysis Result
     *
     * Retrieve scan results. Scan is done asynchronously and each scan request is tracked by a data ID. Initiating file scans and retrieving the results need to be done using two separate API calls. This request needs to be made multiple times until the scan is complete. Scan completion can be traced using &#x60;scan_results.progress_percentage&#x60; value from the response. 
     *
     */
    public AnalysisResult fileAnalysisGet(String dataId, String apikey) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Analyze File
     *
     * ## Scanning a file using a specified workflow. Scan is done asynchronously and each scan request is tracked by data id of which result can be retrieved by API Fetch Scan Result. &gt; _**Note**_: Chunked transfer encoding (applying header Transfer-Encoding: Chunked) is **not supported** on &#x60;/file&#x60; API.
     *
     */
    public InlineResponse2008 fileAnalysisPost(String apikey, String filename, String filepath, String userAgent, String rule, String workflow, String batch, String archivepwd, String metadata, URI callbackurl, File body) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Download Sanitized Files
     *
     * Retrieve sanitized file based on the &#x60;data_id&#x60; 
     *
     */
    public File sanitizedFile(String dataId, String apikey) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Query webhook status
     *
     * Prior to being notified by Core when webhooks mode is set, client can anytime ask Core for file / batch processing webhooks status. 
     *
     */
    public InlineResponse2009 webhookStatus(String dataId, String apikey) {
        // TODO: Implement...
        
        return null;
    }
    
}

