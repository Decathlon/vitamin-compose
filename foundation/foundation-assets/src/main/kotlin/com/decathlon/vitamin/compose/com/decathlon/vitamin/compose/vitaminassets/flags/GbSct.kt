package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
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
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, -0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(-0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1479D0)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0003f, -0.0036f)
                    horizontalLineTo(3.0E-4f)
                    verticalLineTo(19.9964f)
                    horizontalLineTo(28.0003f)
                    verticalLineTo(-0.0036f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0004f, 8.3882f)
                    lineTo(1.5f, 0.0f)
                    lineTo(0.0f, -0.0f)
                    lineTo(0.0f, 2.0f)
                    lineTo(11.616f, 9.9964f)
                    lineTo(0.0f, 17.5f)
                    verticalLineTo(20.0f)
                    lineTo(1.5f, 20.0f)
                    lineTo(14.0004f, 11.6047f)
                    lineTo(26.5f, 20.0f)
                    lineTo(28.0f, 20.0f)
                    verticalLineTo(18.0f)
                    lineTo(16.3848f, 9.9964f)
                    lineTo(28.0f, 2.0f)
                    verticalLineTo(-0.0f)
                    lineTo(26.5f, 0.0f)
                    lineTo(14.0004f, 8.3882f)
                    close()
                }
            }
        }
        .build()
        return _gbSct!!
    }

private var _gbSct: ImageVector? = null
