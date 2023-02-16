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

public val LineGroup.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.876f, 13.9326f)
                lineTo(12.0207f, 11.078f)
                curveTo(12.8722f, 10.0158f, 13.3353f, 8.6946f, 13.3334f, 7.3333f)
                curveTo(13.3334f, 4.0213f, 10.6454f, 1.3333f, 7.3334f, 1.3333f)
                curveTo(4.0214f, 1.3333f, 1.3334f, 4.0213f, 1.3334f, 7.3333f)
                curveTo(1.3334f, 10.6453f, 4.0214f, 13.3333f, 7.3334f, 13.3333f)
                curveTo(8.6947f, 13.3352f, 10.0159f, 12.8721f, 11.078f, 12.0206f)
                lineTo(13.9327f, 14.876f)
                lineTo(14.876f, 13.9326f)
                close()
                moveTo(12.0f, 7.3333f)
                curveTo(12.002f, 8.5469f, 11.5294f, 9.7132f, 10.6834f, 10.5833f)
                lineTo(10.5834f, 10.6833f)
                curveTo(9.7133f, 11.5294f, 8.547f, 12.0019f, 7.3334f, 12.0f)
                curveTo(4.7547f, 12.0f, 2.6667f, 9.9113f, 2.6667f, 7.3333f)
                curveTo(2.6667f, 4.7547f, 4.7547f, 2.6667f, 7.3334f, 2.6667f)
                curveTo(9.9114f, 2.6667f, 12.0f, 4.7547f, 12.0f, 7.3333f)
                close()
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
