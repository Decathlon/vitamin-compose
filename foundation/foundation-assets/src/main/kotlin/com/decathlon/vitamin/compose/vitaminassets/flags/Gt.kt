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

public val FlagsGroup.Gt: ImageVector
    get() {
        if (_gt != null) {
            return _gt!!
        }
        _gt = Builder(name = "Gt", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF63AEE3)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.6665f, 0.0f)
                    horizontalLineToRelative(9.3333f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-9.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF63AEE3)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(9.3333f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF628A40)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0002f, 9.3333f)
                    curveTo(12.0002f, 8.9651f, 11.7017f, 8.6666f, 11.3335f, 8.6666f)
                    curveTo(10.9653f, 8.6666f, 10.6668f, 8.9651f, 10.6668f, 9.3333f)
                    horizontalLineTo(12.0002f)
                    close()
                    moveTo(12.3292f, 12.2181f)
                    curveTo(12.6477f, 12.4029f, 13.0556f, 12.2945f, 13.2404f, 11.976f)
                    curveTo(13.4252f, 11.6576f, 13.3168f, 11.2496f, 12.9984f, 11.0648f)
                    lineTo(12.3292f, 12.2181f)
                    close()
                    moveTo(15.0758f, 11.0198f)
                    curveTo(14.7656f, 11.2182f, 14.675f, 11.6305f, 14.8734f, 11.9406f)
                    curveTo(15.0718f, 12.2508f, 15.484f, 12.3414f, 15.7942f, 12.1431f)
                    lineTo(15.0758f, 11.0198f)
                    close()
                    moveTo(17.3335f, 9.3333f)
                    curveTo(17.3335f, 8.9651f, 17.035f, 8.6666f, 16.6668f, 8.6666f)
                    curveTo(16.2986f, 8.6666f, 16.0002f, 8.9651f, 16.0002f, 9.3333f)
                    horizontalLineTo(17.3335f)
                    close()
                    moveTo(10.6668f, 9.3333f)
                    curveTo(10.6668f, 10.5664f, 11.3367f, 11.6422f, 12.3292f, 12.2181f)
                    lineTo(12.9984f, 11.0648f)
                    curveTo(12.4001f, 10.7177f, 12.0002f, 10.0718f, 12.0002f, 9.3333f)
                    horizontalLineTo(10.6668f)
                    close()
                    moveTo(15.7942f, 12.1431f)
                    curveTo(16.7184f, 11.552f, 17.3335f, 10.5147f, 17.3335f, 9.3333f)
                    horizontalLineTo(16.0002f)
                    curveTo(16.0002f, 10.041f, 15.6331f, 10.6634f, 15.0758f, 11.0198f)
                    lineTo(15.7942f, 12.1431f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDCC26D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(13.9998f, 10.6667f)
                    curveTo(14.7362f, 10.6667f, 15.3332f, 10.0697f, 15.3332f, 9.3333f)
                    curveTo(15.3332f, 8.5969f, 14.7362f, 8.0f, 13.9998f, 8.0f)
                    curveTo(13.2635f, 8.0f, 12.6665f, 8.5969f, 12.6665f, 9.3333f)
                    curveTo(12.6665f, 10.0697f, 13.2635f, 10.6667f, 13.9998f, 10.6667f)
                    close()
                }
            }
        }
        .build()
        return _gt!!
    }

private var _gt: ImageVector? = null
