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

public val FillGroup.PlayCircle: ImageVector
    get() {
        if (_playCircle != null) {
            return _playCircle!!
        }
        _playCircle = Builder(name = "PlayCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                close()
                moveTo(10.2116f, 8.3949f)
                curveTo(10.3417f, 8.3254f, 10.4994f, 8.3332f, 10.622f, 8.415f)
                lineTo(15.501f, 11.667f)
                curveTo(15.6124f, 11.7412f, 15.6794f, 11.8661f, 15.6794f, 12.0f)
                curveTo(15.6794f, 12.1339f, 15.6124f, 12.2588f, 15.501f, 12.333f)
                lineTo(10.622f, 15.585f)
                curveTo(10.4994f, 15.6668f, 10.3417f, 15.6746f, 10.2116f, 15.6051f)
                curveTo(10.0816f, 15.5357f, 10.0003f, 15.4004f, 10.0f, 15.253f)
                verticalLineTo(8.747f)
                curveTo(10.0003f, 8.5996f, 10.0816f, 8.4643f, 10.2116f, 8.3949f)
                close()
            }
        }
        .build()
        return _playCircle!!
    }

private var _playCircle: ImageVector? = null
