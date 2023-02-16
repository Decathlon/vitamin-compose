package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Pinterest: ImageVector
    get() {
        if (_pinterest != null) {
            return _pinterest!!
        }
        _pinterest = Builder(name = "Pinterest", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9132f, 1.396f)
                curveTo(5.6147f, 0.9423f, 2.487f, 2.991f, 1.5851f, 6.196f)
                curveTo(0.6832f, 9.4011f, 2.2835f, 12.7803f, 5.3345f, 14.1133f)
                curveTo(5.2946f, 13.6012f, 5.3313f, 13.086f, 5.4432f, 12.5847f)
                curveTo(5.5665f, 12.0253f, 6.3072f, 8.9427f, 6.3072f, 8.9427f)
                curveTo(6.1597f, 8.6121f, 6.086f, 8.2533f, 6.0912f, 7.8913f)
                curveTo(6.0912f, 6.9013f, 6.6625f, 6.1627f, 7.3732f, 6.1627f)
                curveTo(7.6315f, 6.1589f, 7.8787f, 6.2677f, 8.0505f, 6.4607f)
                curveTo(8.2222f, 6.6537f, 8.3016f, 6.9118f, 8.2679f, 7.168f)
                curveTo(8.2679f, 7.768f, 7.8825f, 8.676f, 7.6812f, 9.528f)
                curveTo(7.6005f, 9.8449f, 7.6752f, 10.1812f, 7.8824f, 10.4342f)
                curveTo(8.0896f, 10.6872f, 8.4046f, 10.8267f, 8.7312f, 10.81f)
                curveTo(9.9965f, 10.81f, 10.8445f, 9.1893f, 10.8445f, 7.276f)
                curveTo(10.8445f, 5.8093f, 9.8732f, 4.7107f, 8.0825f, 4.7107f)
                curveTo(7.2168f, 4.677f, 6.3751f, 4.9999f, 5.7539f, 5.6039f)
                curveTo(5.1327f, 6.208f, 4.7864f, 7.0403f, 4.7959f, 7.9067f)
                curveTo(4.7768f, 8.3822f, 4.9302f, 8.8486f, 5.2279f, 9.22f)
                curveTo(5.3421f, 9.3053f, 5.3862f, 9.4559f, 5.3359f, 9.5893f)
                curveTo(5.3052f, 9.712f, 5.2279f, 10.0047f, 5.1972f, 10.112f)
                curveTo(5.1843f, 10.1858f, 5.137f, 10.2491f, 5.07f, 10.2825f)
                curveTo(5.0029f, 10.3159f, 4.9239f, 10.3155f, 4.8572f, 10.2813f)
                curveTo(3.9345f, 9.912f, 3.4999f, 8.8967f, 3.4999f, 7.7373f)
                curveTo(3.4999f, 5.8393f, 5.0892f, 3.5673f, 8.2692f, 3.5673f)
                curveTo(10.7999f, 3.5673f, 12.4825f, 5.4187f, 12.4825f, 7.3987f)
                curveTo(12.4825f, 10.0047f, 11.0312f, 11.964f, 8.8865f, 11.964f)
                curveTo(8.2351f, 11.9848f, 7.6181f, 11.6716f, 7.2505f, 11.1333f)
                curveTo(7.2505f, 11.1333f, 6.8652f, 12.6773f, 6.7892f, 12.9693f)
                curveTo(6.6341f, 13.4738f, 6.4051f, 13.9525f, 6.1099f, 14.39f)
                curveTo(6.7252f, 14.5767f, 7.3645f, 14.67f, 8.0072f, 14.6673f)
                curveTo(9.7758f, 14.6687f, 11.4724f, 13.9665f, 12.7226f, 12.7154f)
                curveTo(13.9728f, 11.4643f, 14.6739f, 9.7673f, 14.6712f, 7.9987f)
                curveTo(14.6695f, 4.6695f, 12.2125f, 1.8517f, 8.9145f, 1.3967f)
                lineTo(8.9132f, 1.396f)
                close()
            }
        }
        .build()
        return _pinterest!!
    }

private var _pinterest: ImageVector? = null
