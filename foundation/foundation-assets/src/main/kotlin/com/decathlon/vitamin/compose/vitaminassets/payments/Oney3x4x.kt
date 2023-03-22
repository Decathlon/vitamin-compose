package com.decathlon.vitamin.compose.vitaminassets.payments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.decathlon.vitamin.compose.vitaminassets.PaymentsGroup

public val PaymentsGroup.Oney3x4x: ImageVector
    get() {
        if (_oney3x4x != null) {
            return _oney3x4x!!
        }
        _oney3x4x = Builder(name = "Oney3x4x", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
                viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = SolidColor(Color(0xFFF3F3F3)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 0.5f)
                lineTo(54.0f, 0.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 57.5f, 4.0f)
                lineTo(57.5f, 36.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 54.0f, 39.5f)
                lineTo(4.0f, 39.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 0.5f, 36.0f)
                lineTo(0.5f, 4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 4.0f, 0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF87BC2B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.2225f, 12.8471f)
                lineTo(10.7748f, 12.0536f)
                lineTo(10.3276f, 12.8471f)
                horizontalLineTo(9.3246f)
                lineTo(10.265f, 11.4699f)
                lineTo(9.3416f, 10.1158f)
                horizontalLineTo(10.3441f)
                lineTo(10.7748f, 10.8867f)
                lineTo(11.2054f, 10.1158f)
                horizontalLineTo(12.2089f)
                lineTo(11.2907f, 11.4699f)
                lineTo(12.2255f, 12.8471f)
                horizontalLineTo(11.2225f)
                close()
                moveTo(7.6185f, 12.9319f)
                curveTo(6.6382f, 12.9319f, 6.0944f, 12.3539f, 6.0944f, 11.5154f)
                horizontalLineTo(7.012f)
                curveTo(7.012f, 11.946f, 7.2561f, 12.1957f, 7.6071f, 12.1957f)
                curveTo(7.9473f, 12.1957f, 8.1344f, 11.946f, 8.1344f, 11.6741f)
                curveTo(8.1344f, 11.3453f, 7.9809f, 11.1245f, 7.5508f, 11.1245f)
                horizontalLineTo(7.1935f)
                verticalLineTo(10.4162f)
                horizontalLineTo(7.5508f)
                curveTo(7.9587f, 10.4162f, 8.0776f, 10.2177f, 8.0776f, 9.9287f)
                curveTo(8.0776f, 9.6283f, 7.8904f, 9.4867f, 7.6242f, 9.4867f)
                curveTo(7.2333f, 9.4867f, 7.1196f, 9.7193f, 7.1196f, 10.0647f)
                horizontalLineTo(6.2019f)
                curveTo(6.2019f, 9.3905f, 6.6212f, 8.7954f, 7.6014f, 8.7954f)
                curveTo(8.3325f, 8.7954f, 8.9844f, 9.1635f, 8.9844f, 9.9065f)
                curveTo(8.9844f, 10.3537f, 8.7181f, 10.6768f, 8.4007f, 10.7843f)
                curveTo(8.7574f, 10.9146f, 9.047f, 11.2377f, 9.047f, 11.7418f)
                curveTo(9.047f, 12.4956f, 8.3723f, 12.9319f, 7.6185f, 12.9319f)
                close()
                moveTo(9.0759f, 6.0f)
                curveTo(6.2293f, 6.0f, 4.0f, 8.2355f, 4.0f, 11.0925f)
                curveTo(4.0f, 13.9478f, 6.2293f, 16.1865f, 9.0759f, 16.1865f)
                curveTo(11.9158f, 16.1865f, 14.1441f, 13.9478f, 14.1441f, 11.0925f)
                curveTo(14.1441f, 8.2355f, 11.9158f, 6.0f, 9.0759f, 6.0f)
                close()
                moveTo(23.321f, 21.0581f)
                curveTo(21.1227f, 21.0581f, 20.0052f, 22.2309f, 20.0052f, 24.5529f)
                verticalLineTo(31.4268f)
                horizontalLineTo(17.7473f)
                verticalLineTo(24.3909f)
                curveTo(17.769f, 23.158f, 17.9887f, 22.2856f, 18.4942f, 21.4669f)
                curveTo(19.0924f, 20.5473f, 20.513f, 19.0f, 23.321f, 19.0f)
                curveTo(26.1222f, 19.0f, 27.5474f, 20.5473f, 28.1444f, 21.4669f)
                curveTo(28.6454f, 22.2856f, 28.8719f, 23.158f, 28.8856f, 24.3909f)
                verticalLineTo(31.4268f)
                horizontalLineTo(26.6301f)
                verticalLineTo(24.5529f)
                curveTo(26.6301f, 22.2309f, 25.5194f, 21.0581f, 23.321f, 21.0581f)
                close()
                moveTo(4.0f, 25.2236f)
                curveTo(4.0f, 21.733f, 6.7348f, 19.0032f, 10.228f, 19.0032f)
                curveTo(13.712f, 19.0032f, 16.4468f, 21.733f, 16.4468f, 25.2236f)
                curveTo(16.4468f, 28.7099f, 13.712f, 31.444f, 10.228f, 31.444f)
                curveTo(6.7348f, 31.444f, 4.0f, 28.7099f, 4.0f, 25.2236f)
                close()
                moveTo(6.2007f, 25.2236f)
                curveTo(6.2007f, 27.5167f, 8.0079f, 29.314f, 10.228f, 29.314f)
                curveTo(12.4332f, 29.314f, 14.2496f, 27.5167f, 14.2496f, 25.2236f)
                curveTo(14.2496f, 22.9305f, 12.4332f, 21.1289f, 10.228f, 21.1289f)
                curveTo(8.0079f, 21.1289f, 6.2007f, 22.9305f, 6.2007f, 25.2236f)
                close()
                moveTo(42.2635f, 25.0594f)
                curveTo(42.2429f, 21.7277f, 39.5401f, 19.0172f, 36.2334f, 19.0172f)
                curveTo(32.8306f, 19.0172f, 30.1632f, 21.7373f, 30.1632f, 25.2086f)
                curveTo(30.1632f, 26.8385f, 30.79f, 28.3858f, 31.9178f, 29.5672f)
                curveTo(33.0662f, 30.7626f, 34.5806f, 31.4214f, 36.1922f, 31.4214f)
                curveTo(38.0314f, 31.4214f, 40.6084f, 30.5426f, 41.8334f, 28.0489f)
                lineTo(41.8654f, 27.9684f)
                horizontalLineTo(39.3994f)
                lineTo(39.3845f, 27.9867f)
                curveTo(38.7223f, 28.7753f, 37.4721f, 29.3076f, 36.2814f, 29.3076f)
                curveTo(34.7693f, 29.3076f, 32.9553f, 28.315f, 32.4588f, 26.0745f)
                horizontalLineTo(42.2154f)
                curveTo(42.2372f, 25.8427f, 42.2635f, 25.3792f, 42.2635f, 25.0594f)
                close()
                moveTo(36.2151f, 21.1289f)
                curveTo(34.2741f, 21.1289f, 32.8306f, 22.5947f, 32.5309f, 24.0958f)
                horizontalLineTo(39.8912f)
                curveTo(39.595f, 22.5947f, 38.1527f, 21.1289f, 36.2151f, 21.1289f)
                close()
                moveTo(49.2418f, 30.5598f)
                lineTo(54.0f, 19.0032f)
                horizontalLineTo(51.6346f)
                lineTo(48.0671f, 27.6926f)
                lineTo(44.5065f, 19.0032f)
                horizontalLineTo(42.0267f)
                lineTo(46.8901f, 30.5619f)
                lineTo(45.0692f, 35.0f)
                horizontalLineTo(47.4163f)
                lineTo(48.066f, 33.4194f)
                lineTo(49.2418f, 30.5598f)
                close()
                moveTo(23.0484f, 12.1185f)
                lineTo(23.5009f, 12.9205f)
                horizontalLineTo(24.5145f)
                lineTo(23.5693f, 11.5286f)
                lineTo(24.4973f, 10.1601f)
                horizontalLineTo(23.4836f)
                lineTo(23.0484f, 10.9392f)
                lineTo(22.6131f, 10.1601f)
                horizontalLineTo(21.5995f)
                lineTo(22.5332f, 11.5286f)
                lineTo(21.5822f, 12.9205f)
                horizontalLineTo(22.5964f)
                lineTo(23.0484f, 12.1185f)
                close()
                moveTo(20.9296f, 11.8154f)
                horizontalLineTo(21.4161f)
                verticalLineTo(11.0306f)
                horizontalLineTo(20.9296f)
                verticalLineTo(9.9255f)
                horizontalLineTo(20.0074f)
                verticalLineTo(11.0306f)
                horizontalLineTo(19.3318f)
                verticalLineTo(8.9119f)
                horizontalLineTo(18.4039f)
                verticalLineTo(11.8154f)
                horizontalLineTo(20.0074f)
                verticalLineTo(12.9205f)
                horizontalLineTo(20.9296f)
                verticalLineTo(11.8154f)
                close()
                moveTo(16.1441f, 11.1471f)
                curveTo(16.1441f, 8.2598f, 18.3971f, 6.0f, 21.274f, 6.0f)
                curveTo(24.1441f, 6.0f, 26.3966f, 8.2598f, 26.3966f, 11.1471f)
                curveTo(26.3966f, 14.0329f, 24.1441f, 16.2953f, 21.274f, 16.2953f)
                curveTo(18.3971f, 16.2953f, 16.1441f, 14.0329f, 16.1441f, 11.1471f)
                close()
            }
        }
        .build()
        return _oney3x4x!!
    }

private var _oney3x4x: ImageVector? = null
