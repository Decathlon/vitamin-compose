package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val FlagsGroup.Kn: ImageVector
    get() {
        if (_kn != null) {
            return _kn!!
        }
        _kn = Builder(name = "Kn", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1EC160)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 13.3333f)
                    lineTo(28.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDF2A40)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(6.6667f)
                    lineTo(0.0f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFD956)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.0f, 20.0f)
                    lineTo(28.0f, 8.5f)
                    lineTo(28.0f, 0.0f)
                    horizontalLineTo(19.5f)
                    lineTo(0.0f, 12.0f)
                    verticalLineTo(20.0f)
                    lineTo(9.0f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(4.0f, 20.0f)
                    lineTo(28.0f, 5.0f)
                    lineTo(28.0f, 0.0f)
                    horizontalLineTo(24.0f)
                    lineTo(0.0f, 15.0f)
                    verticalLineTo(20.0f)
                    lineTo(4.0f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(20.3092f, 7.7974f)
                    lineTo(19.3638f, 9.2948f)
                    lineTo(18.7504f, 7.6336f)
                    lineTo(17.0342f, 7.1972f)
                    lineTo(18.4245f, 6.1004f)
                    lineTo(18.3092f, 4.3333f)
                    lineTo(19.7819f, 5.3167f)
                    lineTo(21.4269f, 4.661f)
                    lineTo(20.9468f, 6.3655f)
                    lineTo(22.0787f, 7.7273f)
                    lineTo(20.3092f, 7.7974f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.6427f, 14.2641f)
                    lineTo(8.6973f, 15.7615f)
                    lineTo(8.0839f, 14.1003f)
                    lineTo(6.3677f, 13.6638f)
                    lineTo(7.758f, 12.5671f)
                    lineTo(7.6427f, 10.8f)
                    lineTo(9.1154f, 11.7834f)
                    lineTo(10.7604f, 11.1277f)
                    lineTo(10.2803f, 12.8322f)
                    lineTo(11.4122f, 14.194f)
                    lineTo(9.6427f, 14.2641f)
                    close()
                }
            }
        }
        .build()
        return _kn!!
    }

private var _kn: ImageVector? = null
