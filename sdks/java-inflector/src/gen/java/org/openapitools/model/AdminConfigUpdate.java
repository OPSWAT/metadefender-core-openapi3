package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AdminConfigUpdateDisabledupdate;



/**
 * API object for /admin/config/update
 **/

@ApiModel(description = "API object for /admin/config/update")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class AdminConfigUpdate   {
  @JsonProperty("autoupdateperiod")
  private Integer autoupdateperiod;

  @JsonProperty("deleteafterimport")
  private Boolean deleteafterimport;

  @JsonProperty("disabledupdate")
  private List<AdminConfigUpdateDisabledupdate> disabledupdate = null;

  @JsonProperty("pickupfolder")
  private String pickupfolder;

  /**
   * Define where the updates will be loaded from. <p> This can be either:   * `internet` -> if selected, will check for new updates every `autoupdateperiod` minutes   * `folder` -> make sure that MetaDefender has access/permission to that folder   * `manual` -> requires manually uploading the packages in Inventory > Modules > Upload package. 
   */
  public enum SourceEnum {
    INTERNET("internet"),
    
    FOLDER("folder"),
    
    MANUAL("manual");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SourceEnum fromValue(String text) {
      for (SourceEnum b : SourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("source")
  private SourceEnum source;

  /**
   * The interval (in minutes) for checking for new updates.
   **/
  public AdminConfigUpdate autoupdateperiod(Integer autoupdateperiod) {
    this.autoupdateperiod = autoupdateperiod;
    return this;
  }

  
  @ApiModelProperty(example = "240", value = "The interval (in minutes) for checking for new updates.")
  @JsonProperty("autoupdateperiod")
  public Integer getAutoupdateperiod() {
    return autoupdateperiod;
  }
  public void setAutoupdateperiod(Integer autoupdateperiod) {
    this.autoupdateperiod = autoupdateperiod;
  }

  /**
   * If you want to clean the pickup folder after the updates have been applied.
   **/
  public AdminConfigUpdate deleteafterimport(Boolean deleteafterimport) {
    this.deleteafterimport = deleteafterimport;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "If you want to clean the pickup folder after the updates have been applied.")
  @JsonProperty("deleteafterimport")
  public Boolean getDeleteafterimport() {
    return deleteafterimport;
  }
  public void setDeleteafterimport(Boolean deleteafterimport) {
    this.deleteafterimport = deleteafterimport;
  }

  /**
   * Lockdown a time interval when the engines are not allowed to update.
   **/
  public AdminConfigUpdate disabledupdate(List<AdminConfigUpdateDisabledupdate> disabledupdate) {
    this.disabledupdate = disabledupdate;
    return this;
  }

  
  @ApiModelProperty(value = "Lockdown a time interval when the engines are not allowed to update.")
  @JsonProperty("disabledupdate")
  public List<AdminConfigUpdateDisabledupdate> getDisabledupdate() {
    return disabledupdate;
  }
  public void setDisabledupdate(List<AdminConfigUpdateDisabledupdate> disabledupdate) {
    this.disabledupdate = disabledupdate;
  }

  /**
   * The folder where MetaDefender will look for the new engine files.
   **/
  public AdminConfigUpdate pickupfolder(String pickupfolder) {
    this.pickupfolder = pickupfolder;
    return this;
  }

  
  @ApiModelProperty(example = "/tmp/core-data/update_autoadd", value = "The folder where MetaDefender will look for the new engine files.")
  @JsonProperty("pickupfolder")
  public String getPickupfolder() {
    return pickupfolder;
  }
  public void setPickupfolder(String pickupfolder) {
    this.pickupfolder = pickupfolder;
  }

  /**
   * Define where the updates will be loaded from. <p> This can be either:   * `internet` -> if selected, will check for new updates every `autoupdateperiod` minutes   * `folder` -> make sure that MetaDefender has access/permission to that folder   * `manual` -> requires manually uploading the packages in Inventory > Modules > Upload package. 
   **/
  public AdminConfigUpdate source(SourceEnum source) {
    this.source = source;
    return this;
  }

  
  @ApiModelProperty(example = "internet", value = "Define where the updates will be loaded from. <p> This can be either:   * `internet` -> if selected, will check for new updates every `autoupdateperiod` minutes   * `folder` -> make sure that MetaDefender has access/permission to that folder   * `manual` -> requires manually uploading the packages in Inventory > Modules > Upload package. ")
  @JsonProperty("source")
  public SourceEnum getSource() {
    return source;
  }
  public void setSource(SourceEnum source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminConfigUpdate adminConfigUpdate = (AdminConfigUpdate) o;
    return Objects.equals(autoupdateperiod, adminConfigUpdate.autoupdateperiod) &&
        Objects.equals(deleteafterimport, adminConfigUpdate.deleteafterimport) &&
        Objects.equals(disabledupdate, adminConfigUpdate.disabledupdate) &&
        Objects.equals(pickupfolder, adminConfigUpdate.pickupfolder) &&
        Objects.equals(source, adminConfigUpdate.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoupdateperiod, deleteafterimport, disabledupdate, pickupfolder, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminConfigUpdate {\n");
    
    sb.append("    autoupdateperiod: ").append(toIndentedString(autoupdateperiod)).append("\n");
    sb.append("    deleteafterimport: ").append(toIndentedString(deleteafterimport)).append("\n");
    sb.append("    disabledupdate: ").append(toIndentedString(disabledupdate)).append("\n");
    sb.append("    pickupfolder: ").append(toIndentedString(pickupfolder)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

