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

public val FlagsGroup.Eg: ImageVector
    get() {
        if (_eg != null) {
            return _eg!!
        }
        _eg = Builder(name = "Eg", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFFE41D33)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 6.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF262626)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF4B32E)), stroke = SolidColor(Color(0xFFC6A846)),
                        fillAlpha = 0.25f, strokeLineWidth = 0.666667f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(12.3685f, 9.4824f)
                    lineTo(12.6527f, 10.0509f)
                    lineTo(12.9587f, 9.494f)
                    lineTo(12.9587f, 9.494f)
                    lineTo(12.9587f, 9.4939f)
                    lineTo(12.9588f, 9.4938f)
                    lineTo(12.9589f, 9.4937f)
                    lineTo(12.96f, 9.4916f)
                    lineTo(12.9653f, 9.4822f)
                    curveTo(12.9701f, 9.4736f, 12.9776f, 9.4605f, 12.9874f, 9.4436f)
                    curveTo(13.0071f, 9.4097f, 13.0363f, 9.3607f, 13.0732f, 9.3015f)
                    curveTo(13.1475f, 9.1826f, 13.2513f, 9.0259f, 13.3715f, 8.8708f)
                    curveTo(13.4931f, 8.7137f, 13.6234f, 8.569f, 13.7489f, 8.4666f)
                    curveTo(13.8829f, 8.3572f, 13.9661f, 8.3333f, 14.0f, 8.3333f)
                    curveTo(14.0573f, 8.3333f, 14.151f, 8.3644f, 14.2813f, 8.4686f)
                    curveTo(14.407f, 8.5691f, 14.5335f, 8.7114f, 14.65f, 8.8667f)
                    curveTo(14.765f, 9.02f, 14.862f, 9.1751f, 14.9308f, 9.293f)
                    curveTo(14.9649f, 9.3515f, 14.9916f, 9.4001f, 15.0095f, 9.4334f)
                    curveTo(15.0185f, 9.4501f, 15.0252f, 9.463f, 15.0295f, 9.4714f)
                    lineTo(15.0342f, 9.4805f)
                    lineTo(15.0351f, 9.4824f)
                    lineTo(15.0352f, 9.4824f)
                    lineTo(15.0352f, 9.4825f)
                    lineTo(15.0352f, 9.4826f)
                    lineTo(15.0353f, 9.4826f)
                    lineTo(15.3333f, 10.0787f)
                    lineTo(15.6314f, 9.4824f)
                    lineTo(16.206f, 8.3333f)
                    lineTo(16.6666f, 8.3333f)
                    curveTo(16.8507f, 8.3333f, 17.0f, 8.4826f, 17.0f, 8.6667f)
                    verticalLineTo(10.7543f)
                    curveTo(17.0f, 11.0206f, 16.7032f, 11.1794f, 16.4817f, 11.0317f)
                    lineTo(15.5182f, 10.3893f)
                    lineTo(15.4342f, 10.3333f)
                    horizontalLineTo(15.3333f)
                    horizontalLineTo(14.6666f)
                    horizontalLineTo(14.3333f)
                    verticalLineTo(10.6667f)
                    verticalLineTo(11.3333f)
                    curveTo(14.3333f, 11.5174f, 14.1841f, 11.6667f, 14.0f, 11.6667f)
                    curveTo(13.8159f, 11.6667f, 13.6666f, 11.5174f, 13.6666f, 11.3333f)
                    verticalLineTo(10.6667f)
                    verticalLineTo(10.3333f)
                    horizontalLineTo(13.3333f)
                    horizontalLineTo(12.6666f)
                    horizontalLineTo(12.5657f)
                    lineTo(12.4817f, 10.3893f)
                    lineTo(11.5182f, 11.0317f)
                    curveTo(11.2967f, 11.1794f, 11.0f, 11.0206f, 11.0f, 10.7543f)
                    verticalLineTo(8.6667f)
                    curveTo(11.0f, 8.4826f, 11.1492f, 8.3333f, 11.3333f, 8.3333f)
                    lineTo(11.7939f, 8.3333f)
                    lineTo(12.3685f, 9.4824f)
                    close()
                }
            }
        }
        .build()
        return _eg!!
    }

private var _eg: ImageVector? = null
