package com.decathlon.vitamin.compose.vitaminassets.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.decathlon.vitamin.compose.vitaminassets.LogosGroup

public val LogosGroup.DecathlonLogo: ImageVector
    get() {
        if (_decathlonLogo != null) {
            return _decathlonLogo!!
        }
        _decathlonLogo = Builder(name = "DecathlonLogo", defaultWidth = 200.0.dp, defaultHeight =
                50.0.dp, viewportWidth = 200.0f, viewportHeight = 50.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(200.0f)
                verticalLineToRelative(50.0f)
                horizontalLineToRelative(-200.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0082C3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 50.0f)
                horizontalLineTo(200.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(50.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.815f, 38.251f)
                curveTo(63.299f, 38.251f, 62.77f, 38.225f, 62.244f, 38.174f)
                curveTo(59.235f, 37.866f, 56.409f, 36.581f, 54.198f, 34.517f)
                curveTo(51.564f, 31.995f, 50.117f, 28.479f, 50.211f, 24.834f)
                curveTo(50.319f, 21.95f, 51.313f, 19.17f, 53.057f, 16.871f)
                curveTo(54.172f, 15.4f, 55.6f, 14.196f, 57.238f, 13.346f)
                curveTo(59.275f, 12.327f, 61.519f, 11.79f, 63.796f, 11.778f)
                curveTo(63.896f, 11.778f, 64.004f, 11.778f, 64.106f, 11.778f)
                curveTo(68.129f, 11.807f, 71.938f, 13.598f, 74.526f, 16.678f)
                lineTo(74.586f, 16.755f)
                lineTo(71.225f, 22.141f)
                lineTo(71.001f, 21.875f)
                lineTo(70.844f, 21.701f)
                lineTo(70.538f, 21.379f)
                lineTo(70.288f, 21.132f)
                curveTo(69.125f, 20.014f, 66.745f, 18.137f, 63.871f, 18.137f)
                horizontalLineTo(63.738f)
                curveTo(60.016f, 18.201f, 57.03f, 21.233f, 57.023f, 24.956f)
                curveTo(57.023f, 28.056f, 58.887f, 31.697f, 64.139f, 31.778f)
                horizontalLineTo(64.216f)
                curveTo(67.27f, 31.778f, 69.266f, 29.535f, 70.183f, 28.198f)
                lineTo(70.383f, 27.898f)
                curveTo(70.494f, 27.725f, 70.752f, 27.298f, 71.174f, 26.598f)
                lineTo(79.675f, 12.287f)
                horizontalLineTo(86.553f)
                verticalLineTo(37.677f)
                horizontalLineTo(80.223f)
                verticalLineTo(33.868f)
                lineTo(75.18f, 33.846f)
                horizontalLineTo(74.507f)
                lineTo(74.323f, 33.854f)
                lineTo(74.291f, 33.86f)
                lineTo(74.155f, 34.01f)
                lineTo(73.993f, 34.177f)
                lineTo(73.764f, 34.399f)
                lineTo(73.572f, 34.576f)
                lineTo(73.35f, 34.776f)
                lineTo(73.1f, 34.986f)
                curveTo(70.472f, 37.108f, 67.193f, 38.261f, 63.815f, 38.251f)
                close()
                moveTo(80.353f, 22.806f)
                lineTo(76.96f, 28.556f)
                horizontalLineTo(80.353f)
                verticalLineTo(22.806f)
                close()
                moveTo(151.769f, 38.239f)
                curveTo(148.169f, 38.322f, 144.699f, 36.896f, 142.198f, 34.305f)
                verticalLineTo(37.694f)
                horizontalLineTo(127.988f)
                verticalLineTo(12.291f)
                horizontalLineTo(134.526f)
                verticalLineTo(32.08f)
                horizontalLineTo(140.434f)
                curveTo(139.075f, 29.873f, 138.379f, 27.322f, 138.426f, 24.731f)
                curveTo(138.421f, 23.01f, 138.765f, 21.305f, 139.438f, 19.721f)
                curveTo(140.12f, 18.13f, 141.115f, 16.693f, 142.363f, 15.494f)
                curveTo(144.879f, 13.028f, 148.284f, 11.68f, 151.807f, 11.756f)
                curveTo(155.269f, 11.756f, 158.593f, 13.109f, 161.071f, 15.526f)
                curveTo(162.634f, 17.02f, 163.803f, 18.878f, 164.471f, 20.934f)
                verticalLineTo(12.286f)
                horizontalLineTo(170.413f)
                lineTo(180.291f, 26.396f)
                verticalLineTo(12.286f)
                horizontalLineTo(186.878f)
                verticalLineTo(37.694f)
                horizontalLineTo(181.091f)
                lineTo(171.058f, 23.539f)
                verticalLineTo(37.694f)
                horizontalLineTo(164.475f)
                verticalLineTo(28.985f)
                curveTo(163.869f, 30.97f, 162.789f, 32.777f, 161.328f, 34.251f)
                curveTo(158.817f, 36.825f, 155.365f, 38.265f, 151.769f, 38.239f)
                close()
                moveTo(151.843f, 18.077f)
                curveTo(150.018f, 18.062f, 148.26f, 18.766f, 146.95f, 20.038f)
                curveTo(145.665f, 21.289f, 144.943f, 23.008f, 144.95f, 24.801f)
                curveTo(144.942f, 26.696f, 145.686f, 28.517f, 147.018f, 29.865f)
                curveTo(148.267f, 31.15f, 149.975f, 31.885f, 151.767f, 31.909f)
                curveTo(153.563f, 31.922f, 155.286f, 31.203f, 156.54f, 29.917f)
                curveTo(157.844f, 28.536f, 158.555f, 26.7f, 158.52f, 24.801f)
                curveTo(158.528f, 21.103f, 155.541f, 18.095f, 151.843f, 18.077f)
                close()
                moveTo(112.638f, 37.695f)
                horizontalLineTo(106.068f)
                verticalLineTo(12.284f)
                horizontalLineTo(112.638f)
                verticalLineTo(21.932f)
                horizontalLineTo(119.404f)
                verticalLineTo(12.284f)
                horizontalLineTo(125.979f)
                verticalLineTo(37.693f)
                horizontalLineTo(119.404f)
                verticalLineTo(27.972f)
                horizontalLineTo(112.638f)
                verticalLineTo(37.695f)
                close()
                moveTo(99.606f, 37.695f)
                horizontalLineTo(93.038f)
                verticalLineTo(18.35f)
                horizontalLineTo(87.926f)
                verticalLineTo(12.276f)
                horizontalLineTo(104.712f)
                verticalLineTo(18.35f)
                horizontalLineTo(99.612f)
                verticalLineTo(37.693f)
                lineTo(99.606f, 37.695f)
                close()
                moveTo(22.123f, 37.695f)
                horizontalLineTo(12.038f)
                verticalLineTo(12.287f)
                horizontalLineTo(21.226f)
                curveTo(25.44f, 12.287f, 28.436f, 12.787f, 31.276f, 15.322f)
                curveTo(33.34f, 17.2f, 34.666f, 19.753f, 35.014f, 22.522f)
                verticalLineTo(12.287f)
                horizontalLineTo(49.638f)
                verticalLineTo(17.876f)
                lineTo(41.592f, 17.885f)
                verticalLineTo(22.036f)
                lineTo(48.559f, 22.03f)
                verticalLineTo(27.494f)
                lineTo(41.592f, 27.501f)
                verticalLineTo(32.106f)
                horizontalLineTo(49.638f)
                verticalLineTo(37.677f)
                horizontalLineTo(35.013f)
                verticalLineTo(27.548f)
                curveTo(34.608f, 30.235f, 33.3f, 32.704f, 31.305f, 34.548f)
                curveTo(28.438f, 37.193f, 25.865f, 37.694f, 22.126f, 37.694f)
                lineTo(22.123f, 37.695f)
                close()
                moveTo(18.615f, 17.75f)
                verticalLineTo(32.114f)
                horizontalLineTo(21.256f)
                curveTo(23.809f, 32.114f, 25.638f, 31.548f, 26.848f, 30.384f)
                curveTo(28.058f, 29.22f, 28.666f, 27.414f, 28.666f, 24.904f)
                curveTo(28.666f, 20.291f, 26.024f, 17.75f, 21.226f, 17.75f)
                horizontalLineTo(18.615f)
                close()
            }
        }
        .build()
        return _decathlonLogo!!
    }

private var _decathlonLogo: ImageVector? = null
