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

public val FillGroup.Group: ImageVector
    get() {
        if (_group != null) {
            return _group!!
        }
        _group = Builder(name = "Group", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.3334f, 14.6666f)
                curveTo(1.3334f, 13.2521f, 1.8953f, 11.8956f, 2.8955f, 10.8954f)
                curveTo(3.8957f, 9.8952f, 5.2522f, 9.3333f, 6.6667f, 9.3333f)
                curveTo(8.0812f, 9.3333f, 9.4377f, 9.8952f, 10.4379f, 10.8954f)
                curveTo(11.4381f, 11.8956f, 12.0f, 13.2521f, 12.0f, 14.6666f)
                horizontalLineTo(1.3334f)
                close()
                moveTo(6.6667f, 8.6666f)
                curveTo(4.4567f, 8.6666f, 2.6667f, 6.8766f, 2.6667f, 4.6666f)
                curveTo(2.6667f, 2.4566f, 4.4567f, 0.6666f, 6.6667f, 0.6666f)
                curveTo(8.8767f, 0.6666f, 10.6667f, 2.4566f, 10.6667f, 4.6666f)
                curveTo(10.6667f, 6.8766f, 8.8767f, 8.6666f, 6.6667f, 8.6666f)
                close()
                moveTo(11.5754f, 10.1553f)
                curveTo(12.5951f, 10.4174f, 13.5062f, 10.9945f, 14.1789f, 11.8045f)
                curveTo(14.8516f, 12.6145f, 15.2516f, 13.6161f, 15.322f, 14.6666f)
                horizontalLineTo(13.3334f)
                curveTo(13.3334f, 12.9266f, 12.6667f, 11.3426f, 11.5754f, 10.1553f)
                close()
                moveTo(10.2267f, 8.638f)
                curveTo(10.7854f, 8.1383f, 11.2321f, 7.5262f, 11.5377f, 6.8418f)
                curveTo(11.8434f, 6.1574f, 12.0009f, 5.4162f, 12.0f, 4.6666f)
                curveTo(12.0015f, 3.7556f, 11.7684f, 2.8595f, 11.3234f, 2.0646f)
                curveTo(12.0785f, 2.2164f, 12.7577f, 2.6249f, 13.2457f, 3.2208f)
                curveTo(13.7336f, 3.8166f, 14.0002f, 4.5631f, 14.0f, 5.3333f)
                curveTo(14.0002f, 5.8083f, 13.8989f, 6.2778f, 13.7028f, 6.7104f)
                curveTo(13.5067f, 7.143f, 13.2204f, 7.5287f, 12.8631f, 7.8417f)
                curveTo(12.5058f, 8.1546f, 12.0857f, 8.3875f, 11.631f, 8.5249f)
                curveTo(11.1763f, 8.6622f, 10.6975f, 8.7008f, 10.2267f, 8.638f)
                close()
            }
        }
        .build()
        return _group!!
    }

private var _group: ImageVector? = null
