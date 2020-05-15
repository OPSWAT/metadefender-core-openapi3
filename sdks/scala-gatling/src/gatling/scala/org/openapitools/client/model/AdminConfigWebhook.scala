
package org.openapitools.client.model


case class AdminConfigWebhook (
    /* Number of allowed retries sending callback to client when failed.  > _**For example**_: maxretrytime= 3  Sending callback failed for some reasons   * 1st retry triggered after delayduration (ms)   * 2nd retry triggered after delayduration+ delayprogression (ms)   * 3rd retry triggered after delayduration+ 2*delayprogression (ms)  */
    _maxretrytime: Option[Number],
    /* in milliseconds */
    _delayduration: Option[Number],
    /* in milliseconds */
    _deplayprogression: Option[Number]
)
object AdminConfigWebhook {
    def toStringBody(var_maxretrytime: Object, var_delayduration: Object, var_deplayprogression: Object) =
        s"""
        | {
        | "maxretrytime":$var_maxretrytime,"delayduration":$var_delayduration,"deplayprogression":$var_deplayprogression
        | }
        """.stripMargin
}
