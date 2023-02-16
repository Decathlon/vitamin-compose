package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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

public val FlagsGroup.Ki: ImageVector
    get() {
        if (_ki != null) {
            return _ki!!
        }
        _ki = Builder(name = "Ki", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.0001f,0.0f), end = Offset(14.0001f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0001f, 0.0f)
                    horizontalLineTo(1.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0001f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFE62B3F), 1.0f to Color(0xFFCA1A2C),
                        start = Offset(14.0001f,0.0f), end = Offset(14.0001f,10.6667f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0001f, 0.0f)
                    horizontalLineTo(1.0E-4f)
                    verticalLineTo(10.6667f)
                    horizontalLineTo(28.0001f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFDA57), 1.0f to Color(0xFFFCD036),
                        start = Offset(14.0001f,8.0f), end = Offset(14.0001f,14.6667f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(14.0001f, 14.6667f)
                    curveTo(15.841f, 14.6667f, 17.3334f, 13.1743f, 17.3334f, 11.3333f)
                    curveTo(17.3334f, 9.4924f, 15.841f, 8.0f, 14.0001f, 8.0f)
                    curveTo(12.1591f, 8.0f, 10.6667f, 9.4924f, 10.6667f, 11.3333f)
                    curveTo(10.6667f, 13.1743f, 12.1591f, 14.6667f, 14.0001f, 14.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFDA57), 1.0f to Color(0xFFFCD036),
                        start = Offset(14.0001f,4.18384f), end = Offset(14.0001f,18.4828f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(14.0001f, 16.0469f)
                    lineTo(12.3683f, 18.4828f)
                    lineTo(11.9549f, 15.5801f)
                    lineTo(9.4278f, 17.0667f)
                    lineTo(10.3148f, 14.2722f)
                    lineTo(7.393f, 14.5151f)
                    lineTo(9.4046f, 12.3822f)
                    lineTo(6.6667f, 11.3333f)
                    lineTo(9.4046f, 10.2844f)
                    lineTo(7.393f, 8.1515f)
                    lineTo(10.3148f, 8.3944f)
                    lineTo(9.4278f, 5.5999f)
                    lineTo(11.9549f, 7.0865f)
                    lineTo(12.3683f, 4.1838f)
                    lineTo(14.0001f, 6.6197f)
                    lineTo(15.6319f, 4.1838f)
                    lineTo(16.0452f, 7.0865f)
                    lineTo(18.5723f, 5.5999f)
                    lineTo(17.6853f, 8.3944f)
                    lineTo(20.6072f, 8.1515f)
                    lineTo(18.5955f, 10.2844f)
                    lineTo(21.3334f, 11.3333f)
                    lineTo(18.5955f, 12.3822f)
                    lineTo(20.6072f, 14.5151f)
                    lineTo(17.6853f, 14.2722f)
                    lineTo(18.5723f, 17.0667f)
                    lineTo(16.0452f, 15.5801f)
                    lineTo(15.6319f, 18.4828f)
                    lineTo(14.0001f, 16.0469f)
                    close()
                    moveTo(14.0001f, 16.0f)
                    curveTo(16.5774f, 16.0f, 18.6667f, 13.9106f, 18.6667f, 11.3333f)
                    curveTo(18.6667f, 8.756f, 16.5774f, 6.6666f, 14.0001f, 6.6666f)
                    curveTo(11.4228f, 6.6666f, 9.3334f, 8.756f, 9.3334f, 11.3333f)
                    curveTo(9.3334f, 13.9106f, 11.4228f, 16.0f, 14.0001f, 16.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFDA57), 1.0f to Color(0xFFFCD036),
                        start = Offset(14.7405f,1.33334f), end = Offset(14.7405f,4.00001f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(11.8134f, 3.2035f)
                    lineTo(11.7511f, 2.8918f)
                    lineTo(13.0602f, 2.6736f)
                    curveTo(13.0602f, 2.6736f, 11.3021f, 2.2581f, 10.7225f, 2.0502f)
                    curveTo(9.8896f, 1.7515f, 10.0056f, 1.5204f, 10.0056f, 1.5204f)
                    curveTo(10.0056f, 1.5204f, 12.3855f, 1.9879f, 13.5589f, 1.9879f)
                    curveTo(13.8088f, 1.9879f, 14.3069f, 2.6113f, 14.3069f, 2.6113f)
                    curveTo(14.3069f, 2.6113f, 15.1719f, 1.7373f, 15.5848f, 1.7074f)
                    curveTo(17.4607f, 1.5713f, 19.481f, 1.3333f, 19.481f, 1.3333f)
                    curveTo(19.481f, 1.3333f, 18.8958f, 1.7257f, 18.5459f, 1.832f)
                    curveTo(17.5971f, 2.1205f, 15.5848f, 2.5178f, 15.5848f, 2.5178f)
                    lineTo(15.3043f, 2.9541f)
                    horizontalLineTo(17.2991f)
                    lineTo(16.4576f, 3.2035f)
                    lineTo(16.8939f, 3.6087f)
                    curveTo(16.8939f, 3.6087f, 16.4362f, 3.372f, 15.8342f, 3.484f)
                    curveTo(15.4208f, 3.5609f, 14.9381f, 3.8373f, 14.4939f, 3.9515f)
                    curveTo(13.403f, 4.2321f, 12.7485f, 3.2035f, 12.7485f, 3.2035f)
                    horizontalLineTo(11.8134f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF0752A2), 1.0f to Color(0xFF034285),
                        start = Offset(14.0001f,10.6667f), end = Offset(14.0001f,20.0f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(28.0001f, 10.6667f)
                    horizontalLineTo(1.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0001f)
                    verticalLineTo(10.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(31.0958f, 17.2445f)
                    lineTo(31.7283f, 17.4554f)
                    lineTo(31.3067f, 18.7203f)
                    lineTo(30.6742f, 18.5094f)
                    curveTo(30.5304f, 18.4615f, 30.5304f, 18.4615f, 30.0492f, 18.3011f)
                    lineTo(27.2992f, 17.3844f)
                    curveTo(27.0939f, 17.316f, 26.6744f, 17.3166f, 26.4708f, 17.3844f)
                    lineTo(23.7208f, 18.3011f)
                    curveTo(23.2412f, 18.461f, 22.5258f, 18.46f, 22.0492f, 18.3011f)
                    lineTo(19.2992f, 17.3844f)
                    curveTo(19.0939f, 17.316f, 18.6744f, 17.3166f, 18.4708f, 17.3844f)
                    lineTo(15.7208f, 18.3011f)
                    curveTo(15.2412f, 18.461f, 14.5258f, 18.46f, 14.0492f, 18.3011f)
                    lineTo(11.2992f, 17.3844f)
                    curveTo(11.0939f, 17.316f, 10.6744f, 17.3166f, 10.4708f, 17.3844f)
                    lineTo(7.7208f, 18.3011f)
                    curveTo(7.2412f, 18.461f, 6.5258f, 18.46f, 6.0492f, 18.3011f)
                    lineTo(3.2992f, 17.3844f)
                    curveTo(3.0939f, 17.316f, 2.6744f, 17.3166f, 2.4708f, 17.3844f)
                    lineTo(-0.2792f, 18.3011f)
                    lineTo(-0.9116f, 18.5119f)
                    lineTo(-1.3333f, 17.247f)
                    lineTo(-0.7008f, 17.0362f)
                    lineTo(2.0492f, 16.1195f)
                    curveTo(2.5258f, 15.9607f, 3.2412f, 15.9597f, 3.7208f, 16.1195f)
                    lineTo(6.4708f, 17.0362f)
                    curveTo(6.6743f, 17.104f, 7.0939f, 17.1046f, 7.2992f, 17.0362f)
                    lineTo(10.0492f, 16.1195f)
                    curveTo(10.5258f, 15.9607f, 11.2412f, 15.9597f, 11.7208f, 16.1195f)
                    lineTo(14.4708f, 17.0362f)
                    curveTo(14.6744f, 17.104f, 15.0939f, 17.1046f, 15.2992f, 17.0362f)
                    lineTo(18.0492f, 16.1195f)
                    curveTo(18.5258f, 15.9607f, 19.2412f, 15.9597f, 19.7208f, 16.1195f)
                    lineTo(22.4708f, 17.0362f)
                    curveTo(22.6744f, 17.104f, 23.0939f, 17.1046f, 23.2992f, 17.0362f)
                    lineTo(26.0492f, 16.1195f)
                    curveTo(26.5258f, 15.9607f, 27.2412f, 15.9597f, 27.7208f, 16.1195f)
                    lineTo(30.4708f, 17.0362f)
                    curveTo(30.952f, 17.1966f, 30.952f, 17.1966f, 31.0958f, 17.2445f)
                    close()
                    moveTo(31.0958f, 13.9112f)
                    lineTo(31.7283f, 14.122f)
                    lineTo(31.3067f, 15.3869f)
                    lineTo(30.6742f, 15.1761f)
                    curveTo(30.5304f, 15.1282f, 30.5304f, 15.1282f, 30.0492f, 14.9678f)
                    lineTo(27.2992f, 14.0511f)
                    curveTo(27.0939f, 13.9827f, 26.6744f, 13.9833f, 26.4708f, 14.0511f)
                    lineTo(23.7208f, 14.9678f)
                    curveTo(23.2412f, 15.1277f, 22.5258f, 15.1266f, 22.0492f, 14.9678f)
                    lineTo(19.2992f, 14.0511f)
                    curveTo(19.0939f, 13.9827f, 18.6744f, 13.9833f, 18.4708f, 14.0511f)
                    lineTo(15.7208f, 14.9678f)
                    curveTo(15.2412f, 15.1277f, 14.5258f, 15.1266f, 14.0492f, 14.9678f)
                    lineTo(11.2992f, 14.0511f)
                    curveTo(11.0939f, 13.9827f, 10.6744f, 13.9833f, 10.4708f, 14.0511f)
                    lineTo(7.7208f, 14.9678f)
                    curveTo(7.2412f, 15.1277f, 6.5258f, 15.1266f, 6.0492f, 14.9678f)
                    lineTo(3.2992f, 14.0511f)
                    curveTo(3.0939f, 13.9827f, 2.6744f, 13.9833f, 2.4708f, 14.0511f)
                    lineTo(-0.2792f, 14.9678f)
                    lineTo(-0.9116f, 15.1786f)
                    lineTo(-1.3333f, 13.9137f)
                    lineTo(-0.7008f, 13.7029f)
                    lineTo(2.0492f, 12.7862f)
                    curveTo(2.5258f, 12.6273f, 3.2412f, 12.6263f, 3.7208f, 12.7862f)
                    lineTo(6.4708f, 13.7029f)
                    curveTo(6.6743f, 13.7707f, 7.0939f, 13.7713f, 7.2992f, 13.7029f)
                    lineTo(10.0492f, 12.7862f)
                    curveTo(10.5258f, 12.6273f, 11.2412f, 12.6263f, 11.7208f, 12.7862f)
                    lineTo(14.4708f, 13.7029f)
                    curveTo(14.6744f, 13.7707f, 15.0939f, 13.7713f, 15.2992f, 13.7029f)
                    lineTo(18.0492f, 12.7862f)
                    curveTo(18.5258f, 12.6273f, 19.2412f, 12.6263f, 19.7208f, 12.7862f)
                    lineTo(22.4708f, 13.7029f)
                    curveTo(22.6744f, 13.7707f, 23.0939f, 13.7713f, 23.2992f, 13.7029f)
                    lineTo(26.0492f, 12.7862f)
                    curveTo(26.5258f, 12.6273f, 27.2412f, 12.6263f, 27.7208f, 12.7862f)
                    lineTo(30.4708f, 13.7029f)
                    curveTo(30.952f, 13.8633f, 30.952f, 13.8633f, 31.0958f, 13.9112f)
                    close()
                    moveTo(31.0958f, 10.5779f)
                    lineTo(31.7283f, 10.7887f)
                    lineTo(31.3067f, 12.0536f)
                    lineTo(30.6742f, 11.8428f)
                    curveTo(30.5304f, 11.7948f, 30.5304f, 11.7948f, 30.0492f, 11.6344f)
                    lineTo(27.2992f, 10.7178f)
                    curveTo(27.0939f, 10.6493f, 26.6744f, 10.6499f, 26.4708f, 10.7178f)
                    lineTo(23.7208f, 11.6344f)
                    curveTo(23.2412f, 11.7943f, 22.5258f, 11.7933f, 22.0492f, 11.6344f)
                    lineTo(19.2992f, 10.7178f)
                    curveTo(19.0939f, 10.6493f, 18.6744f, 10.6499f, 18.4708f, 10.7178f)
                    lineTo(15.7208f, 11.6344f)
                    curveTo(15.2412f, 11.7943f, 14.5258f, 11.7933f, 14.0492f, 11.6344f)
                    lineTo(11.2992f, 10.7178f)
                    curveTo(11.0939f, 10.6493f, 10.6744f, 10.6499f, 10.4708f, 10.7178f)
                    lineTo(7.7208f, 11.6344f)
                    curveTo(7.2412f, 11.7943f, 6.5258f, 11.7933f, 6.0492f, 11.6344f)
                    lineTo(3.2992f, 10.7178f)
                    curveTo(3.0939f, 10.6493f, 2.6744f, 10.6499f, 2.4708f, 10.7178f)
                    lineTo(-0.2792f, 11.6344f)
                    lineTo(-0.9116f, 11.8453f)
                    lineTo(-1.3333f, 10.5804f)
                    lineTo(-0.7008f, 10.3695f)
                    lineTo(2.0492f, 9.4529f)
                    curveTo(2.5258f, 9.294f, 3.2412f, 9.293f, 3.7208f, 9.4529f)
                    lineTo(6.4708f, 10.3695f)
                    curveTo(6.6743f, 10.4374f, 7.0939f, 10.438f, 7.2992f, 10.3695f)
                    lineTo(10.0492f, 9.4529f)
                    curveTo(10.5258f, 9.294f, 11.2412f, 9.293f, 11.7208f, 9.4529f)
                    lineTo(14.4708f, 10.3695f)
                    curveTo(14.6744f, 10.4374f, 15.0939f, 10.438f, 15.2992f, 10.3695f)
                    lineTo(18.0492f, 9.4529f)
                    curveTo(18.5258f, 9.294f, 19.2412f, 9.293f, 19.7208f, 9.4529f)
                    lineTo(22.4708f, 10.3695f)
                    curveTo(22.6744f, 10.4374f, 23.0939f, 10.438f, 23.2992f, 10.3695f)
                    lineTo(26.0492f, 9.4529f)
                    curveTo(26.5258f, 9.294f, 27.2412f, 9.293f, 27.7208f, 9.4529f)
                    lineTo(30.4708f, 10.3695f)
                    lineTo(31.0958f, 10.5779f)
                    close()
                }
            }
        }
        .build()
        return _ki!!
    }

private var _ki: ImageVector? = null
