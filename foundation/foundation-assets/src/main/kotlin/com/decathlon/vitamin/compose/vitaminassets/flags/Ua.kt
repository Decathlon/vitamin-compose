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

public val FlagsGroup.Ua: ImageVector
    get() {
        if (_ua != null) {
            return _ua!!
        }
        _ua = Builder(name = "Ua", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 2.0f)
                    curveTo(0.0f, 0.8954f, 0.8954f, 0.0f, 2.0f, 0.0f)
                    horizontalLineTo(26.0f)
                    curveTo(27.1046f, 0.0f, 28.0f, 0.8954f, 28.0f, 2.0f)
                    verticalLineTo(18.0f)
                    curveTo(28.0f, 19.1046f, 27.1046f, 20.0f, 26.0f, 20.0f)
                    horizontalLineTo(2.0f)
                    curveTo(0.8954f, 20.0f, 0.0f, 19.1046f, 0.0f, 18.0f)
                    verticalLineTo(2.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF156DD1)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 10.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(10.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD948)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(10.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
            }
        }
        .build()
        return _ua!!
    }

private var _ua: ImageVector? = null
