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

public val FlagsGroup.Br: ImageVector
    get() {
        if (_br != null) {
            return _br!!
        }
        _br = Builder(name = "Br", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 2.0f)
                    curveTo(0.0f, 0.8954f, 0.8954f, 0.0f, 2.0f, 0.0f)
                    horizontalLineTo(26.0f)
                    curveTo(27.1046f, 0.0f, 28.0f, 0.8954f, 28.0f, 2.0f)
                    verticalLineTo(18.0f)
                    curveTo(28.0f, 19.1046f, 27.1046f, 20.0f, 26.0f, 20.0f)
                    horizontalLineTo(2.0f)
                    curveTo(0.8954f, 20.0f, 0.0f, 19.1046f, 0.0f, 18.0f)
                    verticalLineTo(2.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF05AB41)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFDD216)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(3.5315f, 10.5597f)
                    curveTo(3.1255f, 10.297f, 3.1255f, 9.703f, 3.5315f, 9.4403f)
                    lineTo(13.6377f, 2.901f)
                    curveTo(13.8581f, 2.7584f, 14.1416f, 2.7584f, 14.362f, 2.901f)
                    lineTo(24.4682f, 9.4403f)
                    curveTo(24.8742f, 9.703f, 24.8742f, 10.297f, 24.4682f, 10.5597f)
                    lineTo(14.362f, 17.099f)
                    curveTo(14.1416f, 17.2416f, 13.8581f, 17.2416f, 13.6377f, 17.099f)
                    lineTo(3.5315f, 10.5597f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF053087)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.0002f, 14.6666f)
                    curveTo(16.5775f, 14.6666f, 18.6668f, 12.5773f, 18.6668f, 10.0f)
                    curveTo(18.6668f, 7.4226f, 16.5775f, 5.3333f, 14.0002f, 5.3333f)
                    curveTo(11.4228f, 5.3333f, 9.3335f, 7.4226f, 9.3335f, 10.0f)
                    curveTo(9.3335f, 12.5773f, 11.4228f, 14.6666f, 14.0002f, 14.6666f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.6473f, 9.1997f)
                    curveTo(9.3332f, 9.2185f, 9.2192f, 9.2822f, 9.1994f, 9.2983f)
                    lineTo(8.6813f, 9.7178f)
                    lineTo(7.8422f, 8.6817f)
                    lineTo(8.3603f, 8.2621f)
                    curveTo(8.7068f, 7.9815f, 9.1632f, 7.893f, 9.5675f, 7.8687f)
                    curveTo(9.9914f, 7.8433f, 10.4752f, 7.883f, 10.9753f, 7.956f)
                    curveTo(11.9768f, 8.1022f, 13.154f, 8.3996f, 14.2558f, 8.6936f)
                    curveTo(15.4106f, 9.0016f, 16.5819f, 9.4756f, 17.5428f, 9.9667f)
                    curveTo(18.0239f, 10.2126f, 18.4606f, 10.467f, 18.8214f, 10.7128f)
                    curveTo(19.1714f, 10.9513f, 19.489f, 11.2077f, 19.6971f, 11.4647f)
                    lineTo(20.1167f, 11.9828f)
                    lineTo(19.0805f, 12.8219f)
                    lineTo(18.6609f, 12.3038f)
                    curveTo(18.576f, 12.1989f, 18.3861f, 12.0296f, 18.0707f, 11.8147f)
                    curveTo(17.7661f, 11.6072f, 17.3795f, 11.3806f, 16.936f, 11.1539f)
                    curveTo(16.0476f, 10.6999f, 14.9644f, 10.2625f, 13.9122f, 9.9818f)
                    curveTo(12.8069f, 9.687f, 11.6984f, 9.409f, 10.7827f, 9.2753f)
                    curveTo(10.3243f, 9.2084f, 9.9417f, 9.182f, 9.6473f, 9.1997f)
                    close()
                }
            }
        }
        .build()
        return _br!!
    }

private var _br: ImageVector? = null
