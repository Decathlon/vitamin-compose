package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.FlagsGroup

public val FlagsGroup.Mk: ImageVector
    get() {
        if (_mk != null) {
            return _mk!!
        }
        _mk = Builder(name = "Mk", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 0.0f)
                    lineTo(26.0f, 0.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 28.0f, 2.0f)
                    lineTo(28.0f, 18.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 26.0f, 20.0f)
                    lineTo(2.0f, 20.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 0.0f, 18.0f)
                    lineTo(0.0f, 2.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE81B26)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFE94F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(13.9998f, 13.3334f)
                    curveTo(15.8408f, 13.3334f, 17.3332f, 11.841f, 17.3332f, 10.0f)
                    curveTo(17.3332f, 8.1591f, 15.8408f, 6.6667f, 13.9998f, 6.6667f)
                    curveTo(12.1589f, 6.6667f, 10.6665f, 8.1591f, 10.6665f, 10.0f)
                    curveTo(10.6665f, 11.841f, 12.1589f, 13.3334f, 13.9998f, 13.3334f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFE94F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(10.2082f, 7.2793f)
                    curveTo(10.4095f, 6.9992f, 10.641f, 6.7424f, 10.8981f, 6.5135f)
                    lineTo(1.9617f, -3.5306f)
                    lineTo(-0.7148f, -0.5581f)
                    lineTo(10.2082f, 7.2793f)
                    close()
                    moveTo(10.8981f, 13.4864f)
                    curveTo(10.6411f, 13.2576f, 10.4095f, 13.0007f, 10.2082f, 12.7207f)
                    lineTo(-0.7148f, 20.5581f)
                    lineTo(1.9617f, 23.5306f)
                    lineTo(10.8981f, 13.4864f)
                    close()
                    moveTo(13.0846f, 14.5769f)
                    lineTo(12.0f, 20.0f)
                    horizontalLineTo(16.0f)
                    lineTo(14.9154f, 14.5769f)
                    curveTo(14.6195f, 14.6358f, 14.3134f, 14.6666f, 14.0002f, 14.6666f)
                    curveTo(13.6868f, 14.6666f, 13.3807f, 14.6358f, 13.0846f, 14.5769f)
                    close()
                    moveTo(17.792f, 12.7208f)
                    curveTo(17.5907f, 13.0009f, 17.3591f, 13.2577f, 17.1021f, 13.4866f)
                    lineTo(26.0384f, 23.5306f)
                    lineTo(28.7149f, 20.5581f)
                    lineTo(17.792f, 12.7208f)
                    close()
                    moveTo(9.3798f, 10.66f)
                    curveTo(9.3493f, 10.4444f, 9.3335f, 10.224f, 9.3335f, 10.0f)
                    curveTo(9.3335f, 9.7759f, 9.3493f, 9.5556f, 9.3798f, 9.34f)
                    lineTo(0.0f, 8.0f)
                    verticalLineTo(12.0f)
                    lineTo(9.3798f, 10.66f)
                    close()
                    moveTo(13.0846f, 5.4231f)
                    lineTo(12.0f, 0.0f)
                    horizontalLineTo(16.0f)
                    lineTo(14.9154f, 5.423f)
                    curveTo(14.6195f, 5.3642f, 14.3134f, 5.3333f, 14.0002f, 5.3333f)
                    curveTo(13.6868f, 5.3333f, 13.3807f, 5.3642f, 13.0846f, 5.4231f)
                    close()
                    moveTo(18.6205f, 9.3399f)
                    curveTo(18.651f, 9.5556f, 18.6668f, 9.7759f, 18.6668f, 10.0f)
                    curveTo(18.6668f, 10.224f, 18.651f, 10.4444f, 18.6205f, 10.6601f)
                    lineTo(28.0f, 12.0f)
                    verticalLineTo(8.0f)
                    lineTo(18.6205f, 9.3399f)
                    close()
                    moveTo(17.792f, 7.2792f)
                    curveTo(17.5907f, 6.9991f, 17.3591f, 6.7423f, 17.1021f, 6.5134f)
                    lineTo(26.0384f, -3.5306f)
                    lineTo(28.7149f, -0.5581f)
                    lineTo(17.792f, 7.2792f)
                    close()
                }
            }
        }
        .build()
        return _mk!!
    }

private var _mk: ImageVector? = null
