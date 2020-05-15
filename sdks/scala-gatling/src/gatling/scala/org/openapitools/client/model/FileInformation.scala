
package org.openapitools.client.model


case class FileInformation (
    /* The filename reported via `filename` header. */
    _displayName: Option[String],
    /* Total file size in bytes. */
    _fileSize: Option[Integer],
    /* The filetype using mimetype. */
    _fileType: Option[String],
    /* The filetype in human readable format. */
    _fileTypeDescription: Option[String],
    /* File's MD5 hash. */
    _md5: Option[String],
    /* File's SHA1 hash. */
    _sha1: Option[String],
    /* File's SHA256 Hash. */
    _sha256: Option[String],
    /* The timestamp when file was successfully uploaded to MetaDefender. */
    _uploadTimestamp: Option[String]
)
object FileInformation {
    def toStringBody(var_displayName: Object, var_fileSize: Object, var_fileType: Object, var_fileTypeDescription: Object, var_md5: Object, var_sha1: Object, var_sha256: Object, var_uploadTimestamp: Object) =
        s"""
        | {
        | "displayName":$var_displayName,"fileSize":$var_fileSize,"fileType":$var_fileType,"fileTypeDescription":$var_fileTypeDescription,"md5":$var_md5,"sha1":$var_sha1,"sha256":$var_sha256,"uploadTimestamp":$var_uploadTimestamp
        | }
        """.stripMargin
}
