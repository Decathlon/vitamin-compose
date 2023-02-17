package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Question: ImageVector
    get() {
        if (_question != null) {
            return _question!!
        }
        _question = Builder(name = "Question", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(11.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(13.0f, 13.355f)
                curveTo(13.8037f, 13.1128f, 14.4936f, 12.59f, 14.9442f, 11.8817f)
                curveTo(15.3947f, 11.1735f, 15.5759f, 10.3271f, 15.4547f, 9.4965f)
                curveTo(15.3336f, 8.6659f, 14.9181f, 7.9064f, 14.284f, 7.3565f)
                curveTo(13.6499f, 6.8065f, 12.8394f, 6.5025f, 12.0f, 6.5f)
                curveTo(11.1909f, 6.4999f, 10.4067f, 6.7801f, 9.7808f, 7.293f)
                curveTo(9.1549f, 7.8058f, 8.726f, 8.5196f, 8.567f, 9.313f)
                lineTo(10.529f, 9.706f)
                curveTo(10.5847f, 9.4274f, 10.7183f, 9.1704f, 10.9144f, 8.9648f)
                curveTo(11.1104f, 8.7592f, 11.3608f, 8.6135f, 11.6364f, 8.5447f)
                curveTo(11.912f, 8.4759f, 12.2015f, 8.4867f, 12.4712f, 8.576f)
                curveTo(12.7409f, 8.6652f, 12.9797f, 8.8292f, 13.1598f, 9.0489f)
                curveTo(13.34f, 9.2686f, 13.454f, 9.5349f, 13.4887f, 9.8168f)
                curveTo(13.5234f, 10.0988f, 13.4773f, 10.3848f, 13.3558f, 10.6416f)
                curveTo(13.2343f, 10.8984f, 13.0423f, 11.1154f, 12.8023f, 11.2673f)
                curveTo(12.5623f, 11.4193f, 12.2841f, 11.5f, 12.0f, 11.5f)
                curveTo(11.7348f, 11.5f, 11.4804f, 11.6054f, 11.2929f, 11.7929f)
                curveTo(11.1054f, 11.9804f, 11.0f, 12.2348f, 11.0f, 12.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.355f)
                close()
            }
        }
        .build()
        return _question!!
    }

private var _question: ImageVector? = null
