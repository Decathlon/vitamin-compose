package com.decathlon.vitamin.compose.vitaminicons.fill

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
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.SelectedByDecathlon: ImageVector
    get() {
        if (_selectedByDecathlon != null) {
            return _selectedByDecathlon!!
        }
        _selectedByDecathlon = Builder(name = "SelectedByDecathlon", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0348f, 20.0f)
                curveTo(6.6031f, 20.0f, 3.0105f, 16.4183f, 3.0105f, 12.0f)
                curveTo(3.0105f, 7.5817f, 6.6031f, 4.0f, 11.0348f, 4.0f)
                curveTo(15.4665f, 4.0f, 19.0592f, 7.5817f, 19.0592f, 12.0f)
                curveTo(19.0592f, 13.0575f, 18.8533f, 14.0671f, 18.4795f, 14.9911f)
                horizontalLineTo(20.6089f)
                curveTo(20.9054f, 14.0466f, 21.0652f, 13.0419f, 21.0652f, 12.0f)
                curveTo(21.0652f, 6.4771f, 16.5745f, 2.0f, 11.0348f, 2.0f)
                curveTo(5.4952f, 2.0f, 1.0044f, 6.4771f, 1.0044f, 12.0f)
                curveTo(1.0044f, 17.5228f, 5.4952f, 22.0f, 11.0348f, 22.0f)
                curveTo(11.9584f, 22.0f, 12.8528f, 21.8756f, 13.7021f, 21.6426f)
                verticalLineTo(19.5474f)
                curveTo(12.8676f, 19.8405f, 11.9699f, 20.0f, 11.0348f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.4778f, 16.0514f)
                lineTo(23.0044f, 17.4829f)
                lineTo(18.2183f, 21.9738f)
                lineTo(14.937f, 18.8949f)
                lineTo(16.4629f, 17.4631f)
                lineTo(18.2183f, 19.1102f)
                lineTo(21.4778f, 16.0514f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.3423f, 8.5f)
                curveTo(9.5379f, 8.5f, 10.3735f, 8.647f, 11.1576f, 9.3362f)
                curveTo(11.7207f, 9.8299f, 12.0767f, 10.4994f, 12.2045f, 11.3201f)
                lineTo(12.2041f, 8.5f)
                horizontalLineTo(16.3008f)
                verticalLineTo(10.0399f)
                lineTo(14.047f, 10.0424f)
                verticalLineTo(11.1861f)
                lineTo(15.9986f, 11.1844f)
                verticalLineTo(12.6897f)
                lineTo(14.047f, 12.6917f)
                verticalLineTo(13.9604f)
                horizontalLineTo(16.3008f)
                verticalLineTo(15.4953f)
                horizontalLineTo(12.2041f)
                lineTo(12.2046f, 12.7047f)
                curveTo(12.0787f, 13.4702f, 11.7292f, 14.1174f, 11.1659f, 14.6337f)
                curveTo(10.3628f, 15.3609f, 9.6535f, 15.5f, 8.5946f, 15.5f)
                horizontalLineTo(5.7688f)
                verticalLineTo(8.5f)
                horizontalLineTo(8.3423f)
                close()
                moveTo(8.3423f, 10.0053f)
                horizontalLineTo(7.6111f)
                verticalLineTo(13.9627f)
                horizontalLineTo(8.3507f)
                curveTo(9.7601f, 13.9627f, 10.4263f, 13.3536f, 10.4263f, 11.9762f)
                curveTo(10.4263f, 10.7157f, 9.695f, 10.0053f, 8.3423f, 10.0053f)
                close()
            }
        }
        .build()
        return _selectedByDecathlon!!
    }

private var _selectedByDecathlon: ImageVector? = null
