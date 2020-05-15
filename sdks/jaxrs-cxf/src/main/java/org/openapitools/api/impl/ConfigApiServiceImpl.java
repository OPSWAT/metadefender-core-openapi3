package org.openapitools.api.impl;

import org.openapitools.api.*;
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
public class ConfigApiServiceImpl implements ConfigApi {
    /**
     * Audit clean up
     *
     * Setting audit records (update history) clean up time (clean up records older than).  &gt; _**Note**_:The clean up range is defined in &#x60;hours&#x60;.  
     *
     */
    public InlineResponse200 configAuditLog(String apikey, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get &#39;skip by hash&#39; list
     *
     * Get the list of hashes whitelisted or blacklisted.
     *
     */
    public SkipList configGetSkipHash(String apikey) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Quarantine clean up
     *
     * Setting quarantine clean up time (clean up records older than).  &gt; _**Note**_:The clean up range is defined in &#x60;hours&#x60;.  
     *
     */
    public InlineResponse200 configQuarantine(String apikey, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Sanitized files clean up
     *
     * Setting sanitized files clean up time (clean up records older than).  &gt; _**Note**_:The clean up range is defined in &#x60;minutes&#x60;.  
     *
     */
    public InlineResponse2001 configSanitizedRepo(String apikey, InlineObject1 inlineObject1) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Processing history clean up
     *
     * Setting processing history clean up time (clean up records older than).  &gt; _**Note**_:The clean up range is defined in &#x60;hours&#x60;.  
     *
     */
    public InlineResponse200 configScanHistory(String apikey, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Session settings
     *
     * Configure settings for session generated upon a successful login See more at [Login](#operation/userLogin) 
     *
     */
    public AdminConfigSession configSession(String apikey, AdminConfigSession adminConfigSession) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Modules Update Source and Frequency
     *
     * Setting update frequency for all modules and engines.  &gt; _**Note**_:The clean up range is defined in &#x60;minutes&#x60;.  
     *
     */
    public AdminConfigUpdate configUpdate(String apikey, AdminConfigUpdate adminConfigUpdate) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Modify &#39;skip by hash&#39; list
     *
     * Modify one (or more) of the sources for the Yara Engine. The request body containing whitelist&#39;s rules in array under \&quot;whitelist\&quot; key; Each object in the array represents a whitelist: comment: same comment for detailed more information this whitelist settings. engines: containing engine id&#39;s strings in array hash: md5, sha1 or sha256 hash 
     *
     */
    public SkipList configUpdateSkipHash(String apikey, SkipList skipList) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Webhook set configuration
     *
     * Modifying settings supported for webhook mode 
     *
     */
    public AdminConfigWebhook configUpdateWebhook(String apikey, AdminConfigWebhook adminConfigWebhook) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Webhook get configuration
     *
     * Getting settings supported for webhook mode 
     *
     */
    public AdminConfigWebhook configWebhook(String apikey) {
        // TODO: Implement...
        
        return null;
    }
    
}

