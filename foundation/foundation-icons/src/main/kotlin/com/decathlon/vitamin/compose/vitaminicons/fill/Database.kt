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

public val FillGroup.Database: ImageVector
    get() {
        if (_database != null) {
            return _database!!
        }
        _database = Builder(name = "Database", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 5.0f)
                curveTo(2.0f, 6.6567f, 4.6867f, 8.0f, 8.0f, 8.0f)
                curveTo(11.3133f, 8.0f, 14.0f, 6.6567f, 14.0f, 5.0f)
                curveTo(14.0f, 3.3433f, 11.3133f, 2.0f, 8.0f, 2.0f)
                curveTo(4.6867f, 2.0f, 2.0f, 3.3433f, 2.0f, 5.0f)
                close()
                moveTo(14.0f, 6.3333f)
                verticalLineTo(8.3333f)
                curveTo(14.0f, 9.99f, 11.3133f, 11.3333f, 8.0f, 11.3333f)
                curveTo(4.6867f, 11.3333f, 2.0f, 9.99f, 2.0f, 8.3333f)
                verticalLineTo(6.3333f)
                curveTo(2.0f, 7.99f, 4.6867f, 9.3333f, 8.0f, 9.3333f)
                curveTo(11.3133f, 9.3333f, 14.0f, 7.99f, 14.0f, 6.3333f)
                close()
                moveTo(2.0f, 9.6667f)
                curveTo(2.0f, 11.3233f, 4.6867f, 12.6667f, 8.0f, 12.6667f)
                curveTo(11.3133f, 12.6667f, 14.0f, 11.3233f, 14.0f, 9.6667f)
                verticalLineTo(11.6667f)
                curveTo(14.0f, 13.3233f, 11.3133f, 14.6667f, 8.0f, 14.6667f)
                curveTo(4.6867f, 14.6667f, 2.0f, 13.3233f, 2.0f, 11.6667f)
                verticalLineTo(9.6667f)
                close()
            }
        }
        .build()
        return _database!!
    }

private var _database: ImageVector? = null
