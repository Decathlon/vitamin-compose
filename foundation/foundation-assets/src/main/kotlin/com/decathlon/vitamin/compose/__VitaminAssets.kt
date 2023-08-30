package com.decathlon.vitamin.compose

import androidx.compose.ui.graphics.vector.ImageVector
import com.decathlon.vitamin.compose.vitaminassets.AllAssets
import com.decathlon.vitamin.compose.vitaminassets.Flags
import com.decathlon.vitamin.compose.vitaminassets.Logos
import com.decathlon.vitamin.compose.vitaminassets.Payments
import com.decathlon.vitamin.compose.vitaminassets.Placeholders
import com.decathlon.vitamin.compose.vitaminassets.Shipping
import kotlin.collections.List as ____KtList

public object VitaminAssets

private var __AllAssets: ____KtList<ImageVector>? = null

public val VitaminAssets.AllAssets: ____KtList<ImageVector>
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= Shipping.AllAssets + Logos.AllAssets + Flags.AllAssets + Payments.AllAssets +
        Placeholders.AllAssets + listOf()
    return __AllAssets!!
  }
