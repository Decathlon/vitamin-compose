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

public val LineGroup.Naver: ImageVector
    get() {
        if (_naver != null) {
            return _naver!!
        }
        _naver = Builder(name = "Naver", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 3.0f)
                horizontalLineTo(9.7254f)
                lineTo(13.8405f, 9.1417f)
                verticalLineTo(3.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(21.2736f)
                horizontalLineTo(14.2641f)
                lineTo(10.1493f, 15.1248f)
                verticalLineTo(21.2736f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(3.8182f, 4.8182f)
                verticalLineTo(19.4555f)
                horizontalLineTo(8.3312f)
                verticalLineTo(9.1387f)
                lineTo(15.2351f, 19.4555f)
                horizontalLineTo(20.1818f)
                verticalLineTo(4.8182f)
                horizontalLineTo(15.6587f)
                verticalLineTo(15.1218f)
                lineTo(8.7551f, 4.8182f)
                horizontalLineTo(3.8182f)
                close()
            }
        }
        .build()
        return _naver!!
    }

private var _naver: ImageVector? = null
