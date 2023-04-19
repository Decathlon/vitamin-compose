package com.decathlon.vitamin.compose.vitaminassets

import androidx.compose.ui.graphics.vector.ImageVector
import com.decathlon.vitamin.compose.VitaminAssets
import com.decathlon.vitamin.compose.vitaminassets.shipping.Colissimo
import com.decathlon.vitamin.compose.vitaminassets.shipping.MondialRelay
import kotlin.collections.List as ____KtList

public object ShippingGroup

public val VitaminAssets.Shipping: ShippingGroup
  get() = ShippingGroup

private var __AllAssets: ____KtList<ImageVector>? = null

public val ShippingGroup.AllAssets: ____KtList<ImageVector>
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(MondialRelay, Colissimo)
    return __AllAssets!!
  }
