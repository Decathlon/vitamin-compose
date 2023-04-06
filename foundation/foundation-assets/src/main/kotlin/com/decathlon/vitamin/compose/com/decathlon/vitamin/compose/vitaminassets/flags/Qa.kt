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

public val FlagsGroup.Qa: ImageVector
    get() {
        if (_qa != null) {
            return _qa!!
        }
        _qa = Builder(name = "Qa", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.0E-4f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0005f, 6.6667f, 28.0001f, 13.3333f, 28.0001f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3334f, 20.0f, 1.0E-4f, 20.0f)
                    curveTo(1.0E-4f, 13.3333f, -1.0E-4f, 6.6667f, 1.0E-4f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFA6264C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0f, 0.0f)
                    horizontalLineTo(8.0001f)
                    lineTo(10.0001f, 1.3333f)
                    lineTo(8.0001f, 2.6667f)
                    lineTo(10.0001f, 4.0f)
                    lineTo(8.0001f, 5.3333f)
                    lineTo(10.0001f, 6.6667f)
                    lineTo(8.0001f, 8.0f)
                    lineTo(10.0001f, 9.3333f)
                    lineTo(8.0001f, 10.6667f)
                    lineTo(10.0001f, 12.0f)
                    lineTo(8.0001f, 13.3333f)
                    lineTo(10.0001f, 14.6667f)
                    lineTo(8.0001f, 16.0f)
                    lineTo(10.0001f, 17.3333f)
                    lineTo(8.0001f, 18.6667f)
                    lineTo(10.0001f, 20.0f)
                    horizontalLineTo(28.0001f)
                    lineTo(28.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF8996A2)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.5f, 0.5f)
                    lineTo(0.5f, 19.5f)
                    lineTo(9.2519f, 19.5f)
                    lineTo(10.0027f, 20.0f)
                    horizontalLineTo(1.0E-4f)
                    lineTo(1.0E-4f, 0.0f)
                    horizontalLineTo(8.0001f)
                    lineTo(8.7508f, 0.5f)
                    lineTo(0.5f, 0.5f)
                    close()
                }
            }
        }
        .build()
        return _qa!!
    }

private var _qa: ImageVector? = null
