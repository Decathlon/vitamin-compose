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

public val FlagsGroup.Mv: ImageVector
    get() {
        if (_mv != null) {
            return _mv!!
        }
        _mv = Builder(name = "Mv", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 0.0f)
                    lineTo(26.0f, 0.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 28.0f, 2.0f)
                    lineTo(28.0f, 18.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 26.0f, 20.0f)
                    lineTo(2.0f, 20.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 0.0f, 18.0f)
                    lineTo(0.0f, 2.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF32249)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF15A04F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.6667f, 4.0f)
                    lineTo(23.3333f, 4.0f)
                    arcTo(0.6667f, 0.6667f, 0.0f, false, true, 24.0f, 4.6667f)
                    lineTo(24.0f, 15.3333f)
                    arcTo(0.6667f, 0.6667f, 0.0f, false, true, 23.3333f, 16.0f)
                    lineTo(4.6667f, 16.0f)
                    arcTo(0.6667f, 0.6667f, 0.0f, false, true, 4.0f, 15.3333f)
                    lineTo(4.0f, 4.6667f)
                    arcTo(0.6667f, 0.6667f, 0.0f, false, true, 4.6667f, 4.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(16.3333f, 14.5593f)
                    curveTo(16.0112f, 14.6296f, 15.6766f, 14.6667f, 15.3333f, 14.6667f)
                    curveTo(12.756f, 14.6667f, 10.6667f, 12.5773f, 10.6667f, 10.0f)
                    curveTo(10.6667f, 7.4227f, 12.756f, 5.3333f, 15.3333f, 5.3333f)
                    curveTo(15.6766f, 5.3333f, 16.0112f, 5.3704f, 16.3333f, 5.4407f)
                    curveTo(14.2365f, 5.8985f, 12.6667f, 7.7659f, 12.6667f, 10.0f)
                    curveTo(12.6667f, 12.2341f, 14.2365f, 14.1015f, 16.3333f, 14.5593f)
                    close()
                }
            }
        }
        .build()
        return _mv!!
    }

private var _mv: ImageVector? = null
