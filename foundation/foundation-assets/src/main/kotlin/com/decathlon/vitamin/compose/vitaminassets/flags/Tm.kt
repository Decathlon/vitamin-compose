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

public val FlagsGroup.Tm: ImageVector
    get() {
        if (_tm != null) {
            return _tm!!
        }
        _tm = Builder(name = "Tm", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF30C375)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDE414F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.0f, 0.0f)
                    horizontalLineToRelative(4.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-4.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.0f, 4.0f)
                    curveTo(7.1046f, 4.0f, 8.0f, 3.403f, 8.0f, 2.6667f)
                    curveTo(8.0f, 1.9303f, 7.1046f, 1.3333f, 6.0f, 1.3333f)
                    curveTo(4.8954f, 1.3333f, 4.0f, 1.9303f, 4.0f, 2.6667f)
                    curveTo(4.0f, 3.403f, 4.8954f, 4.0f, 6.0f, 4.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDD404F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.0002f, 3.3333f)
                    curveTo(6.3684f, 3.3333f, 6.6668f, 3.0349f, 6.6668f, 2.6667f)
                    curveTo(6.6668f, 2.2985f, 6.3684f, 2.0f, 6.0002f, 2.0f)
                    curveTo(5.632f, 2.0f, 5.3335f, 2.2985f, 5.3335f, 2.6667f)
                    curveTo(5.3335f, 3.0349f, 5.632f, 3.3333f, 6.0002f, 3.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFBAF29)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.0f, 1.3333f)
                    horizontalLineToRelative(2.0f)
                    verticalLineToRelative(1.3333f)
                    horizontalLineToRelative(-2.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFBAF29)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.0f, 2.6667f)
                    horizontalLineToRelative(2.0f)
                    verticalLineToRelative(1.3333f)
                    horizontalLineToRelative(-2.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.0f, 18.6667f)
                    curveTo(7.1046f, 18.6667f, 8.0f, 18.0697f, 8.0f, 17.3333f)
                    curveTo(8.0f, 16.597f, 7.1046f, 16.0f, 6.0f, 16.0f)
                    curveTo(4.8954f, 16.0f, 4.0f, 16.597f, 4.0f, 17.3333f)
                    curveTo(4.0f, 18.0697f, 4.8954f, 18.6667f, 6.0f, 18.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDD404F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.0002f, 18.0f)
                    curveTo(6.3684f, 18.0f, 6.6668f, 17.7015f, 6.6668f, 17.3334f)
                    curveTo(6.6668f, 16.9652f, 6.3684f, 16.6667f, 6.0002f, 16.6667f)
                    curveTo(5.632f, 16.6667f, 5.3335f, 16.9652f, 5.3335f, 17.3334f)
                    curveTo(5.3335f, 17.7015f, 5.632f, 18.0f, 6.0002f, 18.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFBAF29)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.0f, 16.0f)
                    horizontalLineToRelative(2.0f)
                    verticalLineToRelative(1.3333f)
                    horizontalLineToRelative(-2.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFBAF29)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.0f, 17.3333f)
                    horizontalLineToRelative(2.0f)
                    verticalLineToRelative(1.3333f)
                    horizontalLineToRelative(-2.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF28AE67)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.0f, 12.0f)
                    curveTo(7.1046f, 12.0f, 8.0f, 11.403f, 8.0f, 10.6667f)
                    curveTo(8.0f, 9.9303f, 7.1046f, 9.3333f, 6.0f, 9.3333f)
                    curveTo(4.8954f, 9.3333f, 4.0f, 9.9303f, 4.0f, 10.6667f)
                    curveTo(4.0f, 11.403f, 4.8954f, 12.0f, 6.0f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDD404F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(5.9998f, 11.3333f)
                    curveTo(6.7362f, 11.3333f, 7.3332f, 11.0349f, 7.3332f, 10.6667f)
                    curveTo(7.3332f, 10.2985f, 6.7362f, 10.0f, 5.9998f, 10.0f)
                    curveTo(5.2635f, 10.0f, 4.6665f, 10.2985f, 4.6665f, 10.6667f)
                    curveTo(4.6665f, 11.0349f, 5.2635f, 11.3333f, 5.9998f, 11.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF28AE67)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.0f, 14.6667f)
                    curveTo(7.1046f, 14.6667f, 8.0f, 14.3682f, 8.0f, 14.0f)
                    curveTo(8.0f, 13.6318f, 7.1046f, 13.3333f, 6.0f, 13.3333f)
                    curveTo(4.8954f, 13.3333f, 4.0f, 13.6318f, 4.0f, 14.0f)
                    curveTo(4.0f, 14.3682f, 4.8954f, 14.6667f, 6.0f, 14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFBAF29)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.0f, 8.0f)
                    curveTo(7.1046f, 8.0f, 8.0f, 7.403f, 8.0f, 6.6667f)
                    curveTo(8.0f, 5.9303f, 7.1046f, 5.3333f, 6.0f, 5.3333f)
                    curveTo(4.8954f, 5.3333f, 4.0f, 5.9303f, 4.0f, 6.6667f)
                    curveTo(4.0f, 7.403f, 4.8954f, 8.0f, 6.0f, 8.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDD404F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.0002f, 7.3334f)
                    curveTo(6.3684f, 7.3334f, 6.6668f, 7.0349f, 6.6668f, 6.6667f)
                    curveTo(6.6668f, 6.2985f, 6.3684f, 6.0f, 6.0002f, 6.0f)
                    curveTo(5.632f, 6.0f, 5.3335f, 6.2985f, 5.3335f, 6.6667f)
                    curveTo(5.3335f, 7.0349f, 5.632f, 7.3334f, 6.0002f, 7.3334f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF28AE67)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.0f, 5.3333f)
                    horizontalLineToRelative(1.3333f)
                    verticalLineToRelative(2.6667f)
                    horizontalLineToRelative(-1.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF28AE67)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.6665f, 5.3333f)
                    horizontalLineToRelative(1.3333f)
                    verticalLineToRelative(2.6667f)
                    horizontalLineToRelative(-1.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.8225f, 4.2382f)
                    curveTo(14.5858f, 4.5202f, 14.6226f, 4.9407f, 14.9047f, 5.1774f)
                    curveTo(15.1867f, 5.4141f, 15.6072f, 5.3773f, 15.8439f, 5.0952f)
                    curveTo(16.0806f, 4.8132f, 16.0438f, 4.3927f, 15.7617f, 4.156f)
                    curveTo(15.4797f, 3.9193f, 15.0592f, 3.9561f, 14.8225f, 4.2382f)
                    close()
                    moveTo(13.0952f, 6.8227f)
                    curveTo(12.8132f, 6.586f, 12.3927f, 6.6228f, 12.156f, 6.9048f)
                    curveTo(11.9193f, 7.1869f, 11.9561f, 7.6074f, 12.2382f, 7.8441f)
                    curveTo(12.5202f, 8.0807f, 12.9407f, 8.0439f, 13.1774f, 7.7619f)
                    curveTo(13.414f, 7.4798f, 13.3773f, 7.0593f, 13.0952f, 6.8227f)
                    close()
                    moveTo(11.7617f, 5.4893f)
                    curveTo(11.4797f, 5.2527f, 11.0592f, 5.2895f, 10.8225f, 5.5715f)
                    curveTo(10.5858f, 5.8536f, 10.6226f, 6.2741f, 10.9047f, 6.5107f)
                    curveTo(11.1867f, 6.7474f, 11.6072f, 6.7106f, 11.8439f, 6.4286f)
                    curveTo(12.0806f, 6.1465f, 12.0438f, 5.726f, 11.7617f, 5.4893f)
                    close()
                    moveTo(14.4282f, 2.8227f)
                    curveTo(14.1462f, 2.586f, 13.7257f, 2.6228f, 13.489f, 2.9048f)
                    curveTo(13.2523f, 3.1869f, 13.2891f, 3.6074f, 13.5712f, 3.8441f)
                    curveTo(13.8532f, 4.0807f, 14.2737f, 4.0439f, 14.5104f, 3.7619f)
                    curveTo(14.7471f, 3.4798f, 14.7103f, 3.0593f, 14.4282f, 2.8227f)
                    close()
                    moveTo(13.7617f, 4.8227f)
                    curveTo(13.4797f, 4.586f, 13.0592f, 4.6228f, 12.8225f, 4.9048f)
                    curveTo(12.5858f, 5.1869f, 12.6226f, 5.6074f, 12.9047f, 5.8441f)
                    curveTo(13.1867f, 6.0807f, 13.6072f, 6.0439f, 13.8439f, 5.7619f)
                    curveTo(14.0806f, 5.4798f, 14.0438f, 5.0593f, 13.7617f, 4.8227f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(17.4763f, 9.4505f)
                    curveTo(15.8883f, 11.0386f, 13.3135f, 11.0386f, 11.7255f, 9.4505f)
                    curveTo(11.5716f, 9.2966f, 11.4327f, 9.1335f, 11.3086f, 8.9629f)
                    curveTo(12.8987f, 10.1191f, 15.1376f, 9.9802f, 16.5718f, 8.546f)
                    curveTo(18.006f, 7.1118f, 18.1449f, 4.8729f, 16.9887f, 3.2828f)
                    curveTo(17.1593f, 3.4068f, 17.3225f, 3.5458f, 17.4763f, 3.6997f)
                    curveTo(19.0644f, 5.2877f, 19.0644f, 7.8625f, 17.4763f, 9.4505f)
                    close()
                }
            }
        }
        .build()
        return _tm!!
    }

private var _tm: ImageVector? = null
