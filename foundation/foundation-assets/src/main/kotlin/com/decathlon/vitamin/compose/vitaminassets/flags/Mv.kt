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

public val FlagsGroup.Mv: ImageVector
    get() {
        if (_mv != null) {
            return _mv!!
        }
        _mv = Builder(name = "Mv", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFFF32249)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    lineTo(28.0f, 0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF15A04F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.0f, 4.6667f)
                    curveTo(4.0f, 4.2985f, 4.2985f, 4.0f, 4.6667f, 4.0f)
                    horizontalLineTo(23.3333f)
                    curveTo(23.7015f, 4.0f, 24.0f, 4.2985f, 24.0f, 4.6667f)
                    verticalLineTo(15.3333f)
                    curveTo(24.0f, 15.7015f, 23.7015f, 16.0f, 23.3333f, 16.0f)
                    horizontalLineTo(4.6667f)
                    curveTo(4.2985f, 16.0f, 4.0f, 15.7015f, 4.0f, 15.3333f)
                    verticalLineTo(4.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
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
