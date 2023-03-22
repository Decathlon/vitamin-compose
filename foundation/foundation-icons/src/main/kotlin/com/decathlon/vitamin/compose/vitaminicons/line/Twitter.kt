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

public val LineGroup.Twitter: ImageVector
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = Builder(name = "Twitter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.4789f, 3.8993f)
                curveTo(11.6489f, 4.6316f, 10.4357f, 6.3892f, 10.4f, 8.36f)
                lineTo(10.401f, 8.361f)
                curveTo(10.3364f, 8.3521f, 10.2755f, 8.3444f, 10.2161f, 8.337f)
                curveTo(9.788f, 8.2832f, 9.4451f, 8.2402f, 8.428f, 7.823f)
                curveTo(6.688f, 7.109f, 4.971f, 5.763f, 3.278f, 3.786f)
                curveTo(-0.2195f, 12.2065f, 4.8353f, 15.499f, 6.4025f, 16.5198f)
                curveTo(6.4516f, 16.5517f, 6.4972f, 16.5814f, 6.539f, 16.609f)
                curveTo(4.909f, 17.802f, 2.089f, 18.105f, 1.395f, 18.159f)
                curveTo(2.757f, 19.581f, 7.509f, 20.652f, 10.777f, 20.0f)
                curveTo(15.543f, 19.049f, 20.24f, 15.333f, 20.24f, 7.691f)
                curveTo(20.954f, 6.712f, 21.119f, 6.0f, 21.454f, 4.36f)
                curveTo(20.3112f, 5.0526f, 19.702f, 5.0318f, 19.1119f, 5.0116f)
                curveTo(19.0034f, 5.0079f, 18.8955f, 5.0042f, 18.785f, 5.005f)
                curveTo(17.3997f, 3.6027f, 15.309f, 3.1671f, 13.4789f, 3.8993f)
                close()
                moveTo(12.4f, 8.397f)
                curveTo(12.4289f, 6.8161f, 13.7189f, 5.5497f, 15.3f, 5.55f)
                curveTo(17.228f, 5.55f, 18.24f, 7.213f, 18.24f, 7.691f)
                curveTo(18.24f, 13.547f, 15.103f, 17.097f, 10.385f, 18.039f)
                curveTo(9.639f, 18.187f, 8.74f, 18.229f, 7.793f, 18.17f)
                lineTo(9.385f, 17.007f)
                curveTo(9.5459f, 16.8898f, 9.6382f, 16.7004f, 9.6314f, 16.5015f)
                curveTo(9.6246f, 16.3025f, 9.5196f, 16.1199f, 9.351f, 16.014f)
                lineTo(7.604f, 14.916f)
                curveTo(4.791f, 13.147f, 3.623f, 10.854f, 4.221f, 7.544f)
                curveTo(6.109f, 9.117f, 8.077f, 10.063f, 10.131f, 10.343f)
                lineTo(11.692f, 10.555f)
                curveTo(11.8616f, 10.5778f, 12.0328f, 10.5272f, 12.1627f, 10.4159f)
                curveTo(12.2925f, 10.3045f, 12.3687f, 10.143f, 12.372f, 9.972f)
                lineTo(12.4f, 8.397f)
                close()
            }
        }
        .build()
        return _twitter!!
    }

private var _twitter: ImageVector? = null
