package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val FlagsGroup.To: ImageVector
    get() {
        if (_to != null) {
            return _to!!
        }
        _to = Builder(name = "To", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    curveTo(8.6667f, -0.0f, 19.3333f, 0.0f, 28.0f, 0.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE20F1B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    lineTo(16.0f, 0.0f)
                    verticalLineTo(10.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDF101B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.0f, 1.3333f)
                    curveTo(6.8159f, 1.3333f, 6.6667f, 1.4826f, 6.6667f, 1.6667f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(4.3333f)
                    curveTo(4.1492f, 4.0f, 4.0f, 4.1492f, 4.0f, 4.3333f)
                    verticalLineTo(6.3333f)
                    curveTo(4.0f, 6.5174f, 4.1492f, 6.6667f, 4.3333f, 6.6667f)
                    horizontalLineTo(6.6667f)
                    verticalLineTo(9.0f)
                    curveTo(6.6667f, 9.1841f, 6.8159f, 9.3333f, 7.0f, 9.3333f)
                    horizontalLineTo(9.0f)
                    curveTo(9.1841f, 9.3333f, 9.3333f, 9.1841f, 9.3333f, 9.0f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(11.6667f)
                    curveTo(11.8508f, 6.6667f, 12.0f, 6.5174f, 12.0f, 6.3333f)
                    verticalLineTo(4.3333f)
                    curveTo(12.0f, 4.1492f, 11.8508f, 4.0f, 11.6667f, 4.0f)
                    horizontalLineTo(9.3333f)
                    verticalLineTo(1.6667f)
                    curveTo(9.3333f, 1.4826f, 9.1841f, 1.3333f, 9.0f, 1.3333f)
                    horizontalLineTo(7.0f)
                    close()
                }
            }
        }
        .build()
        return _to!!
    }

private var _to: ImageVector? = null
