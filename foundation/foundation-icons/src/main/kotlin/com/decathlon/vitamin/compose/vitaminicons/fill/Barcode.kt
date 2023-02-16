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

public val FillGroup.Barcode: ImageVector
    get() {
        if (_barcode != null) {
            return _barcode!!
        }
        _barcode = Builder(name = "Barcode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(9.8f, 2.6f)
                horizontalLineTo(13.4f)
                verticalLineTo(5.6f)
                horizontalLineTo(12.2f)
                verticalLineTo(3.8f)
                horizontalLineTo(9.8f)
                verticalLineTo(2.6f)
                close()
                moveTo(6.2f, 2.6f)
                verticalLineTo(3.8f)
                horizontalLineTo(3.8f)
                verticalLineTo(5.6f)
                horizontalLineTo(2.6f)
                verticalLineTo(2.6f)
                horizontalLineTo(6.2f)
                close()
                moveTo(9.8f, 13.4f)
                verticalLineTo(12.2f)
                horizontalLineTo(12.2f)
                verticalLineTo(10.4f)
                horizontalLineTo(13.4f)
                verticalLineTo(13.4f)
                horizontalLineTo(9.8f)
                close()
                moveTo(6.2f, 13.4f)
                horizontalLineTo(2.6f)
                verticalLineTo(10.4f)
                horizontalLineTo(3.8f)
                verticalLineTo(12.2f)
                horizontalLineTo(6.2f)
                verticalLineTo(13.4f)
                close()
                moveTo(6.2f, 5.0f)
                horizontalLineTo(4.4f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.2f)
                verticalLineTo(5.0f)
                close()
                moveTo(6.8f, 5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.8f)
                verticalLineTo(5.0f)
                close()
                moveTo(9.2f, 5.0f)
                horizontalLineTo(8.6f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.2f)
                verticalLineTo(5.0f)
                close()
                moveTo(9.8f, 5.0f)
                horizontalLineTo(11.6f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.8f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _barcode!!
    }

private var _barcode: ImageVector? = null
