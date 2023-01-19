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

public val FillGroup.Equalizer: ImageVector
    get() {
        if (_equalizer != null) {
            return _equalizer!!
        }
        _equalizer = Builder(name = "Equalizer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 1.3333f)
                curveTo(5.1517f, 1.3333f, 4.3956f, 1.8683f, 4.1134f, 2.6683f)
                horizontalLineTo(1.3334f)
                verticalLineTo(4.0016f)
                horizontalLineTo(4.1134f)
                curveTo(4.3956f, 4.8016f, 5.1517f, 5.3366f, 6.0f, 5.3366f)
                curveTo(6.8484f, 5.3366f, 7.6044f, 4.8016f, 7.8867f, 4.0016f)
                horizontalLineTo(14.6667f)
                verticalLineTo(2.6683f)
                horizontalLineTo(7.8867f)
                curveTo(7.6044f, 1.8683f, 6.8484f, 1.3333f, 6.0f, 1.3333f)
                close()
                moveTo(8.1134f, 7.3349f)
                curveTo(8.3956f, 6.535f, 9.1517f, 6.0f, 10.0f, 6.0f)
                curveTo(10.8484f, 6.0f, 11.6044f, 6.535f, 11.8867f, 7.3349f)
                horizontalLineTo(14.6667f)
                verticalLineTo(8.6683f)
                horizontalLineTo(11.8867f)
                curveTo(11.6044f, 9.4683f, 10.8484f, 10.0032f, 10.0f, 10.0032f)
                curveTo(9.1517f, 10.0032f, 8.3956f, 9.4683f, 8.1134f, 8.6683f)
                horizontalLineTo(1.3334f)
                verticalLineTo(7.3349f)
                horizontalLineTo(8.1134f)
                close()
                moveTo(4.1134f, 12.0016f)
                curveTo(4.3956f, 11.2016f, 5.1517f, 10.6666f, 6.0f, 10.6666f)
                curveTo(6.8484f, 10.6666f, 7.6044f, 11.2016f, 7.8867f, 12.0016f)
                horizontalLineTo(14.6667f)
                verticalLineTo(13.3349f)
                horizontalLineTo(7.8867f)
                curveTo(7.6044f, 14.1349f, 6.8484f, 14.6699f, 6.0f, 14.6699f)
                curveTo(5.1517f, 14.6699f, 4.3956f, 14.1349f, 4.1134f, 13.3349f)
                horizontalLineTo(1.3334f)
                verticalLineTo(12.0016f)
                horizontalLineTo(4.1134f)
                close()
            }
        }
        .build()
        return _equalizer!!
    }

private var _equalizer: ImageVector? = null
