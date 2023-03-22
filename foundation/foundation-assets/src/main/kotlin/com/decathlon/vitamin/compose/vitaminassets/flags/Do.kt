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

public val FlagsGroup.Do: ImageVector
    get() {
        if (_do != null) {
            return _do!!
        }
        _do = Builder(name = "Do", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF083D7A)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 8.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(8.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF083D7A)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(16.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDF1E35)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDF1E35)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(16.0f, 8.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(8.0f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFF0F6D1A)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.1144f, 8.1144f)
                    curveTo(11.073f, 9.1558f, 11.073f, 10.8442f, 12.1144f, 11.8856f)
                    lineTo(13.0572f, 10.9428f)
                    curveTo(12.5365f, 10.4221f, 12.5365f, 9.5779f, 13.0572f, 9.0572f)
                    lineTo(12.1144f, 8.1144f)
                    close()
                    moveTo(12.1144f, 11.8856f)
                    curveTo(13.1558f, 12.927f, 14.8443f, 12.927f, 15.8857f, 11.8856f)
                    lineTo(14.9429f, 10.9428f)
                    curveTo(14.4222f, 11.4635f, 13.5779f, 11.4635f, 13.0572f, 10.9428f)
                    lineTo(12.1144f, 11.8856f)
                    close()
                    moveTo(15.8857f, 11.8856f)
                    curveTo(16.9271f, 10.8442f, 16.9271f, 9.1558f, 15.8857f, 8.1144f)
                    lineTo(14.9429f, 9.0572f)
                    curveTo(15.4636f, 9.5779f, 15.4636f, 10.4221f, 14.9429f, 10.9428f)
                    lineTo(15.8857f, 11.8856f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF042F60)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 10.6667f)
                    curveTo(14.3682f, 10.6667f, 14.6667f, 10.3682f, 14.6667f, 10.0f)
                    curveTo(14.6667f, 9.6318f, 14.3682f, 9.3333f, 14.0f, 9.3333f)
                    curveTo(13.6319f, 9.3333f, 13.3334f, 9.6318f, 13.3334f, 10.0f)
                    curveTo(13.3334f, 10.3682f, 13.6319f, 10.6667f, 14.0f, 10.6667f)
                    close()
                }
            }
        }
        .build()
        return _do!!
    }

private var _do: ImageVector? = null
