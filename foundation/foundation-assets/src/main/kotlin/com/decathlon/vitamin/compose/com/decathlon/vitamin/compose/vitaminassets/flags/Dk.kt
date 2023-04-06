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

public val FlagsGroup.Dk: ImageVector
    get() {
        if (_dk != null) {
            return _dk!!
        }
        _dk = Builder(name = "Dk", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    lineTo(28.0f, 0.0f)
                    curveTo(28.0187f, 0.0f, 28.0187f, 0.0f, 28.0187f, 0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    horizontalLineTo(0.0187f)
                    lineTo(0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFEF264D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    lineTo(0.0187f, 8.0f)
                    horizontalLineTo(8.0187f)
                    verticalLineTo(0.0f)
                    lineTo(0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFEF264D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0187f, 0.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(28.0187f)
                    verticalLineTo(0.0f)
                    curveTo(28.0187f, 0.0f, 28.0187f, 0.0f, 28.0f, 0.0f)
                    horizontalLineTo(12.0187f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFEF264D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0187f, 12.0f)
                    horizontalLineTo(12.0187f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0187f)
                    verticalLineTo(12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFEF264D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.0187f, 20.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(0.0187f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    horizontalLineTo(8.0187f)
                    close()
                }
            }
        }
        .build()
        return _dk!!
    }

private var _dk: ImageVector? = null
