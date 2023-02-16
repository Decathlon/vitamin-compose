package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Refresh: ImageVector
    get() {
        if (_refresh != null) {
            return _refresh!!
        }
        _refresh = Builder(name = "Refresh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.4207f, 5.0054f)
                curveTo(5.2767f, 3.9833f, 6.5624f, 3.3333f, 8.0f, 3.3333f)
                curveTo(10.5773f, 3.3333f, 12.6666f, 5.4227f, 12.6666f, 8.0f)
                curveTo(12.6666f, 8.2079f, 12.653f, 8.4127f, 12.6267f, 8.6134f)
                lineTo(11.8666f, 7.6f)
                lineTo(10.8f, 8.4f)
                lineTo(13.3333f, 11.7778f)
                lineTo(15.8666f, 8.4f)
                lineTo(14.8f, 7.6f)
                lineTo(13.9567f, 8.7244f)
                curveTo(13.9853f, 8.4869f, 14.0f, 8.2452f, 14.0f, 8.0f)
                curveTo(14.0f, 4.6863f, 11.3137f, 2.0f, 8.0f, 2.0f)
                curveTo(6.2636f, 2.0f, 4.6996f, 2.7376f, 3.604f, 3.9164f)
                lineTo(4.4207f, 5.0054f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 12.6667f)
                curveTo(9.4375f, 12.6667f, 10.7232f, 12.0167f, 11.5792f, 10.9946f)
                lineTo(12.396f, 12.0836f)
                curveTo(11.3004f, 13.2625f, 9.7363f, 14.0f, 8.0f, 14.0f)
                curveTo(4.6863f, 14.0f, 2.0f, 11.3137f, 2.0f, 8.0f)
                curveTo(2.0f, 7.7548f, 2.0147f, 7.5131f, 2.0433f, 7.2756f)
                lineTo(1.2f, 8.4f)
                lineTo(0.1333f, 7.6f)
                lineTo(2.6666f, 4.2222f)
                lineTo(5.2f, 7.6f)
                lineTo(4.1333f, 8.4f)
                lineTo(3.3733f, 7.3866f)
                curveTo(3.3469f, 7.5873f, 3.3333f, 7.7921f, 3.3333f, 8.0f)
                curveTo(3.3333f, 10.5773f, 5.4226f, 12.6667f, 8.0f, 12.6667f)
                close()
            }
        }
        .build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null
