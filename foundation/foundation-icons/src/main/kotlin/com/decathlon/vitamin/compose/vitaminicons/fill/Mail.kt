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

public val FillGroup.Mail: ImageVector
    get() {
        if (_mail != null) {
            return _mail!!
        }
        _mail = Builder(name = "Mail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0002f, 2.0f)
                horizontalLineTo(2.0002f)
                curveTo(1.632f, 2.0f, 1.3335f, 2.2985f, 1.3335f, 2.6667f)
                verticalLineTo(13.3333f)
                curveTo(1.3335f, 13.7015f, 1.632f, 14.0f, 2.0002f, 14.0f)
                horizontalLineTo(14.0002f)
                curveTo(14.3684f, 14.0f, 14.6668f, 13.7015f, 14.6668f, 13.3333f)
                verticalLineTo(2.6667f)
                curveTo(14.6668f, 2.2985f, 14.3684f, 2.0f, 14.0002f, 2.0f)
                close()
                moveTo(3.7655f, 4.1586f)
                lineTo(8.0401f, 7.7887f)
                lineTo(12.2308f, 4.1627f)
                lineTo(13.1028f, 5.1713f)
                lineTo(8.0488f, 9.5447f)
                lineTo(2.9021f, 5.1747f)
                lineTo(3.7655f, 4.1586f)
                close()
            }
        }
        .build()
        return _mail!!
    }

private var _mail: ImageVector? = null
