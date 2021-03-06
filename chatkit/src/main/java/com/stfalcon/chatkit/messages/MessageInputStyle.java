/*******************************************************************************
 * Copyright 2016 stfalcon.com
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package com.stfalcon.chatkit.messages;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.util.AttributeSet;

import com.stfalcon.chatkit.R;
import com.stfalcon.chatkit.commons.Style;

/**
 * Style for MessageInputStyle customization by xml attributes
 */
class MessageInputStyle extends Style {

    private static final int DEFAULT_MAX_LINES = 5;

    private boolean showAttachmentButton;
    private boolean showEmotionButton;

    private int attachmentButtonBackground;
    private int attachmentButtonDefaultBgColor;
    private int attachmentButtonDefaultBgPressedColor;
    private int attachmentButtonDefaultBgDisabledColor;

    private int attachmentButtonIcon;
    private int attachmentButtonDefaultIconColor;
    private int attachmentButtonDefaultIconPressedColor;
    private int attachmentButtonDefaultIconDisabledColor;

    private int attachmentButtonWidth;
    private int attachmentButtonHeight;
    private int attachmentButtonMargin;

    private int inputButtonBackground;
    private int inputButtonDefaultBgColor;
    private int inputButtonDefaultBgPressedColor;
    private int inputButtonDefaultBgDisabledColor;

    private int inputButtonIcon;
    private int inputButtonDefaultIconColor;
    private int inputButtonDefaultIconPressedColor;
    private int inputButtonDefaultIconDisabledColor;

    private int emotionButtonBackground;
    private int emotionButtonDefaultBgColor;
    private int emotionButtonDefaultBgPressedColor;
    private int emotionButtonDefaultBgDisabledColor;

    private int emotionButtonIcon;
    private int emotionButtonDefaultIconColor;
    private int emotionButtonDefaultIconPressedColor;
    private int emotionButtonDefaultIconDisabledColor;

    private int emotionButtonWidth;
    private int emotionButtonHeight;
    private int emotionButtonMargin;


    private int inputButtonWidth;
    private int inputButtonHeight;
    private int inputButtonMargin;

    private int inputMaxLines;
    private String inputHint;
    private String inputText;

    private int inputTextSize;
    private int inputTextColor;
    private int inputHintColor;

    private Drawable inputBackground;
    private Drawable inputCursorDrawable;

    private int inputDefaultPaddingLeft;
    private int inputDefaultPaddingRight;
    private int inputDefaultPaddingTop;
    private int inputDefaultPaddingBottom;

