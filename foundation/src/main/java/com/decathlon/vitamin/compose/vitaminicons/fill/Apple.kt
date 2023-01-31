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

public val FillGroup.Apple: ImageVector
    get() {
        if (_apple != null) {
            return _apple!!
        }
        _apple = Builder(name = "Apple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.8959f, 0.85f)
                curveTo(16.0399f, 2.146f, 15.5239f, 3.454f, 14.7439f, 4.39f)
                curveTo(13.9639f, 5.326f, 12.6919f, 6.058f, 11.4559f, 5.962f)
                curveTo(11.2879f, 4.69f, 11.9119f, 3.358f, 12.6319f, 2.53f)
                curveTo(13.4359f, 1.594f, 14.7799f, 0.898f, 15.8959f, 0.85f)
                close()
                moveTo(10.2541f, 6.8284f)
                curveTo(10.7783f, 7.0364f, 11.2458f, 7.222f, 11.6239f, 7.222f)
                curveTo(11.9561f, 7.222f, 12.3894f, 7.0517f, 12.902f, 6.8503f)
                curveTo(13.7226f, 6.5278f, 14.7465f, 6.1254f, 15.8839f, 6.214f)
                curveTo(16.5919f, 6.262f, 18.6199f, 6.478f, 19.9399f, 8.41f)
                curveTo(19.8319f, 8.47f, 17.5159f, 9.814f, 17.5399f, 12.622f)
                curveTo(17.5759f, 15.982f, 20.4799f, 17.098f, 20.5159f, 17.11f)
                curveTo(20.4919f, 17.194f, 20.0479f, 18.706f, 18.9799f, 20.266f)
                curveTo(18.0559f, 21.622f, 17.0959f, 22.966f, 15.5839f, 22.99f)
                curveTo(14.8537f, 23.0077f, 14.3662f, 22.797f, 13.8591f, 22.5779f)
                curveTo(13.3329f, 22.3505f, 12.7856f, 22.114f, 11.9239f, 22.114f)
                curveTo(11.0083f, 22.114f, 10.4323f, 22.36f, 9.8774f, 22.5969f)
                curveTo(9.3996f, 22.8009f, 8.9375f, 22.9982f, 8.2879f, 23.026f)
                curveTo(6.8239f, 23.074f, 5.7199f, 21.562f, 4.7839f, 20.218f)
                curveTo(2.8759f, 17.458f, 1.4239f, 12.442f, 3.3799f, 9.046f)
                curveTo(4.3519f, 7.354f, 6.0799f, 6.286f, 7.9639f, 6.262f)
                curveTo(8.7755f, 6.2415f, 9.5639f, 6.5544f, 10.2541f, 6.8284f)
                close()
            }
        }
        .build()
        return _apple!!
    }

private var _apple: ImageVector? = null
