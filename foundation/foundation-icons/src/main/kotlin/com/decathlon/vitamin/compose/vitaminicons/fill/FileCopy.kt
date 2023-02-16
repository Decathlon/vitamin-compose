package com.decathlon.vitamin.compose.vitaminicons.fill

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
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.FileCopy: ImageVector
    get() {
        if (_fileCopy != null) {
            return _fileCopy!!
        }
        _fileCopy = Builder(name = "FileCopy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.6667f, 3.1f)
                verticalLineTo(1.7f)
                curveTo(4.6667f, 1.5143f, 4.737f, 1.3363f, 4.862f, 1.205f)
                curveTo(4.919f, 1.1452f, 4.985f, 1.0973f, 5.057f, 1.063f)
                curveTo(5.1429f, 1.0219f, 5.237f, 1.0f, 5.3333f, 1.0f)
                horizontalLineTo(13.3333f)
                curveTo(13.7015f, 1.0f, 14.0f, 1.3134f, 14.0f, 1.7f)
                verticalLineTo(11.5f)
                curveTo(14.0f, 11.6857f, 13.9297f, 11.8637f, 13.8047f, 11.995f)
                curveTo(13.6797f, 12.1262f, 13.5101f, 12.2f, 13.3333f, 12.2f)
                horizontalLineTo(12.0f)
                verticalLineTo(4.1f)
                curveTo(12.0f, 3.5477f, 11.5523f, 3.1f, 11.0f, 3.1f)
                horizontalLineTo(4.6667f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6732f, 3.8f)
                horizontalLineTo(10.3333f)
                curveTo(10.8856f, 3.8f, 11.3333f, 4.2477f, 11.3333f, 4.8f)
                verticalLineTo(14.3f)
                curveTo(11.3333f, 14.6864f, 11.0332f, 15.0f, 10.6621f, 15.0f)
                horizontalLineTo(2.6712f)
                curveTo(2.5833f, 15.0005f, 2.4964f, 14.9828f, 2.415f, 14.948f)
                curveTo(2.3831f, 14.9343f, 2.3525f, 14.918f, 2.3229f, 14.8995f)
                curveTo(2.2773f, 14.8706f, 2.235f, 14.8361f, 2.1973f, 14.7965f)
                curveTo(2.1813f, 14.78f, 2.1663f, 14.7626f, 2.152f, 14.7446f)
                curveTo(2.1107f, 14.6916f, 2.0768f, 14.6324f, 2.0514f, 14.5689f)
                curveTo(2.0176f, 14.4837f, 2.0f, 14.3923f, 2.0f, 14.3f)
                lineTo(2.002f, 4.5f)
                curveTo(2.002f, 4.1136f, 2.3021f, 3.8f, 2.6732f, 3.8f)
                close()
            }
        }
        .build()
        return _fileCopy!!
    }

private var _fileCopy: ImageVector? = null
