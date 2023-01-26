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

public val FillGroup.Naver: ImageVector
    get() {
        if (_naver != null) {
            return _naver!!
        }
        _naver = Builder(name = "Naver", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                verticalLineTo(21.101f)
                horizontalLineTo(8.9643f)
                verticalLineTo(12.0449f)
                lineTo(15.0246f, 21.101f)
                horizontalLineTo(22.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.0246f)
                verticalLineTo(12.0449f)
                lineTo(8.9643f, 3.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _naver!!
    }

private var _naver: ImageVector? = null
