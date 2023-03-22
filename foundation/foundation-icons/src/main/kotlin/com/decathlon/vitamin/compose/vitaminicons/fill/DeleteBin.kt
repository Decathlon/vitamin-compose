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

public val FillGroup.DeleteBin: ImageVector
    get() {
        if (_deleteBin != null) {
            return _deleteBin!!
        }
        _deleteBin = Builder(name = "DeleteBin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(21.0f)
                curveTo(4.0f, 21.5523f, 4.4477f, 22.0f, 5.0f, 22.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 22.0f, 20.0f, 21.5523f, 20.0f, 21.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                curveTo(17.0f, 2.4477f, 16.5523f, 2.0f, 16.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 2.0f, 7.0f, 2.4477f, 7.0f, 3.0f)
                close()
                moveTo(9.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _deleteBin!!
    }

private var _deleteBin: ImageVector? = null
