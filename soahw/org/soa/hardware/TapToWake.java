/*
 * Copyright (C) 2014 The Sons Of And Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.soa.hardware;

import org.soa.hardware.util.FileUtils;

public class TapToWake {

    private static String CONTROL_PATH = "/proc/touchpanel/double_tap_enable";
    private static boolean mEnabled = true;

    public static boolean isSupported() {
        return true;
    }

    public static boolean isEnabled()  {
        return mEnabled;
    }

    public static boolean setEnabled(boolean state)  {
        mEnabled = state;
        return FileUtils.writeLine(CONTROL_PATH, (state ? "1" : "0"));
    }
}
