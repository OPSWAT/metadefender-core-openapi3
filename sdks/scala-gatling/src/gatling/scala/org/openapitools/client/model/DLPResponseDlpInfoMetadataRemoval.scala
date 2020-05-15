
package org.openapitools.client.model


case class DLPResponseDlpInfoMetadataRemoval (
    /* Result of the metadata removal process, possible values: * `removed` * `not removed` * `failed to remove`  */
    _result: Option[String]
)
object DLPResponseDlpInfoMetadataRemoval {
    def toStringBody(var_result: Object) =
        s"""
        | {
        | "result":$var_result
        | }
        """.stripMargin
}
