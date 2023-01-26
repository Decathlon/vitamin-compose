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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.0f)
                curveTo(17.634f, 2.0f, 22.0f, 6.127f, 22.0f, 11.7f)
                curveTo(22.0f, 17.273f, 17.634f, 21.4f, 12.0f, 21.4f)
                curveTo(11.0221f, 21.4025f, 10.0484f, 21.2733f, 9.105f, 21.016f)
                curveTo(8.9278f, 20.9673f, 8.7392f, 20.9811f, 8.571f, 21.055f)
                lineTo(6.587f, 21.931f)
                curveTo(6.3436f, 22.0386f, 6.0626f, 22.0181f, 5.8374f, 21.8763f)
                curveTo(5.6122f, 21.7345f, 5.4722f, 21.49f, 5.464f, 21.224f)
                lineTo(5.409f, 19.444f)
                curveTo(5.4017f, 19.2253f, 5.3048f, 19.0191f, 5.141f, 18.874f)
                curveTo(3.195f, 17.135f, 2.0f, 14.617f, 2.0f, 11.7f)
                curveTo(2.0f, 6.127f, 6.367f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(7.764f, 19.225f)
                curveTo(8.354f, 18.965f, 9.014f, 18.916f, 9.632f, 19.086f)
                curveTo(10.402f, 19.296f, 11.197f, 19.402f, 12.0f, 19.4f)
                curveTo(16.585f, 19.4f, 20.0f, 16.113f, 20.0f, 11.7f)
                curveTo(20.0f, 7.287f, 16.585f, 4.0f, 12.0f, 4.0f)
                curveTo(7.415f, 4.0f, 4.0f, 7.287f, 4.0f, 11.7f)
                curveTo(4.0f, 13.97f, 4.896f, 15.972f, 6.466f, 17.376f)
                curveTo(7.0425f, 17.8867f, 7.3833f, 18.6122f, 7.408f, 19.382f)
                lineTo(7.764f, 19.225f)
                close()
                moveTo(8.932f, 9.877f)
                lineTo(5.995f, 14.537f)
                verticalLineTo(14.536f)
                curveTo(5.713f, 14.984f, 6.263f, 15.488f, 6.684f, 15.169f)
                lineTo(9.839f, 12.774f)
                curveTo(10.0529f, 12.6125f, 10.3481f, 12.6125f, 10.562f, 12.774f)
                lineTo(12.898f, 14.524f)
                curveTo(13.2332f, 14.7757f, 13.6584f, 14.8757f, 14.0707f, 14.7997f)
                curveTo(14.4829f, 14.7237f, 14.8446f, 14.4787f, 15.068f, 14.124f)
                lineTo(18.005f, 9.464f)
                curveTo(18.287f, 9.016f, 17.737f, 8.512f, 17.316f, 8.831f)
                lineTo(14.161f, 11.227f)
                curveTo(13.9471f, 11.3885f, 13.6519f, 11.3885f, 13.438f, 11.227f)
                lineTo(11.102f, 9.477f)
                curveTo(10.7668f, 9.2253f, 10.3416f, 9.1253f, 9.9293f, 9.2013f)
                curveTo(9.517f, 9.2773f, 9.1554f, 9.5223f, 8.932f, 9.877f)
                close()
            }
        }
        .build()
        return _messenger!!
    }

private var _messenger: ImageVector? = null
