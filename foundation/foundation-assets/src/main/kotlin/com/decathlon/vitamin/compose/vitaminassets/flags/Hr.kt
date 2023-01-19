package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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

public val FlagsGroup.Hr: ImageVector
    get() {
        if (_hr != null) {
            return _hr!!
        }
        _hr = Builder(name = "Hr", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = SolidColor(Color(0xFFF5F5F5)),
                        strokeLineWidth = 0.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(2.0f, 0.25f)
                    lineTo(26.0f, 0.25f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 27.75f, 2.0f)
                    lineTo(27.75f, 18.0f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 26.0f, 19.75f)
                    lineTo(2.0f, 19.75f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 0.25f, 18.0f)
                    lineTo(0.25f, 2.0f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 0.25f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFF202D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1895DB)), stroke = null, fillAlpha = 0.5f,
                        strokeAlpha = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(10.6666f, 5.3333f)
                    lineTo(11.3333f, 4.6667f)
                    lineTo(12.0f, 5.3333f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(10.6666f)
                    verticalLineTo(5.3333f)
                    close()
                    moveTo(13.3333f, 5.3333f)
                    lineTo(14.0f, 4.6667f)
                    lineTo(14.6666f, 5.3333f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(5.3333f)
                    close()
                    moveTo(16.6666f, 4.6667f)
                    lineTo(16.0f, 5.3333f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(17.3333f)
                    verticalLineTo(5.3333f)
                    lineTo(16.6666f, 4.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF191F94)), stroke = null, fillAlpha = 0.5f,
                        strokeAlpha = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(12.6667f, 4.6667f)
                    lineTo(12.0f, 5.3333f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(5.3333f)
                    lineTo(12.6667f, 4.6667f)
                    close()
                    moveTo(15.3333f, 4.6667f)
                    lineTo(14.6667f, 5.3333f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(5.3333f)
                    lineTo(15.3333f, 4.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF2027AC)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFF212E), 1.0f to Color(0xFFFD0D1B),
                        start = Offset(10.6666f,6.66666f), end = Offset(10.6666f,14.6667f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(12.0f, 6.6667f)
                    horizontalLineTo(11.3333f)
                    lineTo(10.6666f, 8.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(10.6666f)
                    verticalLineTo(10.6667f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(10.6666f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(14.6667f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(14.6666f)
                    verticalLineTo(14.6667f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(17.3333f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(10.6667f)
                    horizontalLineTo(17.3333f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(17.3333f)
                    lineTo(16.6666f, 6.6667f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(14.6666f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(6.6667f)
                    close()
                    moveTo(13.3333f, 9.3333f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(14.6666f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(13.3333f)
                    close()
                    moveTo(13.3333f, 10.6667f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(10.6667f)
                    horizontalLineTo(13.3333f)
                    close()
                    moveTo(14.6666f, 10.6667f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(14.6666f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(14.6666f)
                    verticalLineTo(10.6667f)
                    close()
                    moveTo(14.6666f, 10.6667f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(14.6666f)
                    verticalLineTo(10.6667f)
                    close()
                }
            }
        }
        .build()
        return _hr!!
    }

private var _hr: ImageVector? = null
