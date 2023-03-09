package com.decathlon.vitamin.compose

import androidx.compose.ui.graphics.vector.ImageVector
import com.decathlon.vitamin.compose.vitaminicons.AllAssets
import com.decathlon.vitamin.compose.vitaminicons.Fill
import com.decathlon.vitamin.compose.vitaminicons.Line
import kotlin.collections.List as ____KtList

public object VitaminIcons

private var __AllAssets: ____KtList<ImageVector>? = null

public val VitaminIcons.AllAssets: ____KtList<ImageVector>
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= Line.AllAssets + Fill.AllAssets + listOf()
    return __AllAssets!!
  }
