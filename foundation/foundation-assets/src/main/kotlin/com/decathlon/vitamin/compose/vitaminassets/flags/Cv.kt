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

public val FlagsGroup.Cv: ImageVector
    get() {
        if (_cv != null) {
            return _cv!!
        }
        _cv = Builder(name = "Cv", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineTo(28.0f)
                    curveTo(28.0f, 6.6667f, 28.0f, 13.3333f, 28.0f, 20.0f)
                    curveTo(18.6667f, 20.0f, 9.3333f, 20.0f, 0.0f, 20.0f)
                    curveTo(0.0f, 13.3333f, -1.0E-4f, 6.6667f, 0.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0C49AE)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 10.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    lineTo(0.0f, 10.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF0C49AE)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(14.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 14.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(10.6667f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(14.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFCD232E)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 13.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.3333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF7D035)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(10.6665f, 9.3334f)
                    curveTo(10.5558f, 9.3334f, 10.4465f, 9.3387f, 10.3389f, 9.3492f)
                    curveTo(9.9724f, 9.3849f, 9.6464f, 9.1167f, 9.6108f, 8.7502f)
                    curveTo(9.5751f, 8.3838f, 9.8433f, 8.0578f, 10.2097f, 8.0221f)
                    curveTo(10.3602f, 8.0075f, 10.5126f, 8.0f, 10.6665f, 8.0f)
                    curveTo(10.8204f, 8.0f, 10.9728f, 8.0075f, 11.1233f, 8.0221f)
                    curveTo(11.4898f, 8.0578f, 11.7579f, 8.3838f, 11.7223f, 8.7502f)
                    curveTo(11.6866f, 9.1167f, 11.3606f, 9.3849f, 10.9941f, 9.3492f)
                    curveTo(10.8865f, 9.3387f, 10.7772f, 9.3334f, 10.6665f, 9.3334f)
                    close()
                    moveTo(8.644f, 9.1513f)
                    curveTo(8.8777f, 9.4358f, 8.8366f, 9.8559f, 8.5521f, 10.0896f)
                    curveTo(8.3832f, 10.2284f, 8.2282f, 10.3834f, 8.0894f, 10.5523f)
                    curveTo(7.8557f, 10.8368f, 7.4356f, 10.8779f, 7.1511f, 10.6442f)
                    curveTo(6.8666f, 10.4104f, 6.8255f, 9.9903f, 7.0592f, 9.7059f)
                    curveTo(7.2531f, 9.4699f, 7.4697f, 9.2533f, 7.7057f, 9.0594f)
                    curveTo(7.9902f, 8.8257f, 8.4103f, 8.8668f, 8.644f, 9.1513f)
                    close()
                    moveTo(12.689f, 9.1513f)
                    curveTo(12.9228f, 8.8668f, 13.3429f, 8.8257f, 13.6273f, 9.0594f)
                    curveTo(13.8633f, 9.2533f, 14.0799f, 9.4699f, 14.2738f, 9.7059f)
                    curveTo(14.5075f, 9.9903f, 14.4664f, 10.4104f, 14.1819f, 10.6442f)
                    curveTo(13.8974f, 10.8779f, 13.4773f, 10.8368f, 13.2436f, 10.5523f)
                    curveTo(13.1048f, 10.3834f, 12.9498f, 10.2284f, 12.7809f, 10.0896f)
                    curveTo(12.4964f, 9.8559f, 12.4553f, 9.4358f, 12.689f, 9.1513f)
                    close()
                    moveTo(6.7501f, 11.6109f)
                    curveTo(7.1165f, 11.6466f, 7.3847f, 11.9726f, 7.349f, 12.339f)
                    curveTo(7.3386f, 12.4467f, 7.3332f, 12.5559f, 7.3332f, 12.6667f)
                    curveTo(7.3332f, 12.7774f, 7.3386f, 12.8867f, 7.349f, 12.9943f)
                    curveTo(7.3847f, 13.3608f, 7.1165f, 13.6868f, 6.7501f, 13.7224f)
                    curveTo(6.3836f, 13.7581f, 6.0576f, 13.4899f, 6.022f, 13.1235f)
                    curveTo(6.0073f, 12.973f, 5.9998f, 12.8206f, 5.9998f, 12.6667f)
                    curveTo(5.9998f, 12.5128f, 6.0073f, 12.3604f, 6.022f, 12.2099f)
                    curveTo(6.0576f, 11.8434f, 6.3836f, 11.5753f, 6.7501f, 11.6109f)
                    close()
                    moveTo(14.5829f, 11.6109f)
                    curveTo(14.9494f, 11.5753f, 15.2754f, 11.8434f, 15.3111f, 12.2099f)
                    curveTo(15.3257f, 12.3604f, 15.3332f, 12.5128f, 15.3332f, 12.6667f)
                    curveTo(15.3332f, 12.8206f, 15.3257f, 12.973f, 15.3111f, 13.1235f)
                    curveTo(15.2754f, 13.4899f, 14.9494f, 13.7581f, 14.5829f, 13.7224f)
                    curveTo(14.2165f, 13.6868f, 13.9483f, 13.3608f, 13.984f, 12.9943f)
                    curveTo(13.9945f, 12.8867f, 13.9998f, 12.7774f, 13.9998f, 12.6667f)
                    curveTo(13.9998f, 12.5559f, 13.9945f, 12.4467f, 13.984f, 12.339f)
                    curveTo(13.9483f, 11.9726f, 14.2165f, 11.6466f, 14.5829f, 11.6109f)
                    close()
                    moveTo(7.1511f, 14.6892f)
                    curveTo(7.4356f, 14.4555f, 7.8557f, 14.4966f, 8.0894f, 14.7811f)
                    curveTo(8.2282f, 14.95f, 8.3832f, 15.105f, 8.5521f, 15.2437f)
                    curveTo(8.8366f, 15.4775f, 8.8777f, 15.8976f, 8.644f, 16.1821f)
                    curveTo(8.4103f, 16.4665f, 7.9902f, 16.5077f, 7.7057f, 16.2739f)
                    curveTo(7.4697f, 16.0801f, 7.2531f, 15.8635f, 7.0592f, 15.6275f)
                    curveTo(6.8255f, 15.343f, 6.8666f, 14.9229f, 7.1511f, 14.6892f)
                    close()
                    moveTo(14.1819f, 14.6892f)
                    curveTo(14.4664f, 14.9229f, 14.5075f, 15.343f, 14.2738f, 15.6275f)
                    curveTo(14.0799f, 15.8635f, 13.8633f, 16.0801f, 13.6273f, 16.274f)
                    curveTo(13.3429f, 16.5077f, 12.9227f, 16.4665f, 12.689f, 16.1821f)
                    curveTo(12.4553f, 15.8976f, 12.4964f, 15.4775f, 12.7809f, 15.2437f)
                    curveTo(12.9498f, 15.105f, 13.1048f, 14.95f, 13.2436f, 14.7811f)
                    curveTo(13.4773f, 14.4966f, 13.8974f, 14.4555f, 14.1819f, 14.6892f)
                    close()
                    moveTo(9.6108f, 16.5831f)
                    curveTo(9.6464f, 16.2167f, 9.9724f, 15.9485f, 10.3389f, 15.9842f)
                    curveTo(10.4465f, 15.9946f, 10.5558f, 16.0f, 10.6665f, 16.0f)
                    curveTo(10.7772f, 16.0f, 10.8865f, 15.9946f, 10.9941f, 15.9842f)
                    curveTo(11.3606f, 15.9485f, 11.6866f, 16.2167f, 11.7223f, 16.5831f)
                    curveTo(11.7579f, 16.9496f, 11.4898f, 17.2756f, 11.1233f, 17.3112f)
                    curveTo(10.9728f, 17.3259f, 10.8204f, 17.3334f, 10.6665f, 17.3334f)
                    curveTo(10.5126f, 17.3334f, 10.3602f, 17.3259f, 10.2097f, 17.3112f)
                    curveTo(9.8433f, 17.2756f, 9.5751f, 16.9496f, 9.6108f, 16.5831f)
                    close()
                }
            }
        }
        .build()
        return _cv!!
    }

private var _cv: ImageVector? = null
