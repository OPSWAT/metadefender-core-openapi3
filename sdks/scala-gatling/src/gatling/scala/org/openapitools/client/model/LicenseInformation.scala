
package org.openapitools.client.model


case class LicenseInformation (
    /* Number of days left before expiration */
    _daysLeft: Option[Integer],
    /* Unique identifier which is maps the current deployment to the activation */
    _deployment: Option[String],
    /* Expiration date in MM/DD/YYYY format. */
    _expiration: Option[String],
    /* List of engine/module identifiers that have been licensed */
    _licensedEngines: Option[List[String]],
    /* Total number of deployed MetaDefender Nodes attached to this MetaDefender Core instance. */
    _maxNodeCount: Option[String],
    /* Track online/offline activation mode */
    _onlineActivated: Option[Boolean],
    /* Official MetaDefender base SKU licensed. */
    _productId: Option[String],
    /* Official MetaDefender base product name licensed. */
    _productName: Option[String]
)
object LicenseInformation {
    def toStringBody(var_daysLeft: Object, var_deployment: Object, var_expiration: Object, var_licensedEngines: Object, var_maxNodeCount: Object, var_onlineActivated: Object, var_productId: Object, var_productName: Object) =
        s"""
        | {
        | "daysLeft":$var_daysLeft,"deployment":$var_deployment,"expiration":$var_expiration,"licensedEngines":$var_licensedEngines,"maxNodeCount":$var_maxNodeCount,"onlineActivated":$var_onlineActivated,"productId":$var_productId,"productName":$var_productName
        | }
        """.stripMargin
}
