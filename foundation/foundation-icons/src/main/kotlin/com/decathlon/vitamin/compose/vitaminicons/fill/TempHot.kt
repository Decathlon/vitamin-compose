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

public val FillGroup.TempHot: ImageVector
    get() {
        if (_tempHot != null) {
            return _tempHot!!
        }
        _tempHot = Builder(name = "TempHot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.3334f, 6.8366f)
                verticalLineTo(3.3333f)
                curveTo(5.3334f, 2.626f, 5.6143f, 1.9478f, 6.1144f, 1.4477f)
                curveTo(6.6145f, 0.9476f, 7.2928f, 0.6666f, 8.0f, 0.6666f)
                curveTo(8.7073f, 0.6666f, 9.3856f, 0.9476f, 9.8857f, 1.4477f)
                curveTo(10.3858f, 1.9478f, 10.6667f, 2.626f, 10.6667f, 3.3333f)
                verticalLineTo(6.8366f)
                curveTo(11.482f, 7.4043f, 12.0949f, 8.2175f, 12.4161f, 9.1576f)
                curveTo(12.7373f, 10.0978f, 12.7501f, 11.1159f, 12.4526f, 12.0638f)
                curveTo(12.155f, 13.0117f, 11.5628f, 13.8399f, 10.762f, 14.4279f)
                curveTo(9.9611f, 15.0159f, 8.9936f, 15.333f, 8.0f, 15.333f)
                curveTo(7.0065f, 15.333f, 6.0389f, 15.0159f, 5.2381f, 14.4279f)
                curveTo(4.4373f, 13.8399f, 3.845f, 13.0117f, 3.5475f, 12.0638f)
                curveTo(3.25f, 11.1159f, 3.2628f, 10.0978f, 3.584f, 9.1576f)
                curveTo(3.9052f, 8.2175f, 4.5181f, 7.4043f, 5.3334f, 6.8366f)
                close()
                moveTo(7.3334f, 8.084f)
                curveTo(6.7064f, 8.2478f, 6.1604f, 8.6342f, 5.7975f, 9.1711f)
                curveTo(5.4346f, 9.7079f, 5.2794f, 10.3586f, 5.3611f, 11.0014f)
                curveTo(5.4427f, 11.6443f, 5.7556f, 12.2355f, 6.2412f, 12.6646f)
                curveTo(6.7268f, 13.0937f, 7.352f, 13.3314f, 8.0f, 13.3333f)
                curveTo(8.6496f, 13.3339f, 9.277f, 13.0975f, 9.7645f, 12.6684f)
                curveTo(10.2521f, 12.2392f, 10.5663f, 11.6469f, 10.6481f, 11.0026f)
                curveTo(10.7299f, 10.3583f, 10.5738f, 9.7062f, 10.209f, 9.1688f)
                curveTo(9.8442f, 8.6314f, 9.2958f, 8.2457f, 8.6667f, 8.084f)
                verticalLineTo(3.3333f)
                horizontalLineTo(7.3334f)
                verticalLineTo(8.084f)
                close()
            }
        }
        .build()
        return _tempHot!!
    }

private var _tempHot: ImageVector? = null
