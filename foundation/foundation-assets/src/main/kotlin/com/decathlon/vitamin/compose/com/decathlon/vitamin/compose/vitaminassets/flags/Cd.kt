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

public val FlagsGroup.Cd: ImageVector
    get() {
        if (_cd != null) {
            return _cd!!
        }
        _cd = Builder(name = "Cd", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    curveTo(8.6667f, 0.0f, 19.3333f, 0.0f, 28.0f, 0.0f)
                    curveTo(28.0001f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF158AFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    curveTo(8.6667f, 0.0f, 19.3333f, 0.0f, 28.0f, 0.0f)
                    curveTo(28.0001f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFDD216)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(28.0f, 7.5f)
                    lineTo(3.5f, 20.0f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 12.5f)
                    lineTo(25.0f, 0.0f)
                    lineTo(28.0f, 0.0f)
                    verticalLineTo(7.5f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFCE1120)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 6.0f)
                    lineTo(0.5f, 20.0f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 14.0f)
                    lineTo(27.5f, 0.0f)
                    lineTo(28.0f, 0.0f)
                    verticalLineTo(6.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFDD216)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(4.6668f, 5.9667f)
                    lineTo(2.7076f, 7.3634f)
                    lineTo(3.4305f, 5.0684f)
                    lineTo(1.4966f, 3.6366f)
                    lineTo(3.9027f, 3.6149f)
                    lineTo(4.6668f, 1.3333f)
                    lineTo(5.431f, 3.6149f)
                    lineTo(7.837f, 3.6366f)
                    lineTo(5.9032f, 5.0684f)
                    lineTo(6.6261f, 7.3634f)
                    lineTo(4.6668f, 5.9667f)
                    close()
                }
            }
        }
        .build()
        return _cd!!
    }

private var _cd: ImageVector? = null
