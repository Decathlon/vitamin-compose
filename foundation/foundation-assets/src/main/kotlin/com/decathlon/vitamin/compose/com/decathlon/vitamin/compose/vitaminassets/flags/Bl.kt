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

public val FlagsGroup.Bl: ImageVector
    get() {
        if (_bl != null) {
            return _bl!!
        }
        _bl = Builder(name = "Bl", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0481f, 0.0f)
                    horizontalLineTo(0.0481f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0481f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF216CD3)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.3814f, 6.6667f)
                    horizontalLineTo(18.7148f)
                    verticalLineTo(12.655f)
                    curveTo(18.7148f, 13.3978f, 18.2673f, 14.3835f, 17.7022f, 14.8679f)
                    lineTo(15.5761f, 16.6903f)
                    curveTo(14.7322f, 17.4136f, 13.3595f, 17.4098f, 12.5201f, 16.6903f)
                    lineTo(10.394f, 14.8679f)
                    curveTo(9.8348f, 14.3886f, 9.3814f, 13.3999f, 9.3814f, 12.655f)
                    verticalLineTo(6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF7E14B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.3814f, 9.3333f)
                    curveTo(11.0132f, 9.3333f, 10.7148f, 9.0348f, 10.7148f, 8.6666f)
                    curveTo(10.7148f, 8.2985f, 11.0132f, 8.0f, 11.3814f, 8.0f)
                    curveTo(11.7496f, 8.0f, 12.0481f, 8.2985f, 12.0481f, 8.6666f)
                    curveTo(12.0481f, 9.0348f, 11.7496f, 9.3333f, 11.3814f, 9.3333f)
                    close()
                    moveTo(14.0481f, 9.3333f)
                    curveTo(13.6799f, 9.3333f, 13.3814f, 9.0348f, 13.3814f, 8.6666f)
                    curveTo(13.3814f, 8.2985f, 13.6799f, 8.0f, 14.0481f, 8.0f)
                    curveTo(14.4163f, 8.0f, 14.7148f, 8.2985f, 14.7148f, 8.6666f)
                    curveTo(14.7148f, 9.0348f, 14.4163f, 9.3333f, 14.0481f, 9.3333f)
                    close()
                    moveTo(16.7148f, 9.3333f)
                    curveTo(16.3466f, 9.3333f, 16.0481f, 9.0348f, 16.0481f, 8.6666f)
                    curveTo(16.0481f, 8.2985f, 16.3466f, 8.0f, 16.7148f, 8.0f)
                    curveTo(17.0829f, 8.0f, 17.3814f, 8.2985f, 17.3814f, 8.6666f)
                    curveTo(17.3814f, 9.0348f, 17.0829f, 9.3333f, 16.7148f, 9.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF7E14B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.0481f, 15.3333f)
                    curveTo(11.6799f, 15.3333f, 11.3814f, 15.0348f, 11.3814f, 14.6666f)
                    curveTo(11.3814f, 14.2985f, 11.6799f, 14.0f, 12.0481f, 14.0f)
                    curveTo(12.4163f, 14.0f, 12.7148f, 14.2985f, 12.7148f, 14.6666f)
                    curveTo(12.7148f, 15.0348f, 12.4163f, 15.3333f, 12.0481f, 15.3333f)
                    close()
                    moveTo(14.0481f, 16.0f)
                    curveTo(13.6799f, 16.0f, 13.3814f, 15.7015f, 13.3814f, 15.3333f)
                    curveTo(13.3814f, 14.9651f, 13.6799f, 14.6666f, 14.0481f, 14.6666f)
                    curveTo(14.4163f, 14.6666f, 14.7148f, 14.9651f, 14.7148f, 15.3333f)
                    curveTo(14.7148f, 15.7015f, 14.4163f, 16.0f, 14.0481f, 16.0f)
                    close()
                    moveTo(16.0481f, 15.3333f)
                    curveTo(15.6799f, 15.3333f, 15.3814f, 15.0348f, 15.3814f, 14.6666f)
                    curveTo(15.3814f, 14.2985f, 15.6799f, 14.0f, 16.0481f, 14.0f)
                    curveTo(16.4163f, 14.0f, 16.7148f, 14.2985f, 16.7148f, 14.6666f)
                    curveTo(16.7148f, 15.0348f, 16.4163f, 15.3333f, 16.0481f, 15.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE12539)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.7148f, 10.6666f)
                    horizontalLineTo(9.3814f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(18.7148f)
                    verticalLineTo(10.6666f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0481f, 13.3333f)
                    curveTo(14.7845f, 13.3333f, 15.3814f, 12.7364f, 15.3814f, 12.0f)
                    curveTo(15.3814f, 11.2636f, 14.7845f, 10.6666f, 14.0481f, 10.6666f)
                    curveTo(13.3117f, 10.6666f, 12.7148f, 11.2636f, 12.7148f, 12.0f)
                    curveTo(12.7148f, 12.7364f, 13.3117f, 13.3333f, 14.0481f, 13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF7E14B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.7148f, 4.6667f)
                    curveTo(8.7148f, 4.6667f, 11.3814f, 4.0f, 14.0481f, 4.0f)
                    curveTo(16.7148f, 4.0f, 19.3814f, 4.6667f, 19.3814f, 4.6667f)
                    lineTo(18.7148f, 7.3333f)
                    curveTo(18.7148f, 7.3333f, 16.3814f, 6.6667f, 14.0481f, 6.6667f)
                    curveTo(11.7148f, 6.6667f, 9.3814f, 7.3333f, 9.3814f, 7.3333f)
                    lineTo(8.7148f, 4.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF5E5216)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0481f, 6.0f)
                    curveTo(13.6799f, 6.0f, 13.3814f, 5.7015f, 13.3814f, 5.3333f)
                    curveTo(13.3814f, 4.9651f, 13.6799f, 4.6667f, 14.0481f, 4.6667f)
                    curveTo(14.4163f, 4.6667f, 14.7148f, 4.9651f, 14.7148f, 5.3333f)
                    curveTo(14.7148f, 5.7015f, 14.4163f, 6.0f, 14.0481f, 6.0f)
                    close()
                    moveTo(16.7148f, 6.0f)
                    curveTo(16.3466f, 6.0f, 16.0481f, 5.7015f, 16.0481f, 5.3333f)
                    curveTo(16.0481f, 4.9651f, 16.3466f, 4.6667f, 16.7148f, 4.6667f)
                    curveTo(17.083f, 4.6667f, 17.3814f, 4.9651f, 17.3814f, 5.3333f)
                    curveTo(17.3814f, 5.7015f, 17.083f, 6.0f, 16.7148f, 6.0f)
                    close()
                    moveTo(11.3814f, 6.0f)
                    curveTo(11.0132f, 6.0f, 10.7148f, 5.7015f, 10.7148f, 5.3333f)
                    curveTo(10.7148f, 4.9651f, 11.0132f, 4.6667f, 11.3814f, 4.6667f)
                    curveTo(11.7496f, 4.6667f, 12.0481f, 4.9651f, 12.0481f, 5.3333f)
                    curveTo(12.0481f, 5.7015f, 11.7496f, 6.0f, 11.3814f, 6.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF8996A2)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0481f, 0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0481f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0481f)
                    close()
                    moveTo(27.5481f, 0.5f)
                    horizontalLineTo(0.5481f)
                    lineTo(0.5481f, 19.5f)
                    horizontalLineTo(27.5481f)
                    verticalLineTo(0.5f)
                    close()
                }
            }
        }
        .build()
        return _bl!!
    }

private var _bl: ImageVector? = null
