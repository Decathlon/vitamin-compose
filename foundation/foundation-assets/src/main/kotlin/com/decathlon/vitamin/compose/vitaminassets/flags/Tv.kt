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

public val FlagsGroup.Tv: ImageVector
    get() {
        if (_tv != null) {
            return _tv!!
        }
        _tv = Builder(name = "Tv", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0002f, 0.0f)
                    horizontalLineTo(2.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF72AFC8)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0002f, 0.0f)
                    horizontalLineTo(2.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0002f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFCD2F)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.0003f, 17.3334f)
                    lineTo(11.0575f, 17.6095f)
                    lineTo(11.3336f, 16.6667f)
                    lineTo(11.0575f, 15.7239f)
                    lineTo(12.0003f, 16.0f)
                    lineTo(12.9431f, 15.7239f)
                    lineTo(12.6669f, 16.6667f)
                    lineTo(12.9431f, 17.6095f)
                    lineTo(12.0003f, 17.3334f)
                    close()
                    moveTo(16.0003f, 16.0f)
                    lineTo(15.0575f, 16.2762f)
                    lineTo(15.3336f, 15.3334f)
                    lineTo(15.0575f, 14.3906f)
                    lineTo(16.0003f, 14.6667f)
                    lineTo(16.9431f, 14.3906f)
                    lineTo(16.6669f, 15.3334f)
                    lineTo(16.9431f, 16.2762f)
                    lineTo(16.0003f, 16.0f)
                    close()
                    moveTo(20.0003f, 16.0f)
                    lineTo(19.0575f, 16.2762f)
                    lineTo(19.3336f, 15.3334f)
                    lineTo(19.0575f, 14.3906f)
                    lineTo(20.0003f, 14.6667f)
                    lineTo(20.9431f, 14.3906f)
                    lineTo(20.6669f, 15.3334f)
                    lineTo(20.9431f, 16.2762f)
                    lineTo(20.0003f, 16.0f)
                    close()
                    moveTo(22.6669f, 13.3334f)
                    lineTo(21.7241f, 13.6095f)
                    lineTo(22.0003f, 12.6667f)
                    lineTo(21.7241f, 11.7239f)
                    lineTo(22.6669f, 12.0f)
                    lineTo(23.6097f, 11.7239f)
                    lineTo(23.3336f, 12.6667f)
                    lineTo(23.6097f, 13.6095f)
                    lineTo(22.6669f, 13.3334f)
                    close()
                    moveTo(25.3336f, 10.6667f)
                    lineTo(24.3908f, 10.9428f)
                    lineTo(24.6669f, 10.0f)
                    lineTo(24.3908f, 9.0572f)
                    lineTo(25.3336f, 9.3334f)
                    lineTo(26.2764f, 9.0572f)
                    lineTo(26.0003f, 10.0f)
                    lineTo(26.2764f, 10.9428f)
                    lineTo(25.3336f, 10.6667f)
                    close()
                    moveTo(17.3336f, 12.0f)
                    lineTo(16.3908f, 12.2762f)
                    lineTo(16.6669f, 11.3334f)
                    lineTo(16.3908f, 10.3906f)
                    lineTo(17.3336f, 10.6667f)
                    lineTo(18.2764f, 10.3906f)
                    lineTo(18.0003f, 11.3334f)
                    lineTo(18.2764f, 12.2762f)
                    lineTo(17.3336f, 12.0f)
                    close()
                    moveTo(20.0003f, 6.6667f)
                    lineTo(19.0575f, 6.9429f)
                    lineTo(19.3336f, 6.0f)
                    lineTo(19.0575f, 5.0572f)
                    lineTo(20.0003f, 5.3334f)
                    lineTo(20.9431f, 5.0572f)
                    lineTo(20.6669f, 6.0f)
                    lineTo(20.9431f, 6.9429f)
                    lineTo(20.0003f, 6.6667f)
                    close()
                    moveTo(22.6669f, 5.3334f)
                    lineTo(21.7241f, 5.6095f)
                    lineTo(22.0003f, 4.6667f)
                    lineTo(21.7241f, 3.7239f)
                    lineTo(22.6669f, 4.0f)
                    lineTo(23.6097f, 3.7239f)
                    lineTo(23.3336f, 4.6667f)
                    lineTo(23.6097f, 5.6095f)
                    lineTo(22.6669f, 5.3334f)
                    close()
                    moveTo(25.3336f, 4.0f)
                    lineTo(24.3908f, 4.2762f)
                    lineTo(24.6669f, 3.3334f)
                    lineTo(24.3908f, 2.3906f)
                    lineTo(25.3336f, 2.6667f)
                    lineTo(26.2764f, 2.3906f)
                    lineTo(26.0003f, 3.3334f)
                    lineTo(26.2764f, 4.2762f)
                    lineTo(25.3336f, 4.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF07319C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0E-4f, 0.0f)
                    lineTo(14.0007f, 0.0f)
                    verticalLineTo(10.0026f)
                    horizontalLineTo(1.0E-4f)
                    lineTo(2.0E-4f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0007f, 0.9474f)
                    lineTo(11.4315f, 3.1023f)
                    horizontalLineTo(14.0007f)
                    verticalLineTo(6.67f)
                    horizontalLineTo(11.432f)
                    lineTo(14.0007f, 8.8238f)
                    verticalLineTo(10.0026f)
                    horizontalLineTo(10.8046f)
                    lineTo(8.7865f, 8.3129f)
                    verticalLineTo(10.0026f)
                    horizontalLineTo(5.2151f)
                    verticalLineTo(8.3113f)
                    lineTo(3.1934f, 10.0026f)
                    horizontalLineTo(1.0E-4f)
                    verticalLineTo(8.8136f)
                    lineTo(2.5636f, 6.67f)
                    horizontalLineTo(1.0E-4f)
                    verticalLineTo(3.1023f)
                    horizontalLineTo(2.5673f)
                    lineTo(1.0E-4f, 0.952f)
                    verticalLineTo(0.0026f)
                    horizontalLineTo(3.4736f)
                    lineTo(5.2151f, 1.4601f)
                    verticalLineTo(0.0026f)
                    horizontalLineTo(8.7865f)
                    verticalLineTo(1.463f)
                    lineTo(10.5353f, 0.0026f)
                    horizontalLineTo(14.0007f)
                    verticalLineTo(0.9474f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDC1F37)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.683f, 4.1023f)
                    lineTo(13.5711f, 0.0026f)
                    lineTo(12.0944f, 0.0f)
                    lineTo(7.7865f, 3.601f)
                    verticalLineTo(0.0045f)
                    lineTo(6.2151f, 0.0045f)
                    verticalLineTo(3.6011f)
                    lineTo(1.9282f, 0.0131f)
                    lineTo(0.4263f, 0.0045f)
                    lineTo(5.3184f, 4.1023f)
                    horizontalLineTo(7.0E-4f)
                    verticalLineTo(5.67f)
                    horizontalLineTo(5.3184f)
                    lineTo(0.1392f, 10.0008f)
                    lineTo(1.6392f, 9.9989f)
                    lineTo(6.2151f, 6.171f)
                    verticalLineTo(10.0004f)
                    horizontalLineTo(7.7865f)
                    verticalLineTo(6.1713f)
                    lineTo(12.3601f, 10.0008f)
                    lineTo(13.8504f, 10.0028f)
                    lineTo(8.6831f, 5.67f)
                    horizontalLineTo(14.0007f)
                    verticalLineTo(4.1023f)
                    horizontalLineTo(8.683f)
                    close()
                }
            }
        }
        .build()
        return _tv!!
    }

private var _tv: ImageVector? = null
