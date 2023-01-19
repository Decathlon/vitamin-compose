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

public val FillGroup.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0153f, 11.0728f)
                lineTo(14.8701f, 13.9269f)
                lineTo(13.9269f, 14.87f)
                lineTo(11.0728f, 12.0152f)
                curveTo(10.0109f, 12.8666f, 8.69f, 13.3296f, 7.3289f, 13.3277f)
                curveTo(4.0175f, 13.3277f, 1.3301f, 10.6402f, 1.3301f, 7.3288f)
                curveTo(1.3301f, 4.0175f, 4.0175f, 1.33f, 7.3289f, 1.33f)
                curveTo(10.6402f, 1.33f, 13.3277f, 4.0175f, 13.3277f, 7.3288f)
                curveTo(13.3297f, 8.6899f, 12.8666f, 10.0108f, 12.0153f, 11.0728f)
                close()
                moveTo(10.6782f, 10.5782f)
                curveTo(11.5241f, 9.7083f, 11.9966f, 8.5422f, 11.9946f, 7.3288f)
                curveTo(11.9946f, 4.7507f, 9.9064f, 2.6631f, 7.3289f, 2.6631f)
                curveTo(4.7507f, 2.6631f, 2.6632f, 4.7507f, 2.6632f, 7.3288f)
                curveTo(2.6632f, 9.9063f, 4.7507f, 11.9946f, 7.3289f, 11.9946f)
                curveTo(8.5423f, 11.9965f, 9.7084f, 11.5241f, 10.5783f, 10.6782f)
                lineTo(10.6782f, 10.5782f)
                close()
                moveTo(7.3289f, 10.6615f)
                curveTo(9.1695f, 10.6615f, 10.6616f, 9.1694f, 10.6616f, 7.3288f)
                curveTo(10.6616f, 5.4882f, 9.1695f, 3.9962f, 7.3289f, 3.9962f)
                curveTo(5.4883f, 3.9962f, 3.9962f, 5.4882f, 3.9962f, 7.3288f)
                curveTo(3.9962f, 9.1694f, 5.4883f, 10.6615f, 7.3289f, 10.6615f)
                close()
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
