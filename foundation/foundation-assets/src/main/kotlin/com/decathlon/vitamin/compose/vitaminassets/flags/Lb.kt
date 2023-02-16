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

public val FlagsGroup.Lb: ImageVector
    get() {
        if (_lb != null) {
            return _lb!!
        }
        _lb = Builder(name = "Lb", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFFF03340)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 5.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(5.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF03340)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(14.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1FC065)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.9428f, 12.3905f)
                    curveTo(13.1585f, 12.1748f, 13.1585f, 11.8251f, 12.9428f, 11.6095f)
                    lineTo(12.8661f, 11.5328f)
                    curveTo(12.7424f, 11.409f, 12.5628f, 11.3593f, 12.3931f, 11.4017f)
                    lineTo(12.0138f, 11.4965f)
                    curveTo(11.5701f, 11.6075f, 11.2948f, 11.0289f, 11.6606f, 10.7545f)
                    lineTo(12.0033f, 10.4975f)
                    curveTo(12.2158f, 10.3381f, 12.1031f, 10.0f, 11.8375f, 10.0f)
                    curveTo(11.5458f, 10.0f, 11.453f, 9.6068f, 11.7139f, 9.4764f)
                    lineTo(12.2861f, 9.1903f)
                    curveTo(12.547f, 9.0598f, 12.4542f, 8.6667f, 12.1625f, 8.6667f)
                    curveTo(11.8969f, 8.6667f, 11.7842f, 8.3285f, 11.9967f, 8.1692f)
                    lineTo(13.6f, 6.9667f)
                    curveTo(13.837f, 6.7889f, 14.163f, 6.7889f, 14.4f, 6.9667f)
                    lineTo(16.0033f, 8.1692f)
                    curveTo(16.2158f, 8.3285f, 16.1031f, 8.6667f, 15.8375f, 8.6667f)
                    curveTo(15.5458f, 8.6667f, 15.453f, 9.0598f, 15.7139f, 9.1903f)
                    lineTo(16.2861f, 9.4764f)
                    curveTo(16.547f, 9.6068f, 16.4542f, 10.0f, 16.1625f, 10.0f)
                    curveTo(15.8969f, 10.0f, 15.7842f, 10.3381f, 15.9967f, 10.4975f)
                    lineTo(16.3394f, 10.7545f)
                    curveTo(16.7052f, 11.0289f, 16.4299f, 11.6075f, 15.9862f, 11.4965f)
                    lineTo(15.6069f, 11.4017f)
                    curveTo(15.4372f, 11.3593f, 15.2576f, 11.409f, 15.1339f, 11.5328f)
                    lineTo(15.0572f, 11.6095f)
                    curveTo(14.8415f, 11.8251f, 14.8415f, 12.1748f, 15.0572f, 12.3905f)
                    curveTo(15.4051f, 12.7384f, 15.1587f, 13.3333f, 14.6667f, 13.3333f)
                    horizontalLineTo(13.3333f)
                    curveTo(12.8413f, 13.3333f, 12.5949f, 12.7384f, 12.9428f, 12.3905f)
                    close()
                }
            }
        }
        .build()
        return _lb!!
    }

private var _lb: ImageVector? = null
