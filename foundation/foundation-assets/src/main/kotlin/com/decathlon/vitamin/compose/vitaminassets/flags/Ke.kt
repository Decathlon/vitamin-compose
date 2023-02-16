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

public val FlagsGroup.Ke: ImageVector
    get() {
        if (_ke != null) {
            return _ke!!
        }
        _ke = Builder(name = "Ke", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 5.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(5.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF018301)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(14.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 14.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(5.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDC0808)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 13.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFBC0000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 16.6666f)
                    curveTo(15.3334f, 16.6666f, 17.3334f, 14.0501f, 17.3334f, 10.0f)
                    curveTo(17.3334f, 5.9499f, 15.3334f, 3.3333f, 14.0f, 3.3333f)
                    curveTo(12.6667f, 3.3333f, 10.6667f, 5.9499f, 10.6667f, 10.0f)
                    curveTo(10.6667f, 14.0501f, 12.6667f, 16.6666f, 14.0f, 16.6666f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.6667f, 17.3333f)
                    curveTo(10.5076f, 17.3333f, 12.0f, 14.0501f, 12.0f, 10.0f)
                    curveTo(12.0f, 5.9499f, 10.5076f, 2.6667f, 8.6667f, 2.6667f)
                    curveTo(6.8257f, 2.6667f, 5.3333f, 5.9499f, 5.3333f, 10.0f)
                    curveTo(5.3333f, 14.0501f, 6.8257f, 17.3333f, 8.6667f, 17.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(19.3333f, 17.3333f)
                    curveTo(21.1743f, 17.3333f, 22.6667f, 14.0501f, 22.6667f, 10.0f)
                    curveTo(22.6667f, 5.9499f, 21.1743f, 2.6667f, 19.3333f, 2.6667f)
                    curveTo(17.4924f, 2.6667f, 16.0f, 5.9499f, 16.0f, 10.0f)
                    curveTo(16.0f, 14.0501f, 17.4924f, 17.3333f, 19.3333f, 17.3333f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(13.3333f,2.66666f), end = Offset(13.3333f,17.3333f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(14.0f, 8.0f)
                    curveTo(14.3682f, 8.0f, 14.6667f, 6.8061f, 14.6667f, 5.3333f)
                    curveTo(14.6667f, 3.8606f, 14.3682f, 2.6667f, 14.0f, 2.6667f)
                    curveTo(13.6318f, 2.6667f, 13.3333f, 3.8606f, 13.3333f, 5.3333f)
                    curveTo(13.3333f, 6.8061f, 13.6318f, 8.0f, 14.0f, 8.0f)
                    close()
                    moveTo(14.0f, 12.0f)
                    curveTo(14.3682f, 12.0f, 14.6667f, 11.1046f, 14.6667f, 10.0f)
                    curveTo(14.6667f, 8.8954f, 14.3682f, 8.0f, 14.0f, 8.0f)
                    curveTo(13.6318f, 8.0f, 13.3333f, 8.8954f, 13.3333f, 10.0f)
                    curveTo(13.3333f, 11.1046f, 13.6318f, 12.0f, 14.0f, 12.0f)
                    close()
                    moveTo(14.0f, 12.0f)
                    curveTo(13.6318f, 12.0f, 13.3333f, 13.1939f, 13.3333f, 14.6667f)
                    curveTo(13.3333f, 16.1394f, 13.6318f, 17.3333f, 14.0f, 17.3333f)
                    curveTo(14.3682f, 17.3333f, 14.6667f, 16.1394f, 14.6667f, 14.6667f)
                    curveTo(14.6667f, 13.1939f, 14.3682f, 12.0f, 14.0f, 12.0f)
                    close()
                }
            }
        }
        .build()
        return _ke!!
    }

private var _ke: ImageVector? = null
