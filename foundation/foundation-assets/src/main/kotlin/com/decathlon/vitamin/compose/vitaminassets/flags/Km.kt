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

public val FlagsGroup.Km: ImageVector
    get() {
        if (_km != null) {
            return _km!!
        }
        _km = Builder(name = "Km", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFFFFCB49)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 5.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(5.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDC1D34)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 14.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF4985D4)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(14.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF4BA343)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    lineTo(13.3333f, 10.0f)
                    lineTo(0.0f, 0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(5.3335f, 14.0f)
                    curveTo(5.6788f, 14.0f, 6.0139f, 13.9562f, 6.3335f, 13.874f)
                    curveTo(4.6083f, 13.4299f, 3.3335f, 11.8638f, 3.3335f, 10.0f)
                    curveTo(3.3335f, 8.1362f, 4.6083f, 6.5701f, 6.3335f, 6.126f)
                    curveTo(6.0139f, 6.0437f, 5.6788f, 6.0f, 5.3335f, 6.0f)
                    curveTo(3.1244f, 6.0f, 1.3335f, 7.7909f, 1.3335f, 10.0f)
                    curveTo(1.3335f, 12.2091f, 3.1244f, 14.0f, 5.3335f, 14.0f)
                    close()
                    moveTo(8.0003f, 7.3334f)
                    curveTo(8.0003f, 7.7015f, 7.7018f, 8.0f, 7.3337f, 8.0f)
                    curveTo(6.9655f, 8.0f, 6.667f, 7.7015f, 6.667f, 7.3334f)
                    curveTo(6.667f, 6.9652f, 6.9655f, 6.6667f, 7.3337f, 6.6667f)
                    curveTo(7.7018f, 6.6667f, 8.0003f, 6.9652f, 8.0003f, 7.3334f)
                    close()
                    moveTo(7.3337f, 10.6666f)
                    curveTo(7.7018f, 10.6666f, 8.0003f, 10.3682f, 8.0003f, 10.0f)
                    curveTo(8.0003f, 9.6318f, 7.7018f, 9.3333f, 7.3337f, 9.3333f)
                    curveTo(6.9655f, 9.3333f, 6.667f, 9.6318f, 6.667f, 10.0f)
                    curveTo(6.667f, 10.3682f, 6.9655f, 10.6666f, 7.3337f, 10.6666f)
                    close()
                    moveTo(8.0003f, 12.6667f)
                    curveTo(8.0003f, 13.0349f, 7.7018f, 13.3333f, 7.3337f, 13.3333f)
                    curveTo(6.9655f, 13.3333f, 6.667f, 13.0349f, 6.667f, 12.6667f)
                    curveTo(6.667f, 12.2985f, 6.9655f, 12.0f, 7.3337f, 12.0f)
                    curveTo(7.7018f, 12.0f, 8.0003f, 12.2985f, 8.0003f, 12.6667f)
                    close()
                }
            }
        }
        .build()
        return _km!!
    }

private var _km: ImageVector? = null
