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

public val FlagsGroup.Ls: ImageVector
    get() {
        if (_ls != null) {
            return _ls!!
        }
        _ls = Builder(name = "Ls", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, -2.0E-4f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0C33B8)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1DB158)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.6149f, 9.85f)
                    curveTo(15.0418f, 9.6278f, 15.3333f, 9.1812f, 15.3333f, 8.6667f)
                    curveTo(15.3333f, 7.9303f, 14.7363f, 7.3333f, 14.0f, 7.3333f)
                    curveTo(13.2636f, 7.3333f, 12.6666f, 7.9303f, 12.6666f, 8.6667f)
                    curveTo(12.6666f, 9.1813f, 12.9582f, 9.6278f, 13.3852f, 9.8501f)
                    curveTo(13.3789f, 9.8654f, 13.373f, 9.8812f, 13.3676f, 9.8974f)
                    lineTo(13.3334f, 10.0f)
                    lineTo(12.1516f, 11.7726f)
                    curveTo(12.0635f, 11.9048f, 12.0829f, 12.0791f, 12.2147f, 12.1678f)
                    curveTo(12.5084f, 12.3653f, 13.1036f, 12.6667f, 14.0001f, 12.6667f)
                    curveTo(14.8966f, 12.6667f, 15.4917f, 12.3653f, 15.7854f, 12.1678f)
                    curveTo(15.9172f, 12.0791f, 15.9366f, 11.9048f, 15.8485f, 11.7726f)
                    lineTo(14.6667f, 10.0f)
                    lineTo(14.6325f, 9.8974f)
                    curveTo(14.6271f, 9.8812f, 14.6212f, 9.8654f, 14.6149f, 9.85f)
                    close()
                    moveTo(14.6666f, 8.6667f)
                    curveTo(14.6666f, 9.0349f, 14.3681f, 9.3333f, 14.0f, 9.3333f)
                    curveTo(13.6318f, 9.3333f, 13.3333f, 9.0349f, 13.3333f, 8.6667f)
                    curveTo(13.3333f, 8.2985f, 13.6318f, 8.0f, 14.0f, 8.0f)
                    curveTo(14.3681f, 8.0f, 14.6666f, 8.2985f, 14.6666f, 8.6667f)
                    close()
                }
            }
        }
        .build()
        return _ls!!
    }

private var _ls: ImageVector? = null
