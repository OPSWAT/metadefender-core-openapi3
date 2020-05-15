package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

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

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-05-15T23:49:49.064488Z[UTC]")
public abstract class AdminApiService {
    public abstract Response adminImport(String apikey,File body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response configAuditLog(String apikey,UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE,SecurityContext securityContext) throws NotFoundException;
    public abstract Response configGetSkipHash(String apikey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response configQuarantine(String apikey,UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE,SecurityContext securityContext) throws NotFoundException;
    public abstract Response configSanitizedRepo(String apikey,InlineObject1 inlineObject1,SecurityContext securityContext) throws NotFoundException;
    public abstract Response configScanHistory(String apikey,UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE,SecurityContext securityContext) throws NotFoundException;
    public abstract Response configSession(String apikey,AdminConfigSession adminConfigSession,SecurityContext securityContext) throws NotFoundException;
    public abstract Response configUpdate(String apikey,AdminConfigUpdate adminConfigUpdate,SecurityContext securityContext) throws NotFoundException;
    public abstract Response configUpdateSkipHash(String apikey,SkipList skipList,SecurityContext securityContext) throws NotFoundException;
    public abstract Response configUpdateWebhook(String apikey,AdminConfigWebhook adminConfigWebhook,SecurityContext securityContext) throws NotFoundException;
    public abstract Response configWebhook(String apikey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response engineDisable(String engineId,String apikey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response engineEnable(String engineId,String apikey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response enginePin(String engineId,String apikey,String type,SecurityContext securityContext) throws NotFoundException;
    public abstract Response engineUnpin(String engineId,String apikey,String type,SecurityContext securityContext) throws NotFoundException;
    public abstract Response licenseActivation(String apikey,UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE,SecurityContext securityContext) throws NotFoundException;
    public abstract Response licenseGet(String apikey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response licenseUpload(String apikey,String body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response roleCreate(String apikey,NewUserRoleRequest newUserRoleRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userCreate(String apikey,UserRequest userRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response yaraSourcesGet(String apikey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response yaraSourcesPut(String apikey,YaraSourcesObject yaraSourcesObject,SecurityContext securityContext) throws NotFoundException;
}
