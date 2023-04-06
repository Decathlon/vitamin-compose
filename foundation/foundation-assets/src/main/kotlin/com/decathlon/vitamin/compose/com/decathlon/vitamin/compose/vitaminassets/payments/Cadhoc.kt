package com.decathlon.vitamin.compose.vitaminassets.payments

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.PaymentsGroup

public val PaymentsGroup.Cadhoc: ImageVector
    get() {
        if (_cadhoc != null) {
            return _cadhoc!!
        }
        _cadhoc = Builder(name = "Cadhoc", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
                viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0xFFF3F3F3)),
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
            path(fill = SolidColor(Color(0xFFF39301)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2858f, 24.785f)
                horizontalLineTo(11.7714f)
                verticalLineTo(16.245f)
                horizontalLineTo(3.2858f)
                verticalLineTo(24.785f)
                close()
            }
            path(fill = SolidColor(Color(0xFF495654)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.3716f, 24.661f)
                curveTo(20.0132f, 24.8723f, 19.3704f, 24.9843f, 18.9872f, 24.9843f)
                curveTo(16.366f, 24.9843f, 14.6228f, 23.006f, 14.6228f, 20.5177f)
                curveTo(14.6228f, 18.054f, 16.4031f, 16.0507f, 18.9375f, 16.0507f)
                curveTo(19.3455f, 16.0508f, 19.9639f, 16.1503f, 20.31f, 16.3618f)
                lineTo(20.5819f, 18.3402f)
                curveTo(20.1368f, 17.9793f, 19.5681f, 17.7305f, 18.8633f, 17.7305f)
                curveTo(17.3674f, 17.7305f, 16.3289f, 19.0743f, 16.3289f, 20.5177f)
                curveTo(16.3289f, 22.1103f, 17.5158f, 23.3047f, 18.9375f, 23.3047f)
                curveTo(19.6175f, 23.3047f, 20.149f, 22.9563f, 20.5942f, 22.5957f)
                lineTo(20.3716f, 24.661f)
                close()
                moveTo(23.9696f, 23.6657f)
                curveTo(24.526f, 23.6657f, 25.1192f, 23.3297f, 25.1192f, 22.7573f)
                curveTo(25.1192f, 22.1973f, 24.526f, 21.849f, 23.9696f, 21.849f)
                curveTo(23.4131f, 21.849f, 22.8196f, 22.1973f, 22.8196f, 22.7573f)
                curveTo(22.8196f, 23.3297f, 23.4131f, 23.6657f, 23.9696f, 23.6657f)
                close()
                moveTo(24.2663f, 18.2655f)
                curveTo(23.6605f, 18.2655f, 23.0422f, 18.3277f, 22.449f, 18.4397f)
                lineTo(22.0161f, 19.9576f)
                curveTo(22.5848f, 19.7336f, 23.1783f, 19.5843f, 23.7963f, 19.5843f)
                curveTo(24.526f, 19.5843f, 25.144f, 19.7463f, 25.144f, 20.6046f)
                curveTo(25.144f, 20.714f, 25.1327f, 20.8064f, 25.1215f, 20.897f)
                verticalLineTo(20.897f)
                verticalLineTo(20.8971f)
                lineTo(25.1215f, 20.8971f)
                curveTo(25.1162f, 20.9404f, 25.1109f, 20.9834f, 25.1069f, 21.0276f)
                curveTo(24.5011f, 20.7166f, 24.056f, 20.6046f, 23.376f, 20.6046f)
                curveTo(22.2016f, 20.6046f, 21.2497f, 21.6126f, 21.2497f, 22.7573f)
                curveTo(21.2497f, 24.2006f, 22.288f, 24.9843f, 23.6234f, 24.9843f)
                curveTo(24.2044f, 24.9843f, 24.7608f, 24.7606f, 25.1934f, 24.3873f)
                verticalLineTo(24.9346f)
                lineTo(26.6275f, 24.7853f)
                verticalLineTo(20.045f)
                curveTo(26.6275f, 18.7632f, 25.3911f, 18.2655f, 24.2663f, 18.2655f)
                close()
                moveTo(30.7941f, 23.541f)
                curveTo(31.8451f, 23.541f, 32.6115f, 22.6577f, 32.6115f, 21.625f)
                curveTo(32.6115f, 20.5923f, 31.8451f, 19.7087f, 30.7941f, 19.7087f)
                curveTo(29.7432f, 19.7087f, 28.9768f, 20.5923f, 28.9768f, 21.625f)
                curveTo(28.9768f, 22.6577f, 29.7432f, 23.541f, 30.7941f, 23.541f)
                close()
                moveTo(30.5961f, 24.9843f)
                curveTo(31.4615f, 24.9843f, 31.8944f, 24.7603f, 32.5496f, 24.101f)
                verticalLineTo(24.1011f)
                verticalLineTo(24.9347f)
                lineTo(34.0334f, 24.7854f)
                verticalLineTo(16.0507f)
                lineTo(32.4631f, 16.2498f)
                verticalLineTo(18.9374f)
                curveTo(31.8822f, 18.4522f, 31.2267f, 18.2655f, 30.5961f, 18.2657f)
                curveTo(28.8036f, 18.2657f, 27.493f, 19.8707f, 27.493f, 21.625f)
                curveTo(27.493f, 23.3793f, 28.8036f, 24.9843f, 30.5961f, 24.9843f)
                close()
                moveTo(35.2449f, 16.25f)
                lineTo(36.8149f, 16.0509f)
                verticalLineTo(19.062f)
                horizontalLineTo(36.8397f)
                curveTo(37.2849f, 18.4648f, 37.8039f, 18.2657f, 38.6819f, 18.2657f)
                curveTo(39.9799f, 18.2657f, 40.8454f, 19.0993f, 40.8454f, 20.4431f)
                verticalLineTo(24.7855f)
                lineTo(39.2751f, 24.8851f)
                verticalLineTo(20.8661f)
                curveTo(39.2751f, 20.1941f, 38.9661f, 19.6345f, 38.2613f, 19.6345f)
                curveTo(37.2723f, 19.6345f, 36.8149f, 20.3935f, 36.8149f, 21.1895f)
                verticalLineTo(24.7855f)
                lineTo(35.2449f, 24.8851f)
                verticalLineTo(16.2501f)
                verticalLineTo(16.25f)
                close()
                moveTo(47.1877f, 21.625f)
                curveTo(47.1877f, 22.7073f, 46.2481f, 23.541f, 45.1849f, 23.541f)
                curveTo(44.1217f, 23.541f, 43.1821f, 22.7073f, 43.1821f, 21.625f)
                curveTo(43.1821f, 20.5427f, 44.1217f, 19.7087f, 45.1849f, 19.7087f)
                curveTo(46.2481f, 19.7087f, 47.1877f, 20.5427f, 47.1877f, 21.625f)
                close()
                moveTo(45.1849f, 18.2657f)
                curveTo(47.0393f, 18.2657f, 48.6705f, 19.7215f, 48.6705f, 21.625f)
                curveTo(48.6705f, 23.5287f, 47.0393f, 24.9843f, 45.1849f, 24.9843f)
                curveTo(43.3304f, 24.9843f, 41.6986f, 23.5287f, 41.6986f, 21.625f)
                curveTo(41.6986f, 19.7213f, 43.3304f, 18.2657f, 45.1849f, 18.2657f)
                close()
                moveTo(52.7776f, 19.709f)
                curveTo(53.2578f, 19.709f, 53.7016f, 19.9327f, 54.1123f, 20.1817f)
                lineTo(54.9404f, 18.9997f)
                curveTo(54.2481f, 18.5517f, 53.5426f, 18.2655f, 52.6285f, 18.2655f)
                curveTo(50.7969f, 18.2655f, 49.1773f, 19.659f, 49.1773f, 21.5753f)
                curveTo(49.1773f, 23.703f, 50.9592f, 24.9843f, 52.5788f, 24.9843f)
                curveTo(53.3804f, 24.9843f, 54.321f, 24.7977f, 54.9271f, 24.188f)
                lineTo(54.0626f, 23.056f)
                curveTo(53.5559f, 23.3917f, 53.1949f, 23.541f, 52.5523f, 23.541f)
                curveTo(51.7376f, 23.541f, 50.7472f, 22.72f, 50.7472f, 21.625f)
                curveTo(50.7472f, 20.4803f, 51.615f, 19.709f, 52.7776f, 19.709f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.655f, 20.504f)
                curveTo(6.655f, 20.9443f, 6.5589f, 21.2825f, 6.0682f, 21.2825f)
                curveTo(5.5187f, 21.2825f, 5.46f, 20.8852f, 5.46f, 20.563f)
                verticalLineTo(18.0391f)
                lineTo(4.7557f, 18.1953f)
                lineTo(4.7558f, 20.665f)
                curveTo(4.7558f, 21.6047f, 5.4066f, 21.9644f, 6.0361f, 21.9644f)
                curveTo(6.8578f, 21.9644f, 7.3591f, 21.433f, 7.3591f, 20.7671f)
                verticalLineTo(18.0391f)
                lineTo(6.655f, 18.1953f)
                verticalLineTo(20.504f)
                lineTo(6.655f, 20.504f)
                close()
                moveTo(9.0916f, 21.3417f)
                curveTo(8.6385f, 21.3417f, 8.3077f, 20.9603f, 8.3077f, 20.5148f)
                curveTo(8.3077f, 20.0691f, 8.6385f, 19.6879f, 9.0916f, 19.6879f)
                curveTo(9.5454f, 19.6879f, 9.8763f, 20.0691f, 9.8763f, 20.5148f)
                curveTo(9.8763f, 20.9603f, 9.5454f, 21.3417f, 9.0916f, 21.3417f)
                close()
                moveTo(8.3736f, 19.3077f)
                curveTo(8.5928f, 19.1541f, 8.8515f, 19.0679f, 9.135f, 19.0679f)
                verticalLineTo(19.0678f)
                curveTo(9.8985f, 19.0678f, 10.5175f, 19.7161f, 10.5175f, 20.5158f)
                curveTo(10.5175f, 21.3155f, 9.8985f, 21.9637f, 9.135f, 21.9637f)
                curveTo(8.8528f, 21.9637f, 8.5905f, 21.875f, 8.3716f, 21.723f)
                verticalLineTo(22.6883f)
                lineTo(7.6941f, 22.845f)
                verticalLineTo(19.0717f)
                lineTo(8.3736f, 18.9063f)
                verticalLineTo(19.3077f)
                close()
            }
        }
        .build()
        return _cadhoc!!
    }

private var _cadhoc: ImageVector? = null
