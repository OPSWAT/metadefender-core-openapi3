
package org.openapitools.client.model


case class DLPResponseDlpInfoHits (
    _ccn: Option[DLPResponseDlpInfoHitsCcn]
)
object DLPResponseDlpInfoHits {
    def toStringBody(var_ccn: Object) =
        s"""
        | {
        | "ccn":$var_ccn
        | }
        """.stripMargin
}
