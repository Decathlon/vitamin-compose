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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 7.5f)
                curveTo(3.0f, 9.985f, 7.03f, 12.0f, 12.0f, 12.0f)
                curveTo(16.97f, 12.0f, 21.0f, 9.985f, 21.0f, 7.5f)
                curveTo(21.0f, 5.015f, 16.97f, 3.0f, 12.0f, 3.0f)
                curveTo(7.03f, 3.0f, 3.0f, 5.015f, 3.0f, 7.5f)
                close()
                moveTo(21.0f, 9.5f)
                verticalLineTo(12.5f)
                curveTo(21.0f, 14.985f, 16.97f, 17.0f, 12.0f, 17.0f)
                curveTo(7.03f, 17.0f, 3.0f, 14.985f, 3.0f, 12.5f)
                verticalLineTo(9.5f)
                curveTo(3.0f, 11.985f, 7.03f, 14.0f, 12.0f, 14.0f)
                curveTo(16.97f, 14.0f, 21.0f, 11.985f, 21.0f, 9.5f)
                close()
                moveTo(3.0f, 14.5f)
                curveTo(3.0f, 16.985f, 7.03f, 19.0f, 12.0f, 19.0f)
                curveTo(16.97f, 19.0f, 21.0f, 16.985f, 21.0f, 14.5f)
                verticalLineTo(17.5f)
                curveTo(21.0f, 19.985f, 16.97f, 22.0f, 12.0f, 22.0f)
                curveTo(7.03f, 22.0f, 3.0f, 19.985f, 3.0f, 17.5f)
                verticalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _database!!
    }

private var _database: ImageVector? = null
