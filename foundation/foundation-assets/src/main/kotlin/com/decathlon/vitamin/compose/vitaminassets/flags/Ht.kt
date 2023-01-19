package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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

public val FlagsGroup.Ht: ImageVector
    get() {
        if (_ht != null) {
            return _ht!!
        }
        _ht = Builder(name = "Ht", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF112EBC)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 9.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(9.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE3264A)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(9.33331f,6.66666f), end = Offset(9.33331f,14.6667f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(10.0f, 6.6667f)
                    lineTo(18.0f, 6.6667f)
                    arcTo(0.6667f, 0.6667f, 0.0f, false, true, 18.6666f, 7.3333f)
                    lineTo(18.6666f, 14.0f)
                    arcTo(0.6667f, 0.6667f, 0.0f, false, true, 18.0f, 14.6667f)
                    lineTo(10.0f, 14.6667f)
                    arcTo(0.6667f, 0.6667f, 0.0f, false, true, 9.3333f, 14.0f)
                    lineTo(9.3333f, 7.3333f)
                    arcTo(0.6667f, 0.6667f, 0.0f, false, true, 10.0f, 6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFAABCAE)), stroke = SolidColor(Color(0xFF366C14)),
                        strokeLineWidth = 0.666667f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(9.6666f, 14.3333f)
                    verticalLineTo(13.5393f)
                    lineTo(11.586f, 12.5797f)
                    curveTo(11.91f, 12.4177f, 12.2673f, 12.3333f, 12.6295f, 12.3333f)
                    horizontalLineTo(15.3705f)
                    curveTo(15.7327f, 12.3333f, 16.09f, 12.4177f, 16.414f, 12.5797f)
                    lineTo(18.3333f, 13.5393f)
                    verticalLineTo(14.3333f)
                    horizontalLineTo(9.6666f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFD4B872)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 12.0f)
                    curveTo(15.1046f, 12.0f, 16.0f, 11.1046f, 16.0f, 10.0f)
                    curveTo(16.0f, 8.8954f, 15.1046f, 8.0f, 14.0f, 8.0f)
                    curveTo(12.8954f, 8.0f, 12.0f, 8.8954f, 12.0f, 10.0f)
                    curveTo(12.0f, 11.1046f, 12.8954f, 12.0f, 14.0f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFC28321)), stroke = SolidColor(Color(0xFF0D3488)),
                        strokeLineWidth = 0.666667f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(11.0f, 11.3871f)
                    curveTo(11.0f, 11.1076f, 11.3233f, 10.9522f, 11.5415f, 11.1268f)
                    lineTo(13.3753f, 12.5938f)
                    curveTo(13.7405f, 12.886f, 14.2594f, 12.886f, 14.6247f, 12.5938f)
                    lineTo(16.4584f, 11.1268f)
                    curveTo(16.6766f, 10.9522f, 17.0f, 11.1076f, 17.0f, 11.3871f)
                    verticalLineTo(12.6667f)
                    curveTo(17.0f, 12.8508f, 16.8507f, 13.0f, 16.6666f, 13.0f)
                    horizontalLineTo(11.3333f)
                    curveTo(11.1492f, 13.0f, 11.0f, 12.8508f, 11.0f, 12.6667f)
                    verticalLineTo(11.3871f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF216C30)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.569f, 8.569f)
                    curveTo(12.359f, 8.359f, 12.5078f, 8.0f, 12.8047f, 8.0f)
                    horizontalLineTo(15.1953f)
                    curveTo(15.4922f, 8.0f, 15.641f, 8.359f, 15.431f, 8.569f)
                    lineTo(14.2357f, 9.7643f)
                    curveTo(14.1055f, 9.8945f, 13.8945f, 9.8945f, 13.7643f, 9.7643f)
                    lineTo(12.569f, 8.569f)
                    close()
                }
            }
        }
        .build()
        return _ht!!
    }

private var _ht: ImageVector? = null
