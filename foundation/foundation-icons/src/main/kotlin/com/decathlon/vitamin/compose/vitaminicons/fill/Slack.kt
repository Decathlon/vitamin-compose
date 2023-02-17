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

public val FillGroup.Slack: ImageVector
    get() {
        if (_slack != null) {
            return _slack!!
        }
        _slack = Builder(name = "Slack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.486f, 6.527f)
                curveTo(8.4014f, 6.5231f, 7.5233f, 5.6446f, 7.52f, 4.56f)
                curveTo(7.52f, 3.477f, 8.404f, 2.593f, 9.487f, 2.593f)
                curveTo(10.57f, 2.593f, 11.455f, 3.477f, 11.455f, 4.56f)
                verticalLineTo(6.528f)
                lineTo(9.486f, 6.527f)
                close()
                moveTo(4.56f, 16.48f)
                curveTo(5.6446f, 16.4767f, 6.5232f, 15.5986f, 6.527f, 14.514f)
                lineTo(6.528f, 14.513f)
                verticalLineTo(12.545f)
                horizontalLineTo(4.56f)
                curveTo(3.477f, 12.545f, 2.593f, 13.43f, 2.593f, 14.513f)
                curveTo(2.5963f, 15.598f, 3.475f, 16.4767f, 4.56f, 16.48f)
                close()
                moveTo(9.486f, 12.546f)
                curveTo(8.403f, 12.546f, 7.519f, 13.431f, 7.519f, 14.514f)
                verticalLineTo(19.441f)
                curveTo(7.5223f, 20.526f, 8.401f, 21.4047f, 9.486f, 21.408f)
                curveTo(10.5714f, 21.4052f, 11.4507f, 20.5264f, 11.454f, 19.441f)
                verticalLineTo(14.514f)
                curveTo(11.454f, 13.431f, 10.569f, 12.546f, 9.486f, 12.546f)
                close()
                moveTo(11.454f, 9.486f)
                curveTo(11.454f, 8.403f, 10.569f, 7.519f, 9.486f, 7.519f)
                horizontalLineTo(4.56f)
                curveTo(3.477f, 7.519f, 2.593f, 8.403f, 2.593f, 9.486f)
                curveTo(2.5958f, 10.5714f, 3.4746f, 11.4507f, 4.56f, 11.454f)
                horizontalLineTo(9.486f)
                curveTo(10.5718f, 11.4512f, 11.4513f, 10.5717f, 11.454f, 9.486f)
                close()
                moveTo(17.473f, 9.486f)
                curveTo(17.473f, 8.403f, 18.358f, 7.519f, 19.441f, 7.519f)
                curveTo(20.524f, 7.519f, 21.408f, 8.403f, 21.408f, 9.486f)
                curveTo(21.4053f, 10.5714f, 20.5264f, 11.4507f, 19.441f, 11.454f)
                horizontalLineTo(17.473f)
                verticalLineTo(9.486f)
                close()
                moveTo(14.514f, 11.454f)
                curveTo(15.5994f, 11.4507f, 16.4783f, 10.5714f, 16.481f, 9.486f)
                verticalLineTo(4.56f)
                curveTo(16.481f, 3.477f, 15.597f, 2.593f, 14.514f, 2.593f)
                curveTo(13.431f, 2.593f, 12.546f, 3.477f, 12.546f, 4.56f)
                verticalLineTo(9.486f)
                curveTo(12.5488f, 10.5717f, 13.4283f, 11.4512f, 14.514f, 11.454f)
                close()
                moveTo(14.514f, 17.473f)
                curveTo(15.597f, 17.473f, 16.481f, 18.358f, 16.481f, 19.441f)
                curveTo(16.4777f, 20.526f, 15.599f, 21.4047f, 14.514f, 21.408f)
                curveTo(13.4287f, 21.4052f, 12.5493f, 20.5264f, 12.546f, 19.441f)
                verticalLineTo(17.473f)
                horizontalLineTo(14.514f)
                close()
                moveTo(12.546f, 14.514f)
                curveTo(12.5493f, 15.5994f, 13.4287f, 16.4782f, 14.514f, 16.481f)
                horizontalLineTo(19.441f)
                curveTo(20.526f, 16.4777f, 21.4047f, 15.599f, 21.408f, 14.514f)
                curveTo(21.408f, 13.431f, 20.524f, 12.546f, 19.441f, 12.546f)
                horizontalLineTo(14.514f)
                curveTo(13.431f, 12.546f, 12.546f, 13.431f, 12.546f, 14.514f)
                close()
            }
        }
        .build()
        return _slack!!
    }

private var _slack: ImageVector? = null
