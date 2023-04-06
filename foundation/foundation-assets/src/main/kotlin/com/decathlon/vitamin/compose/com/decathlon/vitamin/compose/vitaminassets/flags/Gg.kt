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

public val FlagsGroup.Gg: ImageVector
    get() {
        if (_gg != null) {
            return _gg!!
        }
        _gg = Builder(name = "Gg", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, -1.0E-4f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE8112D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.3332f, 0.0f)
                    horizontalLineTo(10.6665f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(10.6665f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(17.3332f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(17.3332f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF9DD16)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.333f, 3.3332f)
                    lineTo(12.6665f, 2.6667f)
                    horizontalLineTo(15.3332f)
                    lineTo(14.6663f, 3.3335f)
                    verticalLineTo(9.3334f)
                    horizontalLineTo(20.6667f)
                    lineTo(21.3333f, 8.6667f)
                    verticalLineTo(11.3334f)
                    lineTo(20.6666f, 10.6667f)
                    horizontalLineTo(14.6663f)
                    verticalLineTo(16.6665f)
                    lineTo(15.3332f, 17.3334f)
                    horizontalLineTo(12.6665f)
                    lineTo(13.333f, 16.6668f)
                    verticalLineTo(10.6667f)
                    horizontalLineTo(7.3334f)
                    lineTo(6.6667f, 11.3334f)
                    verticalLineTo(8.6667f)
                    lineTo(7.3333f, 9.3334f)
                    horizontalLineTo(13.333f)
                    verticalLineTo(3.3332f)
                    close()
                }
            }
        }
        .build()
        return _gg!!
    }

private var _gg: ImageVector? = null
