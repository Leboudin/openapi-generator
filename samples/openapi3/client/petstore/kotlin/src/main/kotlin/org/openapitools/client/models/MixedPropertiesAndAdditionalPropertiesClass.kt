/**
* OpenAPI Petstore
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.Animal

import com.squareup.moshi.Json
import java.io.Serializable
/**
 * 
 * @param uuid 
 * @param dateTime 
 * @param map 
 */

data class MixedPropertiesAndAdditionalPropertiesClass (
    @Json(name = "uuid")
    val uuid: java.util.UUID? = null,
    @Json(name = "dateTime")
    val dateTime: java.time.OffsetDateTime? = null,
    @Json(name = "map")
    val map: kotlin.collections.Map<kotlin.String, Animal>? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

