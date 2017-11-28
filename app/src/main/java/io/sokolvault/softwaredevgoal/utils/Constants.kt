/*
 * Copyright (c) 2017. Dmitry Sokolov (stereoVibe)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY,WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.sokolvault.softwaredevgoal.utils

object Constants {

    /**
     * RescueTime API key. Should be *taken outside* the scope of this class and kept secure (add
     * file with this key to .gitignore)
     */
//    TODO: Change this key to yours and pull it outside this class.
    const val RESCUE_TIME_API_KEY: String = "B6305G8UWIhjFIm3KTiMrp52yr8i_68GPCQKaoyw"

    /**
     * Initializing constants for appropriate activities in RescueTime.
     * Change it here if your names is differ
     */
    const val SOFTWARE_DEVELOPMENT_PERCENTAGE: String = "software_development_percentage"
    const val SOFTWARE_DEVELOPMENT_HOURS: String = "software_development_percentage"
    const val EDUCATION_PERCENTAGE: String = "reference_and_learning_percentage"
    const val EDUCATION_HOURS: String = "reference_and_learning_hours"
}