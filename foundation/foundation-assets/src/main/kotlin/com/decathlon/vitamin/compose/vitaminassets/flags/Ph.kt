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

public val FlagsGroup.Ph: ImageVector
    get() {
        if (_ph != null) {
            return _ph!!
        }
        _ph = Builder(name = "Ph", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFFDD1C34)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(9.3333f)
                    horizontalLineTo(12.4444f)
                    lineTo(13.3333f, 10.0f)
                    lineTo(0.0f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0D4BC3)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(28.0f, 9.3333f)
                    horizontalLineTo(12.4444f)
                    lineTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(9.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFDD64D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(2.0f, 4.0f)
                    curveTo(2.3682f, 4.0f, 2.6667f, 3.7015f, 2.6667f, 3.3333f)
                    curveTo(2.6667f, 2.9652f, 2.3682f, 2.6667f, 2.0f, 2.6667f)
                    curveTo(1.6319f, 2.6667f, 1.3334f, 2.9652f, 1.3334f, 3.3333f)
                    curveTo(1.3334f, 3.7015f, 1.6319f, 4.0f, 2.0f, 4.0f)
                    close()
                    moveTo(10.0f, 10.6667f)
                    curveTo(10.3682f, 10.6667f, 10.6667f, 10.3682f, 10.6667f, 10.0f)
                    curveTo(10.6667f, 9.6318f, 10.3682f, 9.3333f, 10.0f, 9.3333f)
                    curveTo(9.6319f, 9.3333f, 9.3334f, 9.6318f, 9.3334f, 10.0f)
                    curveTo(9.3334f, 10.3682f, 9.6319f, 10.6667f, 10.0f, 10.6667f)
                    close()
                    moveTo(2.6667f, 16.6667f)
                    curveTo(2.6667f, 17.0349f, 2.3682f, 17.3333f, 2.0f, 17.3333f)
                    curveTo(1.6319f, 17.3333f, 1.3334f, 17.0349f, 1.3334f, 16.6667f)
                    curveTo(1.3334f, 16.2985f, 1.6319f, 16.0f, 2.0f, 16.0f)
                    curveTo(2.3682f, 16.0f, 2.6667f, 16.2985f, 2.6667f, 16.6667f)
                    close()
                    moveTo(4.5321f, 11.3266f)
                    lineTo(3.3911f, 13.0796f)
                    lineTo(3.8238f, 11.0332f)
                    curveTo(3.7542f, 10.9763f, 3.6904f, 10.9125f, 3.6335f, 10.8429f)
                    lineTo(1.5871f, 11.2756f)
                    lineTo(3.3401f, 10.1346f)
                    curveTo(3.3356f, 10.0903f, 3.3334f, 10.0454f, 3.3334f, 10.0f)
                    curveTo(3.3334f, 9.9546f, 3.3356f, 9.9097f, 3.3401f, 9.8654f)
                    lineTo(1.5871f, 8.7244f)
                    lineTo(3.6335f, 9.1571f)
                    curveTo(3.6904f, 9.0875f, 3.7542f, 9.0237f, 3.8238f, 8.9668f)
                    lineTo(3.3911f, 6.9204f)
                    lineTo(4.5321f, 8.6734f)
                    curveTo(4.5764f, 8.6689f, 4.6213f, 8.6667f, 4.6667f, 8.6667f)
                    curveTo(4.7121f, 8.6667f, 4.757f, 8.6689f, 4.8013f, 8.6734f)
                    lineTo(5.9423f, 6.9204f)
                    lineTo(5.5096f, 8.9668f)
                    curveTo(5.5792f, 9.0237f, 5.643f, 9.0875f, 5.6999f, 9.1571f)
                    lineTo(7.7463f, 8.7244f)
                    lineTo(5.9933f, 9.8654f)
                    curveTo(5.9978f, 9.9097f, 6.0f, 9.9546f, 6.0f, 10.0f)
                    curveTo(6.0f, 10.0454f, 5.9978f, 10.0903f, 5.9933f, 10.1346f)
                    lineTo(7.7463f, 11.2756f)
                    lineTo(5.6999f, 10.8429f)
                    curveTo(5.643f, 10.9125f, 5.5792f, 10.9763f, 5.5096f, 11.0332f)
                    lineTo(5.9423f, 13.0796f)
                    lineTo(4.8013f, 11.3266f)
                    curveTo(4.757f, 11.3311f, 4.7121f, 11.3333f, 4.6667f, 11.3333f)
                    curveTo(4.6213f, 11.3333f, 4.5764f, 11.3311f, 4.5321f, 11.3266f)
                    close()
                }
            }
        }
        .build()
        return _ph!!
    }

private var _ph: ImageVector? = null
