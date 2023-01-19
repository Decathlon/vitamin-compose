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
                path(fill = SolidColor(Color(0xFF0A632F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(23.6702f, 10.7505f)
                    curveTo(23.5418f, 12.0012f, 23.0088f, 13.2029f, 22.0666f, 14.1451f)
                    curveTo(19.8207f, 16.391f, 16.1006f, 16.3121f, 13.7574f, 13.969f)
                    curveTo(11.4143f, 11.6258f, 11.3354f, 7.9057f, 13.5813f, 5.6598f)
                    curveTo(14.5235f, 4.7176f, 15.7252f, 4.1845f, 16.9758f, 4.0562f)
                    curveTo(16.5819f, 4.2884f, 16.209f, 4.5749f, 15.8686f, 4.9153f)
                    curveTo(13.8269f, 6.957f, 13.7259f, 10.1662f, 15.643f, 12.0833f)
                    curveTo(17.5601f, 14.0005f, 20.7694f, 13.8995f, 22.8111f, 11.8578f)
                    curveTo(23.1515f, 11.5174f, 23.438f, 11.1445f, 23.6702f, 10.7505f)
                    close()
                    moveTo(21.0925f, 8.1047f)
                    lineTo(20.7742f, 10.0031f)
                    lineTo(19.8849f, 8.2959f)
                    lineTo(17.9811f, 8.5799f)
                    lineTo(19.3299f, 7.2066f)
                    lineTo(18.4715f, 5.4837f)
                    lineTo(20.1944f, 6.3421f)
                    lineTo(21.5677f, 4.9933f)
                    lineTo(21.2837f, 6.8972f)
                    lineTo(22.9909f, 7.7864f)
                    lineTo(21.0925f, 8.1047f)
                    close()
                }
            }
        }
        .build()
        return _pk!!
    }

private var _pk: ImageVector? = null
