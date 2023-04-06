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

public val FlagsGroup.Gq: ImageVector
    get() {
        if (_gq != null) {
            return _gq!!
        }
        _gq = Builder(name = "Gq", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFFEC3938)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF51B422)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF159940)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(13.6068f, 11.7151f)
                    curveTo(13.6367f, 11.684f, 13.6535f, 11.6426f, 13.6537f, 11.5995f)
                    lineTo(13.665f, 9.6274f)
                    curveTo(13.6659f, 9.4653f, 13.5347f, 9.3333f, 13.3726f, 9.3333f)
                    curveTo(13.1121f, 9.3333f, 12.9816f, 9.0184f, 13.1658f, 8.8342f)
                    lineTo(13.7643f, 8.2357f)
                    curveTo(13.8945f, 8.1055f, 14.1055f, 8.1055f, 14.2357f, 8.2357f)
                    lineTo(14.8333f, 8.8333f)
                    curveTo(15.0178f, 9.0178f, 14.8872f, 9.3333f, 14.6262f, 9.3333f)
                    curveTo(14.4645f, 9.3333f, 14.3333f, 9.4645f, 14.3333f, 9.6262f)
                    verticalLineTo(11.5976f)
                    curveTo(14.3333f, 11.6418f, 14.3509f, 11.6842f, 14.3821f, 11.7155f)
                    curveTo(14.4871f, 11.8205f, 14.4128f, 12.0f, 14.2643f, 12.0f)
                    horizontalLineTo(13.7282f)
                    curveTo(13.5799f, 12.0f, 13.5041f, 11.8221f, 13.6068f, 11.7151f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF258DE7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 0.0f)
                    lineTo(9.3333f, 10.0f)
                    lineTo(0.0f, 20.0f)
                    verticalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _gq!!
    }

private var _gq: ImageVector? = null
