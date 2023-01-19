package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.CloudWindy: ImageVector
    get() {
        if (_cloudWindy != null) {
            return _cloudWindy!!
        }
        _cloudWindy = Builder(name = "CloudWindy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.3334f, 12.0f)
                verticalLineTo(10.6666f)
                horizontalLineTo(11.6667f)
                curveTo(12.0514f, 10.6666f, 12.4301f, 10.5714f, 12.7691f, 10.3896f)
                curveTo(13.1081f, 10.2078f, 13.3969f, 9.945f, 13.6098f, 9.6246f)
                curveTo(13.8227f, 9.3042f, 13.9531f, 8.9361f, 13.9893f, 8.5531f)
                curveTo(14.0255f, 8.1701f, 13.9665f, 7.7841f, 13.8175f, 7.4295f)
                curveTo(13.6685f, 7.0748f, 13.4341f, 6.7625f, 13.1352f, 6.5203f)
                curveTo(12.8363f, 6.2782f, 12.4822f, 6.1136f, 12.1043f, 6.0415f)
                curveTo(11.7265f, 5.9693f, 11.3366f, 5.9916f, 10.9695f, 6.1065f)
                curveTo(10.6023f, 6.2214f, 10.2693f, 6.4253f, 10.0f, 6.7f)
                verticalLineTo(6.6666f)
                curveTo(10.0f, 5.6058f, 9.5786f, 4.5884f, 8.8285f, 3.8382f)
                curveTo(8.0783f, 3.0881f, 7.0609f, 2.6667f, 6.0f, 2.6667f)
                curveTo(4.9392f, 2.6667f, 3.9217f, 3.0881f, 3.1716f, 3.8382f)
                curveTo(2.4214f, 4.5884f, 2.0f, 5.6058f, 2.0f, 6.6666f)
                verticalLineTo(6.6713f)
                horizontalLineTo(0.6667f)
                verticalLineTo(6.6666f)
                curveTo(0.6657f, 5.4221f, 1.1f, 4.2164f, 1.8943f, 3.2583f)
                curveTo(2.6887f, 2.3002f, 3.7931f, 1.6501f, 5.0163f, 1.4205f)
                curveTo(6.2395f, 1.1909f, 7.5045f, 1.3964f, 8.5921f, 2.0013f)
                curveTo(9.6798f, 2.6062f, 10.5217f, 3.5724f, 10.972f, 4.7326f)
                curveTo(11.4736f, 4.6362f, 11.9898f, 4.6456f, 12.4875f, 4.7602f)
                curveTo(12.9852f, 4.8748f, 13.4535f, 5.0922f, 13.8623f, 5.3983f)
                curveTo(14.2712f, 5.7045f, 14.6116f, 6.0926f, 14.8616f, 6.538f)
                curveTo(15.1117f, 6.9833f, 15.266f, 7.476f, 15.3146f, 7.9844f)
                curveTo(15.3632f, 8.4929f, 15.3051f, 9.0058f, 15.1439f, 9.4905f)
                curveTo(14.9827f, 9.9751f, 14.722f, 10.4208f, 14.3786f, 10.7988f)
                curveTo(14.0351f, 11.1769f, 13.6165f, 11.479f, 13.1495f, 11.6858f)
                curveTo(12.6825f, 11.8927f, 12.1774f, 11.9997f, 11.6667f, 12.0f)
                horizontalLineTo(9.3334f)
                close()
                moveTo(4.0f, 13.3333f)
                horizontalLineTo(10.6667f)
                verticalLineTo(14.6666f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.3333f)
                close()
                moveTo(4.0f, 8.0f)
                horizontalLineTo(9.3334f)
                verticalLineTo(9.3333f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(1.3334f, 10.6666f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(1.3334f)
                verticalLineTo(10.6666f)
                close()
            }
        }
        .build()
        return _cloudWindy!!
    }

private var _cloudWindy: ImageVector? = null
