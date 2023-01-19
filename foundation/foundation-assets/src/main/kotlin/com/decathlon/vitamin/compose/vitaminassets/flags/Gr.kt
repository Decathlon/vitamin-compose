package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.graphics.Color
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

public val FlagsGroup.Gr: ImageVector
    get() {
        if (_gr != null) {
            return _gr!!
        }
        _gr = Builder(name = "Gr", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF1C6DC1)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(5.3333f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(5.3333f)
                    horizontalLineTo(5.3333f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(13.3333f, 0.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(5.3333f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(13.3335f, 0.0f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(2.6667f)
                    horizontalLineTo(13.3335f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(28.0002f, 5.3333f)
                    horizontalLineTo(13.3335f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(5.3333f)
                    close()
                    moveTo(13.3335f, 10.6667f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(13.3334f)
                    horizontalLineTo(13.3335f)
                    verticalLineTo(10.6667f)
                    close()
                    moveTo(28.0f, 16.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(18.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(16.0f)
                    close()
                    moveTo(8.0f, 8.0f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(8.0f)
                    close()
                    moveTo(5.3333f, 8.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(5.3333f)
                    verticalLineTo(8.0f)
                    close()
                }
            }
        }
        .build()
        return _gr!!
    }

private var _gr: ImageVector? = null
