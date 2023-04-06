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

public val FlagsGroup.Ht: ImageVector
    get() {
        if (_ht != null) {
            return _ht!!
        }
        _ht = Builder(name = "Ht", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(-0.0f, 0.0f)
                    lineTo(27.9999f, 0.0f)
                    curveTo(27.9999f, 6.0f, 27.9999f, 14.0f, 27.9999f, 20.0f)
                    curveTo(18.6666f, 20.0f, 9.3333f, 20.0f, -1.0E-4f, 20.0f)
                    curveTo(-1.0E-4f, 14.0f, -2.0E-4f, 6.0f, -0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF112EBC)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(-1.0E-4f, 9.3333f)
                    horizontalLineTo(27.9999f)
                    verticalLineTo(0.0f)
                    lineTo(-0.0f, 0.0f)
                    lineTo(-1.0E-4f, 9.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE3264A)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(-1.0E-4f, 20.0f)
                    horizontalLineTo(27.9999f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(-1.0E-4f)
                    lineTo(-1.0E-4f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFBFBFB)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.3333f, 7.3334f)
                    curveTo(9.3333f, 6.9652f, 9.6318f, 6.6667f, 10.0f, 6.6667f)
                    horizontalLineTo(18.0f)
                    curveTo(18.3681f, 6.6667f, 18.6666f, 6.9652f, 18.6666f, 7.3334f)
                    verticalLineTo(14.0f)
                    curveTo(18.6666f, 14.3682f, 18.3681f, 14.6667f, 18.0f, 14.6667f)
                    horizontalLineTo(10.0f)
                    curveTo(9.6318f, 14.6667f, 9.3333f, 14.3682f, 9.3333f, 14.0f)
                    verticalLineTo(7.3334f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFAABCAE)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.3333f, 13.3333f)
                    lineTo(11.4369f, 12.2815f)
                    curveTo(11.8072f, 12.0964f, 12.2155f, 12.0f, 12.6295f, 12.0f)
                    horizontalLineTo(15.3704f)
                    curveTo(15.7844f, 12.0f, 16.1927f, 12.0964f, 16.563f, 12.2815f)
                    lineTo(18.6666f, 13.3333f)
                    verticalLineTo(14.6667f)
                    horizontalLineTo(9.3333f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF366C14)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(10.0f, 13.7454f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(13.7454f)
                    lineTo(16.2649f, 12.8778f)
                    curveTo(15.9872f, 12.739f, 15.6809f, 12.6667f, 15.3704f, 12.6667f)
                    horizontalLineTo(12.6295f)
                    curveTo(12.319f, 12.6667f, 12.0128f, 12.739f, 11.735f, 12.8778f)
                    lineTo(10.0f, 13.7454f)
                    close()
                    moveTo(18.6666f, 13.3333f)
                    lineTo(16.563f, 12.2815f)
                    curveTo(16.1927f, 12.0964f, 15.7844f, 12.0f, 15.3704f, 12.0f)
                    horizontalLineTo(12.6295f)
                    curveTo(12.2155f, 12.0f, 11.8072f, 12.0964f, 11.4369f, 12.2815f)
                    lineTo(9.3333f, 13.3333f)
                    verticalLineTo(14.6667f)
                    horizontalLineTo(18.6666f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFD4B872)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0f, 12.0f)
                    curveTo(15.1045f, 12.0f, 16.0f, 11.1046f, 16.0f, 10.0f)
                    curveTo(16.0f, 8.8954f, 15.1045f, 8.0f, 14.0f, 8.0f)
                    curveTo(12.8954f, 8.0f, 12.0f, 8.8954f, 12.0f, 10.0f)
                    curveTo(12.0f, 11.1046f, 12.8954f, 12.0f, 14.0f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFC28321)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(10.6666f, 11.3871f)
                    curveTo(10.6666f, 10.8281f, 11.3132f, 10.5173f, 11.7498f, 10.8665f)
                    lineTo(13.5835f, 12.3335f)
                    curveTo(13.827f, 12.5283f, 14.1729f, 12.5283f, 14.4164f, 12.3335f)
                    lineTo(16.2502f, 10.8665f)
                    curveTo(16.6867f, 10.5173f, 17.3333f, 10.8281f, 17.3333f, 11.3871f)
                    verticalLineTo(12.6667f)
                    curveTo(17.3333f, 13.0349f, 17.0348f, 13.3333f, 16.6666f, 13.3333f)
                    horizontalLineTo(11.3333f)
                    curveTo(10.9651f, 13.3333f, 10.6666f, 13.0349f, 10.6666f, 12.6667f)
                    verticalLineTo(11.3871f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0D3488)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.9328f, 12.6667f)
                    lineTo(11.3333f, 11.3871f)
                    lineTo(11.3333f, 12.6667f)
                    horizontalLineTo(12.9328f)
                    close()
                    moveTo(15.0671f, 12.6667f)
                    horizontalLineTo(16.6666f)
                    verticalLineTo(11.3871f)
                    lineTo(15.0671f, 12.6667f)
                    close()
                    moveTo(11.7498f, 10.8665f)
                    curveTo(11.3132f, 10.5173f, 10.6666f, 10.8281f, 10.6666f, 11.3871f)
                    verticalLineTo(12.6667f)
                    curveTo(10.6666f, 13.0349f, 10.9651f, 13.3333f, 11.3333f, 13.3333f)
                    horizontalLineTo(16.6666f)
                    curveTo(17.0348f, 13.3333f, 17.3333f, 13.0349f, 17.3333f, 12.6667f)
                    verticalLineTo(11.3871f)
                    curveTo(17.3333f, 10.8281f, 16.6867f, 10.5173f, 16.2502f, 10.8665f)
                    lineTo(14.4164f, 12.3335f)
                    curveTo(14.1729f, 12.5283f, 13.827f, 12.5283f, 13.5835f, 12.3335f)
                    lineTo(11.7498f, 10.8665f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF216C30)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.569f, 8.569f)
                    curveTo(12.359f, 8.3591f, 12.5077f, 8.0f, 12.8047f, 8.0f)
                    horizontalLineTo(15.1952f)
                    curveTo(15.4922f, 8.0f, 15.6409f, 8.3591f, 15.4309f, 8.569f)
                    lineTo(14.2357f, 9.7643f)
                    curveTo(14.1055f, 9.8945f, 13.8944f, 9.8945f, 13.7643f, 9.7643f)
                    lineTo(12.569f, 8.569f)
                    close()
                }
            }
        }
        .build()
        return _ht!!
    }

private var _ht: ImageVector? = null
