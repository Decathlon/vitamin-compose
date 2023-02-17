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

public val FillGroup.Navigation: ImageVector
    get() {
        if (_navigation != null) {
            return _navigation!!
        }
        _navigation = Builder(name = "Navigation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.9f, 2.3f)
                lineTo(21.705f, 8.568f)
                curveTo(21.8023f, 8.6003f, 21.8874f, 8.6617f, 21.9486f, 8.7439f)
                curveTo(22.0099f, 8.8261f, 22.0444f, 8.9252f, 22.0474f, 9.0277f)
                curveTo(22.0505f, 9.1302f, 22.022f, 9.2311f, 21.9657f, 9.3169f)
                curveTo(21.9095f, 9.4026f, 21.8282f, 9.469f, 21.733f, 9.507f)
                lineTo(13.0f, 13.0f)
                lineTo(8.575f, 21.85f)
                curveTo(8.53f, 21.9401f, 8.4587f, 22.0145f, 8.3707f, 22.0635f)
                curveTo(8.2827f, 22.1124f, 8.1819f, 22.1337f, 8.0816f, 22.1244f)
                curveTo(7.9813f, 22.1151f, 7.8861f, 22.0757f, 7.8085f, 22.0114f)
                curveTo(7.731f, 21.9471f, 7.6747f, 21.8608f, 7.647f, 21.764f)
                lineTo(2.26f, 2.911f)
                curveTo(2.235f, 2.8234f, 2.2345f, 2.7307f, 2.2584f, 2.6428f)
                curveTo(2.2823f, 2.5549f, 2.3297f, 2.4752f, 2.3956f, 2.4123f)
                curveTo(2.4615f, 2.3495f, 2.5433f, 2.3057f, 2.6321f, 2.2859f)
                curveTo(2.721f, 2.2661f, 2.8136f, 2.271f, 2.9f, 2.3f)
                close()
            }
        }
        .build()
        return _navigation!!
    }

private var _navigation: ImageVector? = null
