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

public val FillGroup.ThumbDown: ImageVector
    get() {
        if (_thumbDown != null) {
            return _thumbDown!!
        }
        _thumbDown = Builder(name = "ThumbDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.8714f, 15.1287f)
                lineTo(11.1381f, 10.862f)
                curveTo(11.2631f, 10.737f, 11.3334f, 10.5675f, 11.3334f, 10.3907f)
                verticalLineTo(2.6667f)
                curveTo(11.3334f, 2.2985f, 11.0349f, 2.0f, 10.6668f, 2.0f)
                horizontalLineTo(3.4467f)
                curveTo(3.1766f, 2.0003f, 2.9334f, 2.1635f, 2.8307f, 2.4133f)
                lineTo(0.7668f, 7.4227f)
                curveTo(0.7005f, 7.5838f, 0.6666f, 7.7564f, 0.6667f, 7.9307f)
                verticalLineTo(9.3333f)
                curveTo(0.6667f, 10.0697f, 1.2637f, 10.6667f, 2.0001f, 10.6667f)
                horizontalLineTo(6.2667f)
                lineTo(5.4981f, 13.6867f)
                curveTo(5.3984f, 14.078f, 5.5438f, 14.4909f, 5.8667f, 14.7333f)
                lineTo(6.4354f, 15.16f)
                curveTo(6.5683f, 15.2596f, 6.7542f, 15.2462f, 6.8714f, 15.1287f)
                close()
                moveTo(12.6668f, 10.0f)
                horizontalLineTo(14.6668f)
                curveTo(15.0349f, 10.0f, 15.3334f, 9.7015f, 15.3334f, 9.3333f)
                verticalLineTo(2.6667f)
                curveTo(15.3334f, 2.2985f, 15.0349f, 2.0f, 14.6668f, 2.0f)
                horizontalLineTo(12.6668f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _thumbDown!!
    }

private var _thumbDown: ImageVector? = null
