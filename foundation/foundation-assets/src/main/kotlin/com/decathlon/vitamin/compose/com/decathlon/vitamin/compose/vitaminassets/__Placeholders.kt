package com.decathlon.vitamin.compose.vitaminassets

import androidx.compose.ui.graphics.vector.ImageVector
import com.decathlon.vitamin.compose.VitaminAssets
import com.decathlon.vitamin.compose.vitaminassets.placeholders.LandscapePlaceholder
import kotlin.collections.List as ____KtList

public object PlaceholdersGroup

public val VitaminAssets.Placeholders: PlaceholdersGroup
  get() = PlaceholdersGroup

private var __AllAssets: ____KtList<ImageVector>? = null

public val PlaceholdersGroup.AllAssets: ____KtList<ImageVector>
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(LandscapePlaceholder)
    return __AllAssets!!
  }