    static MessageInputStyle parse(Context context, AttributeSet attrs) {
        MessageInputStyle style = new MessageInputStyle(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MessageInput);

        style.showAttachmentButton = typedArray.getBoolean(R.styleable.MessageInput_showAttachmentButton, false);

        style.attachmentButtonBackground = typedArray.getResourceId(R.styleable.MessageInput_attachmentButtonBackground, -1);
        style.attachmentButtonDefaultBgColor = typedArray.getColor(R.styleable.MessageInput_attachmentButtonDefaultBgColor,
                style.getColor(R.color.white_four));
        style.attachmentButtonDefaultBgPressedColor = typedArray.getColor(R.styleable.MessageInput_attachmentButtonDefaultBgPressedColor,
                style.getColor(R.color.white_five));
        style.attachmentButtonDefaultBgDisabledColor = typedArray.getColor(R.styleable.MessageInput_attachmentButtonDefaultBgDisabledColor,
                style.getColor(R.color.transparent));

        style.attachmentButtonIcon = typedArray.getResourceId(R.styleable.MessageInput_attachmentButtonIcon, -1);
        style.attachmentButtonDefaultIconColor = typedArray.getColor(R.styleable.MessageInput_attachmentButtonDefaultIconColor,
                style.getColor(R.color.cornflower_blue_two));
        style.attachmentButtonDefaultIconPressedColor = typedArray.getColor(R.styleable.MessageInput_attachmentButtonDefaultIconPressedColor,
                style.getColor(R.color.cornflower_blue_two_dark));
        style.attachmentButtonDefaultIconDisabledColor = typedArray.getColor(R.styleable.MessageInput_attachmentButtonDefaultIconDisabledColor,
                style.getColor(R.color.cornflower_blue_light_40));

        style.attachmentButtonWidth = typedArray.getDimensionPixelSize(R.styleable.MessageInput_attachmentButtonWidth, style.getDimension(R.dimen.input_button_width));
        style.attachmentButtonHeight = typedArray.getDimensionPixelSize(R.styleable.MessageInput_attachmentButtonHeight, style.getDimension(R.dimen.input_button_height));
        style.attachmentButtonMargin = typedArray.getDimensionPixelSize(R.styleable.MessageInput_attachmentButtonMargin, style.getDimension(R.dimen.input_button_margin));

        style.showEmotionButton = typedArray.getBoolean(R.styleable.MessageInput_showEmotionButton, false);

        style.emotionButtonBackground = typedArray.getResourceId(R.styleable.MessageInput_emotionButtonBackground, -1);
        style.emotionButtonDefaultBgColor = typedArray.getColor(R.styleable.MessageInput_emotionButtonDefaultBgColor,
                style.getColor(R.color.white_four));
        style.emotionButtonDefaultBgPressedColor = typedArray.getColor(R.styleable.MessageInput_emotionButtonDefaultBgPressedColor,
                style.getColor(R.color.white_five));
        style.emotionButtonDefaultBgDisabledColor = typedArray.getColor(R.styleable.MessageInput_emotionButtonDefaultBgDisabledColor,
                style.getColor(R.color.transparent));

        style.emotionButtonIcon = typedArray.getResourceId(R.styleable.MessageInput_emotionButtonIcon, -1);
        style.emotionButtonDefaultIconColor = typedArray.getColor(R.styleable.MessageInput_emotionButtonDefaultIconColor,
                style.getColor(R.color.cornflower_blue_two));
        style.emotionButtonDefaultIconPressedColor = typedArray.getColor(R.styleable.MessageInput_emotionButtonDefaultIconPressedColor,
                style.getColor(R.color.cornflower_blue_two_dark));
        style.emotionButtonDefaultIconDisabledColor = typedArray.getColor(R.styleable.MessageInput_emotionButtonDefaultIconDisabledColor,
                style.getColor(R.color.cornflower_blue_light_40));

        style.emotionButtonWidth = typedArray.getDimensionPixelSize(R.styleable.MessageInput_emotionButtonWidth, style.getDimension(R.dimen.input_button_width));
        style.emotionButtonHeight = typedArray.getDimensionPixelSize(R.styleable.MessageInput_emotionButtonHeight, style.getDimension(R.dimen.input_button_height));
        style.emotionButtonMargin = typedArray.getDimensionPixelSize(R.styleable.MessageInput_emotionButtonMargin, style.getDimension(R.dimen.input_button_margin));

        style.inputButtonBackground = typedArray.getResourceId(R.styleable.MessageInput_inputButtonBackground, -1);
        style.inputButtonDefaultBgColor = typedArray.getColor(R.styleable.MessageInput_inputButtonDefaultBgColor,
                style.getColor(R.color.cornflower_blue_two));
        style.inputButtonDefaultBgPressedColor = typedArray.getColor(R.styleable.MessageInput_inputButtonDefaultBgPressedColor,
                style.getColor(R.color.cornflower_blue_two_dark));
        style.inputButtonDefaultBgDisabledColor = typedArray.getColor(R.styleable.MessageInput_inputButtonDefaultBgDisabledColor,
                style.getColor(R.color.white_four));

        style.inputButtonIcon = typedArray.getResourceId(R.styleable.MessageInput_inputButtonIcon, -1);
        style.inputButtonDefaultIconColor = typedArray.getColor(R.styleable.MessageInput_inputButtonDefaultIconColor,
                style.getColor(R.color.white));
        style.inputButtonDefaultIconPressedColor = typedArray.getColor(R.styleable.MessageInput_inputButtonDefaultIconPressedColor,
                style.getColor(R.color.white));
        style.inputButtonDefaultIconDisabledColor = typedArray.getColor(R.styleable.MessageInput_inputButtonDefaultIconDisabledColor,
                style.getColor(R.color.warm_grey));

        style.inputButtonWidth = typedArray.getDimensionPixelSize(R.styleable.MessageInput_inputButtonWidth, style.getDimension(R.dimen.input_button_width));
        style.inputButtonHeight = typedArray.getDimensionPixelSize(R.styleable.MessageInput_inputButtonHeight, style.getDimension(R.dimen.input_button_height));
        style.inputButtonMargin = typedArray.getDimensionPixelSize(R.styleable.MessageInput_inputButtonMargin, style.getDimension(R.dimen.input_button_margin));

        style.inputMaxLines = typedArray.getInt(R.styleable.MessageInput_inputMaxLines, DEFAULT_MAX_LINES);
        style.inputHint = typedArray.getString(R.styleable.MessageInput_inputHint);
        style.inputText = typedArray.getString(R.styleable.MessageInput_inputText);

        style.inputTextSize = typedArray.getDimensionPixelSize(R.styleable.MessageInput_inputTextSize, style.getDimension(R.dimen.input_text_size));
        style.inputTextColor = typedArray.getColor(R.styleable.MessageInput_inputTextColor, style.getColor(R.color.dark_grey_two));
        style.inputHintColor = typedArray.getColor(R.styleable.MessageInput_inputHintColor, style.getColor(R.color.warm_grey_three));

        style.inputBackground = typedArray.getDrawable(R.styleable.MessageInput_inputBackground);
        style.inputCursorDrawable = typedArray.getDrawable(R.styleable.MessageInput_inputCursorDrawable);

        typedArray.recycle();

        style.inputDefaultPaddingLeft = style.getDimension(R.dimen.input_padding_left);
        style.inputDefaultPaddingRight = style.getDimension(R.dimen.input_padding_right);
        style.inputDefaultPaddingTop = style.getDimension(R.dimen.input_padding_top);
        style.inputDefaultPaddingBottom = style.getDimension(R.dimen.input_padding_bottom);

        return style;
    }

