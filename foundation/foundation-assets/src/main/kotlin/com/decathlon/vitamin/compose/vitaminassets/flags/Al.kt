package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.graphics.Color
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

public val FlagsGroup.Al: ImageVector
    get() {
        if (_al != null) {
            return _al!!
        }
        _al = Builder(name = "Al", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFEE343C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.3865f, 4.3865f)
                    curveTo(12.1618f, 4.1617f, 11.8097f, 4.1269f, 11.5453f, 4.3032f)
                    lineTo(10.9559f, 4.6961f)
                    curveTo(10.53f, 4.98f, 10.5697f, 5.6182f, 11.0275f, 5.8471f)
                    lineTo(12.2982f, 6.4824f)
                    curveTo(12.524f, 6.5953f, 12.6667f, 6.8262f, 12.6667f, 7.0787f)
                    verticalLineTo(7.3333f)
                    curveTo(12.6667f, 7.7015f, 12.3682f, 8.0f, 12.0f, 8.0f)
                    horizontalLineTo(11.4908f)
                    curveTo(11.3873f, 8.0f, 11.2852f, 7.9759f, 11.1926f, 7.9296f)
                    lineTo(9.0965f, 6.8816f)
                    curveTo(8.8398f, 6.7532f, 8.5299f, 6.8035f, 8.3269f, 7.0064f)
                    lineTo(7.9874f, 7.346f)
                    curveTo(7.6656f, 7.6677f, 7.7537f, 8.2101f, 8.1607f, 8.4136f)
                    lineTo(9.1046f, 8.8856f)
                    curveTo(9.5036f, 9.0851f, 9.5382f, 9.6412f, 9.1671f, 9.8886f)
                    curveTo(8.7364f, 10.1758f, 8.8679f, 10.8402f, 9.3754f, 10.9417f)
                    lineTo(9.9373f, 11.0541f)
                    curveTo(10.4769f, 11.162f, 10.6346f, 11.8574f, 10.1944f, 12.1875f)
                    lineTo(9.6913f, 12.5649f)
                    curveTo(9.3631f, 12.811f, 9.5372f, 13.3333f, 9.9475f, 13.3333f)
                    curveTo(9.9824f, 13.3333f, 10.0172f, 13.3291f, 10.051f, 13.3206f)
                    lineTo(11.3128f, 13.0051f)
                    curveTo(11.7912f, 12.8855f, 12.1661f, 13.4175f, 11.8926f, 13.8278f)
                    curveTo(11.6536f, 14.1864f, 11.9106f, 14.6667f, 12.3415f, 14.6667f)
                    horizontalLineTo(12.925f)
                    curveTo(13.1689f, 14.6667f, 13.3854f, 14.8227f, 13.4625f, 15.0541f)
                    curveTo(13.6347f, 15.5707f, 14.3654f, 15.5707f, 14.5376f, 15.0541f)
                    curveTo(14.6147f, 14.8227f, 14.8312f, 14.6667f, 15.0751f, 14.6667f)
                    horizontalLineTo(15.6586f)
                    curveTo(16.0895f, 14.6667f, 16.3465f, 14.1864f, 16.1075f, 13.8278f)
                    curveTo(15.8339f, 13.4175f, 16.2088f, 12.8855f, 16.6873f, 13.0051f)
                    lineTo(17.9491f, 13.3206f)
                    curveTo(17.9829f, 13.3291f, 18.0177f, 13.3333f, 18.0526f, 13.3333f)
                    curveTo(18.4629f, 13.3333f, 18.637f, 12.811f, 18.3088f, 12.5649f)
                    lineTo(17.8057f, 12.1875f)
                    curveTo(17.3655f, 11.8574f, 17.5232f, 11.162f, 18.0628f, 11.0541f)
                    lineTo(18.6247f, 10.9417f)
                    curveTo(19.1322f, 10.8402f, 19.2637f, 10.1758f, 18.833f, 9.8886f)
                    curveTo(18.4619f, 9.6412f, 18.4965f, 9.0851f, 18.8955f, 8.8856f)
                    lineTo(19.8394f, 8.4136f)
                    curveTo(20.2464f, 8.2101f, 20.3344f, 7.6677f, 20.0127f, 7.346f)
                    lineTo(19.6731f, 7.0064f)
                    curveTo(19.4702f, 6.8035f, 19.1603f, 6.7532f, 18.9036f, 6.8816f)
                    lineTo(16.8075f, 7.9296f)
                    curveTo(16.7149f, 7.9759f, 16.6128f, 8.0f, 16.5093f, 8.0f)
                    horizontalLineTo(16.0f)
                    curveTo(15.6319f, 8.0f, 15.3334f, 7.7015f, 15.3334f, 7.3333f)
                    verticalLineTo(7.0787f)
                    curveTo(15.3334f, 6.8262f, 15.476f, 6.5953f, 15.7019f, 6.4824f)
                    curveTo(16.0945f, 6.2861f, 16.5621f, 6.0523f, 16.9728f, 5.847f)
                    curveTo(17.4306f, 5.6181f, 17.4701f, 4.98f, 17.0442f, 4.6961f)
                    lineTo(16.4548f, 4.3032f)
                    curveTo(16.1904f, 4.1269f, 15.8383f, 4.1617f, 15.6136f, 4.3865f)
                    lineTo(14.4714f, 5.5286f)
                    curveTo(14.2111f, 5.7889f, 13.789f, 5.7889f, 13.5286f, 5.5286f)
                    lineTo(12.3865f, 4.3865f)
                    close()
                }
            }
        }
        .build()
        return _al!!
    }

private var _al: ImageVector? = null
