package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Messenger: ImageVector
    get() {
        if (_messenger != null) {
            return _messenger!!
        }
        _messenger = Builder(name = "Messenger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 1.3333f)
                curveTo(11.756f, 1.3333f, 14.6667f, 4.0847f, 14.6667f, 7.8f)
                curveTo(14.6667f, 11.5153f, 11.756f, 14.2667f, 8.0f, 14.2667f)
                curveTo(7.3481f, 14.2684f, 6.699f, 14.1822f, 6.07f, 14.0107f)
                curveTo(5.9519f, 13.9782f, 5.8262f, 13.9874f, 5.714f, 14.0367f)
                lineTo(4.3914f, 14.6207f)
                curveTo(4.2291f, 14.6924f, 4.0418f, 14.6787f, 3.8916f, 14.5842f)
                curveTo(3.7415f, 14.4897f, 3.6482f, 14.3267f, 3.6427f, 14.1493f)
                lineTo(3.606f, 12.9627f)
                curveTo(3.6012f, 12.8169f, 3.5366f, 12.6794f, 3.4274f, 12.5827f)
                curveTo(2.13f, 11.4233f, 1.3334f, 9.7447f, 1.3334f, 7.8f)
                curveTo(1.3334f, 4.0847f, 4.2447f, 1.3333f, 8.0f, 1.3333f)
                close()
                moveTo(5.176f, 12.8167f)
                curveTo(5.5694f, 12.6433f, 6.0094f, 12.6107f, 6.4214f, 12.724f)
                curveTo(6.9347f, 12.864f, 7.4647f, 12.9347f, 8.0f, 12.9333f)
                curveTo(11.0567f, 12.9333f, 13.3334f, 10.742f, 13.3334f, 7.8f)
                curveTo(13.3334f, 4.858f, 11.0567f, 2.6667f, 8.0f, 2.6667f)
                curveTo(4.9434f, 2.6667f, 2.6667f, 4.858f, 2.6667f, 7.8f)
                curveTo(2.6667f, 9.3133f, 3.264f, 10.648f, 4.3107f, 11.584f)
                curveTo(4.695f, 11.9244f, 4.9222f, 12.4082f, 4.9387f, 12.9213f)
                lineTo(5.176f, 12.8167f)
                close()
                moveTo(5.9546f, 6.5847f)
                lineTo(3.9966f, 9.6913f)
                curveTo(3.8086f, 9.99f, 4.1753f, 10.3253f, 4.456f, 10.1127f)
                lineTo(6.5593f, 8.516f)
                curveTo(6.7019f, 8.4083f, 6.8987f, 8.4083f, 7.0413f, 8.516f)
                lineTo(8.5986f, 9.6827f)
                curveTo(8.8221f, 9.8505f, 9.1056f, 9.9172f, 9.3804f, 9.8665f)
                curveTo(9.6553f, 9.8158f, 9.8964f, 9.6525f, 10.0453f, 9.416f)
                lineTo(12.0033f, 6.3094f)
                curveTo(12.1913f, 6.0107f, 11.8246f, 5.6747f, 11.544f, 5.8874f)
                lineTo(9.4406f, 7.4847f)
                curveTo(9.298f, 7.5924f, 9.1013f, 7.5924f, 8.9586f, 7.4847f)
                lineTo(7.4013f, 6.318f)
                curveTo(7.1778f, 6.1502f, 6.8944f, 6.0835f, 6.6195f, 6.1342f)
                curveTo(6.3447f, 6.1849f, 6.1036f, 6.3482f, 5.9546f, 6.5847f)
                close()
            }
        }
        .build()
        return _messenger!!
    }

private var _messenger: ImageVector? = null
