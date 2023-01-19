package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Database: ImageVector
    get() {
        if (_database != null) {
            return _database!!
        }
        _database = Builder(name = "Database", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.3333f, 8.3333f)
                curveTo(3.3333f, 8.542f, 3.6407f, 8.9053f, 4.3533f, 9.262f)
                curveTo(5.276f, 9.7233f, 6.5847f, 10.0f, 8.0f, 10.0f)
                curveTo(9.4153f, 10.0f, 10.724f, 9.7233f, 11.6467f, 9.262f)
                curveTo(12.3593f, 8.9053f, 12.6667f, 8.542f, 12.6667f, 8.3333f)
                verticalLineTo(6.886f)
                curveTo(11.5667f, 7.566f, 9.8847f, 8.0f, 8.0f, 8.0f)
                curveTo(6.1153f, 8.0f, 4.4333f, 7.5653f, 3.3333f, 6.886f)
                verticalLineTo(8.3333f)
                close()
                moveTo(12.6667f, 10.2193f)
                curveTo(11.5667f, 10.8993f, 9.8847f, 11.3333f, 8.0f, 11.3333f)
                curveTo(6.1153f, 11.3333f, 4.4333f, 10.8987f, 3.3333f, 10.2193f)
                verticalLineTo(11.6667f)
                curveTo(3.3333f, 11.8753f, 3.6407f, 12.2387f, 4.3533f, 12.5953f)
                curveTo(5.276f, 13.0567f, 6.5847f, 13.3333f, 8.0f, 13.3333f)
                curveTo(9.4153f, 13.3333f, 10.724f, 13.0567f, 11.6467f, 12.5953f)
                curveTo(12.3593f, 12.2387f, 12.6667f, 11.8753f, 12.6667f, 11.6667f)
                verticalLineTo(10.2193f)
                close()
                moveTo(2.0f, 11.6667f)
                verticalLineTo(5.0f)
                curveTo(2.0f, 3.3433f, 4.6867f, 2.0f, 8.0f, 2.0f)
                curveTo(11.3133f, 2.0f, 14.0f, 3.3433f, 14.0f, 5.0f)
                verticalLineTo(11.6667f)
                curveTo(14.0f, 13.3233f, 11.3133f, 14.6667f, 8.0f, 14.6667f)
                curveTo(4.6867f, 14.6667f, 2.0f, 13.3233f, 2.0f, 11.6667f)
                close()
                moveTo(8.0f, 6.6667f)
                curveTo(9.4153f, 6.6667f, 10.724f, 6.39f, 11.6467f, 5.9287f)
                curveTo(12.3593f, 5.572f, 12.6667f, 5.2087f, 12.6667f, 5.0f)
                curveTo(12.6667f, 4.7913f, 12.3593f, 4.428f, 11.6467f, 4.0713f)
                curveTo(10.724f, 3.61f, 9.4153f, 3.3333f, 8.0f, 3.3333f)
                curveTo(6.5847f, 3.3333f, 5.276f, 3.61f, 4.3533f, 4.0713f)
                curveTo(3.6407f, 4.428f, 3.3333f, 4.7913f, 3.3333f, 5.0f)
                curveTo(3.3333f, 5.2087f, 3.6407f, 5.572f, 4.3533f, 5.9287f)
                curveTo(5.276f, 6.39f, 6.5847f, 6.6667f, 8.0f, 6.6667f)
                close()
            }
        }
        .build()
        return _database!!
    }

private var _database: ImageVector? = null
