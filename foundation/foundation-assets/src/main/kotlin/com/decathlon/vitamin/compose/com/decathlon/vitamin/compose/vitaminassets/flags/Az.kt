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

public val FlagsGroup.Az: ImageVector
    get() {
        if (_az != null) {
            return _az!!
        }
        _az = Builder(name = "Az", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    curveTo(9.3333f, -1.0E-4f, 18.6667f, 0.0f, 28.0f, 0.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF24AAD5)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    lineTo(0.0f, 0.0f)
                    verticalLineTo(6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF21BF75)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFED1845)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 13.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0f, 12.0f)
                    curveTo(14.4113f, 12.0f, 14.7936f, 11.8759f, 15.1114f, 11.663f)
                    curveTo(15.0747f, 11.6654f, 15.0376f, 11.6666f, 15.0002f, 11.6666f)
                    curveTo(14.0797f, 11.6666f, 13.3335f, 10.9205f, 13.3335f, 10.0f)
                    curveTo(13.3335f, 9.0795f, 14.0797f, 8.3333f, 15.0002f, 8.3333f)
                    curveTo(15.0375f, 8.3333f, 15.0746f, 8.3345f, 15.1114f, 8.337f)
                    curveTo(14.7935f, 8.1241f, 14.4113f, 8.0f, 14.0f, 8.0f)
                    curveTo(12.8954f, 8.0f, 12.0f, 8.8954f, 12.0f, 10.0f)
                    curveTo(12.0f, 11.1046f, 12.8954f, 12.0f, 14.0f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.9998f, 10.0f)
                    curveTo(15.9998f, 10.3682f, 15.7014f, 10.6666f, 15.3332f, 10.6666f)
                    curveTo(14.965f, 10.6666f, 14.6665f, 10.3682f, 14.6665f, 10.0f)
                    curveTo(14.6665f, 9.6318f, 14.965f, 9.3333f, 15.3332f, 9.3333f)
                    curveTo(15.7014f, 9.3333f, 15.9998f, 9.6318f, 15.9998f, 10.0f)
                    close()
                }
            }
        }
        .build()
        return _az!!
    }

private var _az: ImageVector? = null
