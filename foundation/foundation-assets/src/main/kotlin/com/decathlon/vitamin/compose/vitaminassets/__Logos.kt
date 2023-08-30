package com.decathlon.vitamin.compose.vitaminassets

import androidx.compose.ui.graphics.vector.ImageVector
import com.decathlon.vitamin.compose.VitaminAssets
import com.decathlon.vitamin.compose.vitaminassets.logos.DecathlonFavicon
import com.decathlon.vitamin.compose.vitaminassets.logos.DecathlonFaviconBlack
import com.decathlon.vitamin.compose.vitaminassets.logos.DecathlonLogo
import com.decathlon.vitamin.compose.vitaminassets.logos.DecathlonLogoWithOutline
import kotlin.collections.List as ____KtList

public object LogosGroup

public val VitaminAssets.Logos: LogosGroup
  get() = LogosGroup

private var __AllAssets: ____KtList<ImageVector>? = null

public val LogosGroup.AllAssets: ____KtList<ImageVector>
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(DecathlonFaviconBlack, DecathlonFavicon, DecathlonLogoWithOutline,
        DecathlonLogo)
    return __AllAssets!!
  }
