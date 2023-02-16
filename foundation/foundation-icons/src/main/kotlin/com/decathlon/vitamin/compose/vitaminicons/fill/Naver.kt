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
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.3333f, 2.0f)
                verticalLineTo(14.0673f)
                horizontalLineTo(5.9761f)
                verticalLineTo(8.03f)
                lineTo(10.0163f, 14.0673f)
                horizontalLineTo(14.6666f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.0163f)
                verticalLineTo(8.03f)
                lineTo(5.9761f, 2.0f)
                horizontalLineTo(1.3333f)
                close()
            }
        }
        .build()
        return _naver!!
    }

private var _naver: ImageVector? = null
