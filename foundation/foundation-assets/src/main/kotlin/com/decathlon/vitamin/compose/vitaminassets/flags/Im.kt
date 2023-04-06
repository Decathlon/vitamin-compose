package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
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

public val FlagsGroup.Im: ImageVector
    get() {
        if (_im != null) {
            return _im!!
        }
        _im = Builder(name = "Im", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFD01129)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.1358f,3.09634f), end = Offset(14.1358f,18.5566f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(22.0f, 4.0f)
                    horizontalLineTo(19.3334f)
                    lineTo(17.3334f, 8.6667f)
                    lineTo(15.3334f, 7.3334f)
                    curveTo(15.3334f, 7.3334f, 13.8814f, 3.8814f, 13.3334f, 3.3333f)
                    curveTo(12.7853f, 2.7853f, 12.2296f, 3.2923f, 10.494f, 3.7984f)
                    curveTo(8.7584f, 4.3044f, 8.6911f, 4.885f, 8.0122f, 4.885f)
                    curveTo(7.7376f, 4.885f, 6.8636f, 3.8723f, 6.3763f, 3.5698f)
                    curveTo(5.6594f, 3.1248f, 5.4009f, 3.3333f, 5.5738f, 4.0f)
                    curveTo(5.6485f, 4.2882f, 6.2178f, 4.6438f, 6.5785f, 5.161f)
                    curveTo(7.0523f, 5.8403f, 7.3334f, 6.6667f, 7.3334f, 6.6667f)
                    curveTo(7.3334f, 6.6667f, 7.9834f, 6.0591f, 8.3332f, 5.9592f)
                    curveTo(8.864f, 5.8075f, 9.4619f, 6.0677f, 10.1622f, 5.9592f)
                    curveTo(11.0526f, 5.8211f, 12.0f, 5.3334f, 12.0f, 5.3334f)
                    lineTo(12.2318f, 7.876f)
                    curveTo(12.2318f, 7.876f, 9.0603f, 10.8232f, 9.3334f, 12.0f)
                    curveTo(9.6065f, 13.1768f, 12.6253f, 14.6219f, 13.3334f, 15.653f)
                    curveTo(14.0415f, 16.6841f, 12.9125f, 17.0685f, 12.9125f, 17.5637f)
                    curveTo(12.9125f, 18.0589f, 12.7948f, 18.7187f, 13.3334f, 18.5205f)
                    curveTo(13.872f, 18.3224f, 13.9372f, 17.4638f, 14.4312f, 16.6841f)
                    curveTo(14.771f, 16.1477f, 15.0447f, 15.865f, 15.0917f, 15.653f)
                    curveTo(15.207f, 15.1328f, 13.7215f, 13.7673f, 12.9125f, 12.7993f)
                    curveTo(12.5271f, 12.3382f, 11.7504f, 11.7127f, 11.7504f, 11.7127f)
                    lineTo(14.0415f, 10.0f)
                    curveTo(14.0415f, 10.0f, 17.9963f, 11.6335f, 18.8884f, 11.0892f)
                    curveTo(19.7805f, 10.5449f, 20.0f, 5.3334f, 20.0f, 5.3334f)
                    lineTo(22.7496f, 4.6667f)
                    lineTo(22.0f, 4.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF8DD4E), 1.0f to Color(0xFFF9DA38),
                        start = Offset(12.6666f,3.33331f), end = Offset(12.6666f,15.3333f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(15.3332f, 15.3333f)
                    curveTo(14.965f, 15.3333f, 14.6666f, 15.0348f, 14.6666f, 14.6666f)
                    curveTo(14.6666f, 14.2985f, 14.965f, 14.0f, 15.3332f, 14.0f)
                    curveTo(15.7014f, 14.0f, 15.9999f, 14.2985f, 15.9999f, 14.6666f)
                    curveTo(15.9999f, 15.0348f, 15.7014f, 15.3333f, 15.3332f, 15.3333f)
                    close()
                    moveTo(17.9999f, 4.6666f)
                    curveTo(17.6317f, 4.6666f, 17.3332f, 4.3682f, 17.3332f, 4.0f)
                    curveTo(17.3332f, 3.6318f, 17.6317f, 3.3333f, 17.9999f, 3.3333f)
                    curveTo(18.3681f, 3.3333f, 18.6666f, 3.6318f, 18.6666f, 4.0f)
                    curveTo(18.6666f, 4.3682f, 18.3681f, 4.6666f, 17.9999f, 4.6666f)
                    close()
                    moveTo(17.9999f, 10.0f)
                    curveTo(17.6317f, 10.0f, 17.3332f, 9.7015f, 17.3332f, 9.3333f)
                    curveTo(17.3332f, 8.9651f, 17.6317f, 8.6666f, 17.9999f, 8.6666f)
                    curveTo(18.3681f, 8.6666f, 18.6666f, 8.9651f, 18.6666f, 9.3333f)
                    curveTo(18.6666f, 9.7015f, 18.3681f, 10.0f, 17.9999f, 10.0f)
                    close()
                    moveTo(9.9999f, 12.6666f)
                    curveTo(9.6317f, 12.6666f, 9.3332f, 12.3682f, 9.3332f, 12.0f)
                    curveTo(9.3332f, 11.6318f, 9.6317f, 11.3333f, 9.9999f, 11.3333f)
                    curveTo(10.3681f, 11.3333f, 10.6666f, 11.6318f, 10.6666f, 12.0f)
                    curveTo(10.6666f, 12.3682f, 10.3681f, 12.6666f, 9.9999f, 12.6666f)
                    close()
                    moveTo(12.6666f, 4.6666f)
                    curveTo(12.2984f, 4.6666f, 11.9999f, 4.3682f, 11.9999f, 4.0f)
                    curveTo(11.9999f, 3.6318f, 12.2984f, 3.3333f, 12.6666f, 3.3333f)
                    curveTo(13.0348f, 3.3333f, 13.3332f, 3.6318f, 13.3332f, 4.0f)
                    curveTo(13.3332f, 4.3682f, 13.0348f, 4.6666f, 12.6666f, 4.6666f)
                    close()
                    moveTo(13.9999f, 10.0f)
                    curveTo(13.6317f, 10.0f, 13.3332f, 9.403f, 13.3332f, 8.6666f)
                    curveTo(13.3332f, 7.9303f, 13.6317f, 7.3333f, 13.9999f, 7.3333f)
                    curveTo(14.3681f, 7.3333f, 14.6666f, 7.9303f, 14.6666f, 8.6666f)
                    curveTo(14.6666f, 9.403f, 14.3681f, 10.0f, 13.9999f, 10.0f)
                    close()
                    moveTo(7.3332f, 7.3333f)
                    curveTo(6.965f, 7.3333f, 6.6666f, 7.0348f, 6.6666f, 6.6666f)
                    curveTo(6.6666f, 6.2985f, 6.965f, 6.0f, 7.3332f, 6.0f)
                    curveTo(7.7014f, 6.0f, 7.9999f, 6.2985f, 7.9999f, 6.6666f)
                    curveTo(7.9999f, 7.0348f, 7.7014f, 7.3333f, 7.3332f, 7.3333f)
                    close()
                }
            }
        }
        .build()
        return _im!!
    }

private var _im: ImageVector? = null
