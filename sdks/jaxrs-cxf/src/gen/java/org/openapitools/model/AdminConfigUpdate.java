package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AdminConfigUpdateDisabledupdate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * API object for /admin/config/update
 **/
@ApiModel(description="API object for /admin/config/update")
public class AdminConfigUpdate  {
  
  @ApiModelProperty(example = "240", value = "The interval (in minutes) for checking for new updates.")
 /**
   * The interval (in minutes) for checking for new updates.
  **/
  private Integer autoupdateperiod;

  @ApiModelProperty(example = "true", value = "If you want to clean the pickup folder after the updates have been applied.")
 /**
   * If you want to clean the pickup folder after the updates have been applied.
  **/
  private Boolean deleteafterimport;

  @ApiModelProperty(value = "Lockdown a time interval when the engines are not allowed to update.")
  @Valid
 /**
   * Lockdown a time interval when the engines are not allowed to update.
  **/
  private List<AdminConfigUpdateDisabledupdate> disabledupdate = null;

  @ApiModelProperty(example = "/tmp/core-data/update_autoadd", value = "The folder where MetaDefender will look for the new engine files.")
 /**
   * The folder where MetaDefender will look for the new engine files.
  **/
  private String pickupfolder;

@XmlType(name="SourceEnum")
@XmlEnum(String.class)
public enum SourceEnum {

@XmlEnumValue("internet") INTERNET(String.valueOf("internet")), @XmlEnumValue("folder") FOLDER(String.valueOf("folder")), @XmlEnumValue("manual") MANUAL(String.valueOf("manual"));


    private String value;

    SourceEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SourceEnum fromValue(String value) {
        for (SourceEnum b : SourceEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "internet", value = "Define where the updates will be loaded from. <p> This can be either:   * `internet` -> if selected, will check for new updates every `autoupdateperiod` minutes   * `folder` -> make sure that MetaDefender has access/permission to that folder   * `manual` -> requires manually uploading the packages in Inventory > Modules > Upload package. ")
 /**
   * Define where the updates will be loaded from. <p> This can be either:   * `internet` -> if selected, will check for new updates every `autoupdateperiod` minutes   * `folder` -> make sure that MetaDefender has access/permission to that folder   * `manual` -> requires manually uploading the packages in Inventory > Modules > Upload package. 
  **/
  private SourceEnum source;
 /**
   * The interval (in minutes) for checking for new updates.
   * @return autoupdateperiod
  **/
  @JsonProperty("autoupdateperiod")
  public Integer getAutoupdateperiod() {
    return autoupdateperiod;
  }

  public void setAutoupdateperiod(Integer autoupdateperiod) {
    this.autoupdateperiod = autoupdateperiod;
  }

  public AdminConfigUpdate autoupdateperiod(Integer autoupdateperiod) {
    this.autoupdateperiod = autoupdateperiod;
    return this;
  }

 /**
   * If you want to clean the pickup folder after the updates have been applied.
   * @return deleteafterimport
  **/
  @JsonProperty("deleteafterimport")
  public Boolean getDeleteafterimport() {
    return deleteafterimport;
  }

  public void setDeleteafterimport(Boolean deleteafterimport) {
    this.deleteafterimport = deleteafterimport;
  }

  public AdminConfigUpdate deleteafterimport(Boolean deleteafterimport) {
    this.deleteafterimport = deleteafterimport;
    return this;
  }

 /**
   * Lockdown a time interval when the engines are not allowed to update.
   * @return disabledupdate
  **/
  @JsonProperty("disabledupdate")
  public List<AdminConfigUpdateDisabledupdate> getDisabledupdate() {
    return disabledupdate;
  }

  public void setDisabledupdate(List<AdminConfigUpdateDisabledupdate> disabledupdate) {
    this.disabledupdate = disabledupdate;
  }

  public AdminConfigUpdate disabledupdate(List<AdminConfigUpdateDisabledupdate> disabledupdate) {
    this.disabledupdate = disabledupdate;
    return this;
  }

  public AdminConfigUpdate addDisabledupdateItem(AdminConfigUpdateDisabledupdate disabledupdateItem) {
    this.disabledupdate.add(disabledupdateItem);
    return this;
  }

 /**
   * The folder where MetaDefender will look for the new engine files.
   * @return pickupfolder
  **/
  @JsonProperty("pickupfolder")
  public String getPickupfolder() {
    return pickupfolder;
  }

  public void setPickupfolder(String pickupfolder) {
    this.pickupfolder = pickupfolder;
  }

  public AdminConfigUpdate pickupfolder(String pickupfolder) {
    this.pickupfolder = pickupfolder;
    return this;
  }

 /**
   * Define where the updates will be loaded from. &lt;p&gt; This can be either:   * &#x60;internet&#x60; -&gt; if selected, will check for new updates every &#x60;autoupdateperiod&#x60; minutes   * &#x60;folder&#x60; -&gt; make sure that MetaDefender has access/permission to that folder   * &#x60;manual&#x60; -&gt; requires manually uploading the packages in Inventory &gt; Modules &gt; Upload package. 
   * @return source
  **/
  @JsonProperty("source")
  public String getSource() {
    if (source == null) {
      return null;
    }
    return source.value();
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }

  public AdminConfigUpdate source(SourceEnum source) {
    this.source = source;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

