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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 11.7f)
                curveTo(22.0f, 6.127f, 17.634f, 2.0f, 12.0f, 2.0f)
                curveTo(6.367f, 2.0f, 2.0f, 6.127f, 2.0f, 11.7f)
                curveTo(2.0f, 14.617f, 3.195f, 17.135f, 5.141f, 18.874f)
                curveTo(5.3048f, 19.0191f, 5.4017f, 19.2253f, 5.409f, 19.444f)
                lineTo(5.464f, 21.224f)
                curveTo(5.4722f, 21.49f, 5.6122f, 21.7345f, 5.8374f, 21.8763f)
                curveTo(6.0626f, 22.0181f, 6.3436f, 22.0386f, 6.587f, 21.931f)
                lineTo(8.571f, 21.055f)
                curveTo(8.7392f, 20.9811f, 8.9278f, 20.9673f, 9.105f, 21.016f)
                curveTo(10.0484f, 21.2733f, 11.0221f, 21.4025f, 12.0f, 21.4f)
                curveTo(17.634f, 21.4f, 22.0f, 17.273f, 22.0f, 11.7f)
                close()
                moveTo(6.684f, 15.168f)
                curveTo(6.263f, 15.488f, 5.713f, 14.984f, 5.995f, 14.537f)
                lineTo(8.932f, 9.877f)
                curveTo(9.1554f, 9.5226f, 9.5169f, 9.2778f, 9.9289f, 9.2018f)
                curveTo(10.3409f, 9.1258f, 10.7659f, 9.2256f, 11.101f, 9.477f)
                lineTo(13.438f, 11.227f)
                curveTo(13.6519f, 11.3885f, 13.9471f, 11.3885f, 14.161f, 11.227f)
                lineTo(17.316f, 8.831f)
                curveTo(17.737f, 8.512f, 18.287f, 9.016f, 18.005f, 9.464f)
                lineTo(15.068f, 14.124f)
                curveTo(14.8446f, 14.4784f, 14.4831f, 14.7232f, 14.0711f, 14.7992f)
                curveTo(13.6591f, 14.8752f, 13.2341f, 14.7754f, 12.899f, 14.524f)
                lineTo(10.562f, 12.774f)
                curveTo(10.3481f, 12.6125f, 10.0529f, 12.6125f, 9.839f, 12.774f)
                lineTo(6.684f, 15.168f)
                close()
            }
        }
        .build()
        return _messenger!!
    }

private var _messenger: ImageVector? = null
