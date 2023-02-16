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

public val FlagsGroup.Sk: ImageVector
    get() {
        if (_sk != null) {
            return _sk!!
        }
        _sk = Builder(name = "Sk", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF0C47B7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 13.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE53B35)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF73744)), stroke = SolidColor(Color(0xFFffffff)),
                        strokeLineWidth = 1.33333f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(6.9497f, 3.3333f)
                    curveTo(5.8751f, 3.3333f, 4.9925f, 4.1826f, 4.9512f, 5.2565f)
                    lineTo(4.6919f, 11.9969f)
                    curveTo(4.6685f, 12.6073f, 4.9251f, 13.1948f, 5.3889f, 13.5923f)
                    lineTo(8.2646f, 16.0572f)
                    curveTo(9.2632f, 16.9132f, 10.7368f, 16.9132f, 11.7355f, 16.0572f)
                    lineTo(14.6111f, 13.5923f)
                    curveTo(15.0749f, 13.1948f, 15.3315f, 12.6073f, 15.3081f, 11.9969f)
                    lineTo(15.0488f, 5.2565f)
                    curveTo(15.0075f, 4.1826f, 14.125f, 3.3333f, 13.0503f, 3.3333f)
                    horizontalLineTo(6.9497f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.3336f, 11.0f)
                    curveTo(9.3336f, 10.8159f, 9.1843f, 10.6666f, 9.0002f, 10.6666f)
                    horizontalLineTo(7.6669f)
                    curveTo(7.4828f, 10.6666f, 7.3336f, 10.5174f, 7.3336f, 10.3333f)
                    verticalLineTo(9.6666f)
                    curveTo(7.3336f, 9.4825f, 7.4828f, 9.3333f, 7.6669f, 9.3333f)
                    horizontalLineTo(9.0002f)
                    curveTo(9.1843f, 9.3333f, 9.3336f, 9.1841f, 9.3336f, 9.0f)
                    verticalLineTo(8.3333f)
                    curveTo(9.3336f, 8.1492f, 9.1843f, 8.0f, 9.0002f, 8.0f)
                    horizontalLineTo(8.3336f)
                    curveTo(8.1495f, 8.0f, 8.0002f, 7.8507f, 8.0002f, 7.6666f)
                    verticalLineTo(7.0f)
                    curveTo(8.0002f, 6.8159f, 8.1495f, 6.6666f, 8.3336f, 6.6666f)
                    horizontalLineTo(9.0002f)
                    curveTo(9.1843f, 6.6666f, 9.3336f, 6.5174f, 9.3336f, 6.3333f)
                    verticalLineTo(5.6666f)
                    curveTo(9.3336f, 5.4826f, 9.4828f, 5.3333f, 9.6669f, 5.3333f)
                    horizontalLineTo(10.3336f)
                    curveTo(10.5177f, 5.3333f, 10.6669f, 5.4826f, 10.6669f, 5.6666f)
                    verticalLineTo(6.3333f)
                    curveTo(10.6669f, 6.5174f, 10.8161f, 6.6666f, 11.0002f, 6.6666f)
                    horizontalLineTo(11.6669f)
                    curveTo(11.851f, 6.6666f, 12.0002f, 6.8159f, 12.0002f, 7.0f)
                    verticalLineTo(7.6666f)
                    curveTo(12.0002f, 7.8507f, 11.851f, 8.0f, 11.6669f, 8.0f)
                    horizontalLineTo(11.0002f)
                    curveTo(10.8161f, 8.0f, 10.6669f, 8.1492f, 10.6669f, 8.3333f)
                    verticalLineTo(9.0f)
                    curveTo(10.6669f, 9.1841f, 10.8161f, 9.3333f, 11.0002f, 9.3333f)
                    horizontalLineTo(12.3336f)
                    curveTo(12.5177f, 9.3333f, 12.6669f, 9.4825f, 12.6669f, 9.6666f)
                    verticalLineTo(10.3333f)
                    curveTo(12.6669f, 10.5174f, 12.5177f, 10.6666f, 12.3336f, 10.6666f)
                    horizontalLineTo(11.0002f)
                    curveTo(10.8161f, 10.6666f, 10.6669f, 10.8159f, 10.6669f, 11.0f)
                    verticalLineTo(13.0f)
                    curveTo(10.6669f, 13.1841f, 10.5177f, 13.3333f, 10.3336f, 13.3333f)
                    horizontalLineTo(9.6669f)
                    curveTo(9.4828f, 13.3333f, 9.3336f, 13.1841f, 9.3336f, 13.0f)
                    verticalLineTo(11.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1251A1)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.2034f, 13.4254f)
                    curveTo(10.9887f, 12.9767f, 10.5305f, 12.6667f, 9.9998f, 12.6667f)
                    curveTo(9.4692f, 12.6667f, 9.0109f, 12.9767f, 8.7963f, 13.4255f)
                    curveTo(7.1754f, 13.6809f, 6.0f, 14.4385f, 6.0f, 15.3333f)
                    curveTo(6.0f, 16.4379f, 7.7909f, 17.3333f, 10.0f, 17.3333f)
                    curveTo(12.2091f, 17.3333f, 14.0f, 16.4379f, 14.0f, 15.3333f)
                    curveTo(14.0f, 14.4384f, 12.8245f, 13.6808f, 11.2034f, 13.4254f)
                    close()
                }
            }
        }
        .build()
        return _sk!!
    }

private var _sk: ImageVector? = null
