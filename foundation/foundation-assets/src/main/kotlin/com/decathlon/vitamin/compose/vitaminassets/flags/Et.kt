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

public val FlagsGroup.Et: ImageVector
    get() {
        if (_et != null) {
            return _et!!
        }
        _et = Builder(name = "Et", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF20AA46)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE92F3B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFADF50)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 13.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF205CCA)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 14.6667f)
                    curveTo(16.5774f, 14.6667f, 18.6667f, 12.5773f, 18.6667f, 10.0f)
                    curveTo(18.6667f, 7.4227f, 16.5774f, 5.3333f, 14.0f, 5.3333f)
                    curveTo(11.4227f, 5.3333f, 9.3334f, 7.4227f, 9.3334f, 10.0f)
                    curveTo(9.3334f, 12.5773f, 11.4227f, 14.6667f, 14.0f, 14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFFFDB3D)),
                        strokeLineWidth = 0.666667f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(14.1935f, 11.0286f)
                    lineTo(14.0f, 10.8906f)
                    lineTo(13.8065f, 11.0286f)
                    lineTo(12.6576f, 11.8475f)
                    lineTo(13.0815f, 10.5019f)
                    lineTo(13.1529f, 10.2752f)
                    lineTo(12.9619f, 10.1338f)
                    lineTo(11.828f, 9.2943f)
                    lineTo(13.2388f, 9.2816f)
                    lineTo(13.4765f, 9.2795f)
                    lineTo(13.5519f, 9.0541f)
                    lineTo(14.0f, 7.7163f)
                    lineTo(14.448f, 9.0541f)
                    lineTo(14.5235f, 9.2795f)
                    lineTo(14.7611f, 9.2816f)
                    lineTo(16.1719f, 9.2943f)
                    lineTo(15.038f, 10.1338f)
                    lineTo(14.847f, 10.2752f)
                    lineTo(14.9184f, 10.5019f)
                    lineTo(15.3423f, 11.8475f)
                    lineTo(14.1935f, 11.0286f)
                    close()
                }
            }
        }
        .build()
        return _et!!
    }

private var _et: ImageVector? = null
