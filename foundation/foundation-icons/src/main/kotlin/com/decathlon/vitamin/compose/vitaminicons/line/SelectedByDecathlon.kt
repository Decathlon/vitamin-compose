package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.SelectedByDecathlon: ImageVector
    get() {
        if (_selectedByDecathlon != null) {
            return _selectedByDecathlon!!
        }
        _selectedByDecathlon = Builder(name = "SelectedByDecathlon", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.3566f, 13.3333f)
                curveTo(4.4021f, 13.3333f, 2.007f, 10.9455f, 2.007f, 8.0f)
                curveTo(2.007f, 5.0545f, 4.4021f, 2.6667f, 7.3566f, 2.6667f)
                curveTo(10.311f, 2.6667f, 12.7061f, 5.0545f, 12.7061f, 8.0f)
                curveTo(12.7061f, 8.705f, 12.5689f, 9.378f, 12.3197f, 9.994f)
                horizontalLineTo(13.7393f)
                curveTo(13.937f, 9.3644f, 14.0435f, 8.6946f, 14.0435f, 8.0f)
                curveTo(14.0435f, 4.3181f, 11.0497f, 1.3333f, 7.3566f, 1.3333f)
                curveTo(3.6635f, 1.3333f, 0.6696f, 4.3181f, 0.6696f, 8.0f)
                curveTo(0.6696f, 11.6819f, 3.6635f, 14.6666f, 7.3566f, 14.6666f)
                curveTo(7.9723f, 14.6666f, 8.5685f, 14.5837f, 9.1348f, 14.4284f)
                verticalLineTo(13.0316f)
                curveTo(8.5784f, 13.227f, 7.9799f, 13.3333f, 7.3566f, 13.3333f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3185f, 10.7009f)
                lineTo(15.3363f, 11.6552f)
                lineTo(12.1455f, 14.6492f)
                lineTo(9.958f, 12.5966f)
                lineTo(10.9753f, 11.6421f)
                lineTo(12.1455f, 12.7401f)
                lineTo(14.3185f, 10.7009f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5616f, 5.6666f)
                curveTo(6.3586f, 5.6666f, 6.9157f, 5.7647f, 7.4384f, 6.2241f)
                curveTo(7.8138f, 6.5532f, 8.0512f, 6.9996f, 8.1363f, 7.5467f)
                lineTo(8.1361f, 5.6666f)
                horizontalLineTo(10.8672f)
                verticalLineTo(6.6933f)
                lineTo(9.3647f, 6.6949f)
                verticalLineTo(7.4574f)
                lineTo(10.6657f, 7.4562f)
                verticalLineTo(8.4598f)
                lineTo(9.3647f, 8.4611f)
                verticalLineTo(9.3069f)
                horizontalLineTo(10.8672f)
                verticalLineTo(10.3302f)
                horizontalLineTo(8.1361f)
                lineTo(8.1364f, 8.4698f)
                curveTo(8.0525f, 8.9801f, 7.8195f, 9.4116f, 7.444f, 9.7557f)
                curveTo(6.9085f, 10.2406f, 6.4357f, 10.3333f, 5.7297f, 10.3333f)
                horizontalLineTo(3.8459f)
                verticalLineTo(5.6666f)
                horizontalLineTo(5.5616f)
                close()
                moveTo(5.5616f, 6.6701f)
                horizontalLineTo(5.074f)
                verticalLineTo(9.3084f)
                horizontalLineTo(5.5671f)
                curveTo(6.5068f, 9.3084f, 6.9509f, 8.9024f, 6.9509f, 7.9841f)
                curveTo(6.9509f, 7.1438f, 6.4634f, 6.6701f, 5.5616f, 6.6701f)
                close()
            }
        }
        .build()
        return _selectedByDecathlon!!
    }

private var _selectedByDecathlon: ImageVector? = null
