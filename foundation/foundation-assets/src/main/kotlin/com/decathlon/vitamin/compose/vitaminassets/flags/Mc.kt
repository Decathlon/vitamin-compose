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

public val FlagsGroup.Mc: ImageVector
    get() {
        if (_mc != null) {
            return _mc!!
        }
        _mc = Builder(name = "Mc", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    curveTo(9.3333f, 0.0f, 18.6667f, -0.0f, 28.0f, 0.0f)
                    verticalLineTo(20.0f)
                    curveTo(18.6667f, 19.9999f, 9.3333f, 19.9999f, 0.0f, 20.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFEA233B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 10.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    lineTo(0.0f, 0.0f)
                    verticalLineTo(10.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF8996A2)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 10.6714f)
                    horizontalLineTo(0.5f)
                    lineTo(0.5f, 19.5f)
                    horizontalLineTo(27.5f)
                    verticalLineTo(10.6714f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(10.6714f)
                    close()
                }
            }
        }
        .build()
        return _mc!!
    }

private var _mc: ImageVector? = null