    private MessageInputStyle(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private Drawable getSelector(@ColorInt int normalColor, @ColorInt int pressedColor,
                                 @ColorInt int disabledColor, @DrawableRes int shape) {

        Drawable drawable = DrawableCompat.wrap(getVectorDrawable(shape)).mutate();
        DrawableCompat.setTintList(
                drawable,
                new ColorStateList(
                        new int[][]{
                                new int[]{android.R.attr.state_enabled, -android.R.attr.state_pressed},
                                new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed},
                                new int[]{-android.R.attr.state_enabled}
                        },
                        new int[]{normalColor, pressedColor, disabledColor}
                ));
        return drawable;
    }

    boolean showAttachmentButton() {
        return showAttachmentButton;
    }

    boolean showEmotionButton() {
        return showEmotionButton;
    }

    Drawable getAttachmentButtonBackground() {
        if (attachmentButtonBackground == -1) {
            return getSelector(attachmentButtonDefaultBgColor, attachmentButtonDefaultBgPressedColor,
                    attachmentButtonDefaultBgDisabledColor, R.drawable.mask);
        } else {
            return getDrawable(attachmentButtonBackground);
        }
    }

    Drawable getAttachmentButtonIcon() {
        if (attachmentButtonIcon == -1) {
            return getSelector(attachmentButtonDefaultIconColor, attachmentButtonDefaultIconPressedColor,
                    attachmentButtonDefaultIconDisabledColor, R.drawable.ic_add_attachment);
        } else {
            return getDrawable(attachmentButtonIcon);
        }
    }

    Drawable getEmotionButtonBackground() {
        if (emotionButtonIcon == -1) {
            return getSelector(emotionButtonDefaultBgColor, emotionButtonDefaultBgPressedColor,
                    emotionButtonDefaultBgDisabledColor, R.drawable.mask);
        } else {
            return getDrawable(emotionButtonBackground);
        }
    }

    Drawable getEmotionButtonIcon() {
        if (emotionButtonIcon == -1) {
            return getSelector(emotionButtonDefaultIconColor, emotionButtonDefaultIconPressedColor,
                    emotionButtonDefaultIconDisabledColor, R.drawable.ic_emotion);
        } else {
            return getDrawable(attachmentButtonIcon);
        }
    }

    int getAttachmentButtonWidth() {
        return attachmentButtonWidth;
    }

    int getEmotionButtonHeight() {
        return emotionButtonHeight;
    }

    int getEmotionButtonMargin() {
        return emotionButtonMargin;
    }

    int getEmotionButtonWidth() {
        return emotionButtonWidth;
    }

    int getAttachmentButtonHeight() {
        return attachmentButtonHeight;
    }

    int getAttachmentButtonMargin() {
        return attachmentButtonMargin;
    }

    Drawable getInputButtonBackground() {
        if (inputButtonBackground == -1) {
            return getSelector(inputButtonDefaultBgColor, inputButtonDefaultBgPressedColor,
                    inputButtonDefaultBgDisabledColor, R.drawable.mask);
        } else {
            return getDrawable(inputButtonBackground);
        }
    }

    Drawable getInputButtonIcon() {
        if (inputButtonIcon == -1) {
            return getSelector(inputButtonDefaultIconColor, inputButtonDefaultIconPressedColor,
                    inputButtonDefaultIconDisabledColor, R.drawable.ic_send);
        } else {
            return getDrawable(inputButtonIcon);
        }
    }

    int getInputButtonMargin() {
        return inputButtonMargin;
    }

    int getInputButtonWidth() {
        return inputButtonWidth;
    }

    int getInputButtonHeight() {
        return inputButtonHeight;
    }

    int getInputMaxLines() {
        return inputMaxLines;
    }

    String getInputHint() {
        return inputHint;
    }

    String getInputText() {
        return inputText;
    }

    int getInputTextSize() {
        return inputTextSize;
    }

    int getInputTextColor() {
        return inputTextColor;
    }

    int getInputHintColor() {
        return inputHintColor;
    }

    Drawable getInputBackground() {
        return inputBackground;
    }

    Drawable getInputCursorDrawable() {
        return inputCursorDrawable;
    }

    int getInputDefaultPaddingLeft() {
        return inputDefaultPaddingLeft;
    }

    int getInputDefaultPaddingRight() {
        return inputDefaultPaddingRight;
    }

    int getInputDefaultPaddingTop() {
        return inputDefaultPaddingTop;
    }

    int getInputDefaultPaddingBottom() {
        return inputDefaultPaddingBottom;
    }

}
