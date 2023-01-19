package com.decathlon.vitamin.compose.vitaminassets.payments

import androidx.compose.ui.geometry.Offset
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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.PaymentsGroup

public val PaymentsGroup.Discover: ImageVector
    get() {
        if (_discover != null) {
            return _discover!!
        }
        _discover = Builder(name = "Discover", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
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
            path(fill = SolidColor(Color(0xFF1D1D1B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0689f, 20.3224f)
                curveTo(19.0689f, 22.7645f, 20.9865f, 24.658f, 23.4543f, 24.658f)
                curveTo(24.1518f, 24.658f, 24.7494f, 24.5209f, 25.4861f, 24.1739f)
                verticalLineTo(22.2663f)
                curveTo(24.8384f, 22.9147f, 24.2644f, 23.1763f, 23.5297f, 23.1763f)
                curveTo(21.8975f, 23.1763f, 20.739f, 21.9928f, 20.739f, 20.3102f)
                curveTo(20.739f, 18.7152f, 21.9341f, 17.4569f, 23.4543f, 17.4569f)
                curveTo(24.2272f, 17.4569f, 24.8124f, 17.7327f, 25.4861f, 18.3916f)
                verticalLineTo(16.485f)
                curveTo(24.7748f, 16.1242f, 24.19f, 15.9746f, 23.4925f, 15.9746f)
                curveTo(21.0372f, 15.9746f, 19.0689f, 17.9066f, 19.0689f, 20.3224f)
                close()
                moveTo(14.91f, 18.3046f)
                curveTo(14.91f, 18.7536f, 15.1954f, 18.9908f, 16.168f, 19.3507f)
                curveTo(18.0114f, 20.0251f, 18.5577f, 20.6224f, 18.5577f, 21.9426f)
                curveTo(18.5577f, 23.5508f, 17.3762f, 24.6707f, 15.6923f, 24.6707f)
                curveTo(14.459f, 24.6707f, 13.5622f, 24.1851f, 12.8156f, 23.0889f)
                lineTo(13.8626f, 22.0807f)
                curveTo(14.2356f, 22.8022f, 14.8583f, 23.189f, 15.6313f, 23.189f)
                curveTo(16.3545f, 23.189f, 16.8896f, 22.6902f, 16.8896f, 22.0171f)
                curveTo(16.8896f, 21.6682f, 16.7275f, 21.3687f, 16.4036f, 21.1572f)
                curveTo(16.2408f, 21.057f, 15.9179f, 20.9081f, 15.2833f, 20.684f)
                curveTo(13.7612f, 20.1364f, 13.2393f, 19.5503f, 13.2393f, 18.4057f)
                curveTo(13.2393f, 17.046f, 14.3605f, 16.0252f, 15.8306f, 16.0252f)
                curveTo(16.7416f, 16.0252f, 17.5752f, 16.3366f, 18.272f, 16.9461f)
                lineTo(17.424f, 18.0564f)
                curveTo(17.0019f, 17.5833f, 16.6026f, 17.3836f, 16.1173f, 17.3836f)
                curveTo(15.4188f, 17.3836f, 14.91f, 17.7814f, 14.91f, 18.3046f)
                close()
                moveTo(10.5846f, 24.4709f)
                horizontalLineTo(12.2053f)
                verticalLineTo(16.1625f)
                horizontalLineTo(10.5846f)
                verticalLineTo(24.4709f)
                close()
                moveTo(7.272f, 22.4038f)
                curveTo(6.7629f, 22.8638f, 6.1014f, 23.0644f, 5.0543f, 23.0644f)
                horizontalLineTo(4.6194f)
                verticalLineTo(17.57f)
                horizontalLineTo(5.0543f)
                curveTo(6.1014f, 17.57f, 6.7369f, 17.7575f, 7.272f, 18.2422f)
                curveTo(7.8325f, 18.741f, 8.1695f, 19.5146f, 8.1695f, 20.3103f)
                curveTo(8.1695f, 21.108f, 7.8325f, 21.905f, 7.272f, 22.4038f)
                close()
                moveTo(5.3788f, 16.1625f)
                horizontalLineTo(3.0f)
                verticalLineTo(24.4706f)
                horizontalLineTo(5.3663f)
                curveTo(6.6246f, 24.4706f, 7.533f, 24.174f, 8.3306f, 23.5115f)
                curveTo(9.2785f, 22.7274f, 9.839f, 21.5452f, 9.839f, 20.3225f)
                curveTo(9.839f, 17.8705f, 8.0071f, 16.1625f, 5.3788f, 16.1625f)
                close()
                moveTo(36.1203f, 16.1625f)
                lineTo(38.3357f, 21.7432f)
                lineTo(40.5801f, 16.1625f)
                horizontalLineTo(42.3368f)
                lineTo(38.7476f, 24.6841f)
                horizontalLineTo(37.8754f)
                lineTo(34.3497f, 16.1625f)
                horizontalLineTo(36.1203f)
                close()
                moveTo(43.0697f, 24.4708f)
                horizontalLineTo(47.6656f)
                verticalLineTo(23.0642f)
                horizontalLineTo(44.689f)
                verticalLineTo(20.8215f)
                horizontalLineTo(47.5561f)
                verticalLineTo(19.4142f)
                horizontalLineTo(44.689f)
                verticalLineTo(17.5702f)
                horizontalLineTo(47.6656f)
                verticalLineTo(16.1623f)
                horizontalLineTo(43.0697f)
                verticalLineTo(24.4708f)
                close()
                moveTo(50.3576f, 19.9874f)
                horizontalLineTo(50.831f)
                curveTo(51.8662f, 19.9874f, 52.4148f, 19.5377f, 52.4148f, 18.7025f)
                curveTo(52.4148f, 17.894f, 51.8662f, 17.4712f, 50.8567f, 17.4712f)
                horizontalLineTo(50.3576f)
                verticalLineTo(19.9874f)
                close()
                moveTo(51.1421f, 16.1622f)
                curveTo(53.0109f, 16.1622f, 54.0823f, 17.0597f, 54.0823f, 18.6152f)
                curveTo(54.0823f, 19.8873f, 53.4102f, 20.7225f, 52.1895f, 20.9706f)
                lineTo(54.8052f, 24.4707f)
                horizontalLineTo(52.8122f)
                lineTo(50.5691f, 21.133f)
                horizontalLineTo(50.3576f)
                verticalLineTo(24.4707f)
                horizontalLineTo(48.7388f)
                verticalLineTo(16.1622f)
                horizontalLineTo(51.1421f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFF6A000), 0.623918f to Color(0xFFE47E02),
                    1.0f to Color(0xFFD36002), start = Offset(36.5397f,19.0034f), end =
                    Offset(29.0929f,14.241f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                    = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                    EvenOdd) {
                moveTo(34.1585f, 22.7268f)
                curveTo(35.4738f, 20.67f, 34.8731f, 17.9376f, 32.8166f, 16.6224f)
                curveTo(30.76f, 15.3072f, 28.0271f, 15.9076f, 26.7117f, 17.9644f)
                curveTo(25.3967f, 20.0206f, 25.9977f, 22.7539f, 28.0542f, 24.0691f)
                curveTo(30.1107f, 25.3843f, 32.8434f, 24.783f, 34.1585f, 22.7268f)
                close()
            }
        }
        .build()
        return _discover!!
    }

private var _discover: ImageVector? = null
