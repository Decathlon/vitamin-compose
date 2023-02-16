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

public val FlagsGroup.Sz: ImageVector
    get() {
        if (_sz != null) {
            return _sz!!
        }
        _sz = Builder(name = "Sz", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF486BCA)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 4.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(4.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF486BCA)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFDF20)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 16.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(16.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFCF1615)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 14.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(5.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 13.3333f)
                    curveTo(17.3137f, 13.3333f, 20.0f, 10.0f, 20.0f, 10.0f)
                    curveTo(20.0f, 10.0f, 17.3137f, 6.6667f, 14.0f, 6.6667f)
                    curveTo(10.6863f, 6.6667f, 8.0f, 10.0f, 8.0f, 10.0f)
                    curveTo(8.0f, 10.0f, 10.6863f, 13.3333f, 14.0f, 13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.6665f, 6.6667f)
                    horizontalLineTo(7.9998f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(13.3332f)
                    lineTo(14.6665f, 6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1A1A1A)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(15.3332f, 10.6667f)
                    curveTo(15.7014f, 10.6667f, 15.9998f, 10.3682f, 15.9998f, 10.0f)
                    curveTo(15.9998f, 9.6318f, 15.7014f, 9.3334f, 15.3332f, 9.3334f)
                    curveTo(14.965f, 9.3334f, 14.6665f, 9.6318f, 14.6665f, 10.0f)
                    curveTo(14.6665f, 10.3682f, 14.965f, 10.6667f, 15.3332f, 10.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF6F6F6)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.6667f, 10.6667f)
                    curveTo(13.0349f, 10.6667f, 13.3333f, 10.3682f, 13.3333f, 10.0f)
                    curveTo(13.3333f, 9.6318f, 13.0349f, 9.3333f, 12.6667f, 9.3333f)
                    curveTo(12.2985f, 9.3333f, 12.0f, 9.6318f, 12.0f, 10.0f)
                    curveTo(12.0f, 10.3682f, 12.2985f, 10.6667f, 12.6667f, 10.6667f)
                    close()
                }
            }
        }
        .build()
        return _sz!!
    }

private var _sz: ImageVector? = null
