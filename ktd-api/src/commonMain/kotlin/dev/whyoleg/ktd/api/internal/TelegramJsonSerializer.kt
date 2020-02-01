package dev.whyoleg.ktd.api.internal

import dev.whyoleg.ktd.api.*
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlinx.serialization.modules.*

internal class TelegramJsonSerializer(module: SerialModule) {
    private val json = Json(jsonConfiguration, module)

    fun parse(string: String): TelegramApiResponse = json.parse(
        responseSerializer, string
    )

    fun stringify(request: TelegramApiRequest): String = json.stringify(
        requestSerializer, request
    )

    companion object {
        private val jsonConfiguration = JsonConfiguration.Stable.copy(classDiscriminator = "@type")
        private val responseSerializer = PolymorphicSerializer(TelegramApiResponse::class)
        private val requestSerializer = PolymorphicSerializer(TelegramRequest::class)
    }
}
