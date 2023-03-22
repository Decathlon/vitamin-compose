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
                path(fill = SolidColor(Color(0xFFE3243B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(-6.3115f, -2.5828f)
                    lineToRelative(1.5295f, -2.1844f)
                    lineToRelative(40.4115f, 28.2964f)
                    lineToRelative(-1.5295f, 2.1844f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE3243B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(35.6295f, -2.5828f)
                    lineToRelative(-1.5295f, -2.1844f)
                    lineToRelative(-40.4115f, 28.2964f)
                    lineToRelative(1.5295f, 2.1844f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFAEF32)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(15.7408f, 2.6667f)
                    horizontalLineTo(13.5926f)
                    lineTo(13.6799f, 2.6155f)
                    lineTo(12.6931f, 2.0456f)
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
                    horizontalLineTo(15.3334f)
                    curveTo(16.0697f, 2.6667f, 16.6667f, 3.2636f, 16.6667f, 4.0f)
                    curveTo(16.6667f, 4.3823f, 16.6667f, 4.7959f, 16.6667f, 5.1667f)
                    curveTo(16.6667f, 6.9524f, 14.6667f, 7.6667f, 14.6667f, 7.6667f)
                    curveTo(14.6667f, 7.6667f, 12.6667f, 6.9524f, 12.6667f, 5.1667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFAEF32)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.6667f, 6.6667f)
                    lineTo(14.6667f, 6.6667f)
                    arcTo(0.3333f, 0.3333f, 0.0f, false, true, 15.0001f, 7.0f)
                    lineTo(15.0001f, 7.0f)
                    arcTo(0.3333f, 0.3333f, 0.0f, false, true, 14.6667f, 7.3334f)
                    lineTo(14.6667f, 7.3334f)
                    arcTo(0.3333f, 0.3333f, 0.0f, false, true, 14.3334f, 7.0f)
                    lineTo(14.3334f, 7.0f)
                    arcTo(0.3333f, 0.3333f, 0.0f, false, true, 14.6667f, 6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFAEF32)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.6667f, 5.3333f)
                    lineTo(15.6667f, 5.3333f)
                    arcTo(0.3333f, 0.3333f, 0.0f, false, true, 16.0001f, 5.6667f)
                    lineTo(16.0001f, 5.6667f)
                    arcTo(0.3333f, 0.3333f, 0.0f, false, true, 15.6667f, 6.0f)
                    lineTo(13.6667f, 6.0f)
                    arcTo(0.3333f, 0.3333f, 0.0f, false, true, 13.3334f, 5.6667f)
                    lineTo(13.3334f, 5.6667f)
                    arcTo(0.3333f, 0.3333f, 0.0f, false, true, 13.6667f, 5.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFAEF32)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.6667f, 4.0f)
                    lineTo(15.6667f, 4.0f)
                    arcTo(0.3333f, 0.3333f, 0.0f, false, true, 16.0001f, 4.3333f)
                    lineTo(16.0001f, 4.3333f)
                    arcTo(0.3333f, 0.3333f, 0.0f, false, true, 15.6667f, 4.6667f)
                    lineTo(13.6667f, 4.6667f)
                    arcTo(0.3333f, 0.3333f, 0.0f, false, true, 13.3334f, 4.3333f)
                    lineTo(13.3334f, 4.3333f)
                    arcTo(0.3333f, 0.3333f, 0.0f, false, true, 13.6667f, 4.0f)
                    close()
                }
            }
        }
        .build()
        return _je!!
    }

private var _je: ImageVector? = null
