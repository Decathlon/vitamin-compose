package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Github: ImageVector
    get() {
        if (_github != null) {
            return _github!!
        }
        _github = Builder(name = "Github", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.475f, 2.0f, 2.0f, 6.475f, 2.0f, 12.0f)
                curveTo(1.9989f, 14.0993f, 2.6588f, 16.1456f, 3.8862f, 17.8487f)
                curveTo(5.1136f, 19.5517f, 6.8461f, 20.8251f, 8.838f, 21.488f)
                curveTo(9.338f, 21.575f, 9.525f, 21.275f, 9.525f, 21.012f)
                curveTo(9.525f, 20.775f, 9.512f, 19.988f, 9.512f, 19.15f)
                curveTo(7.0f, 19.613f, 6.35f, 18.538f, 6.15f, 17.975f)
                curveTo(6.037f, 17.687f, 5.55f, 16.8f, 5.125f, 16.562f)
                curveTo(4.775f, 16.375f, 4.275f, 15.912f, 5.112f, 15.9f)
                curveTo(5.9f, 15.887f, 6.462f, 16.625f, 6.65f, 16.925f)
                curveTo(7.55f, 18.437f, 8.988f, 18.012f, 9.562f, 17.75f)
                curveTo(9.65f, 17.1f, 9.912f, 16.663f, 10.2f, 16.413f)
                curveTo(7.975f, 16.163f, 5.65f, 15.3f, 5.65f, 11.475f)
                curveTo(5.65f, 10.387f, 6.037f, 9.488f, 6.675f, 8.787f)
                curveTo(6.575f, 8.537f, 6.225f, 7.512f, 6.775f, 6.137f)
                curveTo(6.775f, 6.137f, 7.612f, 5.875f, 9.525f, 7.163f)
                curveTo(10.3391f, 6.9371f, 11.1802f, 6.8233f, 12.025f, 6.825f)
                curveTo(12.875f, 6.825f, 13.725f, 6.937f, 14.525f, 7.162f)
                curveTo(16.437f, 5.862f, 17.275f, 6.138f, 17.275f, 6.138f)
                curveTo(17.825f, 7.513f, 17.475f, 8.538f, 17.375f, 8.788f)
                curveTo(18.012f, 9.488f, 18.4f, 10.375f, 18.4f, 11.475f)
                curveTo(18.4f, 15.313f, 16.063f, 16.163f, 13.838f, 16.413f)
                curveTo(14.2f, 16.725f, 14.513f, 17.325f, 14.513f, 18.263f)
                curveTo(14.513f, 19.6f, 14.5f, 20.675f, 14.5f, 21.013f)
                curveTo(14.5f, 21.275f, 14.688f, 21.587f, 15.188f, 21.487f)
                curveTo(17.173f, 20.8168f, 18.8979f, 19.541f, 20.1199f, 17.8392f)
                curveTo(21.3419f, 16.1373f, 21.9994f, 14.0951f, 22.0f, 12.0f)
                curveTo(22.0f, 6.475f, 17.525f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _github!!
    }

private var _github: ImageVector? = null
