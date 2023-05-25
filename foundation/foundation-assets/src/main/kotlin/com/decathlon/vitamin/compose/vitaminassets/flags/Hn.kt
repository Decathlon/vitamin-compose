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

public val FlagsGroup.Hn: ImageVector
    get() {
        if (_hn != null) {
            return _hn!!
        }
        _hn = Builder(name = "Hn", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(-1.0E-4f, 0.0f)
                    curveTo(9.3332f, 1.0E-4f, 18.6665f, 0.0f, 27.9999f, 0.0f)
                    curveTo(27.9999f, 6.6667f, 27.9999f, 13.3333f, 27.9999f, 20.0f)
                    curveTo(18.6666f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    lineTo(-1.0E-4f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0884E6)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(-1.0E-4f, 6.6667f)
                    horizontalLineTo(27.9999f)
                    verticalLineTo(0.0f)
                    lineTo(-1.0E-4f, 0.0f)
                    verticalLineTo(6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0884E6)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(27.9999f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(-1.0E-4f)
                    lineTo(0.0f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0E88E9)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(13.9999f, 10.6667f)
                    lineTo(13.0571f, 10.9428f)
                    lineTo(13.3332f, 10.0f)
                    lineTo(13.0571f, 9.0572f)
                    lineTo(13.9999f, 9.3334f)
                    lineTo(14.9427f, 9.0572f)
                    lineTo(14.6665f, 10.0f)
                    lineTo(14.9427f, 10.9428f)
                    lineTo(13.9999f, 10.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0E88E9)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(19.3332f, 9.3334f)
                    lineTo(18.3904f, 9.6095f)
                    lineTo(18.6665f, 8.6667f)
                    lineTo(18.3904f, 7.7239f)
                    lineTo(19.3332f, 8.0f)
                    lineTo(20.276f, 7.7239f)
                    lineTo(19.9999f, 8.6667f)
                    lineTo(20.276f, 9.6095f)
                    lineTo(19.3332f, 9.3334f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0E88E9)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(19.3332f, 12.0f)
                    lineTo(18.3904f, 12.2762f)
                    lineTo(18.6665f, 11.3333f)
                    lineTo(18.3904f, 10.3905f)
                    lineTo(19.3332f, 10.6667f)
                    lineTo(20.276f, 10.3905f)
                    lineTo(19.9999f, 11.3333f)
                    lineTo(20.276f, 12.2762f)
                    lineTo(19.3332f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0E88E9)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.6665f, 12.0f)
                    lineTo(7.7237f, 12.2762f)
                    lineTo(7.9999f, 11.3333f)
                    lineTo(7.7237f, 10.3905f)
                    lineTo(8.6665f, 10.6667f)
                    lineTo(9.6094f, 10.3905f)
                    lineTo(9.3332f, 11.3333f)
                    lineTo(9.6094f, 12.2762f)
                    lineTo(8.6665f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0E88E9)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.6665f, 9.3334f)
                    lineTo(7.7237f, 9.6095f)
                    lineTo(7.9999f, 8.6667f)
                    lineTo(7.7237f, 7.7239f)
                    lineTo(8.6665f, 8.0f)
                    lineTo(9.6094f, 7.7239f)
                    lineTo(9.3332f, 8.6667f)
                    lineTo(9.6094f, 9.6095f)
                    lineTo(8.6665f, 9.3334f)
                    close()
                }
            }
        }
        .build()
        return _hn!!
    }

private var _hn: ImageVector? = null
