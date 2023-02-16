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
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.FlagsGroup

public val FlagsGroup.Np: ImageVector
    get() {
        if (_np != null) {
            return _np!!
        }
        _np = Builder(name = "Np", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 2.0f)
                    curveTo(0.0f, 0.8954f, 0.8954f, -0.0f, 2.0f, 0.0f)
                    lineTo(2.4648f, 0.0f)
                    curveTo(2.5964f, 0.0f, 2.7251f, 0.039f, 2.8346f, 0.112f)
                    lineTo(15.0026f, 8.2239f)
                    curveTo(16.1002f, 8.9557f, 15.5822f, 10.6667f, 14.263f, 10.6667f)
                    horizontalLineTo(8.0f)
                    lineTo(15.9961f, 17.6632f)
                    curveTo(16.9226f, 18.474f, 16.3492f, 20.0f, 15.1181f, 20.0f)
                    horizontalLineTo(2.0f)
                    curveTo(0.8954f, 20.0f, 0.0f, 19.1046f, 0.0f, 18.0f)
                    verticalLineTo(2.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFEE1B44)), stroke = SolidColor(Color(0xFF0543A8)),
                        strokeLineWidth = 1.33333f, strokeLineCap = Butt, strokeLineJoin = Round,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(15.1181f, 19.3333f)
                    horizontalLineTo(0.6667f)
                    verticalLineTo(0.6667f)
                    lineTo(2.4648f, 0.6667f)
                    lineTo(14.6328f, 8.7786f)
                    curveTo(15.1816f, 9.1445f, 14.9226f, 10.0f, 14.263f, 10.0f)
                    horizontalLineTo(8.0f)
                    curveTo(7.7223f, 10.0f, 7.4736f, 10.1722f, 7.3759f, 10.4322f)
                    curveTo(7.2782f, 10.6922f, 7.352f, 10.9855f, 7.561f, 11.1684f)
                    lineTo(15.5571f, 18.1649f)
                    curveTo(16.0203f, 18.5703f, 15.7336f, 19.3333f, 15.1181f, 19.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.8511f, 7.8008f)
                    curveTo(7.2352f, 7.6955f, 7.5893f, 7.5515f, 7.9025f, 7.3762f)
                    curveTo(7.5919f, 8.5045f, 6.5584f, 9.3333f, 5.3313f, 9.3333f)
                    curveTo(4.1042f, 9.3333f, 3.0707f, 8.5045f, 2.76f, 7.3762f)
                    curveTo(3.0741f, 7.552f, 3.4293f, 7.6963f, 3.8146f, 7.8017f)
                    lineTo(4.3333f, 7.3333f)
                    lineTo(3.4856f, 6.568f)
                    lineTo(4.6262f, 6.6262f)
                    lineTo(4.568f, 5.4856f)
                    lineTo(5.3333f, 6.3333f)
                    lineTo(6.0987f, 5.4856f)
                    lineTo(6.0405f, 6.6262f)
                    lineTo(7.1811f, 6.568f)
                    lineTo(6.3333f, 7.3333f)
                    lineTo(6.8511f, 7.8008f)
                    close()
                    moveTo(4.313f, 17.1304f)
                    lineTo(5.3335f, 16.0f)
                    lineTo(6.354f, 17.1304f)
                    lineTo(6.2763f, 15.6095f)
                    lineTo(7.7971f, 15.6872f)
                    lineTo(6.6668f, 14.6667f)
                    lineTo(7.7971f, 13.6462f)
                    lineTo(6.2763f, 13.7239f)
                    lineTo(6.354f, 12.203f)
                    lineTo(5.3335f, 13.3333f)
                    lineTo(4.313f, 12.203f)
                    lineTo(4.3906f, 13.7239f)
                    lineTo(2.8698f, 13.6462f)
                    lineTo(4.0001f, 14.6667f)
                    lineTo(2.8698f, 15.6872f)
                    lineTo(4.3906f, 15.6095f)
                    lineTo(4.313f, 17.1304f)
                    close()
                }
            }
        }
        .build()
        return _np!!
    }

private var _np: ImageVector? = null
