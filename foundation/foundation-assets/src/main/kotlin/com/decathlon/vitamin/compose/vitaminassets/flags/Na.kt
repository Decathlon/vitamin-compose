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

public val FlagsGroup.Na: ImageVector
    get() {
        if (_na != null) {
            return _na!!
        }
        _na = Builder(name = "Na", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 0.0f)
                    lineTo(26.0f, 0.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 28.0f, 2.0f)
                    lineTo(28.0f, 18.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 26.0f, 20.0f)
                    lineTo(2.0f, 20.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 0.0f, 18.0f)
                    lineTo(0.0f, 2.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0C4799)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 13.3333f)
                    lineTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD243)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(4.6667f, 6.0f)
                    lineTo(3.6462f, 7.1304f)
                    lineTo(3.7239f, 5.6095f)
                    lineTo(2.203f, 5.6872f)
                    lineTo(3.3333f, 4.6667f)
                    lineTo(2.203f, 3.6462f)
                    lineTo(3.7239f, 3.7239f)
                    lineTo(3.6462f, 2.203f)
                    lineTo(4.6667f, 3.3333f)
                    lineTo(5.6872f, 2.203f)
                    lineTo(5.6095f, 3.7239f)
                    lineTo(7.1304f, 3.6462f)
                    lineTo(6.0f, 4.6667f)
                    lineTo(7.1304f, 5.6872f)
                    lineTo(5.6095f, 5.6095f)
                    lineTo(5.6872f, 7.1304f)
                    lineTo(4.6667f, 6.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1BAC55)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(6.6667f)
                    lineTo(0.0f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(3.0824f, 22.6667f)
                    lineTo(30.1707f, 5.74f)
                    lineTo(24.9176f, -2.6667f)
                    lineTo(-2.1707f, 14.26f)
                    lineTo(3.0824f, 22.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE52347)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(-0.6292f, 23.0719f)
                    lineTo(32.162f, 2.5817f)
                    lineTo(28.6292f, -3.0719f)
                    lineTo(-4.162f, 17.4183f)
                    lineTo(-0.6292f, 23.0719f)
                    close()
                }
            }
        }
        .build()
        return _na!!
    }

private var _na: ImageVector? = null
