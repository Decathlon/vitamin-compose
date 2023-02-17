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

public val LineGroup.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 6.0f)
                curveTo(7.7761f, 6.0f, 6.1228f, 6.6848f, 4.9038f, 7.9038f)
                curveTo(3.6848f, 9.1228f, 3.0f, 10.7761f, 3.0f, 12.5f)
                curveTo(3.0f, 14.2239f, 3.6848f, 15.8772f, 4.9038f, 17.0962f)
                curveTo(6.1228f, 18.3152f, 7.7761f, 19.0f, 9.5f, 19.0f)
                horizontalLineTo(16.5f)
                curveTo(17.1312f, 18.9994f, 17.7552f, 18.866f, 18.3314f, 18.6085f)
                curveTo(18.9077f, 18.351f, 19.4234f, 17.9752f, 19.8449f, 17.5054f)
                curveTo(20.2664f, 17.0357f, 20.5845f, 16.4825f, 20.7783f, 15.8818f)
                curveTo(20.9721f, 15.2811f, 21.0373f, 14.6464f, 20.9699f, 14.0188f)
                curveTo(20.9024f, 13.3912f, 20.7036f, 12.7849f, 20.3865f, 12.2392f)
                curveTo(20.0694f, 11.6934f, 19.641f, 11.2205f, 19.1292f, 10.8511f)
                curveTo(18.6174f, 10.4817f, 18.0336f, 10.2241f, 17.4158f, 10.0951f)
                curveTo(16.7979f, 9.966f, 16.1599f, 9.9684f, 15.543f, 10.102f)
                curveTo(15.0623f, 8.8917f, 14.2293f, 7.8537f, 13.1519f, 7.1223f)
                curveTo(12.0744f, 6.391f, 10.8022f, 6.0f, 9.5f, 6.0f)
                close()
                moveTo(16.5f, 21.0f)
                horizontalLineTo(9.5f)
                curveTo(8.0202f, 20.9996f, 6.5662f, 20.613f, 5.2817f, 19.8783f)
                curveTo(3.9972f, 19.1436f, 2.9268f, 18.0862f, 2.1763f, 16.8109f)
                curveTo(1.4258f, 15.5356f, 1.0213f, 14.0864f, 1.0027f, 12.6068f)
                curveTo(0.9841f, 11.1271f, 1.3521f, 9.6683f, 2.0703f, 8.3745f)
                curveTo(2.7885f, 7.0807f, 3.8321f, 5.9968f, 5.0977f, 5.2301f)
                curveTo(6.3633f, 4.4633f, 7.8072f, 4.0403f, 9.2865f, 4.0027f)
                curveTo(10.7658f, 3.9652f, 12.2292f, 4.3145f, 13.5321f, 5.0161f)
                curveTo(14.835f, 5.7177f, 15.9321f, 6.7473f, 16.715f, 8.003f)
                curveTo(18.4227f, 8.0547f, 20.0414f, 8.7766f, 21.2208f, 10.0126f)
                curveTo(22.4003f, 11.2486f, 23.0458f, 12.8993f, 23.0175f, 14.6075f)
                curveTo(22.9892f, 16.3158f, 22.2896f, 17.9442f, 21.0698f, 19.1405f)
                curveTo(19.8501f, 20.3368f, 18.2085f, 21.0048f, 16.5f, 21.0f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
