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

public val FlagsGroup.Aw: ImageVector
    get() {
        if (_aw != null) {
            return _aw!!
        }
        _aw = Builder(name = "Aw", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    curveTo(9.3334f, 0.0f, 18.6667f, -1.0E-4f, 28.0001f, 0.0f)
                    verticalLineTo(20.0f)
                    curveTo(18.6667f, 20.0f, 9.3334f, 20.0f, 1.0E-4f, 20.0f)
                    curveTo(1.0E-4f, 13.3333f, 4.0E-4f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF4189DD)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    lineTo(28.0001f, 0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(1.0E-4f)
                    lineTo(0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFD21034)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(4.6494f, 3.9809f)
                    lineTo(5.3351f, 2.6667f)
                    lineTo(6.0209f, 3.9809f)
                    lineTo(7.3351f, 4.6667f)
                    lineTo(6.0209f, 5.3524f)
                    lineTo(5.3351f, 6.6667f)
                    lineTo(4.6494f, 5.3524f)
                    lineTo(3.3352f, 4.6667f)
                    lineTo(4.6494f, 3.9809f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(4.6494f, 3.9809f)
                    lineTo(5.3351f, 2.6667f)
                    lineTo(6.0209f, 3.9809f)
                    lineTo(7.3351f, 4.6667f)
                    lineTo(6.0209f, 5.3524f)
                    lineTo(5.3351f, 6.6667f)
                    lineTo(4.6494f, 5.3524f)
                    lineTo(3.3352f, 4.6667f)
                    lineTo(4.6494f, 3.9809f)
                    close()
                    moveTo(4.1553f, 5.8466f)
                    lineTo(5.3351f, 8.1078f)
                    lineTo(6.515f, 5.8466f)
                    lineTo(8.7763f, 4.6667f)
                    lineTo(6.515f, 3.4868f)
                    lineTo(5.3351f, 1.2256f)
                    lineTo(4.1553f, 3.4868f)
                    lineTo(1.8941f, 4.6667f)
                    lineTo(4.1553f, 5.8466f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF9D616)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.0E-4f, 14.6667f)
                    horizontalLineTo(28.0001f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(1.0E-4f)
                    verticalLineTo(14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF9D616)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.0E-4f, 12.0f)
                    horizontalLineTo(28.0001f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(1.0E-4f)
                    verticalLineTo(12.0f)
                    close()
                }
            }
        }
        .build()
        return _aw!!
    }

private var _aw: ImageVector? = null
