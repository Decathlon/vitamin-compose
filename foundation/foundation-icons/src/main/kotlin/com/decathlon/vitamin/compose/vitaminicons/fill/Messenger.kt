package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Messenger: ImageVector
    get() {
        if (_messenger != null) {
            return _messenger!!
        }
        _messenger = Builder(name = "Messenger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.6666f, 7.8f)
                curveTo(14.6666f, 4.0847f, 11.7559f, 1.3333f, 7.9999f, 1.3333f)
                curveTo(4.2446f, 1.3333f, 1.3333f, 4.0847f, 1.3333f, 7.8f)
                curveTo(1.3333f, 9.7447f, 2.1299f, 11.4233f, 3.4272f, 12.5827f)
                curveTo(3.5365f, 12.6794f, 3.6011f, 12.8169f, 3.6059f, 12.9627f)
                lineTo(3.6426f, 14.1493f)
                curveTo(3.6481f, 14.3267f, 3.7414f, 14.4897f, 3.8915f, 14.5842f)
                curveTo(4.0417f, 14.6787f, 4.229f, 14.6924f, 4.3913f, 14.6207f)
                lineTo(5.7139f, 14.0367f)
                curveTo(5.8261f, 13.9874f, 5.9518f, 13.9782f, 6.0699f, 14.0107f)
                curveTo(6.6989f, 14.1822f, 7.348f, 14.2684f, 7.9999f, 14.2667f)
                curveTo(11.7559f, 14.2667f, 14.6666f, 11.5153f, 14.6666f, 7.8f)
                close()
                moveTo(4.4559f, 10.112f)
                curveTo(4.1752f, 10.3253f, 3.8085f, 9.9894f, 3.9965f, 9.6913f)
                lineTo(5.9545f, 6.5847f)
                curveTo(6.1035f, 6.3484f, 6.3444f, 6.1852f, 6.6191f, 6.1346f)
                curveTo(6.8938f, 6.0839f, 7.1771f, 6.1504f, 7.4005f, 6.318f)
                lineTo(8.9585f, 7.4847f)
                curveTo(9.1011f, 7.5924f, 9.2979f, 7.5924f, 9.4405f, 7.4847f)
                lineTo(11.5439f, 5.8874f)
                curveTo(11.8245f, 5.6747f, 12.1912f, 6.0107f, 12.0032f, 6.3094f)
                lineTo(10.0452f, 9.416f)
                curveTo(9.8962f, 9.6523f, 9.6553f, 9.8155f, 9.3806f, 9.8661f)
                curveTo(9.1059f, 9.9168f, 8.8226f, 9.8503f, 8.5992f, 9.6827f)
                lineTo(7.0412f, 8.516f)
                curveTo(6.8986f, 8.4083f, 6.7018f, 8.4083f, 6.5592f, 8.516f)
                lineTo(4.4559f, 10.112f)
                close()
            }
        }
        .build()
        return _messenger!!
    }

private var _messenger: ImageVector? = null
