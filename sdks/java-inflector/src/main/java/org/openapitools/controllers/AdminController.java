package org.openapitools.controllers;

import io.swagger.inflector.models.RequestContext;
import io.swagger.inflector.models.ResponseContext;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import java.io.File;
import java.util.List;

import org.openapitools.model.*;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class AdminController  {
  /** 
   * Uncomment and implement as you see fit.  These operations will map
   * Directly to operation calls from the routing logic.  Because the inflector
   * Code allows you to implement logic incrementally, they are disabled.
   **/

  /*
    public ResponseContext adminImport(RequestContext request , String apikey, File body) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext configAuditLog(RequestContext request , String apikey, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext configGetSkipHash(RequestContext request , String apikey) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext configQuarantine(RequestContext request , String apikey, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext configSanitizedRepo(RequestContext request , String apikey, InlineObject1 inlineObject1) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext configScanHistory(RequestContext request , String apikey, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext configSession(RequestContext request , String apikey, AdminConfigSession adminConfigSession) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext configUpdate(RequestContext request , String apikey, AdminConfigUpdate adminConfigUpdate) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext configUpdateSkipHash(RequestContext request , String apikey, SkipList skipList) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext configUpdateWebhook(RequestContext request , String apikey, AdminConfigWebhook adminConfigWebhook) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext configWebhook(RequestContext request , String apikey) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext engineDisable(RequestContext request , String engineId, String apikey) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext engineEnable(RequestContext request , String engineId, String apikey) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext enginePin(RequestContext request , String engineId, String apikey, String type) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext engineUnpin(RequestContext request , String engineId, String apikey, String type) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext licenseActivation(RequestContext request , String apikey, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext licenseGet(RequestContext request , String apikey) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext licenseUpload(RequestContext request , String apikey, String body) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext roleCreate(RequestContext request , String apikey, NewUserRoleRequest newUserRoleRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext userCreate(RequestContext request , String apikey, UserRequest userRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext yaraSourcesGet(RequestContext request , String apikey) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext yaraSourcesPut(RequestContext request , String apikey, YaraSourcesObject yaraSourcesObject) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

}

