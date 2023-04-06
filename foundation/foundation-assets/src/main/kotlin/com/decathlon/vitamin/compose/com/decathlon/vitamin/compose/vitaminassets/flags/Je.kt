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

public val FlagsGroup.Je: ImageVector
    get() {
        if (_je != null) {
            return _je!!
        }
        _je = Builder(name = "Je", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFAEF32)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.7408f, 2.6667f)
                    horizontalLineTo(13.5926f)
                    lineTo(13.6799f, 2.6155f)
                    lineTo(12.693f, 2.0456f)
                    lineTo(13.9689f, 2.1881f)
                    lineTo(13.7895f, 1.3333f)
                    lineTo(14.6667f, 2.0456f)
                    lineTo(15.5438f, 1.3333f)
                    lineTo(15.3645f, 2.1881f)
                    lineTo(16.6403f, 2.0456f)
                    lineTo(15.6535f, 2.6155f)
                    lineTo(15.7408f, 2.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE3243B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.6667f, 5.1667f)
                    curveTo(12.6667f, 4.7959f, 12.6667f, 4.3823f, 12.6667f, 4.0f)
                    curveTo(12.6667f, 3.2636f, 13.2636f, 2.6667f, 14.0f, 2.6667f)
                    horizontalLineTo(15.3333f)
                    curveTo(16.0697f, 2.6667f, 16.6667f, 3.2636f, 16.6667f, 4.0f)
                    curveTo(16.6667f, 4.3823f, 16.6667f, 4.7959f, 16.6667f, 5.1667f)
                    curveTo(16.6667f, 6.9524f, 14.6667f, 7.6667f, 14.6667f, 7.6667f)
                    curveTo(14.6667f, 7.6667f, 12.6667f, 6.9524f, 12.6667f, 5.1667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFAEF32)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.3333f, 7.0f)
                    curveTo(14.3333f, 6.8159f, 14.4826f, 6.6667f, 14.6667f, 6.6667f)
                    curveTo(14.8508f, 6.6667f, 15.0f, 6.8159f, 15.0f, 7.0f)
                    curveTo(15.0f, 7.1841f, 14.8508f, 7.3334f, 14.6667f, 7.3334f)
                    curveTo(14.4826f, 7.3334f, 14.3333f, 7.1841f, 14.3333f, 7.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFAEF32)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.3333f, 5.6667f)
                    curveTo(13.3333f, 5.4826f, 13.4826f, 5.3334f, 13.6667f, 5.3334f)
                    horizontalLineTo(15.6667f)
                    curveTo(15.8508f, 5.3334f, 16.0f, 5.4826f, 16.0f, 5.6667f)
                    curveTo(16.0f, 5.8508f, 15.8508f, 6.0f, 15.6667f, 6.0f)
                    horizontalLineTo(13.6667f)
                    curveTo(13.4826f, 6.0f, 13.3333f, 5.8508f, 13.3333f, 5.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFAEF32)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.3333f, 4.3334f)
                    curveTo(13.3333f, 4.1493f, 13.4826f, 4.0f, 13.6667f, 4.0f)
                    horizontalLineTo(15.6667f)
                    curveTo(15.8508f, 4.0f, 16.0f, 4.1493f, 16.0f, 4.3334f)
                    curveTo(16.0f, 4.5174f, 15.8508f, 4.6667f, 15.6667f, 4.6667f)
                    horizontalLineTo(13.6667f)
                    curveTo(13.4826f, 4.6667f, 13.3333f, 4.5174f, 13.3333f, 4.3334f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE3243B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(27.0f, 0.0f)
                    lineTo(28.0f, 0.0f)
                    verticalLineTo(2.5f)
                    lineTo(16.9836f, 10.4732f)
                    lineTo(28.0f, 18.0f)
                    lineTo(28.0f, 20.0f)
                    horizontalLineTo(26.0f)
                    lineTo(14.659f, 12.1009f)
                    lineTo(3.5f, 20.0f)
                    lineTo(0.0f, 20.0f)
                    lineTo(0.0f, 19.0f)
                    lineTo(12.3344f, 10.4732f)
                    lineTo(0.0f, 2.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(2.0f)
                    lineTo(14.659f, 8.8455f)
                    lineTo(27.0f, 0.0f)
                    close()
                }
            }
        }
        .build()
        return _je!!
    }

private var _je: ImageVector? = null
