
package org.openapitools.client.model


case class DLPResponseDlpInfoWatermark (
    /* Result of the watermarking process, possible values: * `added` * `not added` * `failed to add`  */
    _result: Option[String]
)
object DLPResponseDlpInfoWatermark {
    def toStringBody(var_result: Object) =
        s"""
        | {
        | "result":$var_result
        | }
        """.stripMargin
}
