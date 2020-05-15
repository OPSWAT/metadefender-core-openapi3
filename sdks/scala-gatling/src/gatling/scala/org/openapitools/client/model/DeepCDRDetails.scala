
package org.openapitools.client.model


case class DeepCDRDetails (
    /* Action was successful or not. */
    _description: Option[String],
    /* List of all sanitized objects */
    _details: Option[List[DeepCDRDetailsDetails]]
)
object DeepCDRDetails {
    def toStringBody(var_description: Object, var_details: Object) =
        s"""
        | {
        | "description":$var_description,"details":$var_details
        | }
        """.stripMargin
}
