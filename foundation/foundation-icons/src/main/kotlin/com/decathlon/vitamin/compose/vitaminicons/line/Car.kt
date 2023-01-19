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

public val LineGroup.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(name = "Car", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6668f, 13.3334f)
                horizontalLineTo(3.3335f)
                verticalLineTo(14.0f)
                curveTo(3.3335f, 14.1768f, 3.2633f, 14.3464f, 3.1382f, 14.4714f)
                curveTo(3.0132f, 14.5965f, 2.8436f, 14.6667f, 2.6668f, 14.6667f)
                horizontalLineTo(2.0002f)
                curveTo(1.8233f, 14.6667f, 1.6538f, 14.5965f, 1.5288f, 14.4714f)
                curveTo(1.4037f, 14.3464f, 1.3335f, 14.1768f, 1.3335f, 14.0f)
                verticalLineTo(7.3334f)
                lineTo(2.9868f, 3.4747f)
                curveTo(3.0897f, 3.2347f, 3.2608f, 3.0302f, 3.4789f, 2.8865f)
                curveTo(3.6969f, 2.7429f, 3.9524f, 2.6665f, 4.2135f, 2.6667f)
                horizontalLineTo(11.7868f)
                curveTo(12.0477f, 2.6667f, 12.3029f, 2.7433f, 12.5207f, 2.8869f)
                curveTo(12.7385f, 3.0305f, 12.9094f, 3.2349f, 13.0122f, 3.4747f)
                lineTo(14.6668f, 7.3334f)
                verticalLineTo(14.0f)
                curveTo(14.6668f, 14.1768f, 14.5966f, 14.3464f, 14.4716f, 14.4714f)
                curveTo(14.3465f, 14.5965f, 14.177f, 14.6667f, 14.0002f, 14.6667f)
                horizontalLineTo(13.3335f)
                curveTo(13.1567f, 14.6667f, 12.9871f, 14.5965f, 12.8621f, 14.4714f)
                curveTo(12.7371f, 14.3464f, 12.6668f, 14.1768f, 12.6668f, 14.0f)
                verticalLineTo(13.3334f)
                close()
                moveTo(13.3335f, 8.6667f)
                horizontalLineTo(2.6668f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.3335f)
                verticalLineTo(8.6667f)
                close()
                moveTo(2.7842f, 7.3334f)
                horizontalLineTo(13.2162f)
                lineTo(11.7875f, 4.0f)
                horizontalLineTo(4.2135f)
                lineTo(2.7848f, 7.3334f)
                horizontalLineTo(2.7842f)
                close()
                moveTo(4.3335f, 11.3334f)
                curveTo(4.0683f, 11.3334f, 3.8139f, 11.228f, 3.6264f, 11.0405f)
                curveTo(3.4388f, 10.8529f, 3.3335f, 10.5986f, 3.3335f, 10.3334f)
                curveTo(3.3335f, 10.0681f, 3.4388f, 9.8138f, 3.6264f, 9.6263f)
                curveTo(3.8139f, 9.4387f, 4.0683f, 9.3334f, 4.3335f, 9.3334f)
                curveTo(4.5987f, 9.3334f, 4.8531f, 9.4387f, 5.0406f, 9.6263f)
                curveTo(5.2281f, 9.8138f, 5.3335f, 10.0681f, 5.3335f, 10.3334f)
                curveTo(5.3335f, 10.5986f, 5.2281f, 10.8529f, 5.0406f, 11.0405f)
                curveTo(4.8531f, 11.228f, 4.5987f, 11.3334f, 4.3335f, 11.3334f)
                close()
                moveTo(11.6668f, 11.3334f)
                curveTo(11.4016f, 11.3334f, 11.1473f, 11.228f, 10.9597f, 11.0405f)
                curveTo(10.7722f, 10.8529f, 10.6668f, 10.5986f, 10.6668f, 10.3334f)
                curveTo(10.6668f, 10.0681f, 10.7722f, 9.8138f, 10.9597f, 9.6263f)
                curveTo(11.1473f, 9.4387f, 11.4016f, 9.3334f, 11.6668f, 9.3334f)
                curveTo(11.932f, 9.3334f, 12.1864f, 9.4387f, 12.3739f, 9.6263f)
                curveTo(12.5615f, 9.8138f, 12.6668f, 10.0681f, 12.6668f, 10.3334f)
                curveTo(12.6668f, 10.5986f, 12.5615f, 10.8529f, 12.3739f, 11.0405f)
                curveTo(12.1864f, 11.228f, 11.932f, 11.3334f, 11.6668f, 11.3334f)
                close()
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
