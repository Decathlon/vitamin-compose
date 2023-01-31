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

public val LineGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 9.0f)
                curveTo(22.0f, 5.5f, 19.538f, 3.0f, 16.5f, 3.0f)
                curveTo(14.64f, 3.0f, 13.0f, 4.0f, 12.0f, 5.0f)
                curveTo(11.0f, 4.0f, 9.36f, 3.0f, 7.5f, 3.0f)
                curveTo(4.5f, 3.0f, 2.0f, 5.5f, 2.0f, 9.0f)
                curveTo(2.0f, 15.6009f, 8.6692f, 19.5341f, 11.5259f, 21.219f)
                curveTo(11.6987f, 21.3208f, 11.8575f, 21.4145f, 12.0f, 21.5f)
                curveTo(12.1425f, 21.4145f, 12.3013f, 21.3208f, 12.4741f, 21.219f)
                curveTo(15.3308f, 19.5341f, 22.0f, 15.6009f, 22.0f, 9.0f)
                close()
                moveTo(15.354f, 16.903f)
                curveTo(14.61f, 17.495f, 13.815f, 18.048f, 12.934f, 18.604f)
                curveTo(12.635f, 18.792f, 12.339f, 18.973f, 12.0f, 19.175f)
                curveTo(11.661f, 18.973f, 11.365f, 18.792f, 11.066f, 18.603f)
                curveTo(10.185f, 18.048f, 9.39f, 17.495f, 8.645f, 16.903f)
                curveTo(5.666f, 14.533f, 4.0f, 11.944f, 4.0f, 9.0f)
                curveTo(4.0f, 6.656f, 5.56f, 5.0f, 7.5f, 5.0f)
                curveTo(8.576f, 5.0f, 9.74f, 5.57f, 10.586f, 6.414f)
                lineTo(12.0f, 7.828f)
                lineTo(13.414f, 6.414f)
                curveTo(14.26f, 5.57f, 15.424f, 5.0f, 16.5f, 5.0f)
                curveTo(18.463f, 5.0f, 20.0f, 6.64f, 20.0f, 9.0f)
                curveTo(20.0f, 11.943f, 18.335f, 14.533f, 15.354f, 16.903f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
