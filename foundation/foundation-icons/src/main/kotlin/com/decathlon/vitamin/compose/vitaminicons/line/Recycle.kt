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

public val LineGroup.Recycle: ImageVector
    get() {
        if (_recycle != null) {
            return _recycle!!
        }
        _recycle = Builder(name = "Recycle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0415f, 8.0647f)
                lineTo(14.0621f, 9.8334f)
                curveTo(14.2669f, 10.188f, 14.3747f, 10.5903f, 14.3747f, 10.9998f)
                curveTo(14.3748f, 11.4094f, 14.267f, 11.8117f, 14.0623f, 12.1664f)
                curveTo(13.8576f, 12.5211f, 13.5632f, 12.8156f, 13.2085f, 13.0205f)
                curveTo(12.8539f, 13.2253f, 12.4517f, 13.3332f, 12.0421f, 13.3334f)
                horizontalLineTo(10.6668f)
                verticalLineTo(15.0f)
                lineTo(7.3335f, 12.6667f)
                lineTo(10.6668f, 10.3334f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.0415f)
                curveTo(12.2171f, 12.0001f, 12.3896f, 11.954f, 12.5417f, 11.8663f)
                curveTo(12.6938f, 11.7786f, 12.8201f, 11.6523f, 12.908f, 11.5003f)
                curveTo(12.9958f, 11.3483f, 13.0421f, 11.1758f, 13.0421f, 11.0002f)
                curveTo(13.0421f, 10.8246f, 12.9959f, 10.6521f, 12.9081f, 10.5f)
                lineTo(11.8868f, 8.7313f)
                lineTo(13.0415f, 8.0647f)
                close()
                moveTo(4.8695f, 6.0894f)
                lineTo(5.2228f, 10.1427f)
                lineTo(3.7801f, 9.3094f)
                lineTo(3.0928f, 10.5f)
                curveTo(3.005f, 10.652f, 2.9588f, 10.8245f, 2.9588f, 11.0f)
                curveTo(2.9588f, 11.1755f, 3.005f, 11.348f, 3.0928f, 11.5f)
                curveTo(3.1806f, 11.652f, 3.3068f, 11.7783f, 3.4588f, 11.866f)
                curveTo(3.6108f, 11.9538f, 3.7833f, 12.0f, 3.9588f, 12.0f)
                horizontalLineTo(6.0001f)
                verticalLineTo(13.3334f)
                horizontalLineTo(3.9588f)
                curveTo(3.5492f, 13.3333f, 3.1469f, 13.2255f, 2.7922f, 13.0207f)
                curveTo(2.4374f, 12.8159f, 2.1429f, 12.5214f, 1.9381f, 12.1667f)
                curveTo(1.7333f, 11.8119f, 1.6255f, 11.4096f, 1.6255f, 11.0f)
                curveTo(1.6255f, 10.5904f, 1.7333f, 10.1881f, 1.9381f, 9.8334f)
                lineTo(2.6248f, 8.642f)
                lineTo(1.1821f, 7.8094f)
                lineTo(4.8688f, 6.0894f)
                horizontalLineTo(4.8695f)
                close()
                moveTo(9.1668f, 1.9793f)
                curveTo(9.5215f, 2.184f, 9.8161f, 2.4787f, 10.0208f, 2.8333f)
                lineTo(10.7075f, 4.0233f)
                lineTo(12.1515f, 3.19f)
                lineTo(11.7981f, 7.244f)
                lineTo(8.1101f, 5.524f)
                lineTo(9.5535f, 4.6907f)
                lineTo(8.8661f, 3.5f)
                curveTo(8.7784f, 3.348f, 8.6521f, 3.2218f, 8.5001f, 3.134f)
                curveTo(8.3481f, 3.0463f, 8.1757f, 3.0001f, 8.0001f, 3.0001f)
                curveTo(7.8246f, 3.0001f, 7.6522f, 3.0463f, 7.5002f, 3.134f)
                curveTo(7.3481f, 3.2218f, 7.2219f, 3.348f, 7.1341f, 3.5f)
                lineTo(6.1128f, 5.2687f)
                lineTo(4.9581f, 4.602f)
                lineTo(5.9801f, 2.8333f)
                curveTo(6.2896f, 2.2975f, 6.7992f, 1.9064f, 7.3969f, 1.7463f)
                curveTo(7.9947f, 1.5861f, 8.6315f, 1.67f, 9.1675f, 1.9793f)
                horizontalLineTo(9.1668f)
                close()
            }
        }
        .build()
        return _recycle!!
    }

private var _recycle: ImageVector? = null
