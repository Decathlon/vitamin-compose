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

public val FlagsGroup.Sa: ImageVector
    get() {
        if (_sa != null) {
            return _sa!!
        }
        _sa = Builder(name = "Sa", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF128C4B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.6667f, 12.0f)
                    horizontalLineTo(17.3334f)
                    verticalLineTo(11.0787f)
                    curveTo(17.3334f, 10.5831f, 17.8549f, 10.2608f, 18.2982f, 10.4824f)
                    lineTo(18.6667f, 10.6667f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(20.6667f)
                    curveTo(21.0349f, 12.0f, 21.3334f, 12.2985f, 21.3334f, 12.6667f)
                    verticalLineTo(13.3333f)
                    curveTo(21.3334f, 14.0697f, 20.7364f, 14.6667f, 20.0f, 14.6667f)
                    horizontalLineTo(18.0f)
                    curveTo(17.6318f, 14.6667f, 17.3334f, 14.3682f, 17.3334f, 14.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(8.2762f)
                    curveTo(8.0993f, 13.3333f, 7.9298f, 13.2631f, 7.8048f, 13.1381f)
                    lineTo(6.6667f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.6667f, 8.1381f)
                    curveTo(6.6667f, 8.0497f, 6.7018f, 7.9649f, 6.7643f, 7.9024f)
                    lineTo(7.0977f, 7.569f)
                    curveTo(7.2278f, 7.4389f, 7.2278f, 7.2278f, 7.0977f, 7.0976f)
                    lineTo(6.7643f, 6.7643f)
                    curveTo(6.7018f, 6.7018f, 6.6667f, 6.617f, 6.6667f, 6.5286f)
                    verticalLineTo(5.6667f)
                    curveTo(6.6667f, 5.4826f, 6.8159f, 5.3333f, 7.0f, 5.3333f)
                    horizontalLineTo(7.7454f)
                    curveTo(7.886f, 5.3333f, 8.0f, 5.4473f, 8.0f, 5.588f)
                    curveTo(8.0f, 5.8567f, 8.3623f, 5.9422f, 8.4824f, 5.7018f)
                    lineTo(8.5818f, 5.5031f)
                    curveTo(8.6338f, 5.3991f, 8.7402f, 5.3333f, 8.8565f, 5.3333f)
                    horizontalLineTo(10.3334f)
                    curveTo(10.5174f, 5.3333f, 10.6667f, 5.4826f, 10.6667f, 5.6667f)
                    curveTo(10.6667f, 5.8508f, 10.5174f, 6.0f, 10.3334f, 6.0f)
                    horizontalLineTo(9.6667f)
                    curveTo(9.4826f, 6.0f, 9.3334f, 6.1492f, 9.3334f, 6.3333f)
                    curveTo(9.3334f, 6.5174f, 9.4826f, 6.6667f, 9.6667f, 6.6667f)
                    horizontalLineTo(10.3334f)
                    curveTo(10.5174f, 6.6667f, 10.6667f, 6.8159f, 10.6667f, 7.0f)
                    verticalLineTo(9.0f)
                    curveTo(10.6667f, 9.1841f, 10.5174f, 9.3333f, 10.3334f, 9.3333f)
                    horizontalLineTo(9.6667f)
                    curveTo(9.4826f, 9.3333f, 9.3334f, 9.1841f, 9.3334f, 9.0f)
                    verticalLineTo(8.3333f)
                    curveTo(9.3334f, 8.1492f, 9.4826f, 8.0f, 9.6667f, 8.0f)
                    curveTo(9.8508f, 8.0f, 10.0f, 7.8508f, 10.0f, 7.6667f)
                    curveTo(10.0f, 7.4826f, 9.8508f, 7.3333f, 9.6667f, 7.3333f)
                    horizontalLineTo(9.0f)
                    curveTo(8.8159f, 7.3333f, 8.6667f, 7.4826f, 8.6667f, 7.6667f)
                    verticalLineTo(9.0f)
                    curveTo(8.6667f, 9.1841f, 8.5175f, 9.3333f, 8.3334f, 9.3333f)
                    curveTo(8.1493f, 9.3333f, 8.0f, 9.1841f, 8.0f, 9.0f)
                    verticalLineTo(8.3333f)
                    curveTo(8.0f, 8.1492f, 7.8508f, 8.0f, 7.6667f, 8.0f)
                    curveTo(7.4826f, 8.0f, 7.3334f, 8.1492f, 7.3334f, 8.3333f)
                    verticalLineTo(9.0f)
                    curveTo(7.3334f, 9.1841f, 7.1841f, 9.3333f, 7.0f, 9.3333f)
                    curveTo(6.8159f, 9.3333f, 6.6667f, 9.1841f, 6.6667f, 9.0f)
                    verticalLineTo(8.1381f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(17.3333f, 8.1381f)
                    curveTo(17.3333f, 8.0497f, 17.3684f, 7.9649f, 17.4309f, 7.9024f)
                    lineTo(17.7643f, 7.569f)
                    curveTo(17.8945f, 7.4389f, 17.8945f, 7.2278f, 17.7643f, 7.0976f)
                    lineTo(17.4309f, 6.7643f)
                    curveTo(17.3684f, 6.7018f, 17.3333f, 6.617f, 17.3333f, 6.5286f)
                    verticalLineTo(5.6667f)
                    curveTo(17.3333f, 5.4826f, 17.4826f, 5.3333f, 17.6666f, 5.3333f)
                    horizontalLineTo(18.412f)
                    curveTo(18.5526f, 5.3333f, 18.6666f, 5.4473f, 18.6666f, 5.588f)
                    curveTo(18.6666f, 5.8567f, 19.0289f, 5.9422f, 19.1491f, 5.7018f)
                    lineTo(19.2484f, 5.5031f)
                    curveTo(19.3005f, 5.3991f, 19.4068f, 5.3333f, 19.5231f, 5.3333f)
                    horizontalLineTo(21.0f)
                    curveTo(21.1841f, 5.3333f, 21.3333f, 5.4826f, 21.3333f, 5.6667f)
                    curveTo(21.3333f, 5.8508f, 21.1841f, 6.0f, 21.0f, 6.0f)
                    horizontalLineTo(20.3333f)
                    curveTo(20.1492f, 6.0f, 20.0f, 6.1492f, 20.0f, 6.3333f)
                    curveTo(20.0f, 6.5174f, 20.1492f, 6.6667f, 20.3333f, 6.6667f)
                    horizontalLineTo(21.0f)
                    curveTo(21.1841f, 6.6667f, 21.3333f, 6.8159f, 21.3333f, 7.0f)
                    verticalLineTo(9.0f)
                    curveTo(21.3333f, 9.1841f, 21.1841f, 9.3333f, 21.0f, 9.3333f)
                    horizontalLineTo(20.3333f)
                    curveTo(20.1492f, 9.3333f, 20.0f, 9.1841f, 20.0f, 9.0f)
                    verticalLineTo(8.3333f)
                    curveTo(20.0f, 8.1492f, 20.1492f, 8.0f, 20.3333f, 8.0f)
                    curveTo(20.5174f, 8.0f, 20.6666f, 7.8508f, 20.6666f, 7.6667f)
                    curveTo(20.6666f, 7.4826f, 20.5174f, 7.3333f, 20.3333f, 7.3333f)
                    horizontalLineTo(19.6666f)
                    curveTo(19.4826f, 7.3333f, 19.3333f, 7.4826f, 19.3333f, 7.6667f)
                    verticalLineTo(9.0f)
                    curveTo(19.3333f, 9.1841f, 19.1841f, 9.3333f, 19.0f, 9.3333f)
                    curveTo(18.8159f, 9.3333f, 18.6666f, 9.1841f, 18.6666f, 9.0f)
                    verticalLineTo(8.3333f)
                    curveTo(18.6666f, 8.1492f, 18.5174f, 8.0f, 18.3333f, 8.0f)
                    curveTo(18.1492f, 8.0f, 18.0f, 8.1492f, 18.0f, 8.3333f)
                    verticalLineTo(9.0f)
                    curveTo(18.0f, 9.1841f, 17.8507f, 9.3333f, 17.6666f, 9.3333f)
                    curveTo(17.4826f, 9.3333f, 17.3333f, 9.1841f, 17.3333f, 9.0f)
                    verticalLineTo(8.1381f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(16.0f, 6.3302f)
                    curveTo(16.0f, 6.516f, 15.8958f, 6.7708f, 15.7593f, 6.9073f)
                    lineTo(15.574f, 7.0926f)
                    curveTo(15.4411f, 7.2256f, 15.4375f, 7.4375f, 15.574f, 7.574f)
                    lineTo(15.7593f, 7.7593f)
                    curveTo(15.8922f, 7.8922f, 16.0f, 8.1427f, 16.0f, 8.3364f)
                    verticalLineTo(8.9969f)
                    curveTo(16.0f, 9.1827f, 15.8573f, 9.3333f, 15.6635f, 9.3333f)
                    horizontalLineTo(15.0031f)
                    curveTo(14.8173f, 9.3333f, 14.6667f, 9.1906f, 14.6667f, 8.9969f)
                    verticalLineTo(8.3364f)
                    curveTo(14.6667f, 8.1506f, 14.6051f, 8.123f, 14.512f, 8.3092f)
                    lineTo(14.1546f, 9.0241f)
                    curveTo(14.0692f, 9.1949f, 13.8431f, 9.3333f, 13.6697f, 9.3333f)
                    horizontalLineTo(12.3303f)
                    curveTo(12.1479f, 9.3333f, 12.0f, 9.1787f, 12.0f, 9.0f)
                    curveTo(12.0f, 8.8159f, 12.1427f, 8.6667f, 12.3365f, 8.6667f)
                    horizontalLineTo(12.9969f)
                    curveTo(13.1827f, 8.6667f, 13.3333f, 8.512f, 13.3333f, 8.3333f)
                    curveTo(13.3333f, 8.1492f, 13.1906f, 8.0f, 12.9969f, 8.0f)
                    horizontalLineTo(12.3365f)
                    curveTo(12.1506f, 8.0f, 12.0f, 7.8566f, 12.0f, 7.673f)
                    verticalLineTo(5.6603f)
                    curveTo(12.0f, 5.4797f, 12.1427f, 5.3333f, 12.3365f, 5.3333f)
                    horizontalLineTo(12.9969f)
                    curveTo(13.1827f, 5.3333f, 13.3333f, 5.476f, 13.3333f, 5.6698f)
                    verticalLineTo(6.3302f)
                    curveTo(13.3333f, 6.516f, 13.1787f, 6.6667f, 13.0f, 6.6667f)
                    curveTo(12.8159f, 6.6667f, 12.6667f, 6.8213f, 12.6667f, 7.0f)
                    curveTo(12.6667f, 7.1841f, 12.8094f, 7.3333f, 13.0031f, 7.3333f)
                    horizontalLineTo(13.6635f)
                    curveTo(13.8494f, 7.3333f, 14.0f, 7.1764f, 14.0f, 7.0031f)
                    verticalLineTo(5.6636f)
                    curveTo(14.0f, 5.4812f, 14.1546f, 5.3333f, 14.3333f, 5.3333f)
                    curveTo(14.5174f, 5.3333f, 14.6667f, 5.476f, 14.6667f, 5.6698f)
                    verticalLineTo(6.3302f)
                    curveTo(14.6667f, 6.516f, 14.8213f, 6.6667f, 15.0f, 6.6667f)
                    curveTo(15.1841f, 6.6667f, 15.3333f, 6.524f, 15.3333f, 6.3302f)
                    verticalLineTo(5.6698f)
                    curveTo(15.3333f, 5.484f, 15.488f, 5.3333f, 15.6667f, 5.3333f)
                    curveTo(15.8508f, 5.3333f, 16.0f, 5.476f, 16.0f, 5.6698f)
                    verticalLineTo(6.3302f)
                    close()
                }
            }
        }
        .build()
        return _sa!!
    }

private var _sa: ImageVector? = null
