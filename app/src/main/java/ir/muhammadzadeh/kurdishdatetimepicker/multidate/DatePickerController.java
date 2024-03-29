/*
 * Copyright (C) 2013 The Android Open Source Project
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

package ir.muhammadzadeh.kurdishdatetimepicker.multidate;


import java.util.ArrayList;

import ir.muhammadzadeh.kurdishdatetimepicker.utils.KurdishCalendar;

/**
 * Controller class to communicate among the various components of the date picker dialog.
 */
public interface DatePickerController {

    void onYearSelected(int year);

    void onDaysOfMonthSelected(ArrayList<KurdishCalendar> selectedDays);

    void registerOnDateChangedListener(MultiDatePickerDialog.OnDateChangedListener listener);

    void unregisterOnDateChangedListener(MultiDatePickerDialog.OnDateChangedListener listener);

    ArrayList<KurdishCalendar> getSelectedDays();

    void setSelectedDays(ArrayList<KurdishCalendar> selectedDays);

    boolean isThemeDark();
    
    KurdishCalendar[] getHighlightedDays();

    KurdishCalendar[] getSelectableDays();

    int getFirstDayOfWeek();

    int getMinYear();

    int getMaxYear();

    int getSelectedYear();

    KurdishCalendar getMinDate();

    KurdishCalendar getMaxDate();

    void tryVibrate();
}
