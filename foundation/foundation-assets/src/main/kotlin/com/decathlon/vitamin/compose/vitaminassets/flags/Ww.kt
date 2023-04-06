package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.graphics.Color
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

public val FlagsGroup.Ww: ImageVector
    get() {
        if (_ww != null) {
            return _ww!!
        }
        _ww = Builder(name = "Ww", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF19BFBF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 17.3333f)
                    curveTo(18.0501f, 17.3333f, 21.3333f, 14.0501f, 21.3333f, 10.0f)
                    curveTo(21.3333f, 5.9499f, 18.0501f, 2.6667f, 14.0f, 2.6667f)
                    curveTo(9.9499f, 2.6667f, 6.6667f, 5.9499f, 6.6667f, 10.0f)
                    curveTo(6.6667f, 14.0501f, 9.9499f, 17.3333f, 14.0f, 17.3333f)
                    close()
                    moveTo(19.9634f, 10.6667f)
                    curveTo(19.7159f, 12.9058f, 18.2361f, 14.7736f, 16.2173f, 15.577f)
                    curveTo(16.8674f, 14.253f, 17.2472f, 12.528f, 17.3203f, 10.6667f)
                    horizontalLineTo(19.9634f)
                    close()
                    moveTo(15.9856f, 10.6667f)
                    curveTo(15.8883f, 12.9157f, 15.3011f, 14.9034f, 14.3855f, 15.9878f)
                    curveTo(14.258f, 15.9959f, 14.1295f, 16.0f, 14.0f, 16.0f)
                    curveTo(13.8705f, 16.0f, 13.742f, 15.9959f, 13.6145f, 15.9878f)
                    curveTo(12.6989f, 14.9034f, 12.1117f, 12.9157f, 12.0144f, 10.6667f)
                    horizontalLineTo(15.9856f)
                    close()
                    moveTo(10.6797f, 10.6667f)
                    curveTo(10.7528f, 12.528f, 11.1326f, 14.253f, 11.7827f, 15.577f)
                    curveTo(9.7639f, 14.7736f, 8.2842f, 12.9058f, 8.0366f, 10.6667f)
                    horizontalLineTo(10.6797f)
                    close()
                    moveTo(12.0144f, 9.3333f)
                    horizontalLineTo(15.9856f)
                    curveTo(15.8883f, 7.0843f, 15.3011f, 5.0966f, 14.3855f, 4.0122f)
                    curveTo(14.258f, 4.0041f, 14.1295f, 4.0f, 14.0f, 4.0f)
                    curveTo(13.8705f, 4.0f, 13.742f, 4.0041f, 13.6145f, 4.0122f)
                    curveTo(12.6989f, 5.0966f, 12.1117f, 7.0843f, 12.0144f, 9.3333f)
                    close()
                    moveTo(11.7827f, 4.423f)
                    curveTo(11.1326f, 5.747f, 10.7528f, 7.472f, 10.6797f, 9.3333f)
                    horizontalLineTo(8.0366f)
                    curveTo(8.2842f, 7.0942f, 9.7639f, 5.2264f, 11.7827f, 4.423f)
                    close()
                    moveTo(19.9634f, 9.3333f)
                    horizontalLineTo(17.3203f)
                    curveTo(17.2472f, 7.472f, 16.8674f, 5.747f, 16.2173f, 4.423f)
                    curveTo(18.2361f, 5.2264f, 19.7159f, 7.0942f, 19.9634f, 9.3333f)
                    close()
                }
            }
        }
        .build()
        return _ww!!
    }

private var _ww: ImageVector? = null
