package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.FlagsGroup

public val FlagsGroup.GbSct: ImageVector
    get() {
        if (_gbSct != null) {
            return _gbSct!!
        }
        _gbSct = Builder(name = "GbSct", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp,
                viewportWidth = 28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(13.9999f,-3.05176E-5f), end = Offset(13.9999f,20.0f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(27.9999f, -0.0f)
                    horizontalLineTo(-1.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(27.9999f)
                    verticalLineTo(-0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF1479D0), 1.0f to Color(0xFF0A68BA),
                        start = Offset(14.0003f,-0.00360107f), end = Offset(14.0003f,19.9964f)),
                        stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin
                        = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0003f, -0.0036f)
                    horizontalLineTo(3.0E-4f)
                    verticalLineTo(19.9964f)
                    horizontalLineTo(28.0003f)
                    verticalLineTo(-0.0036f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0003f,-1.92001f), end = Offset(14.0003f,21.9129f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(14.0003f, 8.3881f)
                    lineTo(-1.2821f, -1.92f)
                    lineTo(-2.7733f, 0.2908f)
                    lineTo(11.6159f, 9.9964f)
                    lineTo(-2.7733f, 19.7021f)
                    lineTo(-1.2821f, 21.9129f)
                    lineTo(14.0003f, 11.6047f)
                    lineTo(29.2828f, 21.9129f)
                    lineTo(30.774f, 19.7021f)
                    lineTo(16.3847f, 9.9964f)
                    lineTo(30.774f, 0.2908f)
                    lineTo(29.2828f, -1.92f)
                    lineTo(14.0003f, 8.3881f)
                    close()
                }
            }
        }
        .build()
        return _gbSct!!
    }

private var _gbSct: ImageVector? = null
