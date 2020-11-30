package com.darkos.mvu.validation

import com.darkos.mvu.EffectHandler
import com.darkos.mvu.model.flow.FlowEffect
import com.darkos.mvu.model.flow.FlowMessage
import kotlinx.coroutines.flow.Flow

interface IValidationHandler : EffectHandler {
    override suspend fun call(effect: FlowEffect): Flow<FlowMessage> {
        throw IllegalStateException("this handler does not support calling as Flow")
    }
}