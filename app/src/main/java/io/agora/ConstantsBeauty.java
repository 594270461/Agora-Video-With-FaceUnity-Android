package io.agora;

import io.agora.rtc.Constants;

/**
 * Created by Yao Ximing on 2018/2/4.
 */

public class ConstantsBeauty {
    public static final String ACTION_KEY_ROOM_NAME = "ecHANEL";
    public static final int UID = 0;

    public static int[] VIDEO_PROFILES = new int[]{
            Constants.VIDEO_PROFILE_120P,
            Constants.VIDEO_PROFILE_180P,
            Constants.VIDEO_PROFILE_240P,
            Constants.VIDEO_PROFILE_360P,
            Constants.VIDEO_PROFILE_480P,
            Constants.VIDEO_PROFILE_720P};

    public static final int DEFAULT_PROFILE_IDX = 2;
}
