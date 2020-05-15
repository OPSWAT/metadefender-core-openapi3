#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "admin_config_update.h"


char* sourceadmin_config_update_ToString(metadefender_core_admin_config_update_SOURCE_e source) {
    char* sourceArray[] =  { "NULL", "internet", "folder", "manual" };
	return sourceArray[source];
}

metadefender_core_admin_config_update_SOURCE_e sourceadmin_config_update_FromString(char* source){
    int stringToReturn = 0;
    char *sourceArray[] =  { "NULL", "internet", "folder", "manual" };
    size_t sizeofArray = sizeof(sourceArray) / sizeof(sourceArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(source, sourceArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

admin_config_update_t *admin_config_update_create(
    int autoupdateperiod,
    int deleteafterimport,
    list_t *disabledupdate,
    char *pickupfolder,
    metadefender_core_admin_config_update_SOURCE_e source
    ) {
    admin_config_update_t *admin_config_update_local_var = malloc(sizeof(admin_config_update_t));
    if (!admin_config_update_local_var) {
        return NULL;
    }
    admin_config_update_local_var->autoupdateperiod = autoupdateperiod;
    admin_config_update_local_var->deleteafterimport = deleteafterimport;
    admin_config_update_local_var->disabledupdate = disabledupdate;
    admin_config_update_local_var->pickupfolder = pickupfolder;
    admin_config_update_local_var->source = source;

    return admin_config_update_local_var;
}


void admin_config_update_free(admin_config_update_t *admin_config_update) {
    if(NULL == admin_config_update){
        return ;
    }
    listEntry_t *listEntry;
    list_ForEach(listEntry, admin_config_update->disabledupdate) {
        admin_config_update_disabledupdate_free(listEntry->data);
    }
    list_free(admin_config_update->disabledupdate);
    free(admin_config_update->pickupfolder);
    free(admin_config_update);
}

cJSON *admin_config_update_convertToJSON(admin_config_update_t *admin_config_update) {
    cJSON *item = cJSON_CreateObject();

    // admin_config_update->autoupdateperiod
    if(admin_config_update->autoupdateperiod) { 
    if(cJSON_AddNumberToObject(item, "autoupdateperiod", admin_config_update->autoupdateperiod) == NULL) {
    goto fail; //Numeric
    }
     } 


    // admin_config_update->deleteafterimport
    if(admin_config_update->deleteafterimport) { 
    if(cJSON_AddBoolToObject(item, "deleteafterimport", admin_config_update->deleteafterimport) == NULL) {
    goto fail; //Bool
    }
     } 


    // admin_config_update->disabledupdate
    if(admin_config_update->disabledupdate) { 
    cJSON *disabledupdate = cJSON_AddArrayToObject(item, "disabledupdate");
    if(disabledupdate == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *disabledupdateListEntry;
    if (admin_config_update->disabledupdate) {
    list_ForEach(disabledupdateListEntry, admin_config_update->disabledupdate) {
    cJSON *itemLocal = admin_config_update_disabledupdate_convertToJSON(disabledupdateListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(disabledupdate, itemLocal);
    }
    }
     } 


    // admin_config_update->pickupfolder
    if(admin_config_update->pickupfolder) { 
    if(cJSON_AddStringToObject(item, "pickupfolder", admin_config_update->pickupfolder) == NULL) {
    goto fail; //String
    }
     } 


    // admin_config_update->source
    
    if(cJSON_AddStringToObject(item, "source", sourceadmin_config_update_ToString(admin_config_update->source)) == NULL)
    {
    goto fail; //Enum
    }
    

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

admin_config_update_t *admin_config_update_parseFromJSON(cJSON *admin_config_updateJSON){

    admin_config_update_t *admin_config_update_local_var = NULL;

    // admin_config_update->autoupdateperiod
    cJSON *autoupdateperiod = cJSON_GetObjectItemCaseSensitive(admin_config_updateJSON, "autoupdateperiod");
    if (autoupdateperiod) { 
    if(!cJSON_IsNumber(autoupdateperiod))
    {
    goto end; //Numeric
    }
    }

    // admin_config_update->deleteafterimport
    cJSON *deleteafterimport = cJSON_GetObjectItemCaseSensitive(admin_config_updateJSON, "deleteafterimport");
    if (deleteafterimport) { 
    if(!cJSON_IsBool(deleteafterimport))
    {
    goto end; //Bool
    }
    }

    // admin_config_update->disabledupdate
    cJSON *disabledupdate = cJSON_GetObjectItemCaseSensitive(admin_config_updateJSON, "disabledupdate");
    list_t *disabledupdateList;
    if (disabledupdate) { 
    cJSON *disabledupdate_local_nonprimitive;
    if(!cJSON_IsArray(disabledupdate)){
        goto end; //nonprimitive container
    }

    disabledupdateList = list_create();

    cJSON_ArrayForEach(disabledupdate_local_nonprimitive,disabledupdate )
    {
        if(!cJSON_IsObject(disabledupdate_local_nonprimitive)){
            goto end;
        }
        admin_config_update_disabledupdate_t *disabledupdateItem = admin_config_update_disabledupdate_parseFromJSON(disabledupdate_local_nonprimitive);

        list_addElement(disabledupdateList, disabledupdateItem);
    }
    }

    // admin_config_update->pickupfolder
    cJSON *pickupfolder = cJSON_GetObjectItemCaseSensitive(admin_config_updateJSON, "pickupfolder");
    if (pickupfolder) { 
    if(!cJSON_IsString(pickupfolder))
    {
    goto end; //String
    }
    }

    // admin_config_update->source
    cJSON *source = cJSON_GetObjectItemCaseSensitive(admin_config_updateJSON, "source");
    metadefender_core_admin_config_update_SOURCE_e sourceVariable;
    if (source) { 
    if(!cJSON_IsString(source))
    {
    goto end; //Enum
    }
    sourceVariable = sourceadmin_config_update_FromString(source->valuestring);
    }


    admin_config_update_local_var = admin_config_update_create (
        autoupdateperiod ? autoupdateperiod->valuedouble : 0,
        deleteafterimport ? deleteafterimport->valueint : 0,
        disabledupdate ? disabledupdateList : NULL,
        pickupfolder ? strdup(pickupfolder->valuestring) : NULL,
        source ? sourceVariable : -1
        );

    return admin_config_update_local_var;
end:
    return NULL;

}
