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

public val FlagsGroup.In: ImageVector
    get() {
        if (_in != null) {
            return _in!!
        }
        _in = Builder(name = "In", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, -0.0f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFA44A)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1A9F0B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF181A93)), stroke = null, fillAlpha = 0.15f,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(14.0f, 12.0f)
                    curveTo(15.1046f, 12.0f, 16.0f, 11.1046f, 16.0f, 10.0f)
                    curveTo(16.0f, 8.8954f, 15.1046f, 8.0f, 14.0f, 8.0f)
                    curveTo(12.8955f, 8.0f, 12.0f, 8.8954f, 12.0f, 10.0f)
                    curveTo(12.0f, 11.1046f, 12.8955f, 12.0f, 14.0f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF181A93)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(16.6667f, 10.0f)
                    curveTo(16.6667f, 11.4728f, 15.4728f, 12.6667f, 14.0f, 12.6667f)
                    curveTo(12.5273f, 12.6667f, 11.3334f, 11.4728f, 11.3334f, 10.0f)
                    curveTo(11.3334f, 8.5272f, 12.5273f, 7.3333f, 14.0f, 7.3333f)
                    curveTo(15.4728f, 7.3333f, 16.6667f, 8.5272f, 16.6667f, 10.0f)
                    close()
                    moveTo(16.0f, 10.0f)
                    curveTo(16.0f, 11.1046f, 15.1046f, 12.0f, 14.0f, 12.0f)
                    curveTo(12.8955f, 12.0f, 12.0f, 11.1046f, 12.0f, 10.0f)
                    curveTo(12.0f, 8.8954f, 12.8955f, 8.0f, 14.0f, 8.0f)
                    curveTo(15.1046f, 8.0f, 16.0f, 8.8954f, 16.0f, 10.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF181A93)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 10.6667f)
                    curveTo(14.3682f, 10.6667f, 14.6667f, 10.3682f, 14.6667f, 10.0f)
                    curveTo(14.6667f, 9.6318f, 14.3682f, 9.3333f, 14.0f, 9.3333f)
                    curveTo(13.6318f, 9.3333f, 13.3334f, 9.6318f, 13.3334f, 10.0f)
                    curveTo(13.3334f, 10.3682f, 13.6318f, 10.6667f, 14.0f, 10.6667f)
                    close()
                }
            }
        }
        .build()
        return _in!!
    }

private var _in: ImageVector? = null
