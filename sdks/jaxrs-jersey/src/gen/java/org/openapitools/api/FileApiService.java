package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

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

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-05-15T23:49:49.064488Z[UTC]")
public abstract class FileApiService {
    public abstract Response analysisRules(String userAgent,SecurityContext securityContext) throws NotFoundException;
    public abstract Response batchCancel(String batchId,String apikey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response batchClose(String batchId,String apikey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response batchCreate(String apikey,String rule,String userAgent,String userData,SecurityContext securityContext) throws NotFoundException;
    public abstract Response batchSignedResult(String batchId,String apikey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response batchStatus(String batchId,String apikey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response fileAnalysisCancel(String dataId,String apikey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response fileAnalysisGet(String dataId,String apikey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response fileAnalysisPost(String apikey,String filename,String filepath,String userAgent,String rule,String workflow,String batch,String archivepwd,String metadata,URI callbackurl,File body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response sanitizedFile(String dataId,String apikey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response webhookStatus(String dataId,String apikey,SecurityContext securityContext) throws NotFoundException;
}
