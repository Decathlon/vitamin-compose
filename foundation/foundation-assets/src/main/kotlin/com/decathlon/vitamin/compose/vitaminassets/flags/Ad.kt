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

public val FlagsGroup.Ad: ImageVector
    get() {
        if (_ad != null) {
            return _ad!!
        }
        _ad = Builder(name = "Ad", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(27.9997f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, -0.0f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1537D1)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    lineTo(28.0f, 20.0f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFEA3058)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.6667f, 0.0f)
                    horizontalLineTo(28.0f)
                    lineTo(28.0f, 20.0f)
                    horizontalLineTo(18.6667f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFCF3C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.3333f, 20.0f)
                    horizontalLineTo(18.6667f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(9.3333f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFEDB1)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.6667f, 8.6667f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(12.6667f)
                    verticalLineTo(8.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFD32E28)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(15.2755f, 8.6667f)
                    horizontalLineTo(12.7245f)
                    lineTo(12.8958f, 10.722f)
                    curveTo(12.9246f, 11.0676f, 13.2135f, 11.3333f, 13.5602f, 11.3333f)
                    horizontalLineTo(14.4398f)
                    curveTo(14.7865f, 11.3333f, 15.0754f, 11.0676f, 15.1042f, 10.722f)
                    lineTo(15.2755f, 8.6667f)
                    close()
                    moveTo(12.7245f, 8.0f)
                    curveTo(12.3345f, 8.0f, 12.0278f, 8.3334f, 12.0602f, 8.722f)
                    lineTo(12.2314f, 10.7774f)
                    curveTo(12.289f, 11.4685f, 12.8667f, 12.0f, 13.5602f, 12.0f)
                    horizontalLineTo(14.4398f)
                    curveTo(15.1333f, 12.0f, 15.711f, 11.4684f, 15.7686f, 10.7774f)
                    lineTo(15.9398f, 8.722f)
                    curveTo(15.9722f, 8.3334f, 15.6655f, 8.0f, 15.2755f, 8.0f)
                    horizontalLineTo(12.7245f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFD32E28)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.6667f, 9.3333f)
                    lineTo(15.3333f, 9.3333f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(12.6667f)
                    verticalLineTo(9.3333f)
                    close()
                }
            }
        }
        .build()
        return _ad!!
    }

private var _ad: ImageVector? = null
