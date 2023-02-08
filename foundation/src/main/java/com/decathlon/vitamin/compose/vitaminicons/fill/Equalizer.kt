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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 2.0f)
                curveTo(7.7275f, 2.0f, 6.5934f, 2.8025f, 6.17f, 4.0024f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0024f)
                horizontalLineTo(6.17f)
                curveTo(6.5934f, 7.2024f, 7.7275f, 8.0049f, 9.0f, 8.0049f)
                curveTo(10.2725f, 8.0049f, 11.4066f, 7.2024f, 11.83f, 6.0024f)
                horizontalLineTo(22.0f)
                verticalLineTo(4.0024f)
                horizontalLineTo(11.83f)
                curveTo(11.4066f, 2.8025f, 10.2725f, 2.0f, 9.0f, 2.0f)
                close()
                moveTo(12.17f, 11.0025f)
                curveTo(12.5934f, 9.8025f, 13.7275f, 9.0f, 15.0f, 9.0f)
                curveTo(16.2725f, 9.0f, 17.4066f, 9.8025f, 17.83f, 11.0025f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0025f)
                horizontalLineTo(17.83f)
                curveTo(17.4066f, 14.2024f, 16.2725f, 15.0049f, 15.0f, 15.0049f)
                curveTo(13.7275f, 15.0049f, 12.5934f, 14.2024f, 12.17f, 13.0025f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0025f)
                horizontalLineTo(12.17f)
                close()
                moveTo(6.17f, 18.0025f)
                curveTo(6.5934f, 16.8025f, 7.7275f, 16.0f, 9.0f, 16.0f)
                curveTo(10.2725f, 16.0f, 11.4066f, 16.8025f, 11.83f, 18.0025f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0025f)
                horizontalLineTo(11.83f)
                curveTo(11.4066f, 21.2024f, 10.2725f, 22.0049f, 9.0f, 22.0049f)
                curveTo(7.7275f, 22.0049f, 6.5934f, 21.2024f, 6.17f, 20.0025f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0025f)
                horizontalLineTo(6.17f)
                close()
            }
        }
        .build()
        return _equalizer!!
    }

private var _equalizer: ImageVector? = null
