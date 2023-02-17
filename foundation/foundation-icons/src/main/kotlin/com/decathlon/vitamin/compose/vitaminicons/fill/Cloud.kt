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

public val FillGroup.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 20.986f)
                curveTo(7.544f, 20.8997f, 6.1348f, 20.4403f, 4.9077f, 19.6519f)
                curveTo(3.6807f, 18.8635f, 2.6772f, 17.7726f, 1.9937f, 16.4842f)
                curveTo(1.3102f, 15.1957f, 0.9697f, 13.7531f, 1.0051f, 12.295f)
                curveTo(1.0404f, 10.8369f, 1.4503f, 9.4125f, 2.1954f, 8.1586f)
                curveTo(2.9404f, 6.9048f, 3.9956f, 5.8638f, 5.2594f, 5.1357f)
                curveTo(6.5232f, 4.4076f, 7.953f, 4.017f, 9.4115f, 4.0013f)
                curveTo(10.8699f, 3.9857f, 12.3078f, 4.3456f, 13.5869f, 5.0464f)
                curveTo(14.866f, 5.7473f, 15.9432f, 6.7654f, 16.715f, 8.003f)
                curveTo(18.3774f, 8.0561f, 19.9563f, 8.7445f, 21.1265f, 9.9265f)
                curveTo(22.2968f, 11.1084f, 22.9694f, 12.6941f, 23.0059f, 14.357f)
                curveTo(23.0424f, 16.0199f, 22.4401f, 17.6335f, 21.3228f, 18.8657f)
                curveTo(20.2056f, 20.0979f, 18.6585f, 20.855f, 17.0f, 20.981f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.986f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
