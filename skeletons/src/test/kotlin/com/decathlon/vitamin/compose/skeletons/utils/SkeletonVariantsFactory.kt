package com.decathlon.vitamin.compose.skeletons.utils

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.skeletons.VitaminSkeletons
import com.decathlon.vitamin.compose.skeletons.vtmnSkeleton

object SkeletonVariantsFactory {

    @Composable
    fun Skeleton(
        variant: Variant,
        modifier: Modifier = Modifier
    ) {
        when (variant) {
            Variant.Rectangular -> VitaminSkeletons.Rectangular(
                modifier = modifier
            )
            Variant.Rounded -> VitaminSkeletons.Rounded(
                modifier = modifier
            )
        }
    }

    @Composable
    fun SkeletonExtension(
        variant: Variant,
        modifier: Modifier = Modifier
    ) {
        when (variant) {
            Variant.Rectangular -> Box(modifier = modifier.vtmnSkeleton(shape = RectangleShape))
            Variant.Rounded -> Box(modifier = modifier.vtmnSkeleton(shape = CircleShape))
        }
    }
}
