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

public val FlagsGroup.Pk: ImageVector
    get() {
        if (_pk != null) {
            return _pk!!
        }
        _pk = Builder(name = "Pk", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, -0.0f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0A632F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(23.6701f, 10.7505f)
                    curveTo(23.5418f, 12.0012f, 23.0087f, 13.2029f, 22.0665f, 14.1451f)
                    curveTo(19.8206f, 16.391f, 16.1005f, 16.3121f, 13.7574f, 13.969f)
                    curveTo(11.4142f, 11.6258f, 11.3354f, 7.9057f, 13.5812f, 5.6598f)
                    curveTo(14.5234f, 4.7176f, 15.7251f, 4.1846f, 16.9758f, 4.0562f)
                    curveTo(16.5818f, 4.2884f, 16.209f, 4.5749f, 15.8685f, 4.9153f)
                    curveTo(13.8268f, 6.957f, 13.7259f, 10.1662f, 15.643f, 12.0833f)
                    curveTo(17.5601f, 14.0005f, 20.7694f, 13.8995f, 22.811f, 11.8578f)
                    curveTo(23.1515f, 11.5174f, 23.4379f, 11.1445f, 23.6701f, 10.7505f)
                    close()
                    moveTo(21.0924f, 8.1047f)
                    lineTo(20.7742f, 10.0031f)
                    lineTo(19.8849f, 8.2959f)
                    lineTo(17.981f, 8.5799f)
                    lineTo(19.3298f, 7.2066f)
                    lineTo(18.4714f, 5.4837f)
                    lineTo(20.1943f, 6.3421f)
                    lineTo(21.5677f, 4.9933f)
                    lineTo(21.2837f, 6.8972f)
                    lineTo(22.9909f, 7.7865f)
                    lineTo(21.0924f, 8.1047f)
                    close()
                }
            }
        }
        .build()
        return _pk!!
    }

private var _pk: ImageVector? = null
