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
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 0.0f, 28.0f, 0.8954f, 28.0f, 2.0f)
                    curveTo(28.0f, 8.0f, 28.0f, 14.0f, 28.0f, 20.0f)
                    horizontalLineTo(0.0f)
                    curveTo(0.0f, 20.0f, 0.0f, 19.1046f, 0.0f, 18.0f)
                    curveTo(0.0f, 12.0f, 0.0f, 6.0f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0C4799)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 13.3333f)
                    lineTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 13.3333f)
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
                    lineTo(28.0f, 6.6667f)
                    lineTo(0.0f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(7.0f, 20.0f)
                    lineTo(28.0f, 7.0f)
                    verticalLineTo(0.0f)
                    lineTo(20.5f, 0.0f)
                    lineTo(0.0f, 12.5f)
                    verticalLineTo(20.0f)
                    lineTo(7.0f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE52347)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(4.5f, 20.0f)
                    lineTo(28.0f, 5.0f)
                    verticalLineTo(0.0f)
                    lineTo(23.5f, 0.0f)
                    lineTo(0.0f, 14.5f)
                    verticalLineTo(20.0f)
                    lineTo(4.5f, 20.0f)
                    close()
                }
            }
        }
        .build()
        return _na!!
    }

private var _na: ImageVector? = null
